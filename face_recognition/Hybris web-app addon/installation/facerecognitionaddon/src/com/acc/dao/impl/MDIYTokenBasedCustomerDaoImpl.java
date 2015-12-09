/**
 * 
 */
package com.acc.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import org.apache.commons.collections.CollectionUtils;

import com.acc.dao.MDIYTokenBasedCustomerDao;
import com.acc.model.CSRCustomerDetailsModel;


/**
 * @author swapnil.a.pandey
 * 
 */
public class MDIYTokenBasedCustomerDaoImpl extends AbstractItemDao implements MDIYTokenBasedCustomerDao
{

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.acc.dao.MDIYTokenBasedCustomerDao#getTokenBasedOnCustomer(java.lang.String)
	 */
	@Override
	public CSRCustomerDetailsModel getTokenBasedOnCustomer(final String devicetoken)
	{
		final FlexibleSearchQuery query = new FlexibleSearchQuery("select {pk} from {CSRCustomerDetails} where {devicetoken}='"
				+ devicetoken + "'");
		final SearchResult<CSRCustomerDetailsModel> result = getFlexibleSearchService().search(query);
		return CollectionUtils.isEmpty(result.getResult()) ? null : result.getResult().get(0);
	}

}
