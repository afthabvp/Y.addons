/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Aug 28, 2015 3:11:41 PM                     ---
 * ----------------------------------------------------------------
 */
package com.acc.jalo;

import com.acc.constants.QrcodeConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem CollectOrder}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCollectOrder extends GenericItem
{
	/** Qualifier of the <code>CollectOrder.UCOID</code> attribute **/
	public static final String UCOID = "UCOID";
	/** Qualifier of the <code>CollectOrder.OID</code> attribute **/
	public static final String OID = "OID";
	/** Qualifier of the <code>CollectOrder.Status</code> attribute **/
	public static final String STATUS = "Status";
	/** Qualifier of the <code>CollectOrder.PID</code> attribute **/
	public static final String PID = "PID";
	/** Qualifier of the <code>CollectOrder.CID</code> attribute **/
	public static final String CID = "CID";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(UCOID, AttributeMode.INITIAL);
		tmp.put(OID, AttributeMode.INITIAL);
		tmp.put(STATUS, AttributeMode.INITIAL);
		tmp.put(PID, AttributeMode.INITIAL);
		tmp.put(CID, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CollectOrder.CID</code> attribute.
	 * @return the CID
	 */
	public String getCID(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CollectOrder.CID</code> attribute.
	 * @return the CID
	 */
	public String getCID()
	{
		return getCID( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CollectOrder.CID</code> attribute. 
	 * @param value the CID
	 */
	public void setCID(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CollectOrder.CID</code> attribute. 
	 * @param value the CID
	 */
	public void setCID(final String value)
	{
		setCID( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CollectOrder.OID</code> attribute.
	 * @return the OID
	 */
	public String getOID(final SessionContext ctx)
	{
		return (String)getProperty( ctx, OID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CollectOrder.OID</code> attribute.
	 * @return the OID
	 */
	public String getOID()
	{
		return getOID( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CollectOrder.OID</code> attribute. 
	 * @param value the OID
	 */
	public void setOID(final SessionContext ctx, final String value)
	{
		setProperty(ctx, OID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CollectOrder.OID</code> attribute. 
	 * @param value the OID
	 */
	public void setOID(final String value)
	{
		setOID( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CollectOrder.PID</code> attribute.
	 * @return the PID
	 */
	public String getPID(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CollectOrder.PID</code> attribute.
	 * @return the PID
	 */
	public String getPID()
	{
		return getPID( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CollectOrder.PID</code> attribute. 
	 * @param value the PID
	 */
	public void setPID(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CollectOrder.PID</code> attribute. 
	 * @param value the PID
	 */
	public void setPID(final String value)
	{
		setPID( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CollectOrder.Status</code> attribute.
	 * @return the Status
	 */
	public String getStatus(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CollectOrder.Status</code> attribute.
	 * @return the Status
	 */
	public String getStatus()
	{
		return getStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CollectOrder.Status</code> attribute. 
	 * @param value the Status
	 */
	public void setStatus(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CollectOrder.Status</code> attribute. 
	 * @param value the Status
	 */
	public void setStatus(final String value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CollectOrder.UCOID</code> attribute.
	 * @return the UCOID
	 */
	public String getUCOID(final SessionContext ctx)
	{
		return (String)getProperty( ctx, UCOID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CollectOrder.UCOID</code> attribute.
	 * @return the UCOID
	 */
	public String getUCOID()
	{
		return getUCOID( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CollectOrder.UCOID</code> attribute. 
	 * @param value the UCOID
	 */
	public void setUCOID(final SessionContext ctx, final String value)
	{
		setProperty(ctx, UCOID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CollectOrder.UCOID</code> attribute. 
	 * @param value the UCOID
	 */
	public void setUCOID(final String value)
	{
		setUCOID( getSession().getSessionContext(), value );
	}
	
}
