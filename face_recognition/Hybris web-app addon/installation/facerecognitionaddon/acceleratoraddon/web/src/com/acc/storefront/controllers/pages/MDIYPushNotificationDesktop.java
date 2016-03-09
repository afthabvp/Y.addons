package com.acc.storefront.controllers.pages;
import de.hybris.platform.addonsupport.controllers.page.AbstractAddOnPageController;


import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.Collections;
import java.util.List;

import javapns.communication.ConnectionToAppleServer;
import javapns.devices.Device;
import javapns.devices.exceptions.DuplicateDeviceException;
import javapns.devices.exceptions.NullDeviceTokenException;
import javapns.devices.exceptions.NullIdException;
import javapns.notification.AppleNotificationServer;
import javapns.notification.AppleNotificationServerBasicImpl;
import javapns.notification.Payload;
import javapns.notification.PushNotificationManager;
import javapns.notification.PushNotificationPayload;

import com.acc.storefront.controllers.FcControllerConstants;




import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.acc.data.CameraPromotionData;
import com.acc.facade.FaceRecogPromotionsFacade;
import com.acc.facade.MDIYTokenBasedCustomerFacade;
import com.acc.facades.CSRCustomerDetails.data.CSRCustomerDetailsData;
import com.acc.model.CSRCustomerDetailsModel;
import com.frs.bean.MDIRequestResponseBean;
import com.frs.bean.MDIUser;


/**
 * 
 */

/**
 * @author swapnil.a.pandey
 * 
 */
@Controller
@Scope("tenant")
@RequestMapping(value = "/pushNotification")
public class MDIYPushNotificationDesktop extends AbstractAddOnPageController
{
	private static final Logger LOG = Logger.getLogger(MDIYPushNotificationDesktop.class);

	private static final String HOST = "gateway.sandbox.push.apple.com";
	private static final int PORT = 2195;
	private static final int BADGE = 1;
	private static final String ADD_EDIT_ADDRESS_CMS_PAGE = "add-edit-address";


	private static String certificate = "C:/Users/swapnil.a.pandey/Documents/Sandbox_Certificates.p12/Sandbox_Certificates.p12";
	private static String passwd = "hybris";
	Payload aPayload;
	@Autowired
	MDIYTokenBasedCustomerFacade mDIYTokenBasedCustomerFacade;
	@Autowired
	FaceRecogPromotionsFacade facerecogPromotionsfacade;
	@Autowired
	ModelService modelService;

	String messages = null;
	String cameraId = null;
	String status=null;

	@RequestMapping(method = RequestMethod.GET)
	public String getCustomerToken(final Model model) throws CMSItemNotFoundException
	{
		System.out.println("inside getCustomerToken notification");

		final List<CSRCustomerDetailsData> csrCustomer = mDIYTokenBasedCustomerFacade.getTokenCustomer();

		model.addAttribute("metaRobots", "no-index,no-follow");
		model.addAttribute("csrCustomer", csrCustomer);
		storeCmsPageInModel(model, getContentPageForLabelOrId(ADD_EDIT_ADDRESS_CMS_PAGE));
		setUpMetaDataForContentPage(model, getContentPageForLabelOrId(ADD_EDIT_ADDRESS_CMS_PAGE));
		return FcControllerConstants.Views.Pages.Account.PushNotificationPage;
	}


	@RequestMapping(value = "/push", method = RequestMethod.GET, produces = "application/json")
	public void sendPushNotification(@RequestParam("devicetoken") final String deviceToken,
			@RequestParam("message") String message, final Model model, final HttpServletRequest request,
			final HttpServletResponse response) throws DuplicateDeviceException, NullIdException,
			NullDeviceTokenException, Exception
	{
		
		System.out.println("inside desktop push notification");


			// Get !PushNotification Instance
			final PushNotificationManager pushManager = new PushNotificationManager();
			if (StringUtils.isNotEmpty(deviceToken) || null != deviceToken)
			{
				final CSRCustomerDetailsData csrCustomer = mDIYTokenBasedCustomerFacade.getTokenBasedOnCustomer(deviceToken);
				final String mobileType = csrCustomer.getMobiletype();
				final MDIUser mdiUser = new MDIUser();
				final MDIRequestResponseBean bean = new MDIRequestResponseBean();
				mdiUser.setUserName(csrCustomer.getCustomerName());
				bean.setUser(mdiUser);
				System.out.println("mdiuser++++++++++" + mdiUser);
				System.out.println("mobileType++++++++++" + mobileType);

				System.out.println("mdiuser++++++++++" + mdiUser.getUserName());
				//		final CSRCustomerDetailsModel model = modelService.create(CSRCustomerDetailsModel.class);
				System.out.println("bean +++++++++++++++" + bean);
				//	final String cameraId = bean.getUser().getCameraId();
				System.out.println("complexion++++++++++" + bean.getUser().getComplexion());
				System.out.println("deviceToken"+deviceToken);
				//System.out.println("cameraId++++++++++" + cameraId);
				if (StringUtils.isNotEmpty(cameraId) || StringUtils.isNotBlank(cameraId))
				{
					final CSRCustomerDetailsData camera = facerecogPromotionsfacade.getPromotionsBasedOnCamera(cameraId);
					System.out.println("CameraPromotionData++++++++++" + camera.getPromotions());
					final CameraPromotionData cameraPromotionsData = new CameraPromotionData();
					//cameraPromotionsData.setWelcomeMessage(camera.getWelcomeMessage());
					cameraPromotionsData.setPromotions(CollectionUtils.isNotEmpty(camera.getPromotions()) ? camera.getPromotions()
							: Collections.EMPTY_LIST);
					messages = cameraPromotionsData.getPromotions().toString();
				}
				else
				{
					messages = message;
				}

				final PushNotificationPayload complexPayload = PushNotificationPayload.complex();
				complexPayload.addAlert(messages);
				complexPayload.addBadge(BADGE);
				complexPayload.addSound("default");
				System.out.println("Payload setup successfull.");
				System.out.println(complexPayload);
				System.out.println(complexPayload.getPayloadSize());
				pushManager.addDevice(mobileType, deviceToken);
				// Get iPhone client
				status = "success";

				final Device dev = pushManager.getDevice(mobileType);
				LOG.info("device+++++++++++++++" + dev);
				if (dev != null)
				{
					System.out.println("iPhone UDID taken.");
					System.out.println("Token: " + pushManager.getDevice("iPhone").getToken());
					System.out.println("Client setup successfull.");
					final AppleNotificationServer customServer = new AppleNotificationServerBasicImpl(certificate, passwd,
							ConnectionToAppleServer.KEYSTORE_TYPE_PKCS12, HOST, PORT);
					// Initialize connection
					//pushManager.initializeConnection(HOST, PORT, certificate, passwd, ConnectionToAppleServer.KEYSTORE_TYPE_PKCS12);
					pushManager.initializeConnection(customServer);
					System.out.println("Connection initialized...");
					// Send message
					pushManager.sendNotification(dev, complexPayload);
					pushManager.removeDevice(mobileType);
					System.out.println("Message sent!");
					System.out.println("# of attempts: " + pushManager.getRetryAttempts());
					pushManager.stopConnection();
					System.out.println("done");
					LOG.info("at the end of pushNotification webservice" + complexPayload);
					//notify("Notify my iPhone");
				}
			}
			else
			{
				status = "failed";

				System.out.println("device token is empty");
			}
		

		}




	}


