/**
 * 
 */
package com.acc.dao;

import com.acc.model.CSRCustomerDetailsModel;


/**
 * @author swapnil.a.pandey
 * 
 */
public interface FaceRecogPromotionsDao
{
	public CSRCustomerDetailsModel getPromotionsBasedOnCamera(String cameraId);


}
