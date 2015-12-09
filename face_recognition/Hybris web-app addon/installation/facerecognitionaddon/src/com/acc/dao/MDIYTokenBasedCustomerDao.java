/**
 * 
 */
package com.acc.dao;

import com.acc.model.CSRCustomerDetailsModel;


/**
 * @author swapnil.a.pandey
 * 
 */
public interface MDIYTokenBasedCustomerDao
{
	public CSRCustomerDetailsModel getTokenBasedOnCustomer(String devicetoken);

}
