/**
 * 
 */
package com.acc.facade.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;

import javax.annotation.Resource;

import com.acc.facade.FaceRecogPromotionsFacade;
import com.acc.facades.CSRCustomerDetails.data.CSRCustomerDetailsData;
import com.acc.model.CSRCustomerDetailsModel;
import com.acc.service.FaceRecogPromotionsService;


/**
 * @author swapnil.a.pandey
 * 
 */
public class FaceRecogPromotionsFacadeImpl implements FaceRecogPromotionsFacade
{
	@Resource(name = "faceRecogPromotionsService")
	FaceRecogPromotionsService faceRecogPromotionsService;


	@Resource(name = "csrCustomerDetailsConverter")
	private Converter<CSRCustomerDetailsModel, CSRCustomerDetailsData> csrCustomerDetailsConverter;

	/**
	 * @return the csrCustomerDetailsConverter
	 */
	public Converter<CSRCustomerDetailsModel, CSRCustomerDetailsData> getCsrCustomerDetailsConverter()
	{
		return csrCustomerDetailsConverter;
	}


	/**
	 * @param csrCustomerDetailsConverter
	 *           the csrCustomerDetailsConverter to set
	 */
	public void setCsrCustomerDetailsConverter(
			final Converter<CSRCustomerDetailsModel, CSRCustomerDetailsData> csrCustomerDetailsConverter)
	{
		this.csrCustomerDetailsConverter = csrCustomerDetailsConverter;
	}


	/**
	 * @return the faceRecogPromotionsService
	 */
	public FaceRecogPromotionsService getFaceRecogPromotionsService()
	{
		return faceRecogPromotionsService;
	}


	/**
	 * @param faceRecogPromotionsService
	 *           the faceRecogPromotionsService to set
	 */
	public void setFaceRecogPromotionsService(final FaceRecogPromotionsService faceRecogPromotionsService)
	{
		this.faceRecogPromotionsService = faceRecogPromotionsService;
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see com.acc.facade.FaceRecogPromotionsService#getPromotionsBasedOnCamera(java.lang.String)
	 */
	@Override
	public CSRCustomerDetailsData getPromotionsBasedOnCamera(final String name)
	{
		// YTODO Auto-generated method stub
		return csrCustomerDetailsConverter.convert(faceRecogPromotionsService.getPromotionsBasedOnCamera(name));
	}

}
