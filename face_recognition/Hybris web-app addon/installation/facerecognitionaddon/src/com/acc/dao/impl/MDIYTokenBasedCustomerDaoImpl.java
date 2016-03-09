/**
 * 
 */
package com.acc.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.acc.dao.MDIYTokenBasedCustomerDao#getTokenCustomer()
	 */
	@Override
	public List<CSRCustomerDetailsModel> getTokenCustomer()
	{
		final FlexibleSearchQuery query = new FlexibleSearchQuery(
				"select {pk} from {CSRCustomerDetails} where {devicetoken} IS NOT NULL");
		final SearchResult<CSRCustomerDetailsModel> result = getFlexibleSearchService().search(query);
		return result.getResult();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.acc.dao.MDIYTokenBasedCustomerDao#isCustomerFound(java.lang.String)
	 */
	@Override
	public CSRCustomerDetailsModel isCustomerFound(final String customerid)
	{
		FlexibleSearchQuery flexibleQuery = null;
		if (customerid.contains("@"))
		{
			flexibleQuery = new FlexibleSearchQuery("select {pk} from {CSRCustomerDetails} where {customerId} like '" + customerid
					+ "%'");
		}
		else
		{
			flexibleQuery = new FlexibleSearchQuery("select {pk} from {CSRCustomerDetails} where {customerId} like '%#" + customerid
					+ "#%'");
		}

		final SearchResult<CSRCustomerDetailsModel> result = getFlexibleSearchService().search(flexibleQuery);

		return CollectionUtils.isEmpty(result.getResult()) ? null : result.getResult().get(0);
	}

}
