/**
 * 
 */
package com.acc.service.impl;

import de.hybris.platform.commercefacades.product.data.PromotionData;
import de.hybris.platform.promotions.model.AbstractPromotionModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.user.UserService;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.acc.dao.FaceRecogPromotionsDao;
import com.acc.model.CSRCustomerDetailsModel;
import com.acc.service.FaceRecogPromotionsService;


/**
 * @author swapnil.a.pandey
 * 
 */
public class FaceRecogPromotionsServiceImpl implements FaceRecogPromotionsService
{
	private static final Logger LOG = Logger.getLogger(FaceRecogPromotionsServiceImpl.class);
	@Resource(name = "faceRecogPromotionsDao")
	FaceRecogPromotionsDao faceRecogPromotionsDao;
	@Resource(name = "promotionsConverter")
	private Converter<AbstractPromotionModel, PromotionData> promotionsConverter;
	@Resource(name = "userService")
	UserService userService;

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
	public void setPromoonverter(final Converter<AbstractPromotionModel, PromotionData> promotionsConverter)
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

	/**
	 * @return the faceRecogPromotionsDao
	 */
	public FaceRecogPromotionsDao getFaceRecogPromotionsDao()
	{
		return faceRecogPromotionsDao;
	}

	/**
	 * @param faceRecogPromotionsDao
	 *           the faceRecogPromotionsDao to set
	 */
	public void setFaceRecogPromotionsDao(final FaceRecogPromotionsDao faceRecogPromotionsDao)
	{
		this.faceRecogPromotionsDao = faceRecogPromotionsDao;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.acc.service.FaceRecogPromotionsService#getPromotionsBasedOnCamera(java.lang.String)
	 */
	@Override
	public CSRCustomerDetailsModel getPromotionsBasedOnCamera(final String cameraId)
	{
		return faceRecogPromotionsDao.getPromotionsBasedOnCamera(cameraId);
	}
}
