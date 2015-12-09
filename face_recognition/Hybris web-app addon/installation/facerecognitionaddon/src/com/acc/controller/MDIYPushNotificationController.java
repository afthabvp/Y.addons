/**
 * 
 */
package com.acc.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Collections;

import javapns.communication.ConnectionToAppleServer;
import javapns.devices.Device;
import javapns.devices.exceptions.DuplicateDeviceException;
import javapns.devices.exceptions.NullDeviceTokenException;
import javapns.devices.exceptions.NullIdException;
import javapns.notification.AppleNotificationServer;
import javapns.notification.AppleNotificationServerBasicImpl;
import javapns.notification.Payload;
//import javapns.back.!PushNotificationManager;
import javapns.notification.PushNotificationManager;
import javapns.notification.PushNotificationPayload;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.acc.data.CameraPromotionData;
import com.acc.facade.FaceRecogPromotionsFacade;
import com.acc.facade.MDIYTokenBasedCustomerFacade;
import com.acc.facades.CSRCustomerDetails.data.CSRCustomerDetailsData;
import com.frs.bean.MDIRequestResponseBean;
import com.frs.bean.MDIUser;


//import javapns.back.SSLConnectionHelper;


/**
 * @author swapnil.a.pandey
 * 
 */
@Controller
@RequestMapping(value = "/v1/{baseSiteId}/pushNotifications")
public class MDIYPushNotificationController
{
	private static final Logger LOG = Logger.getLogger(MDIYCustomerImagesController.class);
	private static final String TOKEN = "token";
	private static final String MOBILETYPE = "mobiletype";
	String deviceToken = null;
	String mobileType = null;

	private static final String HOST = "gateway.sandbox.push.apple.com";
	private static final int PORT = 2195;
	private static final int BADGE = 1;

	private static String certificate = "C:/Users/swapnil.a.pandey/Documents/Sandbox_Certificates.p12/Sandbox_Certificates.p12";
	private static String passwd = "hybris";
	Payload aPayload;
	String status = null;
	@Autowired
	MDIYTokenBasedCustomerFacade mDIYTokenBasedCustomerFacade;
	@Autowired
	FaceRecogPromotionsFacade facerecogPromotionsfacade;

	String message = null;

	//Object keystore;


	//final ApnsService pushService = APNS.newService()
	//	.withCert("C:/Users/swapnil.a.pandey/Documents/Sandbox_Certificates.p12", "hybris").withSandboxDestination().build();

	@SuppressWarnings("deprecation")
	@RequestMapping(value = "/push", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public String pushNotification(final HttpServletRequest request) throws DuplicateDeviceException, NullIdException,
			NullDeviceTokenException, Exception
	{

		LOG.info("inside pushNotification webservice*****************");
		final StringBuffer sbuf = getJsonBodyString(request);
		if (StringUtils.isNotEmpty(sbuf.toString()))
		{
			final JSONParser parser = new JSONParser();
			final JSONObject obj = (JSONObject) parser.parse(sbuf.toString());
			deviceToken = String.valueOf(obj.get(TOKEN));
			mobileType = String.valueOf(obj.get(MOBILETYPE));
			System.out.println("mobile type of the user is" + mobileType);

		}





		// Get !PushNotification Instance
		final PushNotificationManager pushManager = new PushNotificationManager();
		if (StringUtils.isNotEmpty(deviceToken) || null != deviceToken)
		{
			final CSRCustomerDetailsData csrCustomer = mDIYTokenBasedCustomerFacade.getTokenBasedOnCustomer(deviceToken);
			System.out.println("csrcustomer+++++++++" + csrCustomer);

			System.out.println("csrcustomer+++++++++" + csrCustomer.getCustomerName());
			final MDIRequestResponseBean bean = new MDIRequestResponseBean();
			final MDIUser mdiUser = new MDIUser();
			mdiUser.setUserName(csrCustomer.getCustomerName());

			bean.setUser(mdiUser);
			//			CSRCustomerDetailsModel model = modelService.create(CSRCustomerDetailsModel.class);
			System.out.println("bean +++++++++++++++" + bean);

			final String cameraId = bean.getUser().getCameraId();
			System.out.println("complexion++++++++++" + bean.getUser().getComplexion());

			System.out.println("cameraId++++++++++" + cameraId);
			if (StringUtils.isNotEmpty(cameraId) || StringUtils.isNotBlank(cameraId))
			{

				final CSRCustomerDetailsData camera = facerecogPromotionsfacade.getPromotionsBasedOnCamera(cameraId);
				System.out.println("CameraPromotionData++++++++++" + camera.getPromotions());


				final CameraPromotionData cameraPromotionsData = new CameraPromotionData();
				//	cameraPromotionsData.setWelcomeMessage(camera.getWelcomeMessage());
				cameraPromotionsData.setPromotions(CollectionUtils.isNotEmpty(camera.getPromotions()) ? camera.getPromotions()
						: Collections.EMPTY_LIST);
				message = cameraPromotionsData.getPromotions().toString();
			}
			else
			{
				message = "get 20% to 30% discount on all our products available in store";
			}

			final PushNotificationPayload complexPayload = PushNotificationPayload.complex();
			complexPayload.addAlert(message);
			complexPayload.addBadge(BADGE);
			complexPayload.addSound("default");
			//final PayloadBuilder aPayload = APNS.newPayload();
			//aPayload.badge(BADGE);
			System.out.println("Payload setup successfull.");
			System.out.println(complexPayload);
			System.out.println(complexPayload.getPayloadSize());


			pushManager.addDevice("iPhone", deviceToken);
			status = "success";
			// Get iPhone client
			final Device dev = pushManager.getDevice("iPhone");
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
				pushManager.removeDevice(deviceToken);


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

		return status;


	}

	/*
	 * void notify(final String message) { final String payload = APNS.newPayload().alertBody(message).build(); //final
	 * String badge = APNS.newPayload().badge(1).build(); //final String deviceSound =
	 * APNS.newPayload().sound(sound).build(); final String token = deviceToken; pushService.push(token, payload);
	 * //pushService.push(deviceSound, badge); }
	 */

	private StringBuffer getJsonBodyString(final HttpServletRequest request) throws IOException, UnsupportedEncodingException
	{
		final ServletInputStream input = request.getInputStream();
		final byte[] buf = new byte[201];
		final StringBuffer sbuf = new StringBuffer();
		int result;
		do
		{
			result = input.readLine(buf, 0, buf.length);
			if (result != -1)
			{
				sbuf.append(new String(buf, 0, result, "UTF-8"));
			}
			else
			{
				break;
			}
		}
		while (result == buf.length);
		return sbuf;
	}

}
