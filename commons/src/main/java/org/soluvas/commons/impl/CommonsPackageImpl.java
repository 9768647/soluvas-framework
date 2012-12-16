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
import org.soluvas.commons.Added;
import org.soluvas.commons.AddedMany;
import org.soluvas.commons.AppManifest;
import org.soluvas.commons.AttributeNotification;
import org.soluvas.commons.AttributeSet;
import org.soluvas.commons.AttributeUnset;
import org.soluvas.commons.BundleAware;
import org.soluvas.commons.CategoryInfo;
import org.soluvas.commons.CategoryLike;
import org.soluvas.commons.CommonsFactory;
import org.soluvas.commons.CommonsPackage;
import org.soluvas.commons.Describable;
import org.soluvas.commons.EClassLinked;
import org.soluvas.commons.EClassStatus;
import org.soluvas.commons.EFactoryLinked;
import org.soluvas.commons.EObjectLinked;
import org.soluvas.commons.Gender;
import org.soluvas.commons.Identifiable;
import org.soluvas.commons.Imageable;
import org.soluvas.commons.Informer;
import org.soluvas.commons.JavaClassLinked;
import org.soluvas.commons.JavaClassStatus;
import org.soluvas.commons.ModelNotification;
import org.soluvas.commons.NameContainer;
import org.soluvas.commons.Nameable;
import org.soluvas.commons.NsPrefixable;
import org.soluvas.commons.ObjectNotification;
import org.soluvas.commons.ObjectsNotification;
import org.soluvas.commons.Parentable;
import org.soluvas.commons.PersonInfo;
import org.soluvas.commons.PhotoIdContainer;
import org.soluvas.commons.Positionable;
import org.soluvas.commons.Removed;
import org.soluvas.commons.RemovedMany;
import org.soluvas.commons.ResourceAware;
import org.soluvas.commons.ResourceType;
import org.soluvas.commons.SchemaVersionable;
import org.soluvas.commons.Sluggable;
import org.soluvas.commons.Timestamped;

