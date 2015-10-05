/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Aug 28, 2015 3:11:41 PM                     ---
 * ----------------------------------------------------------------
 */
package com.acc.jalo;

import com.acc.constants.QrcodeConstants;
import com.acc.jalo.CSRCustomerDetails;
import com.acc.jalo.CollectOrder;
import com.acc.jalo.Config;
import de.hybris.platform.cms2lib.components.UCOIDOnOrderConfirmationComponent;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.order.AbstractOrder;
import de.hybris.platform.jalo.order.Order;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.security.Principal;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>QrcodeManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedQrcodeManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("recentlyviewedproducts", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.User", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("UUID", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Customer", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("UCOID", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.order.Order", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public CollectOrder createCollectOrder(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( QrcodeConstants.TC.COLLECTORDER );
			return (CollectOrder)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CollectOrder : "+e.getMessage(), 0 );
		}
	}
	
	public CollectOrder createCollectOrder(final Map attributeValues)
	{
		return createCollectOrder( getSession().getSessionContext(), attributeValues );
	}
	
	public Config createConfig(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( QrcodeConstants.TC.CONFIG );
			return (Config)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Config : "+e.getMessage(), 0 );
		}
	}
	
	public Config createConfig(final Map attributeValues)
	{
		return createConfig( getSession().getSessionContext(), attributeValues );
	}
	
	public CSRCustomerDetails createCSRCustomerDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( QrcodeConstants.TC.CSRCUSTOMERDETAILS );
			return (CSRCustomerDetails)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CSRCustomerDetails : "+e.getMessage(), 0 );
		}
	}
	
	public CSRCustomerDetails createCSRCustomerDetails(final Map attributeValues)
	{
		return createCSRCustomerDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public UCOIDOnOrderConfirmationComponent createUCOIDOnOrderConfirmationComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( QrcodeConstants.TC.UCOIDONORDERCONFIRMATIONCOMPONENT );
			return (UCOIDOnOrderConfirmationComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating UCOIDOnOrderConfirmationComponent : "+e.getMessage(), 0 );
		}
	}
	
	public UCOIDOnOrderConfirmationComponent createUCOIDOnOrderConfirmationComponent(final Map attributeValues)
	{
		return createUCOIDOnOrderConfirmationComponent( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return QrcodeConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.recentlyviewedproducts</code> attribute.
	 * @return the recentlyviewedproducts
	 */
	public Collection<Product> getRecentlyviewedproducts(final SessionContext ctx, final User item)
	{
		Collection<Product> coll = (Collection<Product>)item.getProperty( ctx, QrcodeConstants.Attributes.User.RECENTLYVIEWEDPRODUCTS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.recentlyviewedproducts</code> attribute.
	 * @return the recentlyviewedproducts
	 */
	public Collection<Product> getRecentlyviewedproducts(final User item)
	{
		return getRecentlyviewedproducts( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>User.recentlyviewedproducts</code> attribute. 
	 * @param value the recentlyviewedproducts
	 */
	public void setRecentlyviewedproducts(final SessionContext ctx, final User item, final Collection<Product> value)
	{
		item.setProperty(ctx, QrcodeConstants.Attributes.User.RECENTLYVIEWEDPRODUCTS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>User.recentlyviewedproducts</code> attribute. 
	 * @param value the recentlyviewedproducts
	 */
	public void setRecentlyviewedproducts(final User item, final Collection<Product> value)
	{
		setRecentlyviewedproducts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.UCOID</code> attribute.
	 * @return the UCOID - Customer unique code
	 */
	public String getUCOID(final SessionContext ctx, final Order item)
	{
		return (String)item.getProperty( ctx, QrcodeConstants.Attributes.Order.UCOID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.UCOID</code> attribute.
	 * @return the UCOID - Customer unique code
	 */
	public String getUCOID(final Order item)
	{
		return getUCOID( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.UCOID</code> attribute. 
	 * @param value the UCOID - Customer unique code
	 */
	public void setUCOID(final SessionContext ctx, final Order item, final String value)
	{
		item.setProperty(ctx, QrcodeConstants.Attributes.Order.UCOID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.UCOID</code> attribute. 
	 * @param value the UCOID - Customer unique code
	 */
	public void setUCOID(final Order item, final String value)
	{
		setUCOID( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.UUID</code> attribute.
	 * @return the UUID - Customer universally unique id for a device
	 */
	public String getUUID(final SessionContext ctx, final Customer item)
	{
		return (String)item.getProperty( ctx, QrcodeConstants.Attributes.Customer.UUID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.UUID</code> attribute.
	 * @return the UUID - Customer universally unique id for a device
	 */
	public String getUUID(final Customer item)
	{
		return getUUID( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.UUID</code> attribute. 
	 * @param value the UUID - Customer universally unique id for a device
	 */
	public void setUUID(final SessionContext ctx, final Customer item, final String value)
	{
		item.setProperty(ctx, QrcodeConstants.Attributes.Customer.UUID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.UUID</code> attribute. 
	 * @param value the UUID - Customer universally unique id for a device
	 */
	public void setUUID(final Customer item, final String value)
	{
		setUUID( getSession().getSessionContext(), item, value );
	}
	
}
