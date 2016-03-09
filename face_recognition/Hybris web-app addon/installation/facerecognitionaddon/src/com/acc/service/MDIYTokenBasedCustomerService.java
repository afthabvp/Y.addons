/**
 * 
 */
package com.acc.service;

import java.util.List;

import com.acc.model.CSRCustomerDetailsModel;


/**
 * @author swapnil.a.pandey
 * 
 */
public interface MDIYTokenBasedCustomerService
{
	public CSRCustomerDetailsModel getTokenBasedOnCustomer(String devicetoken);

	public List<CSRCustomerDetailsModel> getTokenCustomer();

}
