/**
 */
package org.soluvas.commons;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.soluvas.commons.CommonsFactory
 * @model kind="package"
 * @generated
 */
public interface CommonsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "commons";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.soluvas.org/schema/commons/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "commons";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonsPackage eINSTANCE = org.soluvas.commons.impl.CommonsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.soluvas.commons.ResourceAware <em>Resource Aware</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.ResourceAware
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getResourceAware()
	 * @generated
	 */
	int RESOURCE_AWARE = 0;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_AWARE__RESOURCE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Resource Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_AWARE__RESOURCE_URI = 1;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_AWARE__RESOURCE_NAME = 2;

	/**
	 * The number of structural features of the '<em>Resource Aware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_AWARE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.Positionable <em>Positionable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.Positionable
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getPositionable()
	 * @generated
	 */
	int POSITIONABLE = 1;

	/**
	 * The feature id for the '<em><b>Positioner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONABLE__POSITIONER = 0;

	/**
	 * The number of structural features of the '<em>Positionable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.impl.AppManifestImpl <em>App Manifest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.impl.AppManifestImpl
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getAppManifest()
	 * @generated
	 */
	int APP_MANIFEST = 2;

	/**
	 * The feature id for the '<em><b>Positioner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__POSITIONER = POSITIONABLE__POSITIONER;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__RESOURCE_TYPE = POSITIONABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__RESOURCE_URI = POSITIONABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__RESOURCE_NAME = POSITIONABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__TITLE = POSITIONABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST__DESCRIPTION = POSITIONABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>App Manifest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MANIFEST_FEATURE_COUNT = POSITIONABLE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.impl.PersonInfoImpl <em>Person Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.impl.PersonInfoImpl
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getPersonInfo()
	 * @generated
	 */
	int PERSON_INFO = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_INFO__ID = 0;

	/**
	 * The feature id for the '<em><b>Slug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_INFO__SLUG = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_INFO__NAME = 2;

	/**
	 * The feature id for the '<em><b>Photo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_INFO__PHOTO_ID = 3;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_INFO__GENDER = 4;

	/**
	 * The number of structural features of the '<em>Person Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_INFO_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.Timestamped <em>Timestamped</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.Timestamped
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getTimestamped()
	 * @generated
	 */
	int TIMESTAMPED = 4;

	/**
	 * The feature id for the '<em><b>Creation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMPED__CREATION_TIME = 0;

	/**
	 * The feature id for the '<em><b>Modification Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMPED__MODIFICATION_TIME = 1;

	/**
	 * The number of structural features of the '<em>Timestamped</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMPED_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.soluvas.commons.ResourceType <em>Resource Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.ResourceType
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getResourceType()
	 * @generated
	 */
	int RESOURCE_TYPE = 5;


	/**
	 * The meta object id for the '{@link org.soluvas.commons.Gender <em>Gender</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.commons.Gender
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getGender()
	 * @generated
	 */
	int GENDER = 6;


	/**
	 * The meta object id for the '<em>Date Time</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.joda.time.DateTime
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getDateTime()
	 * @generated
	 */
	int DATE_TIME = 7;

	/**
	 * The meta object id for the '<em>Currency Unit</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.joda.money.CurrencyUnit
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getCurrencyUnit()
	 * @generated
	 */
	int CURRENCY_UNIT = 8;

	/**
	 * The meta object id for the '<em>Unit</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.measure.unit.Unit
	 * @see org.soluvas.commons.impl.CommonsPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 9;


	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.ResourceAware <em>Resource Aware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Aware</em>'.
	 * @see org.soluvas.commons.ResourceAware
	 * @generated
	 */
	EClass getResourceAware();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.ResourceAware#getResourceUri <em>Resource Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Uri</em>'.
	 * @see org.soluvas.commons.ResourceAware#getResourceUri()
	 * @see #getResourceAware()
	 * @generated
	 */
	EAttribute getResourceAware_ResourceUri();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.ResourceAware#getResourceName <em>Resource Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Name</em>'.
	 * @see org.soluvas.commons.ResourceAware#getResourceName()
	 * @see #getResourceAware()
	 * @generated
	 */
	EAttribute getResourceAware_ResourceName();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.Positionable <em>Positionable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positionable</em>'.
	 * @see org.soluvas.commons.Positionable
	 * @generated
	 */
	EClass getPositionable();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Positionable#getPositioner <em>Positioner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Positioner</em>'.
	 * @see org.soluvas.commons.Positionable#getPositioner()
	 * @see #getPositionable()
	 * @generated
	 */
	EAttribute getPositionable_Positioner();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.ResourceAware#getResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Type</em>'.
	 * @see org.soluvas.commons.ResourceAware#getResourceType()
	 * @see #getResourceAware()
	 * @generated
	 */
	EAttribute getResourceAware_ResourceType();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.AppManifest <em>App Manifest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Manifest</em>'.
	 * @see org.soluvas.commons.AppManifest
	 * @generated
	 */
	EClass getAppManifest();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.AppManifest#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.soluvas.commons.AppManifest#getTitle()
	 * @see #getAppManifest()
	 * @generated
	 */
	EAttribute getAppManifest_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.AppManifest#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.soluvas.commons.AppManifest#getDescription()
	 * @see #getAppManifest()
	 * @generated
	 */
	EAttribute getAppManifest_Description();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.PersonInfo <em>Person Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person Info</em>'.
	 * @see org.soluvas.commons.PersonInfo
	 * @generated
	 */
	EClass getPersonInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.PersonInfo#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.soluvas.commons.PersonInfo#getId()
	 * @see #getPersonInfo()
	 * @generated
	 */
	EAttribute getPersonInfo_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.PersonInfo#getSlug <em>Slug</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slug</em>'.
	 * @see org.soluvas.commons.PersonInfo#getSlug()
	 * @see #getPersonInfo()
	 * @generated
	 */
	EAttribute getPersonInfo_Slug();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.PersonInfo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.soluvas.commons.PersonInfo#getName()
	 * @see #getPersonInfo()
	 * @generated
	 */
	EAttribute getPersonInfo_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.PersonInfo#getPhotoId <em>Photo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Photo Id</em>'.
	 * @see org.soluvas.commons.PersonInfo#getPhotoId()
	 * @see #getPersonInfo()
	 * @generated
	 */
	EAttribute getPersonInfo_PhotoId();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.PersonInfo#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see org.soluvas.commons.PersonInfo#getGender()
	 * @see #getPersonInfo()
	 * @generated
	 */
	EAttribute getPersonInfo_Gender();

	/**
	 * Returns the meta object for class '{@link org.soluvas.commons.Timestamped <em>Timestamped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timestamped</em>'.
	 * @see org.soluvas.commons.Timestamped
	 * @generated
	 */
	EClass getTimestamped();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Timestamped#getCreationTime <em>Creation Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Time</em>'.
	 * @see org.soluvas.commons.Timestamped#getCreationTime()
	 * @see #getTimestamped()
	 * @generated
	 */
	EAttribute getTimestamped_CreationTime();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.commons.Timestamped#getModificationTime <em>Modification Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modification Time</em>'.
	 * @see org.soluvas.commons.Timestamped#getModificationTime()
	 * @see #getTimestamped()
	 * @generated
	 */
	EAttribute getTimestamped_ModificationTime();

	/**
	 * Returns the meta object for enum '{@link org.soluvas.commons.ResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource Type</em>'.
	 * @see org.soluvas.commons.ResourceType
	 * @generated
	 */
	EEnum getResourceType();

	/**
	 * Returns the meta object for enum '{@link org.soluvas.commons.Gender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gender</em>'.
	 * @see org.soluvas.commons.Gender
	 * @generated
	 */
	EEnum getGender();

	/**
	 * Returns the meta object for data type '{@link org.joda.time.DateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date Time</em>'.
	 * @see org.joda.time.DateTime
	 * @model instanceClass="org.joda.time.DateTime"
	 * @generated
	 */
	EDataType getDateTime();

	/**
	 * Returns the meta object for data type '{@link org.joda.money.CurrencyUnit <em>Currency Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Currency Unit</em>'.
	 * @see org.joda.money.CurrencyUnit
	 * @model instanceClass="org.joda.money.CurrencyUnit"
	 * @generated
	 */
	EDataType getCurrencyUnit();

	/**
	 * Returns the meta object for data type '{@link javax.measure.unit.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unit</em>'.
	 * @see javax.measure.unit.Unit
	 * @model instanceClass="javax.measure.unit.Unit"
	 * @generated
	 */
	EDataType getUnit();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommonsFactory getCommonsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.soluvas.commons.ResourceAware <em>Resource Aware</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.ResourceAware
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getResourceAware()
		 * @generated
		 */
		EClass RESOURCE_AWARE = eINSTANCE.getResourceAware();

		/**
		 * The meta object literal for the '<em><b>Resource Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_AWARE__RESOURCE_URI = eINSTANCE.getResourceAware_ResourceUri();

		/**
		 * The meta object literal for the '<em><b>Resource Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_AWARE__RESOURCE_NAME = eINSTANCE.getResourceAware_ResourceName();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.Positionable <em>Positionable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.Positionable
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getPositionable()
		 * @generated
		 */
		EClass POSITIONABLE = eINSTANCE.getPositionable();

		/**
		 * The meta object literal for the '<em><b>Positioner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITIONABLE__POSITIONER = eINSTANCE.getPositionable_Positioner();

		/**
		 * The meta object literal for the '<em><b>Resource Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_AWARE__RESOURCE_TYPE = eINSTANCE.getResourceAware_ResourceType();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.impl.AppManifestImpl <em>App Manifest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.impl.AppManifestImpl
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getAppManifest()
		 * @generated
		 */
		EClass APP_MANIFEST = eINSTANCE.getAppManifest();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_MANIFEST__TITLE = eINSTANCE.getAppManifest_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_MANIFEST__DESCRIPTION = eINSTANCE.getAppManifest_Description();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.impl.PersonInfoImpl <em>Person Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.impl.PersonInfoImpl
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getPersonInfo()
		 * @generated
		 */
		EClass PERSON_INFO = eINSTANCE.getPersonInfo();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_INFO__ID = eINSTANCE.getPersonInfo_Id();

		/**
		 * The meta object literal for the '<em><b>Slug</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_INFO__SLUG = eINSTANCE.getPersonInfo_Slug();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_INFO__NAME = eINSTANCE.getPersonInfo_Name();

		/**
		 * The meta object literal for the '<em><b>Photo Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_INFO__PHOTO_ID = eINSTANCE.getPersonInfo_PhotoId();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_INFO__GENDER = eINSTANCE.getPersonInfo_Gender();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.Timestamped <em>Timestamped</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.Timestamped
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getTimestamped()
		 * @generated
		 */
		EClass TIMESTAMPED = eINSTANCE.getTimestamped();

		/**
		 * The meta object literal for the '<em><b>Creation Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMESTAMPED__CREATION_TIME = eINSTANCE.getTimestamped_CreationTime();

		/**
		 * The meta object literal for the '<em><b>Modification Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMESTAMPED__MODIFICATION_TIME = eINSTANCE.getTimestamped_ModificationTime();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.ResourceType <em>Resource Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.ResourceType
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getResourceType()
		 * @generated
		 */
		EEnum RESOURCE_TYPE = eINSTANCE.getResourceType();

		/**
		 * The meta object literal for the '{@link org.soluvas.commons.Gender <em>Gender</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.commons.Gender
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getGender()
		 * @generated
		 */
		EEnum GENDER = eINSTANCE.getGender();

		/**
		 * The meta object literal for the '<em>Date Time</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.joda.time.DateTime
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getDateTime()
		 * @generated
		 */
		EDataType DATE_TIME = eINSTANCE.getDateTime();

		/**
		 * The meta object literal for the '<em>Currency Unit</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.joda.money.CurrencyUnit
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getCurrencyUnit()
		 * @generated
		 */
		EDataType CURRENCY_UNIT = eINSTANCE.getCurrencyUnit();

		/**
		 * The meta object literal for the '<em>Unit</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.measure.unit.Unit
		 * @see org.soluvas.commons.impl.CommonsPackageImpl#getUnit()
		 * @generated
		 */
		EDataType UNIT = eINSTANCE.getUnit();

	}

} //CommonsPackage
