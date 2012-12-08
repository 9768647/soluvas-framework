/**
 */
package org.soluvas.commons.impl;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Queue;
import java.util.Set;

import javax.measure.unit.Unit;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.joda.money.CurrencyUnit;
import org.joda.time.DateTime;
import org.osgi.framework.Bundle;
import org.soluvas.commons.AppManifest;
import org.soluvas.commons.BundleAware;
import org.soluvas.commons.CommonsFactory;
import org.soluvas.commons.CommonsPackage;
import org.soluvas.commons.Describable;
import org.soluvas.commons.EClassLinked;
import org.soluvas.commons.EClassStatus;
import org.soluvas.commons.Gender;
import org.soluvas.commons.Identifiable;
import org.soluvas.commons.Imageable;
import org.soluvas.commons.Informer;
import org.soluvas.commons.JavaClassLinked;
import org.soluvas.commons.JavaClassStatus;
import org.soluvas.commons.NameContainer;
import org.soluvas.commons.Nameable;
import org.soluvas.commons.PersonInfo;
import org.soluvas.commons.PhotoIdContainer;
import org.soluvas.commons.Positionable;
import org.soluvas.commons.ResourceAware;
import org.soluvas.commons.ResourceType;
import org.soluvas.commons.Sluggable;
import org.soluvas.commons.Timestamped;

