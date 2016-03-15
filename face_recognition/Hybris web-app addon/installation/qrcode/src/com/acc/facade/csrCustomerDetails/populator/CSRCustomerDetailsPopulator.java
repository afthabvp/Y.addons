/**
 *
 */
package com.acc.facade.csrCustomerDetails.populator;

import de.hybris.platform.commercefacades.product.data.PromotionData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.promotions.model.AbstractPromotionModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.user.UserService;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.acc.facades.CSRCustomerDetails.data.CSRCustomerDetailsData;
import com.acc.model.CSRCustomerDetailsModel;



/**
 * @author swapnil.a.pandey
 * 
 */
public class CSRCustomerDetailsPopulator implements Populator<CSRCustomerDetailsModel, CSRCustomerDetailsData>
{
	@Resource(name = "promotionsConverter")
	private Converter<AbstractPromotionModel, PromotionData> promotionsConverter;
	@Autowired
	private UserService userService;

	/**
	 * @return the promotionsConverter
	 */
	public Converter<AbstractPromotionModel, PromotionData> getPromotionsConverter()
	{
		return promotionsConverter;
	}

	/**
	 * @param promotionsConverter
	 *           the promotionsConverter to set
	 */
	public void setPromotionsConverter(final Converter<AbstractPromotionModel, PromotionData> promotionsConverter)
	{
		this.promotionsConverter = promotionsConverter;
	}

	/**
	 * @return the userService
	 */
	public UserService getUserService()
	{
		return userService;
	}

	/**
	 * @param userService
	 *           the userService to set
	 */
	public void setUserService(final UserService userService)
	{
		this.userService = userService;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.converters.Populator#populate(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void populate(final CSRCustomerDetailsModel source, final CSRCustomerDetailsData target) throws ConversionException
	{
		if (source != null)
		{
			target.setCustomerId(source.getCustomerId());
			target.setCustomerName(source.getCustomerName());
			target.setLoginTime(source.getLoginTime());
			target.setPk(String.valueOf(source.getPk().getLongValue()));
			target.setPointOfService(source.getPointOfService());
			target.setStatus(source.getStatus());
			target.setUUID(source.getUUID());
			target.setProcessedBy(source.getProcessedBy());
			final UserModel userModel = userService.getUserForUID(source.getCustomerId());
			if (userModel instanceof CustomerModel)
			{
				final CustomerModel customerModel = (CustomerModel) userModel;
				target.setProfilePictureURL((null == customerModel.getProfilePicture() ? StringUtils.EMPTY : customerModel
						.getProfilePicture().getURL2()));
			}

			target.setAge(source.getAge());
			target.setComplexion(source.getComplexion().toString());
			target.setGender(source.getGender());
			target.setDevicetoken(source.getDevicetoken());
			target.setCameraid(source.getCameraid());
			target.setMobiletype(source.getMobiletype());
			final List<PromotionData> promotionsDatas = new ArrayList<PromotionData>();
			if (CollectionUtils.isNotEmpty(source.getPromotions()))
			{
				for (final AbstractPromotionModel model : source.getPromotions())
				{
					promotionsDatas.add(promotionsConverter.convert(model));
				}
				target.setPromotions(promotionsDatas);
			}
		}


	}

}
