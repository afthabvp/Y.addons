/**
 * 
 */
package com.acc.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.Logger;

import com.acc.dao.FaceRecogPromotionsDao;
import com.acc.model.CSRCustomerDetailsModel;


/**
 * @author swapnil.a.pandey
 * 
 */
public class FaceRecogPromotionsDaoImpl extends AbstractItemDao implements FaceRecogPromotionsDao
{
	private static final Logger LOG = Logger.getLogger(FaceRecogPromotionsDaoImpl.class);


	/*
	 * (non-Javadoc)
	 * 
	 * @see com.acc.dao.FaceRecogPromotionsDao#getPromotionsBasedOnCamera(java.lang.String)
	 */

	@Override
	public CSRCustomerDetailsModel getPromotionsBasedOnCamera(final String cameraId)
	{

		LOG.info("::::::::::customerHealthDataModel :::::::::");
		final FlexibleSearchQuery flexibleQuery = new FlexibleSearchQuery(
				"select {pk} from {CSRCustomerDetailsModel} where {cameraid}='" + cameraId + "'");
		final SearchResult<CSRCustomerDetailsModel> result = getFlexibleSearchService().search(flexibleQuery);
		return result != null && CollectionUtils.isNotEmpty(result.getResult()) ? result.getResult().get(0)
				: new CSRCustomerDetailsModel();


	}

}
