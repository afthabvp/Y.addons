/**
 * 
 */
package com.acc.facade.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import com.acc.facade.MDIYTokenBasedCustomerFacade;
import com.acc.facades.CSRCustomerDetails.data.CSRCustomerDetailsData;
import com.acc.model.CSRCustomerDetailsModel;
import com.acc.service.MDIYTokenBasedCustomerService;


/**
 * @author swapnil.a.pandey
 * 
 */
public class MDIYTokenBasedCustomerFacadeImpl implements MDIYTokenBasedCustomerFacade
{
	@Resource(name = "mDIYTokenBasedCustomerService")
	MDIYTokenBasedCustomerService mDIYTokenBasedCustomerService;

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
	 * @return the mDIYTokenBasedCustomerService
	 */
	public MDIYTokenBasedCustomerService getmDIYTokenBasedCustomerService()
	{
		return mDIYTokenBasedCustomerService;
	}

	/**
	 * @param mDIYTokenBasedCustomerService
	 *           the mDIYTokenBasedCustomerService to set
	 */
	public void setmDIYTokenBasedCustomerService(final MDIYTokenBasedCustomerService mDIYTokenBasedCustomerService)
	{
		this.mDIYTokenBasedCustomerService = mDIYTokenBasedCustomerService;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.acc.facade.MDIYTokenBasedCustomerFacade#getTokenBasedOnCustomer(java.lang.String)
	 */
	@Override
	public CSRCustomerDetailsData getTokenBasedOnCustomer(final String devicetoken)
	{
		final CSRCustomerDetailsModel model = mDIYTokenBasedCustomerService.getTokenBasedOnCustomer(devicetoken);

		return csrCustomerDetailsConverter.convert(model);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.acc.facade.MDIYTokenBasedCustomerFacade#getTokenCustomer()
	 */
	@Override
	public List<CSRCustomerDetailsData> getTokenCustomer()
	{
		final List<CSRCustomerDetailsModel> model = mDIYTokenBasedCustomerService.getTokenCustomer();

		//final List<CSRCustomerDetailsModel> csrModel = new ArrayList<CSRCustomerDetailsModel>();
		CSRCustomerDetailsData data = new CSRCustomerDetailsData();

		final List<CSRCustomerDetailsData> csrDataList = new ArrayList<CSRCustomerDetailsData>();

		for (final CSRCustomerDetailsModel csrModel : model)
		{
			data = csrCustomerDetailsConverter.convert(csrModel);
			csrDataList.add(data);
		}
		return csrDataList;
	}
}
