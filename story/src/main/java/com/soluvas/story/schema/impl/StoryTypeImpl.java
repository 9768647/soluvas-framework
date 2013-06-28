/**
 */
package com.soluvas.story.schema.impl;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.osgi.framework.Bundle;
import org.soluvas.commons.CommonsPackage;
import org.soluvas.commons.EClassLinked;
import org.soluvas.commons.EClassStatus;
import org.soluvas.commons.JavaClassLinked;
import org.soluvas.commons.JavaClassStatus;
import org.soluvas.commons.NameContainer;
import org.soluvas.commons.Nameable;
import org.soluvas.commons.ResourceType;

import com.soluvas.story.Story;
import com.soluvas.story.schema.SchemaPackage;
import com.soluvas.story.schema.StoryType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Story Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.soluvas.story.schema.impl.StoryTypeImpl#getResourceType <em>Resource Type</em>}</li>
 *   <li>{@link com.soluvas.story.schema.impl.StoryTypeImpl#getResourceUri <em>Resource Uri</em>}</li>
 *   <li>{@link com.soluvas.story.schema.impl.StoryTypeImpl#getResourceName <em>Resource Name</em>}</li>
 *   <li>{@link com.soluvas.story.schema.impl.StoryTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.soluvas.story.schema.impl.StoryTypeImpl#getJavaClassName <em>Java Class Name</em>}</li>
 *   <li>{@link com.soluvas.story.schema.impl.StoryTypeImpl#getJavaClass <em>Java Class</em>}</li>
 *   <li>{@link com.soluvas.story.schema.impl.StoryTypeImpl#getJavaClassStatus <em>Java Class Status</em>}</li>
 *   <li>{@link com.soluvas.story.schema.impl.StoryTypeImpl#getEClass <em>EClass</em>}</li>
 *   <li>{@link com.soluvas.story.schema.impl.StoryTypeImpl#getEClassStatus <em>EClass Status</em>}</li>
 *   <li>{@link com.soluvas.story.schema.impl.StoryTypeImpl#getEPackageNsPrefix <em>EPackage Ns Prefix</em>}</li>
 *   <li>{@link com.soluvas.story.schema.impl.StoryTypeImpl#getEClassName <em>EClass Name</em>}</li>
 *   <li>{@link com.soluvas.story.schema.impl.StoryTypeImpl#getEPackageName <em>EPackage Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StoryTypeImpl extends EObjectImpl implements StoryType {
	/**
	 * The default value of the '{@link #getResourceType() <em>Resource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceType()
	 * @generated
	 * @ordered
	 */
	protected static final ResourceType RESOURCE_TYPE_EDEFAULT = ResourceType.BUNDLE;

	/**
	 * The cached value of the '{@link #getResourceType() <em>Resource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceType()
	 * @generated
	 * @ordered
	 */
	protected ResourceType resourceType = RESOURCE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResourceUri() <em>Resource Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceUri()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceUri() <em>Resource Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceUri()
	 * @generated
	 * @ordered
	 */
	protected String resourceUri = RESOURCE_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getResourceName() <em>Resource Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceName()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceName() <em>Resource Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceName()
	 * @generated
	 * @ordered
	 */
	protected String resourceName = RESOURCE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getJavaClassName() <em>Java Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String JAVA_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJavaClassName() <em>Java Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaClassName()
	 * @generated
	 * @ordered
	 */
	protected String javaClassName = JAVA_CLASS_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getJavaClass() <em>Java Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaClass()
	 * @generated
	 * @ordered
	 */
	protected Class<Story> javaClass;

	/**
	 * The default value of the '{@link #getJavaClassStatus() <em>Java Class Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaClassStatus()
	 * @generated
	 * @ordered
	 */
	protected static final JavaClassStatus JAVA_CLASS_STATUS_EDEFAULT = JavaClassStatus.UNRESOLVED;

	/**
	 * The cached value of the '{@link #getJavaClassStatus() <em>Java Class Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaClassStatus()
	 * @generated
	 * @ordered
	 */
	protected JavaClassStatus javaClassStatus = JAVA_CLASS_STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEClass() <em>EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEClass()
	 * @generated
	 * @ordered
	 */
	protected EClass eClass;

	/**
	 * The default value of the '{@link #getEClassStatus() <em>EClass Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEClassStatus()
	 * @generated
	 * @ordered
	 */
	protected static final EClassStatus ECLASS_STATUS_EDEFAULT = EClassStatus.UNRESOLVED;

	/**
	 * The cached value of the '{@link #getEClassStatus() <em>EClass Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEClassStatus()
	 * @generated
	 * @ordered
	 */
	protected EClassStatus eClassStatus = ECLASS_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEPackageNsPrefix() <em>EPackage Ns Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEPackageNsPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String EPACKAGE_NS_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEPackageNsPrefix() <em>EPackage Ns Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEPackageNsPrefix()
	 * @generated
	 * @ordered
	 */
	protected String ePackageNsPrefix = EPACKAGE_NS_PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getEClassName() <em>EClass Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String ECLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEClassName() <em>EClass Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEClassName()
	 * @generated
	 * @ordered
	 */
	protected String eClassName = ECLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEPackageName() <em>EPackage Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEPackageName()
	 * @generated
	 * @ordered
	 */
	protected static final String EPACKAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEPackageName() <em>EPackage Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEPackageName()
	 * @generated
	 * @ordered
	 */
	protected String ePackageName = EPACKAGE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.Literals.STORY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceType getResourceType() {
		return resourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceType(ResourceType newResourceType) {
		ResourceType oldResourceType = resourceType;
		resourceType = newResourceType == null ? RESOURCE_TYPE_EDEFAULT : newResourceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.STORY_TYPE__RESOURCE_TYPE, oldResourceType, resourceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResourceUri() {
		return resourceUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceUri(String newResourceUri) {
		String oldResourceUri = resourceUri;
		resourceUri = newResourceUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.STORY_TYPE__RESOURCE_URI, oldResourceUri, resourceUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResourceName() {
		return resourceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceName(String newResourceName) {
		String oldResourceName = resourceName;
		resourceName = newResourceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.STORY_TYPE__RESOURCE_NAME, oldResourceName, resourceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.STORY_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJavaClassName() {
		return javaClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJavaClassName(String newJavaClassName) {
		String oldJavaClassName = javaClassName;
		javaClassName = newJavaClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.STORY_TYPE__JAVA_CLASS_NAME, oldJavaClassName, javaClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Class<Story> getJavaClass() {
		return javaClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJavaClass(Class<Story> newJavaClass) {
		Class<Story> oldJavaClass = javaClass;
		javaClass = newJavaClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.STORY_TYPE__JAVA_CLASS, oldJavaClass, javaClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JavaClassStatus getJavaClassStatus() {
		return javaClassStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJavaClassStatus(JavaClassStatus newJavaClassStatus) {
		JavaClassStatus oldJavaClassStatus = javaClassStatus;
		javaClassStatus = newJavaClassStatus == null ? JAVA_CLASS_STATUS_EDEFAULT : newJavaClassStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.STORY_TYPE__JAVA_CLASS_STATUS, oldJavaClassStatus, javaClassStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEClass() {
		if (eClass != null && eClass.eIsProxy()) {
			InternalEObject oldEClass = (InternalEObject)eClass;
			eClass = (EClass)eResolveProxy(oldEClass);
			if (eClass != oldEClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchemaPackage.STORY_TYPE__ECLASS, oldEClass, eClass));
			}
		}
		return eClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetEClass() {
		return eClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEClass(EClass newEClass) {
		EClass oldEClass = eClass;
		eClass = newEClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.STORY_TYPE__ECLASS, oldEClass, eClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClassStatus getEClassStatus() {
		return eClassStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEClassStatus(EClassStatus newEClassStatus) {
		EClassStatus oldEClassStatus = eClassStatus;
		eClassStatus = newEClassStatus == null ? ECLASS_STATUS_EDEFAULT : newEClassStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.STORY_TYPE__ECLASS_STATUS, oldEClassStatus, eClassStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEPackageNsPrefix() {
		return ePackageNsPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEPackageNsPrefix(String newEPackageNsPrefix) {
		String oldEPackageNsPrefix = ePackageNsPrefix;
		ePackageNsPrefix = newEPackageNsPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.STORY_TYPE__EPACKAGE_NS_PREFIX, oldEPackageNsPrefix, ePackageNsPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEClassName() {
		return eClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEClassName(String newEClassName) {
		String oldEClassName = eClassName;
		eClassName = newEClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.STORY_TYPE__ECLASS_NAME, oldEClassName, eClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEPackageName() {
		return ePackageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEPackageName(String newEPackageName) {
		String oldEPackageName = ePackageName;
		ePackageName = newEPackageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.STORY_TYPE__EPACKAGE_NAME, oldEPackageName, ePackageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public void resolveEClass(Map<String, EClass> eClassMap) {
		EClassLinked.Trait.resolveEClass(this, eClassMap);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public void resolveJavaClass(Bundle bundle) {
		JavaClassLinked.Trait.resolveJavaClass(this, bundle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.STORY_TYPE__RESOURCE_TYPE:
				return getResourceType();
			case SchemaPackage.STORY_TYPE__RESOURCE_URI:
				return getResourceUri();
			case SchemaPackage.STORY_TYPE__RESOURCE_NAME:
				return getResourceName();
			case SchemaPackage.STORY_TYPE__NAME:
				return getName();
			case SchemaPackage.STORY_TYPE__JAVA_CLASS_NAME:
				return getJavaClassName();
			case SchemaPackage.STORY_TYPE__JAVA_CLASS:
				return getJavaClass();
			case SchemaPackage.STORY_TYPE__JAVA_CLASS_STATUS:
				return getJavaClassStatus();
			case SchemaPackage.STORY_TYPE__ECLASS:
				if (resolve) return getEClass();
				return basicGetEClass();
			case SchemaPackage.STORY_TYPE__ECLASS_STATUS:
				return getEClassStatus();
			case SchemaPackage.STORY_TYPE__EPACKAGE_NS_PREFIX:
				return getEPackageNsPrefix();
			case SchemaPackage.STORY_TYPE__ECLASS_NAME:
				return getEClassName();
			case SchemaPackage.STORY_TYPE__EPACKAGE_NAME:
				return getEPackageName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchemaPackage.STORY_TYPE__RESOURCE_TYPE:
				setResourceType((ResourceType)newValue);
				return;
			case SchemaPackage.STORY_TYPE__RESOURCE_URI:
				setResourceUri((String)newValue);
				return;
			case SchemaPackage.STORY_TYPE__RESOURCE_NAME:
				setResourceName((String)newValue);
				return;
			case SchemaPackage.STORY_TYPE__NAME:
				setName((String)newValue);
				return;
			case SchemaPackage.STORY_TYPE__JAVA_CLASS_NAME:
				setJavaClassName((String)newValue);
				return;
			case SchemaPackage.STORY_TYPE__JAVA_CLASS:
				setJavaClass((Class<Story>)newValue);
				return;
			case SchemaPackage.STORY_TYPE__JAVA_CLASS_STATUS:
				setJavaClassStatus((JavaClassStatus)newValue);
				return;
			case SchemaPackage.STORY_TYPE__ECLASS:
				setEClass((EClass)newValue);
				return;
			case SchemaPackage.STORY_TYPE__ECLASS_STATUS:
				setEClassStatus((EClassStatus)newValue);
				return;
			case SchemaPackage.STORY_TYPE__EPACKAGE_NS_PREFIX:
				setEPackageNsPrefix((String)newValue);
				return;
			case SchemaPackage.STORY_TYPE__ECLASS_NAME:
				setEClassName((String)newValue);
				return;
			case SchemaPackage.STORY_TYPE__EPACKAGE_NAME:
				setEPackageName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SchemaPackage.STORY_TYPE__RESOURCE_TYPE:
				setResourceType(RESOURCE_TYPE_EDEFAULT);
				return;
			case SchemaPackage.STORY_TYPE__RESOURCE_URI:
				setResourceUri(RESOURCE_URI_EDEFAULT);
				return;
			case SchemaPackage.STORY_TYPE__RESOURCE_NAME:
				setResourceName(RESOURCE_NAME_EDEFAULT);
				return;
			case SchemaPackage.STORY_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SchemaPackage.STORY_TYPE__JAVA_CLASS_NAME:
				setJavaClassName(JAVA_CLASS_NAME_EDEFAULT);
				return;
			case SchemaPackage.STORY_TYPE__JAVA_CLASS:
				setJavaClass((Class<Story>)null);
				return;
			case SchemaPackage.STORY_TYPE__JAVA_CLASS_STATUS:
				setJavaClassStatus(JAVA_CLASS_STATUS_EDEFAULT);
				return;
			case SchemaPackage.STORY_TYPE__ECLASS:
				setEClass((EClass)null);
				return;
			case SchemaPackage.STORY_TYPE__ECLASS_STATUS:
				setEClassStatus(ECLASS_STATUS_EDEFAULT);
				return;
			case SchemaPackage.STORY_TYPE__EPACKAGE_NS_PREFIX:
				setEPackageNsPrefix(EPACKAGE_NS_PREFIX_EDEFAULT);
				return;
			case SchemaPackage.STORY_TYPE__ECLASS_NAME:
				setEClassName(ECLASS_NAME_EDEFAULT);
				return;
			case SchemaPackage.STORY_TYPE__EPACKAGE_NAME:
				setEPackageName(EPACKAGE_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SchemaPackage.STORY_TYPE__RESOURCE_TYPE:
				return resourceType != RESOURCE_TYPE_EDEFAULT;
			case SchemaPackage.STORY_TYPE__RESOURCE_URI:
				return RESOURCE_URI_EDEFAULT == null ? resourceUri != null : !RESOURCE_URI_EDEFAULT.equals(resourceUri);
			case SchemaPackage.STORY_TYPE__RESOURCE_NAME:
				return RESOURCE_NAME_EDEFAULT == null ? resourceName != null : !RESOURCE_NAME_EDEFAULT.equals(resourceName);
			case SchemaPackage.STORY_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SchemaPackage.STORY_TYPE__JAVA_CLASS_NAME:
				return JAVA_CLASS_NAME_EDEFAULT == null ? javaClassName != null : !JAVA_CLASS_NAME_EDEFAULT.equals(javaClassName);
			case SchemaPackage.STORY_TYPE__JAVA_CLASS:
				return javaClass != null;
			case SchemaPackage.STORY_TYPE__JAVA_CLASS_STATUS:
				return javaClassStatus != JAVA_CLASS_STATUS_EDEFAULT;
			case SchemaPackage.STORY_TYPE__ECLASS:
				return eClass != null;
			case SchemaPackage.STORY_TYPE__ECLASS_STATUS:
				return eClassStatus != ECLASS_STATUS_EDEFAULT;
			case SchemaPackage.STORY_TYPE__EPACKAGE_NS_PREFIX:
				return EPACKAGE_NS_PREFIX_EDEFAULT == null ? ePackageNsPrefix != null : !EPACKAGE_NS_PREFIX_EDEFAULT.equals(ePackageNsPrefix);
			case SchemaPackage.STORY_TYPE__ECLASS_NAME:
				return ECLASS_NAME_EDEFAULT == null ? eClassName != null : !ECLASS_NAME_EDEFAULT.equals(eClassName);
			case SchemaPackage.STORY_TYPE__EPACKAGE_NAME:
				return EPACKAGE_NAME_EDEFAULT == null ? ePackageName != null : !EPACKAGE_NAME_EDEFAULT.equals(ePackageName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Nameable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NameContainer.class) {
			switch (derivedFeatureID) {
				case SchemaPackage.STORY_TYPE__NAME: return CommonsPackage.NAME_CONTAINER__NAME;
				default: return -1;
			}
		}
		if (baseClass == JavaClassLinked.class) {
			switch (derivedFeatureID) {
				case SchemaPackage.STORY_TYPE__JAVA_CLASS_NAME: return CommonsPackage.JAVA_CLASS_LINKED__JAVA_CLASS_NAME;
				case SchemaPackage.STORY_TYPE__JAVA_CLASS: return CommonsPackage.JAVA_CLASS_LINKED__JAVA_CLASS;
				case SchemaPackage.STORY_TYPE__JAVA_CLASS_STATUS: return CommonsPackage.JAVA_CLASS_LINKED__JAVA_CLASS_STATUS;
				default: return -1;
			}
		}
		if (baseClass == EClassLinked.class) {
			switch (derivedFeatureID) {
				case SchemaPackage.STORY_TYPE__ECLASS: return CommonsPackage.ECLASS_LINKED__ECLASS;
				case SchemaPackage.STORY_TYPE__ECLASS_STATUS: return CommonsPackage.ECLASS_LINKED__ECLASS_STATUS;
				case SchemaPackage.STORY_TYPE__EPACKAGE_NS_PREFIX: return CommonsPackage.ECLASS_LINKED__EPACKAGE_NS_PREFIX;
				case SchemaPackage.STORY_TYPE__ECLASS_NAME: return CommonsPackage.ECLASS_LINKED__ECLASS_NAME;
				case SchemaPackage.STORY_TYPE__EPACKAGE_NAME: return CommonsPackage.ECLASS_LINKED__EPACKAGE_NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Nameable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NameContainer.class) {
			switch (baseFeatureID) {
				case CommonsPackage.NAME_CONTAINER__NAME: return SchemaPackage.STORY_TYPE__NAME;
				default: return -1;
			}
		}
		if (baseClass == JavaClassLinked.class) {
			switch (baseFeatureID) {
				case CommonsPackage.JAVA_CLASS_LINKED__JAVA_CLASS_NAME: return SchemaPackage.STORY_TYPE__JAVA_CLASS_NAME;
				case CommonsPackage.JAVA_CLASS_LINKED__JAVA_CLASS: return SchemaPackage.STORY_TYPE__JAVA_CLASS;
				case CommonsPackage.JAVA_CLASS_LINKED__JAVA_CLASS_STATUS: return SchemaPackage.STORY_TYPE__JAVA_CLASS_STATUS;
				default: return -1;
			}
		}
		if (baseClass == EClassLinked.class) {
			switch (baseFeatureID) {
				case CommonsPackage.ECLASS_LINKED__ECLASS: return SchemaPackage.STORY_TYPE__ECLASS;
				case CommonsPackage.ECLASS_LINKED__ECLASS_STATUS: return SchemaPackage.STORY_TYPE__ECLASS_STATUS;
				case CommonsPackage.ECLASS_LINKED__EPACKAGE_NS_PREFIX: return SchemaPackage.STORY_TYPE__EPACKAGE_NS_PREFIX;
				case CommonsPackage.ECLASS_LINKED__ECLASS_NAME: return SchemaPackage.STORY_TYPE__ECLASS_NAME;
				case CommonsPackage.ECLASS_LINKED__EPACKAGE_NAME: return SchemaPackage.STORY_TYPE__EPACKAGE_NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (resourceType: ");
		result.append(resourceType);
		result.append(", resourceUri: ");
		result.append(resourceUri);
		result.append(", resourceName: ");
		result.append(resourceName);
		result.append(", name: ");
		result.append(name);
		result.append(", javaClassName: ");
		result.append(javaClassName);
		result.append(", javaClass: ");
		result.append(javaClass);
		result.append(", javaClassStatus: ");
		result.append(javaClassStatus);
		result.append(", eClassStatus: ");
		result.append(eClassStatus);
		result.append(", ePackageNsPrefix: ");
		result.append(ePackageNsPrefix);
		result.append(", eClassName: ");
		result.append(eClassName);
		result.append(", ePackageName: ");
		result.append(ePackageName);
		result.append(')');
		return result.toString();
	}

} //StoryTypeImpl
