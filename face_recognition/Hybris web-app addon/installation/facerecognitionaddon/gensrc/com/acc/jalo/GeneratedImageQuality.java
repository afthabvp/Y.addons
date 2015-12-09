/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Dec 7, 2015 12:46:45 AM                     ---
 * ----------------------------------------------------------------
 */
package com.acc.jalo;

import com.acc.constants.FacerecognitionaddonConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem ImageQuality}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedImageQuality extends GenericItem
{
	/** Qualifier of the <code>ImageQuality.identityId</code> attribute **/
	public static final String IDENTITYID = "identityId";
	/** Qualifier of the <code>ImageQuality.qualityScore</code> attribute **/
	public static final String QUALITYSCORE = "qualityScore";
	/** Qualifier of the <code>ImageQuality.customer</code> attribute **/
	public static final String CUSTOMER = "customer";
	/** Qualifier of the <code>ImageQuality.imagePath</code> attribute **/
	public static final String IMAGEPATH = "imagePath";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CUSTOMER's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedImageQuality> CUSTOMERHANDLER = new BidirectionalOneToManyHandler<GeneratedImageQuality>(
	FacerecognitionaddonConstants.TC.IMAGEQUALITY,
	false,
	"customer",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(IDENTITYID, AttributeMode.INITIAL);
		tmp.put(QUALITYSCORE, AttributeMode.INITIAL);
		tmp.put(CUSTOMER, AttributeMode.INITIAL);
		tmp.put(IMAGEPATH, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		CUSTOMERHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ImageQuality.customer</code> attribute.
	 * @return the customer
	 */
	public Customer getCustomer(final SessionContext ctx)
	{
		return (Customer)getProperty( ctx, CUSTOMER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ImageQuality.customer</code> attribute.
	 * @return the customer
	 */
	public Customer getCustomer()
	{
		return getCustomer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ImageQuality.customer</code> attribute. 
	 * @param value the customer
	 */
	public void setCustomer(final SessionContext ctx, final Customer value)
	{
		CUSTOMERHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ImageQuality.customer</code> attribute. 
	 * @param value the customer
	 */
	public void setCustomer(final Customer value)
	{
		setCustomer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ImageQuality.identityId</code> attribute.
	 * @return the identityId - BiometricId
	 */
	public String getIdentityId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, IDENTITYID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ImageQuality.identityId</code> attribute.
	 * @return the identityId - BiometricId
	 */
	public String getIdentityId()
	{
		return getIdentityId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ImageQuality.identityId</code> attribute. 
	 * @param value the identityId - BiometricId
	 */
	public void setIdentityId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, IDENTITYID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ImageQuality.identityId</code> attribute. 
	 * @param value the identityId - BiometricId
	 */
	public void setIdentityId(final String value)
	{
		setIdentityId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ImageQuality.imagePath</code> attribute.
	 * @return the imagePath - Customer's Image
	 */
	public String getImagePath(final SessionContext ctx)
	{
		return (String)getProperty( ctx, IMAGEPATH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ImageQuality.imagePath</code> attribute.
	 * @return the imagePath - Customer's Image
	 */
	public String getImagePath()
	{
		return getImagePath( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ImageQuality.imagePath</code> attribute. 
	 * @param value the imagePath - Customer's Image
	 */
	public void setImagePath(final SessionContext ctx, final String value)
	{
		setProperty(ctx, IMAGEPATH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ImageQuality.imagePath</code> attribute. 
	 * @param value the imagePath - Customer's Image
	 */
	public void setImagePath(final String value)
	{
		setImagePath( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ImageQuality.qualityScore</code> attribute.
	 * @return the qualityScore - quality of the photo uploaded
	 */
	public String getQualityScore(final SessionContext ctx)
	{
		return (String)getProperty( ctx, QUALITYSCORE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ImageQuality.qualityScore</code> attribute.
	 * @return the qualityScore - quality of the photo uploaded
	 */
	public String getQualityScore()
	{
		return getQualityScore( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ImageQuality.qualityScore</code> attribute. 
	 * @param value the qualityScore - quality of the photo uploaded
	 */
	public void setQualityScore(final SessionContext ctx, final String value)
	{
		setProperty(ctx, QUALITYSCORE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ImageQuality.qualityScore</code> attribute. 
	 * @param value the qualityScore - quality of the photo uploaded
	 */
	public void setQualityScore(final String value)
	{
		setQualityScore( getSession().getSessionContext(), value );
	}
	
}
