/**
 */
package org.soluvas.email.impl;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.osgi.framework.Bundle;
import org.soluvas.commons.BundleAware;
import org.soluvas.commons.CommonsPackage;
import org.soluvas.commons.EClassLinked;
import org.soluvas.commons.EClassStatus;
import org.soluvas.commons.EFactoryLinked;
import org.soluvas.commons.JavaClassLinked;
import org.soluvas.commons.JavaClassStatus;
import org.soluvas.commons.NameContainer;
import org.soluvas.commons.Nameable;
import org.soluvas.commons.NsPrefixable;
import org.soluvas.commons.ResourceType;
import org.soluvas.email.EmailPackage;
import org.soluvas.email.Template;
import org.soluvas.email.TemplateLike;
import org.soluvas.email.TemplateType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.soluvas.email.impl.TemplateTypeImpl#getResourceType <em>Resource Type</em>}</li>
 *   <li>{@link org.soluvas.email.impl.TemplateTypeImpl#getResourceUri <em>Resource Uri</em>}</li>
 *   <li>{@link org.soluvas.email.impl.TemplateTypeImpl#getResourceName <em>Resource Name</em>}</li>
 *   <li>{@link org.soluvas.email.impl.TemplateTypeImpl#getBundle <em>Bundle</em>}</li>
 *   <li>{@link org.soluvas.email.impl.TemplateTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.soluvas.email.impl.TemplateTypeImpl#getSubjectTemplate <em>Subject Template</em>}</li>
 *   <li>{@link org.soluvas.email.impl.TemplateTypeImpl#getPlainTemplate <em>Plain Template</em>}</li>
 *   <li>{@link org.soluvas.email.impl.TemplateTypeImpl#getHtmlTemplate <em>Html Template</em>}</li>
 *   <li>{@link org.soluvas.email.impl.TemplateTypeImpl#getNsPrefix <em>Ns Prefix</em>}</li>
 *   <li>{@link org.soluvas.email.impl.TemplateTypeImpl#getJavaClassName <em>Java Class Name</em>}</li>
 *   <li>{@link org.soluvas.email.impl.TemplateTypeImpl#getJavaClass <em>Java Class</em>}</li>
 *   <li>{@link org.soluvas.email.impl.TemplateTypeImpl#getJavaClassStatus <em>Java Class Status</em>}</li>
 *   <li>{@link org.soluvas.email.impl.TemplateTypeImpl#getEFactory <em>EFactory</em>}</li>
 *   <li>{@link org.soluvas.email.impl.TemplateTypeImpl#getEClass <em>EClass</em>}</li>
 *   <li>{@link org.soluvas.email.impl.TemplateTypeImpl#getEClassStatus <em>EClass Status</em>}</li>
 *   <li>{@link org.soluvas.email.impl.TemplateTypeImpl#getEPackageNsPrefix <em>EPackage Ns Prefix</em>}</li>
 *   <li>{@link org.soluvas.email.impl.TemplateTypeImpl#getEClassName <em>EClass Name</em>}</li>
 *   <li>{@link org.soluvas.email.impl.TemplateTypeImpl#getEPackageName <em>EPackage Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TemplateTypeImpl<T extends Template> extends MinimalEObjectImpl.Container implements TemplateType<T> {
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
	 * The default value of the '{@link #getBundle() <em>Bundle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBundle()
	 * @generated
	 * @ordered
	 */
	protected static final Bundle BUNDLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBundle() <em>Bundle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBundle()
	 * @generated
	 * @ordered
	 */
	protected Bundle bundle = BUNDLE_EDEFAULT;

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
	 * The default value of the '{@link #getSubjectTemplate() <em>Subject Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBJECT_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubjectTemplate() <em>Subject Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectTemplate()
	 * @generated
	 * @ordered
	 */
	protected String subjectTemplate = SUBJECT_TEMPLATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlainTemplate() <em>Plain Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlainTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String PLAIN_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlainTemplate() <em>Plain Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlainTemplate()
	 * @generated
	 * @ordered
	 */
	protected String plainTemplate = PLAIN_TEMPLATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHtmlTemplate() <em>Html Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHtmlTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String HTML_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHtmlTemplate() <em>Html Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHtmlTemplate()
	 * @generated
	 * @ordered
	 */
	protected String htmlTemplate = HTML_TEMPLATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNsPrefix() <em>Ns Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNsPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String NS_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNsPrefix() <em>Ns Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNsPrefix()
	 * @generated
	 * @ordered
	 */
	protected String nsPrefix = NS_PREFIX_EDEFAULT;

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
	protected Class<T> javaClass;

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
	 * The default value of the '{@link #getEFactory() <em>EFactory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEFactory()
	 * @generated
	 * @ordered
	 */
	protected static final EFactory EFACTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEFactory() <em>EFactory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEFactory()
	 * @generated
	 * @ordered
	 */
	protected EFactory eFactory = EFACTORY_EDEFAULT;

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
	public TemplateTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmailPackage.Literals.TEMPLATE_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmailPackage.TEMPLATE_TYPE__RESOURCE_TYPE, oldResourceType, resourceType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmailPackage.TEMPLATE_TYPE__RESOURCE_URI, oldResourceUri, resourceUri));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmailPackage.TEMPLATE_TYPE__RESOURCE_NAME, oldResourceName, resourceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bundle getBundle() {
		return bundle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBundle(Bundle newBundle) {
		Bundle oldBundle = bundle;
		bundle = newBundle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmailPackage.TEMPLATE_TYPE__BUNDLE, oldBundle, bundle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmailPackage.TEMPLATE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubjectTemplate() {
		return subjectTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubjectTemplate(String newSubjectTemplate) {
		String oldSubjectTemplate = subjectTemplate;
		subjectTemplate = newSubjectTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmailPackage.TEMPLATE_TYPE__SUBJECT_TEMPLATE, oldSubjectTemplate, subjectTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPlainTemplate() {
		return plainTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlainTemplate(String newPlainTemplate) {
		String oldPlainTemplate = plainTemplate;
		plainTemplate = newPlainTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmailPackage.TEMPLATE_TYPE__PLAIN_TEMPLATE, oldPlainTemplate, plainTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHtmlTemplate() {
		return htmlTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHtmlTemplate(String newHtmlTemplate) {
		String oldHtmlTemplate = htmlTemplate;
		htmlTemplate = newHtmlTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmailPackage.TEMPLATE_TYPE__HTML_TEMPLATE, oldHtmlTemplate, htmlTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNsPrefix() {
		return nsPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNsPrefix(String newNsPrefix) {
		String oldNsPrefix = nsPrefix;
		nsPrefix = newNsPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmailPackage.TEMPLATE_TYPE__NS_PREFIX, oldNsPrefix, nsPrefix));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmailPackage.TEMPLATE_TYPE__JAVA_CLASS_NAME, oldJavaClassName, javaClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Class<T> getJavaClass() {
		return javaClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJavaClass(Class<T> newJavaClass) {
		Class<T> oldJavaClass = javaClass;
		javaClass = newJavaClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmailPackage.TEMPLATE_TYPE__JAVA_CLASS, oldJavaClass, javaClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmailPackage.TEMPLATE_TYPE__JAVA_CLASS_STATUS, oldJavaClassStatus, javaClassStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EFactory getEFactory() {
		return eFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEFactory(EFactory newEFactory) {
		EFactory oldEFactory = eFactory;
		eFactory = newEFactory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmailPackage.TEMPLATE_TYPE__EFACTORY, oldEFactory, eFactory));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmailPackage.TEMPLATE_TYPE__ECLASS, oldEClass, eClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmailPackage.TEMPLATE_TYPE__ECLASS, oldEClass, eClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmailPackage.TEMPLATE_TYPE__ECLASS_STATUS, oldEClassStatus, eClassStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEPackageNsPrefix() {
		return ePackageNsPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEPackageNsPrefix(String newEPackageNsPrefix) {
		String oldEPackageNsPrefix = ePackageNsPrefix;
		ePackageNsPrefix = newEPackageNsPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmailPackage.TEMPLATE_TYPE__EPACKAGE_NS_PREFIX, oldEPackageNsPrefix, ePackageNsPrefix));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmailPackage.TEMPLATE_TYPE__ECLASS_NAME, oldEClassName, eClassName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmailPackage.TEMPLATE_TYPE__EPACKAGE_NAME, oldEPackageName, ePackageName));
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
			case EmailPackage.TEMPLATE_TYPE__RESOURCE_TYPE:
				return getResourceType();
			case EmailPackage.TEMPLATE_TYPE__RESOURCE_URI:
				return getResourceUri();
			case EmailPackage.TEMPLATE_TYPE__RESOURCE_NAME:
				return getResourceName();
			case EmailPackage.TEMPLATE_TYPE__BUNDLE:
				return getBundle();
			case EmailPackage.TEMPLATE_TYPE__NAME:
				return getName();
			case EmailPackage.TEMPLATE_TYPE__SUBJECT_TEMPLATE:
				return getSubjectTemplate();
			case EmailPackage.TEMPLATE_TYPE__PLAIN_TEMPLATE:
				return getPlainTemplate();
			case EmailPackage.TEMPLATE_TYPE__HTML_TEMPLATE:
				return getHtmlTemplate();
			case EmailPackage.TEMPLATE_TYPE__NS_PREFIX:
				return getNsPrefix();
			case EmailPackage.TEMPLATE_TYPE__JAVA_CLASS_NAME:
				return getJavaClassName();
			case EmailPackage.TEMPLATE_TYPE__JAVA_CLASS:
				return getJavaClass();
			case EmailPackage.TEMPLATE_TYPE__JAVA_CLASS_STATUS:
				return getJavaClassStatus();
			case EmailPackage.TEMPLATE_TYPE__EFACTORY:
				return getEFactory();
			case EmailPackage.TEMPLATE_TYPE__ECLASS:
				if (resolve) return getEClass();
				return basicGetEClass();
			case EmailPackage.TEMPLATE_TYPE__ECLASS_STATUS:
				return getEClassStatus();
			case EmailPackage.TEMPLATE_TYPE__EPACKAGE_NS_PREFIX:
				return getEPackageNsPrefix();
			case EmailPackage.TEMPLATE_TYPE__ECLASS_NAME:
				return getEClassName();
			case EmailPackage.TEMPLATE_TYPE__EPACKAGE_NAME:
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
			case EmailPackage.TEMPLATE_TYPE__RESOURCE_TYPE:
				setResourceType((ResourceType)newValue);
				return;
			case EmailPackage.TEMPLATE_TYPE__RESOURCE_URI:
				setResourceUri((String)newValue);
				return;
			case EmailPackage.TEMPLATE_TYPE__RESOURCE_NAME:
				setResourceName((String)newValue);
				return;
			case EmailPackage.TEMPLATE_TYPE__BUNDLE:
				setBundle((Bundle)newValue);
				return;
			case EmailPackage.TEMPLATE_TYPE__NAME:
				setName((String)newValue);
				return;
			case EmailPackage.TEMPLATE_TYPE__SUBJECT_TEMPLATE:
				setSubjectTemplate((String)newValue);
				return;
			case EmailPackage.TEMPLATE_TYPE__PLAIN_TEMPLATE:
				setPlainTemplate((String)newValue);
				return;
			case EmailPackage.TEMPLATE_TYPE__HTML_TEMPLATE:
				setHtmlTemplate((String)newValue);
				return;
			case EmailPackage.TEMPLATE_TYPE__NS_PREFIX:
				setNsPrefix((String)newValue);
				return;
			case EmailPackage.TEMPLATE_TYPE__JAVA_CLASS_NAME:
				setJavaClassName((String)newValue);
				return;
			case EmailPackage.TEMPLATE_TYPE__JAVA_CLASS:
				setJavaClass((Class<T>)newValue);
				return;
			case EmailPackage.TEMPLATE_TYPE__JAVA_CLASS_STATUS:
				setJavaClassStatus((JavaClassStatus)newValue);
				return;
			case EmailPackage.TEMPLATE_TYPE__EFACTORY:
				setEFactory((EFactory)newValue);
				return;
			case EmailPackage.TEMPLATE_TYPE__ECLASS:
				setEClass((EClass)newValue);
				return;
			case EmailPackage.TEMPLATE_TYPE__ECLASS_STATUS:
				setEClassStatus((EClassStatus)newValue);
				return;
			case EmailPackage.TEMPLATE_TYPE__EPACKAGE_NS_PREFIX:
				setEPackageNsPrefix((String)newValue);
				return;
			case EmailPackage.TEMPLATE_TYPE__ECLASS_NAME:
				setEClassName((String)newValue);
				return;
			case EmailPackage.TEMPLATE_TYPE__EPACKAGE_NAME:
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
			case EmailPackage.TEMPLATE_TYPE__RESOURCE_TYPE:
				setResourceType(RESOURCE_TYPE_EDEFAULT);
				return;
			case EmailPackage.TEMPLATE_TYPE__RESOURCE_URI:
				setResourceUri(RESOURCE_URI_EDEFAULT);
				return;
			case EmailPackage.TEMPLATE_TYPE__RESOURCE_NAME:
				setResourceName(RESOURCE_NAME_EDEFAULT);
				return;
			case EmailPackage.TEMPLATE_TYPE__BUNDLE:
				setBundle(BUNDLE_EDEFAULT);
				return;
			case EmailPackage.TEMPLATE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EmailPackage.TEMPLATE_TYPE__SUBJECT_TEMPLATE:
				setSubjectTemplate(SUBJECT_TEMPLATE_EDEFAULT);
				return;
			case EmailPackage.TEMPLATE_TYPE__PLAIN_TEMPLATE:
				setPlainTemplate(PLAIN_TEMPLATE_EDEFAULT);
				return;
			case EmailPackage.TEMPLATE_TYPE__HTML_TEMPLATE:
				setHtmlTemplate(HTML_TEMPLATE_EDEFAULT);
				return;
			case EmailPackage.TEMPLATE_TYPE__NS_PREFIX:
				setNsPrefix(NS_PREFIX_EDEFAULT);
				return;
			case EmailPackage.TEMPLATE_TYPE__JAVA_CLASS_NAME:
				setJavaClassName(JAVA_CLASS_NAME_EDEFAULT);
				return;
			case EmailPackage.TEMPLATE_TYPE__JAVA_CLASS:
				setJavaClass((Class<T>)null);
				return;
			case EmailPackage.TEMPLATE_TYPE__JAVA_CLASS_STATUS:
				setJavaClassStatus(JAVA_CLASS_STATUS_EDEFAULT);
				return;
			case EmailPackage.TEMPLATE_TYPE__EFACTORY:
				setEFactory(EFACTORY_EDEFAULT);
				return;
			case EmailPackage.TEMPLATE_TYPE__ECLASS:
				setEClass((EClass)null);
				return;
			case EmailPackage.TEMPLATE_TYPE__ECLASS_STATUS:
				setEClassStatus(ECLASS_STATUS_EDEFAULT);
				return;
			case EmailPackage.TEMPLATE_TYPE__EPACKAGE_NS_PREFIX:
				setEPackageNsPrefix(EPACKAGE_NS_PREFIX_EDEFAULT);
				return;
			case EmailPackage.TEMPLATE_TYPE__ECLASS_NAME:
				setEClassName(ECLASS_NAME_EDEFAULT);
				return;
			case EmailPackage.TEMPLATE_TYPE__EPACKAGE_NAME:
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
			case EmailPackage.TEMPLATE_TYPE__RESOURCE_TYPE:
				return resourceType != RESOURCE_TYPE_EDEFAULT;
			case EmailPackage.TEMPLATE_TYPE__RESOURCE_URI:
				return RESOURCE_URI_EDEFAULT == null ? resourceUri != null : !RESOURCE_URI_EDEFAULT.equals(resourceUri);
			case EmailPackage.TEMPLATE_TYPE__RESOURCE_NAME:
				return RESOURCE_NAME_EDEFAULT == null ? resourceName != null : !RESOURCE_NAME_EDEFAULT.equals(resourceName);
			case EmailPackage.TEMPLATE_TYPE__BUNDLE:
				return BUNDLE_EDEFAULT == null ? bundle != null : !BUNDLE_EDEFAULT.equals(bundle);
			case EmailPackage.TEMPLATE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EmailPackage.TEMPLATE_TYPE__SUBJECT_TEMPLATE:
				return SUBJECT_TEMPLATE_EDEFAULT == null ? subjectTemplate != null : !SUBJECT_TEMPLATE_EDEFAULT.equals(subjectTemplate);
			case EmailPackage.TEMPLATE_TYPE__PLAIN_TEMPLATE:
				return PLAIN_TEMPLATE_EDEFAULT == null ? plainTemplate != null : !PLAIN_TEMPLATE_EDEFAULT.equals(plainTemplate);
			case EmailPackage.TEMPLATE_TYPE__HTML_TEMPLATE:
				return HTML_TEMPLATE_EDEFAULT == null ? htmlTemplate != null : !HTML_TEMPLATE_EDEFAULT.equals(htmlTemplate);
			case EmailPackage.TEMPLATE_TYPE__NS_PREFIX:
				return NS_PREFIX_EDEFAULT == null ? nsPrefix != null : !NS_PREFIX_EDEFAULT.equals(nsPrefix);
			case EmailPackage.TEMPLATE_TYPE__JAVA_CLASS_NAME:
				return JAVA_CLASS_NAME_EDEFAULT == null ? javaClassName != null : !JAVA_CLASS_NAME_EDEFAULT.equals(javaClassName);
			case EmailPackage.TEMPLATE_TYPE__JAVA_CLASS:
				return javaClass != null;
			case EmailPackage.TEMPLATE_TYPE__JAVA_CLASS_STATUS:
				return javaClassStatus != JAVA_CLASS_STATUS_EDEFAULT;
			case EmailPackage.TEMPLATE_TYPE__EFACTORY:
				return EFACTORY_EDEFAULT == null ? eFactory != null : !EFACTORY_EDEFAULT.equals(eFactory);
			case EmailPackage.TEMPLATE_TYPE__ECLASS:
				return eClass != null;
			case EmailPackage.TEMPLATE_TYPE__ECLASS_STATUS:
				return eClassStatus != ECLASS_STATUS_EDEFAULT;
			case EmailPackage.TEMPLATE_TYPE__EPACKAGE_NS_PREFIX:
				return EPACKAGE_NS_PREFIX_EDEFAULT == null ? ePackageNsPrefix != null : !EPACKAGE_NS_PREFIX_EDEFAULT.equals(ePackageNsPrefix);
			case EmailPackage.TEMPLATE_TYPE__ECLASS_NAME:
				return ECLASS_NAME_EDEFAULT == null ? eClassName != null : !ECLASS_NAME_EDEFAULT.equals(eClassName);
			case EmailPackage.TEMPLATE_TYPE__EPACKAGE_NAME:
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
		if (baseClass == BundleAware.class) {
			switch (derivedFeatureID) {
				case EmailPackage.TEMPLATE_TYPE__BUNDLE: return CommonsPackage.BUNDLE_AWARE__BUNDLE;
				default: return -1;
			}
		}
		if (baseClass == Nameable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NameContainer.class) {
			switch (derivedFeatureID) {
				case EmailPackage.TEMPLATE_TYPE__NAME: return CommonsPackage.NAME_CONTAINER__NAME;
				default: return -1;
			}
		}
		if (baseClass == TemplateLike.class) {
			switch (derivedFeatureID) {
				case EmailPackage.TEMPLATE_TYPE__SUBJECT_TEMPLATE: return EmailPackage.TEMPLATE_LIKE__SUBJECT_TEMPLATE;
				case EmailPackage.TEMPLATE_TYPE__PLAIN_TEMPLATE: return EmailPackage.TEMPLATE_LIKE__PLAIN_TEMPLATE;
				case EmailPackage.TEMPLATE_TYPE__HTML_TEMPLATE: return EmailPackage.TEMPLATE_LIKE__HTML_TEMPLATE;
				default: return -1;
			}
		}
		if (baseClass == NsPrefixable.class) {
			switch (derivedFeatureID) {
				case EmailPackage.TEMPLATE_TYPE__NS_PREFIX: return CommonsPackage.NS_PREFIXABLE__NS_PREFIX;
				default: return -1;
			}
		}
		if (baseClass == JavaClassLinked.class) {
			switch (derivedFeatureID) {
				case EmailPackage.TEMPLATE_TYPE__JAVA_CLASS_NAME: return CommonsPackage.JAVA_CLASS_LINKED__JAVA_CLASS_NAME;
				case EmailPackage.TEMPLATE_TYPE__JAVA_CLASS: return CommonsPackage.JAVA_CLASS_LINKED__JAVA_CLASS;
				case EmailPackage.TEMPLATE_TYPE__JAVA_CLASS_STATUS: return CommonsPackage.JAVA_CLASS_LINKED__JAVA_CLASS_STATUS;
				default: return -1;
			}
		}
		if (baseClass == EFactoryLinked.class) {
			switch (derivedFeatureID) {
				case EmailPackage.TEMPLATE_TYPE__EFACTORY: return CommonsPackage.EFACTORY_LINKED__EFACTORY;
				default: return -1;
			}
		}
		if (baseClass == EClassLinked.class) {
			switch (derivedFeatureID) {
				case EmailPackage.TEMPLATE_TYPE__ECLASS: return CommonsPackage.ECLASS_LINKED__ECLASS;
				case EmailPackage.TEMPLATE_TYPE__ECLASS_STATUS: return CommonsPackage.ECLASS_LINKED__ECLASS_STATUS;
				case EmailPackage.TEMPLATE_TYPE__EPACKAGE_NS_PREFIX: return CommonsPackage.ECLASS_LINKED__EPACKAGE_NS_PREFIX;
				case EmailPackage.TEMPLATE_TYPE__ECLASS_NAME: return CommonsPackage.ECLASS_LINKED__ECLASS_NAME;
				case EmailPackage.TEMPLATE_TYPE__EPACKAGE_NAME: return CommonsPackage.ECLASS_LINKED__EPACKAGE_NAME;
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
		if (baseClass == BundleAware.class) {
			switch (baseFeatureID) {
				case CommonsPackage.BUNDLE_AWARE__BUNDLE: return EmailPackage.TEMPLATE_TYPE__BUNDLE;
				default: return -1;
			}
		}
		if (baseClass == Nameable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NameContainer.class) {
			switch (baseFeatureID) {
				case CommonsPackage.NAME_CONTAINER__NAME: return EmailPackage.TEMPLATE_TYPE__NAME;
				default: return -1;
			}
		}
		if (baseClass == TemplateLike.class) {
			switch (baseFeatureID) {
				case EmailPackage.TEMPLATE_LIKE__SUBJECT_TEMPLATE: return EmailPackage.TEMPLATE_TYPE__SUBJECT_TEMPLATE;
				case EmailPackage.TEMPLATE_LIKE__PLAIN_TEMPLATE: return EmailPackage.TEMPLATE_TYPE__PLAIN_TEMPLATE;
				case EmailPackage.TEMPLATE_LIKE__HTML_TEMPLATE: return EmailPackage.TEMPLATE_TYPE__HTML_TEMPLATE;
				default: return -1;
			}
		}
		if (baseClass == NsPrefixable.class) {
			switch (baseFeatureID) {
				case CommonsPackage.NS_PREFIXABLE__NS_PREFIX: return EmailPackage.TEMPLATE_TYPE__NS_PREFIX;
				default: return -1;
			}
		}
		if (baseClass == JavaClassLinked.class) {
			switch (baseFeatureID) {
				case CommonsPackage.JAVA_CLASS_LINKED__JAVA_CLASS_NAME: return EmailPackage.TEMPLATE_TYPE__JAVA_CLASS_NAME;
				case CommonsPackage.JAVA_CLASS_LINKED__JAVA_CLASS: return EmailPackage.TEMPLATE_TYPE__JAVA_CLASS;
				case CommonsPackage.JAVA_CLASS_LINKED__JAVA_CLASS_STATUS: return EmailPackage.TEMPLATE_TYPE__JAVA_CLASS_STATUS;
				default: return -1;
			}
		}
		if (baseClass == EFactoryLinked.class) {
			switch (baseFeatureID) {
				case CommonsPackage.EFACTORY_LINKED__EFACTORY: return EmailPackage.TEMPLATE_TYPE__EFACTORY;
				default: return -1;
			}
		}
		if (baseClass == EClassLinked.class) {
			switch (baseFeatureID) {
				case CommonsPackage.ECLASS_LINKED__ECLASS: return EmailPackage.TEMPLATE_TYPE__ECLASS;
				case CommonsPackage.ECLASS_LINKED__ECLASS_STATUS: return EmailPackage.TEMPLATE_TYPE__ECLASS_STATUS;
				case CommonsPackage.ECLASS_LINKED__EPACKAGE_NS_PREFIX: return EmailPackage.TEMPLATE_TYPE__EPACKAGE_NS_PREFIX;
				case CommonsPackage.ECLASS_LINKED__ECLASS_NAME: return EmailPackage.TEMPLATE_TYPE__ECLASS_NAME;
				case CommonsPackage.ECLASS_LINKED__EPACKAGE_NAME: return EmailPackage.TEMPLATE_TYPE__EPACKAGE_NAME;
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
		result.append(", bundle: ");
		result.append(bundle);
		result.append(", name: ");
		result.append(name);
		result.append(", subjectTemplate: ");
		result.append(subjectTemplate);
		result.append(", plainTemplate: ");
		result.append(plainTemplate);
		result.append(", htmlTemplate: ");
		result.append(htmlTemplate);
		result.append(", nsPrefix: ");
		result.append(nsPrefix);
		result.append(", javaClassName: ");
		result.append(javaClassName);
		result.append(", javaClass: ");
		result.append(javaClass);
		result.append(", javaClassStatus: ");
		result.append(javaClassStatus);
		result.append(", eFactory: ");
		result.append(eFactory);
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

} //EmailTemplateImpl
