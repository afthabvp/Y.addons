/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2014 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */
package com.acc.services;

import de.hybris.platform.core.model.user.CustomerModel;


public interface StoreLoginService
{

	public String saveCustomerLoginDetails(String uuID, String storeID, String customerID);

	public CustomerModel isCustomerFound(final String customerID);
}