import com.google.common.collect.Multimap;
import com.google.common.collect.Multiset;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommonsPackageImpl extends EPackageImpl implements CommonsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceAwareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appManifestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timestampedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sluggableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass photoIdContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass describableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleAwareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaClassLinkedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eClassLinkedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resourceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum genderEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eClassStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum javaClassStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateTimeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType currencyUnitEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unitEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mapEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType setEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType collectionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType multimapEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType navigableMapEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType queueEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType multisetEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType serializableEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bundleEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.soluvas.commons.CommonsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CommonsPackageImpl() {
		super(eNS_URI, CommonsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CommonsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CommonsPackage init() {
		if (isInited) return (CommonsPackage)EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI);

		// Obtain or create and register package
		CommonsPackageImpl theCommonsPackage = (CommonsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CommonsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CommonsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCommonsPackage.createPackageContents();

		// Initialize created meta-data
		theCommonsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCommonsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CommonsPackage.eNS_URI, theCommonsPackage);
		return theCommonsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceAware() {
		return resourceAwareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceAware_ResourceType() {
		return (EAttribute)resourceAwareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceAware_ResourceUri() {
		return (EAttribute)resourceAwareEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceAware_ResourceName() {
		return (EAttribute)resourceAwareEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPositionable() {
		return positionableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPositionable_Positioner() {
		return (EAttribute)positionableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAppManifest() {
		return appManifestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppManifest_Title() {
		return (EAttribute)appManifestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppManifest_Description() {
		return (EAttribute)appManifestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPersonInfo() {
		return personInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersonInfo_Gender() {
		return (EAttribute)personInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimestamped() {
		return timestampedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimestamped_CreationTime() {
		return (EAttribute)timestampedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimestamped_ModificationTime() {
		return (EAttribute)timestampedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdentifiable() {
		return identifiableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentifiable_Id() {
		return (EAttribute)identifiableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSluggable() {
		return sluggableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSluggable_Slug() {
		return (EAttribute)sluggableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNameable() {
		return nameableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImageable() {
		return imageableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPhotoIdContainer() {
		return photoIdContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPhotoIdContainer_PhotoId() {
		return (EAttribute)photoIdContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNameContainer() {
		return nameContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNameContainer_Name() {
		return (EAttribute)nameContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInformer() {
		return informerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDescribable() {
		return describableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBundleAware() {
		return bundleAwareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBundleAware_Bundle() {
		return (EAttribute)bundleAwareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJavaClassLinked() {
		return javaClassLinkedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaClassLinked_JavaClassName() {
		return (EAttribute)javaClassLinkedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaClassLinked_JavaClass() {
		return (EAttribute)javaClassLinkedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaClassLinked_JavaClassStatus() {
		return (EAttribute)javaClassLinkedEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEClassLinked() {
		return eClassLinkedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEClassLinked_EClass() {
		return (EReference)eClassLinkedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEClassLinked_EClassStatus() {
		return (EAttribute)eClassLinkedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEClassLinked_EClassName() {
		return (EAttribute)eClassLinkedEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEClassLinked_EPackageName() {
		return (EAttribute)eClassLinkedEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getResourceType() {
		return resourceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getGender() {
		return genderEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEClassStatus() {
		return eClassStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getJavaClassStatus() {
		return javaClassStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDateTime() {
		return dateTimeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCurrencyUnit() {
		return currencyUnitEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUnit() {
		return unitEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getList() {
		return listEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMap() {
		return mapEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSet() {
		return setEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCollection() {
		return collectionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMultimap() {
		return multimapEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getNavigableMap() {
		return navigableMapEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getQueue() {
		return queueEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMultiset() {
		return multisetEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSerializable() {
		return serializableEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBundle() {
		return bundleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommonsFactory getCommonsFactory() {
		return (CommonsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		resourceAwareEClass = createEClass(RESOURCE_AWARE);
		createEAttribute(resourceAwareEClass, RESOURCE_AWARE__RESOURCE_TYPE);
		createEAttribute(resourceAwareEClass, RESOURCE_AWARE__RESOURCE_URI);
		createEAttribute(resourceAwareEClass, RESOURCE_AWARE__RESOURCE_NAME);

		positionableEClass = createEClass(POSITIONABLE);
		createEAttribute(positionableEClass, POSITIONABLE__POSITIONER);

		appManifestEClass = createEClass(APP_MANIFEST);
		createEAttribute(appManifestEClass, APP_MANIFEST__TITLE);
		createEAttribute(appManifestEClass, APP_MANIFEST__DESCRIPTION);

		personInfoEClass = createEClass(PERSON_INFO);
		createEAttribute(personInfoEClass, PERSON_INFO__GENDER);

		timestampedEClass = createEClass(TIMESTAMPED);
		createEAttribute(timestampedEClass, TIMESTAMPED__CREATION_TIME);
		createEAttribute(timestampedEClass, TIMESTAMPED__MODIFICATION_TIME);

		identifiableEClass = createEClass(IDENTIFIABLE);
		createEAttribute(identifiableEClass, IDENTIFIABLE__ID);

		sluggableEClass = createEClass(SLUGGABLE);
		createEAttribute(sluggableEClass, SLUGGABLE__SLUG);

		nameableEClass = createEClass(NAMEABLE);

		imageableEClass = createEClass(IMAGEABLE);

		photoIdContainerEClass = createEClass(PHOTO_ID_CONTAINER);
		createEAttribute(photoIdContainerEClass, PHOTO_ID_CONTAINER__PHOTO_ID);

		nameContainerEClass = createEClass(NAME_CONTAINER);
		createEAttribute(nameContainerEClass, NAME_CONTAINER__NAME);

		informerEClass = createEClass(INFORMER);

		describableEClass = createEClass(DESCRIBABLE);

		bundleAwareEClass = createEClass(BUNDLE_AWARE);
		createEAttribute(bundleAwareEClass, BUNDLE_AWARE__BUNDLE);

		javaClassLinkedEClass = createEClass(JAVA_CLASS_LINKED);
		createEAttribute(javaClassLinkedEClass, JAVA_CLASS_LINKED__JAVA_CLASS_NAME);
		createEAttribute(javaClassLinkedEClass, JAVA_CLASS_LINKED__JAVA_CLASS);
		createEAttribute(javaClassLinkedEClass, JAVA_CLASS_LINKED__JAVA_CLASS_STATUS);

		eClassLinkedEClass = createEClass(ECLASS_LINKED);
		createEReference(eClassLinkedEClass, ECLASS_LINKED__ECLASS);
		createEAttribute(eClassLinkedEClass, ECLASS_LINKED__ECLASS_STATUS);
		createEAttribute(eClassLinkedEClass, ECLASS_LINKED__ECLASS_NAME);
		createEAttribute(eClassLinkedEClass, ECLASS_LINKED__EPACKAGE_NAME);

		// Create enums
		resourceTypeEEnum = createEEnum(RESOURCE_TYPE);
		genderEEnum = createEEnum(GENDER);
		eClassStatusEEnum = createEEnum(ECLASS_STATUS);
		javaClassStatusEEnum = createEEnum(JAVA_CLASS_STATUS);

		// Create data types
		dateTimeEDataType = createEDataType(DATE_TIME);
		currencyUnitEDataType = createEDataType(CURRENCY_UNIT);
		unitEDataType = createEDataType(UNIT);
		listEDataType = createEDataType(LIST);
		mapEDataType = createEDataType(MAP);
		setEDataType = createEDataType(SET);
		collectionEDataType = createEDataType(COLLECTION);
		multimapEDataType = createEDataType(MULTIMAP);
		navigableMapEDataType = createEDataType(NAVIGABLE_MAP);
		queueEDataType = createEDataType(QUEUE);
		multisetEDataType = createEDataType(MULTISET);
		serializableEDataType = createEDataType(SERIALIZABLE);
		bundleEDataType = createEDataType(BUNDLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters
		ETypeParameter informerEClass_T = addETypeParameter(informerEClass, "T");
		ETypeParameter javaClassLinkedEClass_T = addETypeParameter(javaClassLinkedEClass, "T");
		addETypeParameter(listEDataType, "T");
		addETypeParameter(mapEDataType, "K");
		addETypeParameter(mapEDataType, "V");
		addETypeParameter(setEDataType, "T");
		addETypeParameter(collectionEDataType, "T");
		addETypeParameter(multimapEDataType, "K");
		addETypeParameter(multimapEDataType, "V");
		addETypeParameter(navigableMapEDataType, "K");
		addETypeParameter(navigableMapEDataType, "V");
		addETypeParameter(queueEDataType, "T");
		addETypeParameter(multisetEDataType, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getIdentifiable());
		informerEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		appManifestEClass.getESuperTypes().add(this.getPositionable());
		appManifestEClass.getESuperTypes().add(this.getResourceAware());
		personInfoEClass.getESuperTypes().add(this.getIdentifiable());
		personInfoEClass.getESuperTypes().add(this.getPhotoIdContainer());
		personInfoEClass.getESuperTypes().add(this.getSluggable());
		personInfoEClass.getESuperTypes().add(this.getNameContainer());
		photoIdContainerEClass.getESuperTypes().add(this.getImageable());
		nameContainerEClass.getESuperTypes().add(this.getNameable());

		// Initialize classes and features; add operations and parameters
		initEClass(resourceAwareEClass, ResourceAware.class, "ResourceAware", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceAware_ResourceType(), this.getResourceType(), "resourceType", null, 0, 1, ResourceAware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceAware_ResourceUri(), ecorePackage.getEString(), "resourceUri", null, 0, 1, ResourceAware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceAware_ResourceName(), ecorePackage.getEString(), "resourceName", null, 0, 1, ResourceAware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionableEClass, Positionable.class, "Positionable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPositionable_Positioner(), ecorePackage.getEIntegerObject(), "positioner", "0", 0, 1, Positionable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(appManifestEClass, AppManifest.class, "AppManifest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAppManifest_Title(), ecorePackage.getEString(), "title", null, 0, 1, AppManifest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppManifest_Description(), ecorePackage.getEString(), "description", null, 0, 1, AppManifest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personInfoEClass, PersonInfo.class, "PersonInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersonInfo_Gender(), this.getGender(), "gender", null, 0, 1, PersonInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timestampedEClass, Timestamped.class, "Timestamped", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimestamped_CreationTime(), this.getDateTime(), "creationTime", null, 0, 1, Timestamped.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimestamped_ModificationTime(), this.getDateTime(), "modificationTime", null, 0, 1, Timestamped.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifiableEClass, Identifiable.class, "Identifiable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiable_Id(), ecorePackage.getEString(), "id", null, 1, 1, Identifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sluggableEClass, Sluggable.class, "Sluggable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSluggable_Slug(), ecorePackage.getEString(), "slug", null, 1, 1, Sluggable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameableEClass, Nameable.class, "Nameable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(nameableEClass, ecorePackage.getEString(), "getName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(imageableEClass, Imageable.class, "Imageable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(imageableEClass, ecorePackage.getEString(), "getImageId", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(photoIdContainerEClass, PhotoIdContainer.class, "PhotoIdContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhotoIdContainer_PhotoId(), ecorePackage.getEString(), "photoId", null, 0, 1, PhotoIdContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameContainerEClass, NameContainer.class, "NameContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNameContainer_Name(), ecorePackage.getEString(), "name", null, 1, 1, NameContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(informerEClass, Informer.class, "Informer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(informerEClass, null, "toInfo", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(informerEClass_T);
		initEOperation(op, g1);

		initEClass(describableEClass, Describable.class, "Describable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bundleAwareEClass, BundleAware.class, "BundleAware", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBundleAware_Bundle(), this.getBundle(), "bundle", null, 0, 1, BundleAware.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaClassLinkedEClass, JavaClassLinked.class, "JavaClassLinked", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaClassLinked_JavaClassName(), theEcorePackage.getEString(), "javaClassName", null, 0, 1, JavaClassLinked.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theEcorePackage.getEJavaClass());
		EGenericType g2 = createEGenericType(javaClassLinkedEClass_T);
		g1.getETypeArguments().add(g2);
		initEAttribute(getJavaClassLinked_JavaClass(), g1, "javaClass", null, 0, 1, JavaClassLinked.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaClassLinked_JavaClassStatus(), this.getJavaClassStatus(), "javaClassStatus", "unresolved", 0, 1, JavaClassLinked.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(javaClassLinkedEClass, null, "resolveJavaClass", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBundle(), "bundle", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eClassLinkedEClass, EClassLinked.class, "EClassLinked", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEClassLinked_EClass(), theEcorePackage.getEClass(), null, "eClass", null, 0, 1, EClassLinked.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEClassLinked_EClassStatus(), this.getEClassStatus(), "eClassStatus", "unresolved", 0, 1, EClassLinked.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEClassLinked_EClassName(), theEcorePackage.getEString(), "eClassName", null, 0, 1, EClassLinked.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEClassLinked_EPackageName(), theEcorePackage.getEString(), "ePackageName", null, 0, 1, EClassLinked.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(eClassLinkedEClass, null, "resolveEClass", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getMap());
		g2 = createEGenericType(theEcorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theEcorePackage.getEClass());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "eClassMap", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(resourceTypeEEnum, ResourceType.class, "ResourceType");
		addEEnumLiteral(resourceTypeEEnum, ResourceType.BUNDLE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.FILE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.DATABASE);

		initEEnum(genderEEnum, Gender.class, "Gender");
		addEEnumLiteral(genderEEnum, Gender.MALE);
		addEEnumLiteral(genderEEnum, Gender.FEMALE);

		initEEnum(eClassStatusEEnum, EClassStatus.class, "EClassStatus");
		addEEnumLiteral(eClassStatusEEnum, EClassStatus.UNRESOLVED);
		addEEnumLiteral(eClassStatusEEnum, EClassStatus.RESOLVED);

		initEEnum(javaClassStatusEEnum, JavaClassStatus.class, "JavaClassStatus");
		addEEnumLiteral(javaClassStatusEEnum, JavaClassStatus.UNRESOLVED);
		addEEnumLiteral(javaClassStatusEEnum, JavaClassStatus.RESOLVED);

		// Initialize data types
		initEDataType(dateTimeEDataType, DateTime.class, "DateTime", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(currencyUnitEDataType, CurrencyUnit.class, "CurrencyUnit", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(unitEDataType, Unit.class, "Unit", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(listEDataType, List.class, "List", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mapEDataType, Map.class, "Map", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(setEDataType, Set.class, "Set", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(collectionEDataType, Collection.class, "Collection", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(multimapEDataType, Multimap.class, "Multimap", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(navigableMapEDataType, NavigableMap.class, "NavigableMap", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(queueEDataType, Queue.class, "Queue", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(multisetEDataType, Multiset.class, "Multiset", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(serializableEDataType, Serializable.class, "Serializable", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bundleEDataType, Bundle.class, "Bundle", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";		
		addAnnotation
		  (getResourceAware_ResourceName(), 
		   source, 
		   new String[] {
			 "documentation", "Name relative to parent resource."
		   });		
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "documentation", "The resource is from a bundle classpath."
		   });		
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "documentation", "The resource is from a file, usually in a watched folder."
		   });		
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "documentation", "The resource is from a persistence storage."
		   });		
		addAnnotation
		  (personInfoEClass, 
		   source, 
		   new String[] {
			 "documentation", "Person partial value object that is stored in Graph database (usually Neo4j) or embedded in a MongoDB document.\n\nThe ID is Directory entry uid attribute.\n"
		   });		
		addAnnotation
		  (timestampedEClass, 
		   source, 
		   new String[] {
			 "documentation", "Can be used by any EObject that wants to preserve creationTime/modificationTime."
		   });		
		addAnnotation
		  (getTimestamped_CreationTime(), 
		   source, 
		   new String[] {
			 "documentation", "First creation time (raw)."
		   });		
		addAnnotation
		  (getTimestamped_ModificationTime(), 
		   source, 
		   new String[] {
			 "documentation", "Last modification time (raw)."
		   });		
		addAnnotation
		  (identifiableEClass, 
		   source, 
		   new String[] {
			 "documentation", "Object that has ID as String."
		   });		
		addAnnotation
		  (getIdentifiable_Id(), 
		   source, 
		   new String[] {
			 "documentation", "ID of the object. Usually either lowercase_underscored or UUID.\n\nIn LDAP, it can either be \'uid\' or \'uniqueIdentifier\'.\n\nRFC1274: unique identifer.\nLDAP: uniqueIdentifier"
		   });		
		addAnnotation
		  (getSluggable_Slug(), 
		   source, 
		   new String[] {
			 "documentation", "Slug (aka Directory uniqueIdentifier) used in SEO-friendly URIs."
		   });		
		addAnnotation
		  (nameableEClass, 
		   source, 
		   new String[] {
			 "documentation", "An object that can provide a name."
		   });		
		addAnnotation
		  (imageableEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "documentation", "Return the primary image ID for square proportion."
		   });		
		addAnnotation
		  (photoIdContainerEClass, 
		   source, 
		   new String[] {
			 "documentation", "Contains image ID as photoId attribute and has default implementation for {#getImageId()}."
		   });		
		addAnnotation
		  (getPhotoIdContainer_PhotoId(), 
		   source, 
		   new String[] {
			 "documentation", "Avatar Photo ID directly usable by Image Store. Used by {#getImageId()}."
		   });		
		addAnnotation
		  (nameContainerEClass, 
		   source, 
		   new String[] {
			 "documentation", "Contains a name attribute named \'name\' and has default implementation for {@link #getName()}."
		   });		
		addAnnotation
		  (getNameContainer_Name(), 
		   source, 
		   new String[] {
			 "documentation", "Display name (can be full name, nickname, slug, screen name, etc. whatever is commonly used by the particular app).\nUsed by {#getName()}."
		   });		
		addAnnotation
		  (informerEClass, 
		   source, 
		   new String[] {
			 "documentation", "Can transform itself an \"Info\" object."
		   });		
		addAnnotation
		  (informerEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "documentation", "Transforms to its \"Info\" model."
		   });		
		addAnnotation
		  (bundleEDataType, 
		   source, 
		   new String[] {
			 "documentation", "An installed bundle in the Framework.\n\nA Bundle object is the access point to define the lifecycle of an installed bundle. Each bundle installed in the OSGi environment must have an associated Bundle object.\n\nA bundle must have a unique identity, a long, chosen by the Framework. This identity must not change during the lifecycle of a bundle, even when the bundle is updated. Uninstalling and then reinstalling the bundle must create a new unique identity.\n\nA bundle can be in one of six states:\n\nUNINSTALLED\nINSTALLED\nRESOLVED\nSTARTING\nSTOPPING\nACTIVE\nValues assigned to these states have no specified ordering; they represent bit values that may be ORed together to determine if a bundle is in one of the valid states.\n\nA bundle should only have active threads of execution when its state is one of STARTING,ACTIVE, or STOPPING. An UNINSTALLED bundle can not be set to another state; it is a zombie and can only be reached because references are kept somewhere.\n\nThe Framework is the only entity that is allowed to create Bundle objects, and these objects are only valid within the Framework that created them.\n\nBundles have a natural ordering such that if two Bundles have the same bundle id they are equal. A Bundle is less than another Bundle if it has a lower bundle id and is greater if it has a higher bundle id."
		   });		
		addAnnotation
		  (bundleAwareEClass, 
		   source, 
		   new String[] {
			 "documentation", "BundleAware classes are usually also ResourceAware (since Bundle is a resource).\nHowever, Soluvas can load from other non-bundle resources as well, etc. JCR, Git, filesystem, database, HTTP, etc."
		   });		
		addAnnotation
		  (getBundleAware_Bundle(), 
		   source, 
		   new String[] {
			 "documentation", "Only available if resolved."
		   });		
		addAnnotation
		  (javaClassLinkedEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "documentation", "Resolve referenced Java Class."
		   });		
		addAnnotation
		  ((javaClassLinkedEClass.getEOperations().get(0)).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "documentation", "Resolve referenced Java Class using the specified Bundle."
		   });		
		addAnnotation
		  (getJavaClassLinked_JavaClassName(), 
		   source, 
		   new String[] {
			 "documentation", "The Java class name linked to this type. Used to resolve the Java Class instance."
		   });		
		addAnnotation
		  (getJavaClassLinked_JavaClass(), 
		   source, 
		   new String[] {
			 "documentation", "The Java class linked to this type. Only available when resolved."
		   });		
		addAnnotation
		  (eClassLinkedEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "documentation", "Resolve referenced EClass."
		   });		
		addAnnotation
		  ((eClassLinkedEClass.getEOperations().get(0)).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "documentation", "Keys are {ePackageName}.{eClassName}.\nValues are EClass instances themselves."
		   });		
		addAnnotation
		  (getEClassLinked_EClass(), 
		   source, 
		   new String[] {
			 "documentation", "EClass for this instances of this type."
		   });		
		addAnnotation
		  (getEClassLinked_EClassName(), 
		   source, 
		   new String[] {
			 "documentation", "Name of EClass, used for resolving the EClass instance."
		   });		
		addAnnotation
		  (getEClassLinked_EPackageName(), 
		   source, 
		   new String[] {
			 "documentation", "Name of EPackage, used for resolving the EClass instance."
		   });
	}

} //CommonsPackageImpl
