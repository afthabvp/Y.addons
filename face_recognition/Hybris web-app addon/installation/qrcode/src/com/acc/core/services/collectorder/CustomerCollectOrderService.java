/**
 *
 */
package com.acc.core.services.collectorder;

import de.hybris.platform.core.model.order.OrderModel;

import java.util.List;

import com.acc.facades.collectOrder.data.CollectOrderData;
import com.acc.model.CollectOrderModel;


/**
 * @author prasun.a.kumar
 *
 */
public interface CustomerCollectOrderService
{
	/**
	 * It is through this table the queue for order (that needs to be collected) will be managed by CSR agent, hence it
	 * needs to be updated every time with latest values.
	 *
	 * @param collectOrderModel
	 *           Indicates Customer collect Order details.
	 */
	public void saveCustomerColectOrder(CollectOrderModel collectOrderModel);

	/**
	 *
	 * @return List<CollectOrderModel>
	 */
	public List<CollectOrderModel> getCollectOrders();

	/**
	 * @param ucoid
	 * @return CollectOrderData
	 */
	public CollectOrderModel getCollectOrderByUCOID(String ucoid);

	/**
	 * @param orderCode
	 * @return CollectOrderModel
	 */
	public CollectOrderModel getCollectOrderByOrderCode(String orderCode);


	/**
	 *
	 * @param customerID
	 * @return
	 */
	public List<CollectOrderModel> getCustomerListOrders(final String customerID);

	/**
	 * @param collectOrderData
	 */
	public void updateCollectOrder(CollectOrderData collectOrderData);

	/**
	 * @param orderCode
	 * @return OrderModel
	 */
	public OrderModel getOrderDetailsForCode(String orderCode);

	/**
	 * @param fromDate
	 * @param toDate
	 * @param fromTime
	 * @param toTime
	 * @return List<CollectOrderModel>
	 */
	public List<CollectOrderModel> getCollectOrderByDateAndTime(String fromDate, String toDate, String fromTime, String toTime);

	/**
	 * @param status
	 * @return List<CollectOrderModel>
	 */
	public List<CollectOrderModel> getCollectOrdersByStatus(String status);

}
