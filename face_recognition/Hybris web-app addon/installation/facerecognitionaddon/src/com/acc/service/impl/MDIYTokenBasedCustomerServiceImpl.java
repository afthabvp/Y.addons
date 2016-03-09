/**
 * 
 */
package com.acc.service.impl;

import javax.annotation.Resource;

import com.acc.dao.MDIYTokenBasedCustomerDao;
import com.acc.model.CSRCustomerDetailsModel;
import com.acc.service.MDIYTokenBasedCustomerService;


/**
 * @author swapnil.a.pandey
 * 
 */
public class MDIYTokenBasedCustomerServiceImpl implements MDIYTokenBasedCustomerService
{
	@Resource(name = "mDIYTokenBasedCustomerDao")
	MDIYTokenBasedCustomerDao mDIYTokenBasedCustomerDao;

	/**
	 * @return the mDIYTokenBasedCustomerDao
	 */
	public MDIYTokenBasedCustomerDao getmDIYTokenBasedCustomerDao()
	{
		return mDIYTokenBasedCustomerDao;
	}

	/**
	 * @param mDIYTokenBasedCustomerDao
	 *           the mDIYTokenBasedCustomerDao to set
	 */
	public void setmDIYTokenBasedCustomerDao(final MDIYTokenBasedCustomerDao mDIYTokenBasedCustomerDao)
	{
		this.mDIYTokenBasedCustomerDao = mDIYTokenBasedCustomerDao;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.acc.service.MDIYTokenBasedCustomerService#getTokenBasedOnCustomer(java.lang.String)
	 */
	@Override
	public CSRCustomerDetailsModel getTokenBasedOnCustomer(final String devicetoken)
	{
		// YTODO Auto-generated method stub
		return mDIYTokenBasedCustomerDao.getTokenBasedOnCustomer(devicetoken);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.acc.service.MDIYTokenBasedCustomerService#getTokenCustomer()
	 */
	@Override
	public List<CSRCustomerDetailsModel> getTokenCustomer()
	{
		// YTODO Auto-generated method stub
		return mDIYTokenBasedCustomerDao.getTokenCustomer();
	}

}
