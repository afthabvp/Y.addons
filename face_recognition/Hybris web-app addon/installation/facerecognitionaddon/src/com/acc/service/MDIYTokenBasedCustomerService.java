/**
 * 
 */
package com.acc.service;

import com.acc.model.CSRCustomerDetailsModel;


/**
 * @author swapnil.a.pandey
 * 
 */
public interface MDIYTokenBasedCustomerService
{
	public CSRCustomerDetailsModel getTokenBasedOnCustomer(String devicetoken);

}
