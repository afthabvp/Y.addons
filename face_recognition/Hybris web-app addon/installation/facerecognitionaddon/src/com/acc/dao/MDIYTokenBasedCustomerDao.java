/**
 * 
 */
package com.acc.dao;

import java.util.List;

import com.acc.model.CSRCustomerDetailsModel;


/**
 * @author swapnil.a.pandey
 * 
 */
public interface MDIYTokenBasedCustomerDao
{
	public CSRCustomerDetailsModel getTokenBasedOnCustomer(String devicetoken);

	public List<CSRCustomerDetailsModel> getTokenCustomer();

	public CSRCustomerDetailsModel isCustomerFound(String customerid);

}