import org.soluvas.commons.WebAddress;
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
	private EClass schemaVersionableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eFactoryLinkedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nsPrefixableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webAddressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelNotificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeUnsetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectNotificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeNotificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addedManyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removedManyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectsNotificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eObjectLinkedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parentableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryLikeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryInfoEClass = null;

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
	public EAttribute getAppManifest_Domain() {
		return (EAttribute)appManifestEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getDescribable_Description() {
		return (EAttribute)describableEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getEClassLinked_EPackageNsPrefix() {
		return (EAttribute)eClassLinkedEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEClassLinked_EClassName() {
		return (EAttribute)eClassLinkedEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEClassLinked_EPackageName() {
		return (EAttribute)eClassLinkedEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchemaVersionable() {
		return schemaVersionableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEFactoryLinked() {
		return eFactoryLinkedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEFactoryLinked_EFactory() {
		return (EReference)eFactoryLinkedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNsPrefixable() {
		return nsPrefixableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNsPrefixable_NsPrefix() {
		return (EAttribute)nsPrefixableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebAddress() {
		return webAddressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebAddress_BaseUri() {
		return (EAttribute)webAddressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebAddress_BasePath() {
		return (EAttribute)webAddressEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebAddress_ApiPath() {
		return (EAttribute)webAddressEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebAddress_ImagesUri() {
		return (EAttribute)webAddressEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebAddress_SkinUri() {
		return (EAttribute)webAddressEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebAddress_JsUri() {
		return (EAttribute)webAddressEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebAddress_SecureBaseUri() {
		return (EAttribute)webAddressEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebAddress_SecureImagesUri() {
		return (EAttribute)webAddressEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebAddress_SecureSkinUri() {
		return (EAttribute)webAddressEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebAddress_SecureJsUri() {
		return (EAttribute)webAddressEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdded() {
		return addedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelNotification() {
		return modelNotificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelNotification_Container() {
		return (EReference)modelNotificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeSet() {
		return attributeSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeUnset() {
		return attributeUnsetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoved() {
		return removedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectNotification() {
		return objectNotificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectNotification_Object() {
		return (EAttribute)objectNotificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeNotification() {
		return attributeNotificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeNotification_Attribute() {
		return (EReference)attributeNotificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeNotification_Object() {
		return (EAttribute)attributeNotificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeNotification_OldValue() {
		return (EAttribute)attributeNotificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeNotification_NewValue() {
		return (EAttribute)attributeNotificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddedMany() {
		return addedManyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemovedMany() {
		return removedManyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectsNotification() {
		return objectsNotificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectsNotification_Objects() {
		return (EAttribute)objectsNotificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEObjectLinked() {
		return eObjectLinkedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParentable() {
		return parentableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParentable_Parent() {
		return (EReference)parentableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategoryLike() {
		return categoryLikeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategoryLike_SlugPath() {
		return (EAttribute)categoryLikeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategoryLike_Color() {
		return (EAttribute)categoryLikeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategoryLike_ImageId() {
		return (EAttribute)categoryLikeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategoryLike_Level() {
		return (EAttribute)categoryLikeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategoryLike_CategoryCount() {
		return (EAttribute)categoryLikeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategoryInfo() {
		return categoryInfoEClass;
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
		createEAttribute(appManifestEClass, APP_MANIFEST__DOMAIN);

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
		createEAttribute(describableEClass, DESCRIBABLE__DESCRIPTION);

		bundleAwareEClass = createEClass(BUNDLE_AWARE);
		createEAttribute(bundleAwareEClass, BUNDLE_AWARE__BUNDLE);

		javaClassLinkedEClass = createEClass(JAVA_CLASS_LINKED);
		createEAttribute(javaClassLinkedEClass, JAVA_CLASS_LINKED__JAVA_CLASS_NAME);
		createEAttribute(javaClassLinkedEClass, JAVA_CLASS_LINKED__JAVA_CLASS);
		createEAttribute(javaClassLinkedEClass, JAVA_CLASS_LINKED__JAVA_CLASS_STATUS);

		eClassLinkedEClass = createEClass(ECLASS_LINKED);
		createEReference(eClassLinkedEClass, ECLASS_LINKED__ECLASS);
		createEAttribute(eClassLinkedEClass, ECLASS_LINKED__ECLASS_STATUS);
		createEAttribute(eClassLinkedEClass, ECLASS_LINKED__EPACKAGE_NS_PREFIX);
		createEAttribute(eClassLinkedEClass, ECLASS_LINKED__ECLASS_NAME);
		createEAttribute(eClassLinkedEClass, ECLASS_LINKED__EPACKAGE_NAME);

		schemaVersionableEClass = createEClass(SCHEMA_VERSIONABLE);

		eFactoryLinkedEClass = createEClass(EFACTORY_LINKED);
		createEReference(eFactoryLinkedEClass, EFACTORY_LINKED__EFACTORY);

		nsPrefixableEClass = createEClass(NS_PREFIXABLE);
		createEAttribute(nsPrefixableEClass, NS_PREFIXABLE__NS_PREFIX);

		webAddressEClass = createEClass(WEB_ADDRESS);
		createEAttribute(webAddressEClass, WEB_ADDRESS__BASE_URI);
		createEAttribute(webAddressEClass, WEB_ADDRESS__BASE_PATH);
		createEAttribute(webAddressEClass, WEB_ADDRESS__API_PATH);
		createEAttribute(webAddressEClass, WEB_ADDRESS__IMAGES_URI);
		createEAttribute(webAddressEClass, WEB_ADDRESS__SKIN_URI);
		createEAttribute(webAddressEClass, WEB_ADDRESS__JS_URI);
		createEAttribute(webAddressEClass, WEB_ADDRESS__SECURE_BASE_URI);
		createEAttribute(webAddressEClass, WEB_ADDRESS__SECURE_IMAGES_URI);
		createEAttribute(webAddressEClass, WEB_ADDRESS__SECURE_SKIN_URI);
		createEAttribute(webAddressEClass, WEB_ADDRESS__SECURE_JS_URI);

		addedEClass = createEClass(ADDED);

		modelNotificationEClass = createEClass(MODEL_NOTIFICATION);
		createEReference(modelNotificationEClass, MODEL_NOTIFICATION__CONTAINER);

		attributeSetEClass = createEClass(ATTRIBUTE_SET);

		attributeUnsetEClass = createEClass(ATTRIBUTE_UNSET);

		removedEClass = createEClass(REMOVED);

		objectNotificationEClass = createEClass(OBJECT_NOTIFICATION);
		createEAttribute(objectNotificationEClass, OBJECT_NOTIFICATION__OBJECT);

		attributeNotificationEClass = createEClass(ATTRIBUTE_NOTIFICATION);
		createEReference(attributeNotificationEClass, ATTRIBUTE_NOTIFICATION__ATTRIBUTE);
		createEAttribute(attributeNotificationEClass, ATTRIBUTE_NOTIFICATION__OBJECT);
		createEAttribute(attributeNotificationEClass, ATTRIBUTE_NOTIFICATION__OLD_VALUE);
		createEAttribute(attributeNotificationEClass, ATTRIBUTE_NOTIFICATION__NEW_VALUE);

		addedManyEClass = createEClass(ADDED_MANY);

		removedManyEClass = createEClass(REMOVED_MANY);

		objectsNotificationEClass = createEClass(OBJECTS_NOTIFICATION);
		createEAttribute(objectsNotificationEClass, OBJECTS_NOTIFICATION__OBJECTS);

		eObjectLinkedEClass = createEClass(EOBJECT_LINKED);

		parentableEClass = createEClass(PARENTABLE);
		createEReference(parentableEClass, PARENTABLE__PARENT);

		categoryLikeEClass = createEClass(CATEGORY_LIKE);
		createEAttribute(categoryLikeEClass, CATEGORY_LIKE__SLUG_PATH);
		createEAttribute(categoryLikeEClass, CATEGORY_LIKE__COLOR);
		createEAttribute(categoryLikeEClass, CATEGORY_LIKE__IMAGE_ID);
		createEAttribute(categoryLikeEClass, CATEGORY_LIKE__LEVEL);
		createEAttribute(categoryLikeEClass, CATEGORY_LIKE__CATEGORY_COUNT);

		categoryInfoEClass = createEClass(CATEGORY_INFO);

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
		ETypeParameter addedEClass_T = addETypeParameter(addedEClass, "T");
		ETypeParameter modelNotificationEClass_T = addETypeParameter(modelNotificationEClass, "T");
		ETypeParameter attributeSetEClass_T = addETypeParameter(attributeSetEClass, "T");
		ETypeParameter attributeSetEClass_V = addETypeParameter(attributeSetEClass, "V");
		ETypeParameter attributeUnsetEClass_T = addETypeParameter(attributeUnsetEClass, "T");
		ETypeParameter attributeUnsetEClass_V = addETypeParameter(attributeUnsetEClass, "V");
		ETypeParameter removedEClass_T = addETypeParameter(removedEClass, "T");
		ETypeParameter objectNotificationEClass_T = addETypeParameter(objectNotificationEClass, "T");
		ETypeParameter attributeNotificationEClass_T = addETypeParameter(attributeNotificationEClass, "T");
		ETypeParameter attributeNotificationEClass_V = addETypeParameter(attributeNotificationEClass, "V");
		ETypeParameter addedManyEClass_T = addETypeParameter(addedManyEClass, "T");
		ETypeParameter removedManyEClass_T = addETypeParameter(removedManyEClass, "T");
		ETypeParameter objectsNotificationEClass_T = addETypeParameter(objectsNotificationEClass, "T");
		ETypeParameter eObjectLinkedEClass_T = addETypeParameter(eObjectLinkedEClass, "T");
		ETypeParameter parentableEClass_P = addETypeParameter(parentableEClass, "P");
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
		g1 = createEGenericType(theEcorePackage.getEObject());
		addedEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theEcorePackage.getEObject());
		modelNotificationEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theEcorePackage.getEObject());
		attributeSetEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theEcorePackage.getEObject());
		attributeUnsetEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theEcorePackage.getEObject());
		removedEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theEcorePackage.getEObject());
		objectNotificationEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theEcorePackage.getEObject());
		attributeNotificationEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theEcorePackage.getEObject());
		addedManyEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theEcorePackage.getEObject());
		removedManyEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theEcorePackage.getEObject());
		objectsNotificationEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theEcorePackage.getEObject());
		eObjectLinkedEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		appManifestEClass.getESuperTypes().add(this.getPositionable());
		appManifestEClass.getESuperTypes().add(this.getResourceAware());
		personInfoEClass.getESuperTypes().add(this.getIdentifiable());
		personInfoEClass.getESuperTypes().add(this.getPhotoIdContainer());
		personInfoEClass.getESuperTypes().add(this.getSluggable());
		personInfoEClass.getESuperTypes().add(this.getNameContainer());
		photoIdContainerEClass.getESuperTypes().add(this.getImageable());
		nameContainerEClass.getESuperTypes().add(this.getNameable());
		g1 = createEGenericType(this.getObjectNotification());
		EGenericType g2 = createEGenericType(addedEClass_T);
		g1.getETypeArguments().add(g2);
		addedEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getEObjectLinked());
		g2 = createEGenericType(modelNotificationEClass_T);
		g1.getETypeArguments().add(g2);
		modelNotificationEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getAttributeNotification());
		g2 = createEGenericType(attributeSetEClass_T);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(attributeSetEClass_V);
		g1.getETypeArguments().add(g2);
		attributeSetEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getAttributeNotification());
		g2 = createEGenericType(attributeUnsetEClass_T);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(attributeUnsetEClass_V);
		g1.getETypeArguments().add(g2);
		attributeUnsetEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getObjectNotification());
		g2 = createEGenericType(removedEClass_T);
		g1.getETypeArguments().add(g2);
		removedEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getModelNotification());
		g2 = createEGenericType(objectNotificationEClass_T);
		g1.getETypeArguments().add(g2);
		objectNotificationEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getModelNotification());
		g2 = createEGenericType(attributeNotificationEClass_T);
		g1.getETypeArguments().add(g2);
		attributeNotificationEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getEObjectLinked());
		g2 = createEGenericType(attributeNotificationEClass_T);
		g1.getETypeArguments().add(g2);
		attributeNotificationEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getObjectsNotification());
		g2 = createEGenericType(addedManyEClass_T);
		g1.getETypeArguments().add(g2);
		addedManyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getObjectsNotification());
		g2 = createEGenericType(removedManyEClass_T);
		g1.getETypeArguments().add(g2);
		removedManyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getModelNotification());
		g2 = createEGenericType(objectsNotificationEClass_T);
		g1.getETypeArguments().add(g2);
		objectsNotificationEClass.getEGenericSuperTypes().add(g1);
		categoryLikeEClass.getESuperTypes().add(this.getPositionable());
		categoryLikeEClass.getESuperTypes().add(this.getSluggable());
		categoryLikeEClass.getESuperTypes().add(this.getImageable());
		categoryLikeEClass.getESuperTypes().add(this.getIdentifiable());
		categoryLikeEClass.getESuperTypes().add(this.getNameContainer());
		g1 = createEGenericType(this.getCategoryLike());
		categoryInfoEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getParentable());
		g2 = createEGenericType(this.getCategoryInfo());
		g1.getETypeArguments().add(g2);
		categoryInfoEClass.getEGenericSuperTypes().add(g1);

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
		initEAttribute(getAppManifest_Domain(), theEcorePackage.getEString(), "domain", null, 0, 1, AppManifest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personInfoEClass, PersonInfo.class, "PersonInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersonInfo_Gender(), this.getGender(), "gender", null, 0, 1, PersonInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timestampedEClass, Timestamped.class, "Timestamped", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimestamped_CreationTime(), this.getDateTime(), "creationTime", null, 0, 1, Timestamped.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimestamped_ModificationTime(), this.getDateTime(), "modificationTime", null, 0, 1, Timestamped.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifiableEClass, Identifiable.class, "Identifiable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiable_Id(), ecorePackage.getEString(), "id", null, 0, 1, Identifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sluggableEClass, Sluggable.class, "Sluggable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSluggable_Slug(), ecorePackage.getEString(), "slug", null, 0, 1, Sluggable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameableEClass, Nameable.class, "Nameable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(nameableEClass, ecorePackage.getEString(), "getName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(imageableEClass, Imageable.class, "Imageable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(imageableEClass, ecorePackage.getEString(), "getImageId", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(photoIdContainerEClass, PhotoIdContainer.class, "PhotoIdContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhotoIdContainer_PhotoId(), ecorePackage.getEString(), "photoId", null, 0, 1, PhotoIdContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameContainerEClass, NameContainer.class, "NameContainer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNameContainer_Name(), ecorePackage.getEString(), "name", null, 1, 1, NameContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(informerEClass, Informer.class, "Informer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(informerEClass, null, "toInfo", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(informerEClass_T);
		initEOperation(op, g1);

		initEClass(describableEClass, Describable.class, "Describable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescribable_Description(), theEcorePackage.getEString(), "description", null, 0, 1, Describable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bundleAwareEClass, BundleAware.class, "BundleAware", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBundleAware_Bundle(), this.getBundle(), "bundle", null, 0, 1, BundleAware.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaClassLinkedEClass, JavaClassLinked.class, "JavaClassLinked", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaClassLinked_JavaClassName(), theEcorePackage.getEString(), "javaClassName", null, 0, 1, JavaClassLinked.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theEcorePackage.getEJavaClass());
		g2 = createEGenericType(javaClassLinkedEClass_T);
		g1.getETypeArguments().add(g2);
		initEAttribute(getJavaClassLinked_JavaClass(), g1, "javaClass", null, 0, 1, JavaClassLinked.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaClassLinked_JavaClassStatus(), this.getJavaClassStatus(), "javaClassStatus", "unresolved", 0, 1, JavaClassLinked.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(javaClassLinkedEClass, null, "resolveJavaClass", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBundle(), "bundle", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eClassLinkedEClass, EClassLinked.class, "EClassLinked", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEClassLinked_EClass(), theEcorePackage.getEClass(), null, "eClass", null, 0, 1, EClassLinked.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEClassLinked_EClassStatus(), this.getEClassStatus(), "eClassStatus", "unresolved", 0, 1, EClassLinked.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEClassLinked_EPackageNsPrefix(), theEcorePackage.getEString(), "ePackageNsPrefix", null, 0, 1, EClassLinked.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEClassLinked_EClassName(), theEcorePackage.getEString(), "eClassName", null, 0, 1, EClassLinked.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEClassLinked_EPackageName(), theEcorePackage.getEString(), "ePackageName", null, 0, 1, EClassLinked.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(eClassLinkedEClass, null, "resolveEClass", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getMap());
		g2 = createEGenericType(theEcorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theEcorePackage.getEClass());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "eClassMap", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(schemaVersionableEClass, SchemaVersionable.class, "SchemaVersionable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(schemaVersionableEClass, theEcorePackage.getELong(), "getSchemaVersion", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eFactoryLinkedEClass, EFactoryLinked.class, "EFactoryLinked", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEFactoryLinked_EFactory(), theEcorePackage.getEFactory(), null, "eFactory", null, 0, 1, EFactoryLinked.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nsPrefixableEClass, NsPrefixable.class, "NsPrefixable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNsPrefixable_NsPrefix(), theEcorePackage.getEString(), "nsPrefix", null, 0, 1, NsPrefixable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(webAddressEClass, WebAddress.class, "WebAddress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWebAddress_BaseUri(), ecorePackage.getEString(), "baseUri", null, 1, 1, WebAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebAddress_BasePath(), ecorePackage.getEString(), "basePath", null, 1, 1, WebAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebAddress_ApiPath(), ecorePackage.getEString(), "apiPath", null, 1, 1, WebAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebAddress_ImagesUri(), ecorePackage.getEString(), "imagesUri", null, 1, 1, WebAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebAddress_SkinUri(), ecorePackage.getEString(), "skinUri", null, 1, 1, WebAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebAddress_JsUri(), ecorePackage.getEString(), "jsUri", null, 1, 1, WebAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebAddress_SecureBaseUri(), ecorePackage.getEString(), "secureBaseUri", null, 0, 1, WebAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebAddress_SecureImagesUri(), ecorePackage.getEString(), "secureImagesUri", null, 0, 1, WebAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebAddress_SecureSkinUri(), ecorePackage.getEString(), "secureSkinUri", null, 0, 1, WebAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebAddress_SecureJsUri(), ecorePackage.getEString(), "secureJsUri", null, 0, 1, WebAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addedEClass, Added.class, "Added", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelNotificationEClass, ModelNotification.class, "ModelNotification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelNotification_Container(), theEcorePackage.getEObject(), null, "container", null, 0, 1, ModelNotification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeSetEClass, AttributeSet.class, "AttributeSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeUnsetEClass, AttributeUnset.class, "AttributeUnset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(removedEClass, Removed.class, "Removed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectNotificationEClass, ObjectNotification.class, "ObjectNotification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(objectNotificationEClass_T);
		initEAttribute(getObjectNotification_Object(), g1, "object", null, 1, 1, ObjectNotification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeNotificationEClass, AttributeNotification.class, "AttributeNotification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeNotification_Attribute(), theEcorePackage.getEAttribute(), null, "attribute", null, 1, 1, AttributeNotification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(attributeNotificationEClass_T);
		initEAttribute(getAttributeNotification_Object(), g1, "object", null, 1, 1, AttributeNotification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(attributeNotificationEClass_V);
		initEAttribute(getAttributeNotification_OldValue(), g1, "oldValue", null, 0, 1, AttributeNotification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(attributeNotificationEClass_V);
		initEAttribute(getAttributeNotification_NewValue(), g1, "newValue", null, 0, 1, AttributeNotification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addedManyEClass, AddedMany.class, "AddedMany", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(removedManyEClass, RemovedMany.class, "RemovedMany", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectsNotificationEClass, ObjectsNotification.class, "ObjectsNotification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(objectsNotificationEClass_T);
		initEAttribute(getObjectsNotification_Objects(), g1, "objects", null, 1, -1, ObjectsNotification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eObjectLinkedEClass, EObjectLinked.class, "EObjectLinked", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(eObjectLinkedEClass, null, "getObject", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(eObjectLinkedEClass_T);
		initEOperation(op, g1);

		initEClass(parentableEClass, Parentable.class, "Parentable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(parentableEClass_P);
		initEReference(getParentable_Parent(), g1, null, "parent", null, 0, 1, Parentable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(categoryLikeEClass, CategoryLike.class, "CategoryLike", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCategoryLike_SlugPath(), theEcorePackage.getEString(), "slugPath", null, 0, 1, CategoryLike.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCategoryLike_Color(), theEcorePackage.getEString(), "color", null, 0, 1, CategoryLike.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCategoryLike_ImageId(), theEcorePackage.getEString(), "imageId", null, 0, 1, CategoryLike.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCategoryLike_Level(), theEcorePackage.getEIntegerObject(), "level", null, 0, 1, CategoryLike.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCategoryLike_CategoryCount(), theEcorePackage.getELongObject(), "categoryCount", null, 0, 1, CategoryLike.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(categoryInfoEClass, CategoryInfo.class, "CategoryInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		  (appManifestEClass, 
		   source, 
		   new String[] {
			 "documentation", "Attributes are optional because can use OverlayingSupplier."
		   });		
		addAnnotation
		  (getAppManifest_Domain(), 
		   source, 
		   new String[] {
			 "documentation", "Primary domain name of the application, e.g. \"berbatik.com\". Used by Email system.\n\n<p>For development, use e.g. \"berbatik.annafi.dev\".\n\n<p>TODO: title & domain should probably be moved somewhere else, since it\'s tenant & environment specific.\n\n<p>Production: title=Berbatik, domain=berbatik.com\n\n<p>Staging: title=Berbatik stg, domain=stg.berbatik.com\n\n<p>Development: title=Berbatik Annafi, domain=berbatik.annafi.dev\n\n<p>Description usually stays the same, but can be different too."
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
			 "documentation", "ID of the object. Usually either lowercase_underscored or UUID. Optional because some implementations (e.g. CategoryCatalog) can generate IDs dynamically when loading from Catalog.\n\n<p>In LDAP, it can either be \'uid\' or \'uniqueIdentifier\'.\n\n<p>RFC1274: unique identifer.\nLDAP: uniqueIdentifier"
		   });		
		addAnnotation
		  (getSluggable_Slug(), 
		   source, 
		   new String[] {
			 "documentation", "Slug (aka Directory uniqueIdentifier) used in SEO-friendly URIs. Optional because some implementations (e.g. CategoryCatalog) can generate slugs dynamically when loading from Catalogs."
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
		  (describableEClass, 
		   source, 
		   new String[] {
			 "documentation", "Has description."
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
		  (javaClassLinkedEClass, 
		   source, 
		   new String[] {
			 "documentation", "Implementation is in {@link org.soluvas.commons.JavaClassLinked.Trait}."
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
		  (eClassLinkedEClass, 
		   source, 
		   new String[] {
			 "documentation", "Implementation is in {@link org.soluvas.commons.util.EClassLinked.Trait}."
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
		  (getEClassLinked_EPackageNsPrefix(), 
		   source, 
		   new String[] {
			 "documentation", "Used to resolve agains NS Prefix instead of EPackage name. The key format will be \"{ePackage.nsPrefix}:{eClass.name}\"."
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
			 "documentation", "Name of EPackage, used for resolving the EClass instance.  The key format will be \"{ePackage.name}.{eClass.name}\"."
		   });		
		addAnnotation
		  (eFactoryLinkedEClass, 
		   source, 
		   new String[] {
			 "documentation", "Useful for schema classes, e.g. {@code com.soluvas.story.schema.ActionType}, {@code com.soluvas.story.schema.TargetType}."
		   });		
		addAnnotation
		  (getEFactoryLinked_EFactory(), 
		   source, 
		   new String[] {
			 "documentation", "Useful for schema classes, e.g. {@code com.soluvas.story.schema.ActionType}, {@code com.soluvas.story.schema.TargetType}. Only accessible when resolved."
		   });		
		addAnnotation
		  (getNsPrefixable_NsPrefix(), 
		   source, 
		   new String[] {
			 "documentation", "Context-specific NS prefix.\n\nComes from: getActionType().getEClass().getEPackage().getNsPrefix()."
		   });		
		addAnnotation
		  (webAddressEClass, 
		   source, 
		   new String[] {
			 "documentation", "Tenant-wide website URI configuration."
		   });		
		addAnnotation
		  (getWebAddress_BaseUri(), 
		   source, 
		   new String[] {
			 "documentation", "Absolute URI of the website. Used by email notifications, external servers, etc."
		   });		
		addAnnotation
		  (getWebAddress_BasePath(), 
		   source, 
		   new String[] {
			 "documentation", "Absolute path to website, e.g. /"
		   });		
		addAnnotation
		  (getWebAddress_ApiPath(), 
		   source, 
		   new String[] {
			 "documentation", "Absolute path to API, e.g. /api/\n"
		   });		
		addAnnotation
		  (getWebAddress_ImagesUri(), 
		   source, 
		   new String[] {
			 "documentation", "Absolute URI to image files, e.g. http://images.berbatik.com/"
		   });		
		addAnnotation
		  (getWebAddress_SkinUri(), 
		   source, 
		   new String[] {
			 "documentation", "Absolute URI to CSS files and dependencies (sprite images, fonts, etc.), e.g. http://skin.berbatik.com/"
		   });		
		addAnnotation
		  (getWebAddress_JsUri(), 
		   source, 
		   new String[] {
			 "documentation", "Absolute URI to JavaScript files, e.g. http://js.berbatik.com/"
		   });		
		addAnnotation
		  (getWebAddress_SecureBaseUri(), 
		   source, 
		   new String[] {
			 "documentation", "Absolute URI to website, e.g. https://www.berbatik.com/"
		   });		
		addAnnotation
		  (getWebAddress_SecureImagesUri(), 
		   source, 
		   new String[] {
			 "documentation", "Absolute URI to secure image files, e.g. https://images.berbatik.com/"
		   });		
		addAnnotation
		  (getWebAddress_SecureSkinUri(), 
		   source, 
		   new String[] {
			 "documentation", "Absolute secure URI to CSS files and dependencies (sprite images, fonts, etc.), e.g. http://skin.berbatik.com/"
		   });		
		addAnnotation
		  (addedEClass, 
		   source, 
		   new String[] {
			 "documentation", "Inspired by {@link org.eclipse.emf.common.notify.Notification}."
		   });		
		addAnnotation
		  (modelNotificationEClass, 
		   source, 
		   new String[] {
			 "documentation", "Inspired by {@link org.eclipse.emf.common.notify.Notification}."
		   });		
		addAnnotation
		  (categoryLikeEClass, 
		   source, 
		   new String[] {
			 "documentation", "ID is prefixed with parent IDs then concatenated by \'_\', it won\'t change when categories are reordered are moved/restructured. IDs cannot be duplicate (even draft/inactive/void categories). Slugs can be duplicates only within same parent. Names can be duplicates.\n\n<p>Slug is used as name in JCR repositories. If not specified, should be generated based on Name.\n\n<p>Name is used as displayName in JCR repositories."
		   });		
		addAnnotation
		  (getCategoryLike_SlugPath(), 
		   source, 
		   new String[] {
			 "documentation", "Automatically updated based on slug and parent slugs, separated by \'/\'."
		   });		
		addAnnotation
		  (getCategoryLike_Color(), 
		   source, 
		   new String[] {
			 "documentation", "HTML color code name or hexadecimal code (i.e. \"#3356ff\") of category color (usually used as background)."
		   });		
		addAnnotation
		  (getCategoryLike_Level(), 
		   source, 
		   new String[] {
			 "documentation", "The \"implicit root category\" has level 0. So a Category without a parent has level 1. Automatically updated on save."
		   });		
		addAnnotation
		  (getCategoryLike_CategoryCount(), 
		   source, 
		   new String[] {
			 "documentation", "Number of children categories. Automatically updated when categories are restructured."
		   });
	}

} //CommonsPackageImpl
