/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Dec 7, 2015 12:46:45 AM                     ---
 * ----------------------------------------------------------------
 */
package com.acc.jalo;

import com.acc.constants.FacerecognitionaddonConstants;
import com.acc.jalo.CSRCustomerDetails;
import com.acc.jalo.ImageQuality;
import com.acc.jalo.cronjob.PersistCustomerImagesCronJob;
import de.hybris.platform.cms2lib.components.FaceRecognitionComponent;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.promotions.jalo.AbstractPromotion;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type <code>FacerecognitionaddonManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedFacerecognitionaddonManager extends Extension
{
	/** Relation ordering override parameter constants for Camera2PromotionsRel from ((facerecognitionaddon))*/
	protected static String CAMERA2PROMOTIONSREL_SRC_ORDERED = "relation.Camera2PromotionsRel.source.ordered";
	protected static String CAMERA2PROMOTIONSREL_TGT_ORDERED = "relation.Camera2PromotionsRel.target.ordered";
	/** Relation disable markmodifed parameter constants for Camera2PromotionsRel from ((facerecognitionaddon))*/
	protected static String CAMERA2PROMOTIONSREL_MARKMODIFIED = "relation.Camera2PromotionsRel.markmodified";
	/**
	* {@link OneToManyHandler} for handling 1:n IMAGEQUALITY's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ImageQuality> CUSTOMER2IMAGEQUALITYRELIMAGEQUALITYHANDLER = new OneToManyHandler<ImageQuality>(
	FacerecognitionaddonConstants.TC.IMAGEQUALITY,
	false,
	"customer",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("age", AttributeMode.INITIAL);
		tmp.put("complexion", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Customer", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("gender", AttributeMode.INITIAL);
		tmp.put("imageUrl", AttributeMode.INITIAL);
		tmp.put("welcomeMessage", AttributeMode.INITIAL);
		tmp.put("age", AttributeMode.INITIAL);
		tmp.put("cameraid", AttributeMode.INITIAL);
		tmp.put("complexion", AttributeMode.INITIAL);
		tmp.put("devicetoken", AttributeMode.INITIAL);
		ttmp.put("com.acc.jalo.CSRCustomerDetails", Collections.unmodifiableMap(tmp));
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
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.age</code> attribute.
	 * @return the age
	 */
	public Integer getAge(final SessionContext ctx, final Customer item)
	{
		return (Integer)item.getProperty( ctx, FacerecognitionaddonConstants.Attributes.Customer.AGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.age</code> attribute.
	 * @return the age
	 */
	public Integer getAge(final Customer item)
	{
		return getAge( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.age</code> attribute. 
	 * @return the age
	 */
	public int getAgeAsPrimitive(final SessionContext ctx, final Customer item)
	{
		Integer value = getAge( ctx,item );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.age</code> attribute. 
	 * @return the age
	 */
	public int getAgeAsPrimitive(final Customer item)
	{
		return getAgeAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.age</code> attribute. 
	 * @param value the age
	 */
	public void setAge(final SessionContext ctx, final Customer item, final Integer value)
	{
		item.setProperty(ctx, FacerecognitionaddonConstants.Attributes.Customer.AGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.age</code> attribute. 
	 * @param value the age
	 */
	public void setAge(final Customer item, final Integer value)
	{
		setAge( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.age</code> attribute. 
	 * @param value the age
	 */
	public void setAge(final SessionContext ctx, final Customer item, final int value)
	{
		setAge( ctx, item, Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.age</code> attribute. 
	 * @param value the age
	 */
	public void setAge(final Customer item, final int value)
	{
		setAge( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CSRCustomerDetails.age</code> attribute.
	 * @return the age - Customer's Age
	 */
	public String getAge(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, FacerecognitionaddonConstants.Attributes.CSRCustomerDetails.AGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CSRCustomerDetails.age</code> attribute.
	 * @return the age - Customer's Age
	 */
	public String getAge(final CSRCustomerDetails item)
	{
		return getAge( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CSRCustomerDetails.age</code> attribute. 
	 * @param value the age - Customer's Age
	 */
	public void setAge(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, FacerecognitionaddonConstants.Attributes.CSRCustomerDetails.AGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CSRCustomerDetails.age</code> attribute. 
	 * @param value the age - Customer's Age
	 */
	public void setAge(final CSRCustomerDetails item, final String value)
	{
		setAge( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPromotion.camera</code> attribute.
	 * @return the camera
	 */
	public List<CSRCustomerDetails> getCamera(final SessionContext ctx, final AbstractPromotion item)
	{
		final List<CSRCustomerDetails> items = item.getLinkedItems( 
			ctx,
			false,
			FacerecognitionaddonConstants.Relations.CAMERA2PROMOTIONSREL,
			null,
			Utilities.getRelationOrderingOverride(CAMERA2PROMOTIONSREL_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(CAMERA2PROMOTIONSREL_TGT_ORDERED, true)
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPromotion.camera</code> attribute.
	 * @return the camera
	 */
	public List<CSRCustomerDetails> getCamera(final AbstractPromotion item)
	{
		return getCamera( getSession().getSessionContext(), item );
	}
	
	public long getCameraCount(final SessionContext ctx, final AbstractPromotion item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			FacerecognitionaddonConstants.Relations.CAMERA2PROMOTIONSREL,
			null
		);
	}
	
	public long getCameraCount(final AbstractPromotion item)
	{
		return getCameraCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractPromotion.camera</code> attribute. 
	 * @param value the camera
	 */
	public void setCamera(final SessionContext ctx, final AbstractPromotion item, final List<CSRCustomerDetails> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			FacerecognitionaddonConstants.Relations.CAMERA2PROMOTIONSREL,
			null,
			value,
			Utilities.getRelationOrderingOverride(CAMERA2PROMOTIONSREL_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(CAMERA2PROMOTIONSREL_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(CAMERA2PROMOTIONSREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractPromotion.camera</code> attribute. 
	 * @param value the camera
	 */
	public void setCamera(final AbstractPromotion item, final List<CSRCustomerDetails> value)
	{
		setCamera( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to camera. 
	 * @param value the item to add to camera
	 */
	public void addToCamera(final SessionContext ctx, final AbstractPromotion item, final CSRCustomerDetails value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			FacerecognitionaddonConstants.Relations.CAMERA2PROMOTIONSREL,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(CAMERA2PROMOTIONSREL_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(CAMERA2PROMOTIONSREL_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(CAMERA2PROMOTIONSREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to camera. 
	 * @param value the item to add to camera
	 */
	public void addToCamera(final AbstractPromotion item, final CSRCustomerDetails value)
	{
		addToCamera( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from camera. 
	 * @param value the item to remove from camera
	 */
	public void removeFromCamera(final SessionContext ctx, final AbstractPromotion item, final CSRCustomerDetails value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			FacerecognitionaddonConstants.Relations.CAMERA2PROMOTIONSREL,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(CAMERA2PROMOTIONSREL_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(CAMERA2PROMOTIONSREL_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(CAMERA2PROMOTIONSREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from camera. 
	 * @param value the item to remove from camera
	 */
	public void removeFromCamera(final AbstractPromotion item, final CSRCustomerDetails value)
	{
		removeFromCamera( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CSRCustomerDetails.cameraid</code> attribute.
	 * @return the cameraid - camera id
	 */
	public String getCameraid(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, FacerecognitionaddonConstants.Attributes.CSRCustomerDetails.CAMERAID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CSRCustomerDetails.cameraid</code> attribute.
	 * @return the cameraid - camera id
	 */
	public String getCameraid(final CSRCustomerDetails item)
	{
		return getCameraid( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CSRCustomerDetails.cameraid</code> attribute. 
	 * @param value the cameraid - camera id
	 */
	public void setCameraid(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, FacerecognitionaddonConstants.Attributes.CSRCustomerDetails.CAMERAID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CSRCustomerDetails.cameraid</code> attribute. 
	 * @param value the cameraid - camera id
	 */
	public void setCameraid(final CSRCustomerDetails item, final String value)
	{
		setCameraid( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.complexion</code> attribute.
	 * @return the complexion
	 */
	public EnumerationValue getComplexion(final SessionContext ctx, final Customer item)
	{
		return (EnumerationValue)item.getProperty( ctx, FacerecognitionaddonConstants.Attributes.Customer.COMPLEXION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.complexion</code> attribute.
	 * @return the complexion
	 */
	public EnumerationValue getComplexion(final Customer item)
	{
		return getComplexion( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.complexion</code> attribute. 
	 * @param value the complexion
	 */
	public void setComplexion(final SessionContext ctx, final Customer item, final EnumerationValue value)
	{
		item.setProperty(ctx, FacerecognitionaddonConstants.Attributes.Customer.COMPLEXION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.complexion</code> attribute. 
	 * @param value the complexion
	 */
	public void setComplexion(final Customer item, final EnumerationValue value)
	{
		setComplexion( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CSRCustomerDetails.complexion</code> attribute.
	 * @return the complexion
	 */
	public EnumerationValue getComplexion(final SessionContext ctx, final GenericItem item)
	{
		return (EnumerationValue)item.getProperty( ctx, FacerecognitionaddonConstants.Attributes.CSRCustomerDetails.COMPLEXION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CSRCustomerDetails.complexion</code> attribute.
	 * @return the complexion
	 */
	public EnumerationValue getComplexion(final CSRCustomerDetails item)
	{
		return getComplexion( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CSRCustomerDetails.complexion</code> attribute. 
	 * @param value the complexion
	 */
	public void setComplexion(final SessionContext ctx, final GenericItem item, final EnumerationValue value)
	{
		item.setProperty(ctx, FacerecognitionaddonConstants.Attributes.CSRCustomerDetails.COMPLEXION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CSRCustomerDetails.complexion</code> attribute. 
	 * @param value the complexion
	 */
	public void setComplexion(final CSRCustomerDetails item, final EnumerationValue value)
	{
		setComplexion( getSession().getSessionContext(), item, value );
	}
	
	public FaceRecognitionComponent createFaceRecognitionComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( FacerecognitionaddonConstants.TC.FACERECOGNITIONCOMPONENT );
			return (FaceRecognitionComponent)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating FaceRecognitionComponent : "+e.getMessage(), 0 );
		}
	}
	
	public FaceRecognitionComponent createFaceRecognitionComponent(final Map attributeValues)
	{
		return createFaceRecognitionComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public ImageQuality createImageQuality(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( FacerecognitionaddonConstants.TC.IMAGEQUALITY );
			return (ImageQuality)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ImageQuality : "+e.getMessage(), 0 );
		}
	}
	
	public ImageQuality createImageQuality(final Map attributeValues)
	{
		return createImageQuality( getSession().getSessionContext(), attributeValues );
	}
	
	public PersistCustomerImagesCronJob createPersistCustomerImagesCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( FacerecognitionaddonConstants.TC.PERSISTCUSTOMERIMAGESCRONJOB );
			return (PersistCustomerImagesCronJob)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating PersistCustomerImagesCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public PersistCustomerImagesCronJob createPersistCustomerImagesCronJob(final Map attributeValues)
	{
		return createPersistCustomerImagesCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CSRCustomerDetails.devicetoken</code> attribute.
	 * @return the devicetoken - device token
	 */
	public String getDevicetoken(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, FacerecognitionaddonConstants.Attributes.CSRCustomerDetails.DEVICETOKEN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CSRCustomerDetails.devicetoken</code> attribute.
	 * @return the devicetoken - device token
	 */
	public String getDevicetoken(final CSRCustomerDetails item)
	{
		return getDevicetoken( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CSRCustomerDetails.devicetoken</code> attribute. 
	 * @param value the devicetoken - device token
	 */
	public void setDevicetoken(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, FacerecognitionaddonConstants.Attributes.CSRCustomerDetails.DEVICETOKEN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CSRCustomerDetails.devicetoken</code> attribute. 
	 * @param value the devicetoken - device token
	 */
	public void setDevicetoken(final CSRCustomerDetails item, final String value)
	{
		setDevicetoken( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CSRCustomerDetails.gender</code> attribute.
	 * @return the gender - Customer's Gender
	 */
	public String getGender(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, FacerecognitionaddonConstants.Attributes.CSRCustomerDetails.GENDER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CSRCustomerDetails.gender</code> attribute.
	 * @return the gender - Customer's Gender
	 */
	public String getGender(final CSRCustomerDetails item)
	{
		return getGender( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CSRCustomerDetails.gender</code> attribute. 
	 * @param value the gender - Customer's Gender
	 */
	public void setGender(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, FacerecognitionaddonConstants.Attributes.CSRCustomerDetails.GENDER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CSRCustomerDetails.gender</code> attribute. 
	 * @param value the gender - Customer's Gender
	 */
	public void setGender(final CSRCustomerDetails item, final String value)
	{
		setGender( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return FacerecognitionaddonConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.imageQuality</code> attribute.
	 * @return the imageQuality
	 */
	public Collection<ImageQuality> getImageQuality(final SessionContext ctx, final Customer item)
	{
		return CUSTOMER2IMAGEQUALITYRELIMAGEQUALITYHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.imageQuality</code> attribute.
	 * @return the imageQuality
	 */
	public Collection<ImageQuality> getImageQuality(final Customer item)
	{
		return getImageQuality( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.imageQuality</code> attribute. 
	 * @param value the imageQuality
	 */
	public void setImageQuality(final SessionContext ctx, final Customer item, final Collection<ImageQuality> value)
	{
		CUSTOMER2IMAGEQUALITYRELIMAGEQUALITYHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.imageQuality</code> attribute. 
	 * @param value the imageQuality
	 */
	public void setImageQuality(final Customer item, final Collection<ImageQuality> value)
	{
		setImageQuality( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to imageQuality. 
	 * @param value the item to add to imageQuality
	 */
	public void addToImageQuality(final SessionContext ctx, final Customer item, final ImageQuality value)
	{
		CUSTOMER2IMAGEQUALITYRELIMAGEQUALITYHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to imageQuality. 
	 * @param value the item to add to imageQuality
	 */
	public void addToImageQuality(final Customer item, final ImageQuality value)
	{
		addToImageQuality( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from imageQuality. 
	 * @param value the item to remove from imageQuality
	 */
	public void removeFromImageQuality(final SessionContext ctx, final Customer item, final ImageQuality value)
	{
		CUSTOMER2IMAGEQUALITYRELIMAGEQUALITYHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from imageQuality. 
	 * @param value the item to remove from imageQuality
	 */
	public void removeFromImageQuality(final Customer item, final ImageQuality value)
	{
		removeFromImageQuality( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CSRCustomerDetails.imageUrl</code> attribute.
	 * @return the imageUrl - Customer's Image
	 */
	public String getImageUrl(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, FacerecognitionaddonConstants.Attributes.CSRCustomerDetails.IMAGEURL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CSRCustomerDetails.imageUrl</code> attribute.
	 * @return the imageUrl - Customer's Image
	 */
	public String getImageUrl(final CSRCustomerDetails item)
	{
		return getImageUrl( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CSRCustomerDetails.imageUrl</code> attribute. 
	 * @param value the imageUrl - Customer's Image
	 */
	public void setImageUrl(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, FacerecognitionaddonConstants.Attributes.CSRCustomerDetails.IMAGEURL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CSRCustomerDetails.imageUrl</code> attribute. 
	 * @param value the imageUrl - Customer's Image
	 */
	public void setImageUrl(final CSRCustomerDetails item, final String value)
	{
		setImageUrl( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CSRCustomerDetails.promotions</code> attribute.
	 * @return the promotions
	 */
	public List<AbstractPromotion> getPromotions(final SessionContext ctx, final GenericItem item)
	{
		final List<AbstractPromotion> items = item.getLinkedItems( 
			ctx,
			true,
			FacerecognitionaddonConstants.Relations.CAMERA2PROMOTIONSREL,
			null,
			Utilities.getRelationOrderingOverride(CAMERA2PROMOTIONSREL_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(CAMERA2PROMOTIONSREL_TGT_ORDERED, true)
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CSRCustomerDetails.promotions</code> attribute.
	 * @return the promotions
	 */
	public List<AbstractPromotion> getPromotions(final CSRCustomerDetails item)
	{
		return getPromotions( getSession().getSessionContext(), item );
	}
	
	public long getPromotionsCount(final SessionContext ctx, final CSRCustomerDetails item)
	{
		return item.getLinkedItemsCount(
			ctx,
			true,
			FacerecognitionaddonConstants.Relations.CAMERA2PROMOTIONSREL,
			null
		);
	}
	
	public long getPromotionsCount(final CSRCustomerDetails item)
	{
		return getPromotionsCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CSRCustomerDetails.promotions</code> attribute. 
	 * @param value the promotions
	 */
	public void setPromotions(final SessionContext ctx, final GenericItem item, final List<AbstractPromotion> value)
	{
		item.setLinkedItems( 
			ctx,
			true,
			FacerecognitionaddonConstants.Relations.CAMERA2PROMOTIONSREL,
			null,
			value,
			Utilities.getRelationOrderingOverride(CAMERA2PROMOTIONSREL_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(CAMERA2PROMOTIONSREL_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(CAMERA2PROMOTIONSREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CSRCustomerDetails.promotions</code> attribute. 
	 * @param value the promotions
	 */
	public void setPromotions(final CSRCustomerDetails item, final List<AbstractPromotion> value)
	{
		setPromotions( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to promotions. 
	 * @param value the item to add to promotions
	 */
	public void addToPromotions(final SessionContext ctx, final GenericItem item, final AbstractPromotion value)
	{
		item.addLinkedItems( 
			ctx,
			true,
			FacerecognitionaddonConstants.Relations.CAMERA2PROMOTIONSREL,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(CAMERA2PROMOTIONSREL_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(CAMERA2PROMOTIONSREL_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(CAMERA2PROMOTIONSREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to promotions. 
	 * @param value the item to add to promotions
	 */
	public void addToPromotions(final CSRCustomerDetails item, final AbstractPromotion value)
	{
		addToPromotions( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from promotions. 
	 * @param value the item to remove from promotions
	 */
	public void removeFromPromotions(final SessionContext ctx, final GenericItem item, final AbstractPromotion value)
	{
		item.removeLinkedItems( 
			ctx,
			true,
			FacerecognitionaddonConstants.Relations.CAMERA2PROMOTIONSREL,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(CAMERA2PROMOTIONSREL_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(CAMERA2PROMOTIONSREL_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(CAMERA2PROMOTIONSREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from promotions. 
	 * @param value the item to remove from promotions
	 */
	public void removeFromPromotions(final CSRCustomerDetails item, final AbstractPromotion value)
	{
		removeFromPromotions( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CSRCustomerDetails.welcomeMessage</code> attribute.
	 * @return the welcomeMessage
	 */
	public String getWelcomeMessage(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, FacerecognitionaddonConstants.Attributes.CSRCustomerDetails.WELCOMEMESSAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CSRCustomerDetails.welcomeMessage</code> attribute.
	 * @return the welcomeMessage
	 */
	public String getWelcomeMessage(final CSRCustomerDetails item)
	{
		return getWelcomeMessage( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CSRCustomerDetails.welcomeMessage</code> attribute. 
	 * @param value the welcomeMessage
	 */
	public void setWelcomeMessage(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, FacerecognitionaddonConstants.Attributes.CSRCustomerDetails.WELCOMEMESSAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CSRCustomerDetails.welcomeMessage</code> attribute. 
	 * @param value the welcomeMessage
	 */
	public void setWelcomeMessage(final CSRCustomerDetails item, final String value)
	{
		setWelcomeMessage( getSession().getSessionContext(), item, value );
	}
	
}
