/**
 * 
 */
package com.acc.facade;

import com.acc.facades.CSRCustomerDetails.data.CSRCustomerDetailsData;


/**
 * @author swapnil.a.pandey
 * 
 */
public interface FaceRecogPromotionsFacade
{
	public CSRCustomerDetailsData getPromotionsBasedOnCamera(String name);
}
