/**
 * 
 */
package com.acc.facade;

import java.util.List;

import com.acc.facades.CSRCustomerDetails.data.CSRCustomerDetailsData;


/**
 * @author swapnil.a.pandey
 * 
 */
public interface MDIYTokenBasedCustomerFacade
{
	public CSRCustomerDetailsData getTokenBasedOnCustomer(String devicetoken);

	public List<CSRCustomerDetailsData> getTokenCustomer();
}
