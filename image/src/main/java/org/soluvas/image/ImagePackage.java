/**
 */
package org.soluvas.image;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.soluvas.commons.CommonsPackage;

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
 * @see org.soluvas.image.ImageFactory
 * @model kind="package"
 * @generated
 */
public interface ImagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "image";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.soluvas.org/schema/image/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "image";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImagePackage eINSTANCE = org.soluvas.image.impl.ImagePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.soluvas.image.impl.ImageConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.image.impl.ImageConnectorImpl
	 * @see org.soluvas.image.impl.ImagePackageImpl#getImageConnector()
	 * @generated
	 */
	int IMAGE_CONNECTOR = 0;

	/**
	 * The feature id for the '<em><b>Hi Uri Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CONNECTOR__HI_URI_TEMPLATE = 0;

	/**
	 * The feature id for the '<em><b>Uri Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CONNECTOR__URI_TEMPLATE = 1;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CONNECTOR__EXECUTOR = 2;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CONNECTOR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.soluvas.image.impl.S3ConnectorImpl <em>S3 Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.image.impl.S3ConnectorImpl
	 * @see org.soluvas.image.impl.ImagePackageImpl#getS3Connector()
	 * @generated
	 */
	int S3_CONNECTOR = 2;

	/**
	 * The meta object id for the '{@link org.soluvas.image.impl.ImageTransformerImpl <em>Transformer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.image.impl.ImageTransformerImpl
	 * @see org.soluvas.image.impl.ImagePackageImpl#getImageTransformer()
	 * @generated
	 */
	int IMAGE_TRANSFORMER = 3;

	/**
	 * The meta object id for the '{@link org.soluvas.image.impl.BlitlineTransformerImpl <em>Blitline Transformer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.image.impl.BlitlineTransformerImpl
	 * @see org.soluvas.image.impl.ImagePackageImpl#getBlitlineTransformer()
	 * @generated
	 */
	int BLITLINE_TRANSFORMER = 4;

	/**
	 * The meta object id for the '{@link org.soluvas.image.impl.DavConnectorImpl <em>Dav Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.image.impl.DavConnectorImpl
	 * @see org.soluvas.image.impl.ImagePackageImpl#getDavConnector()
	 * @generated
	 */
	int DAV_CONNECTOR = 1;

	/**
	 * The feature id for the '<em><b>Hi Uri Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAV_CONNECTOR__HI_URI_TEMPLATE = IMAGE_CONNECTOR__HI_URI_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Uri Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAV_CONNECTOR__URI_TEMPLATE = IMAGE_CONNECTOR__URI_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAV_CONNECTOR__EXECUTOR = IMAGE_CONNECTOR__EXECUTOR;

	/**
	 * The number of structural features of the '<em>Dav Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAV_CONNECTOR_FEATURE_COUNT = IMAGE_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hi Uri Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int S3_CONNECTOR__HI_URI_TEMPLATE = IMAGE_CONNECTOR__HI_URI_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Uri Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int S3_CONNECTOR__URI_TEMPLATE = IMAGE_CONNECTOR__URI_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int S3_CONNECTOR__EXECUTOR = IMAGE_CONNECTOR__EXECUTOR;

	/**
	 * The feature id for the '<em><b>Canonical User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int S3_CONNECTOR__CANONICAL_USER_ID = IMAGE_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bucket</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int S3_CONNECTOR__BUCKET = IMAGE_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tenant Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int S3_CONNECTOR__TENANT_ID = IMAGE_CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tenant Env</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int S3_CONNECTOR__TENANT_ENV = IMAGE_CONNECTOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Origin Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int S3_CONNECTOR__ORIGIN_ALIAS = IMAGE_CONNECTOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cdn Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int S3_CONNECTOR__CDN_ALIAS = IMAGE_CONNECTOR_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>S3 Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int S3_CONNECTOR_FEATURE_COUNT = IMAGE_CONNECTOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TRANSFORMER__EXECUTOR = 0;

	/**
	 * The number of structural features of the '<em>Transformer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TRANSFORMER_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLITLINE_TRANSFORMER__EXECUTOR = IMAGE_TRANSFORMER__EXECUTOR;

	/**
	 * The feature id for the '<em><b>Application Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLITLINE_TRANSFORMER__APPLICATION_ID = IMAGE_TRANSFORMER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bucket</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLITLINE_TRANSFORMER__BUCKET = IMAGE_TRANSFORMER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tenant Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLITLINE_TRANSFORMER__TENANT_ID = IMAGE_TRANSFORMER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tenant Env</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLITLINE_TRANSFORMER__TENANT_ENV = IMAGE_TRANSFORMER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cdn Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLITLINE_TRANSFORMER__CDN_ALIAS = IMAGE_TRANSFORMER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Key Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLITLINE_TRANSFORMER__KEY_TEMPLATE = IMAGE_TRANSFORMER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Uri Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLITLINE_TRANSFORMER__URI_TEMPLATE = IMAGE_TRANSFORMER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Origin Uri Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLITLINE_TRANSFORMER__ORIGIN_URI_TEMPLATE = IMAGE_TRANSFORMER_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Blitline Transformer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLITLINE_TRANSFORMER_FEATURE_COUNT = IMAGE_TRANSFORMER_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.soluvas.image.impl.ThumbnailatorTransformerImpl <em>Thumbnailator Transformer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.image.impl.ThumbnailatorTransformerImpl
	 * @see org.soluvas.image.impl.ImagePackageImpl#getThumbnailatorTransformer()
	 * @generated
	 */
	int THUMBNAILATOR_TRANSFORMER = 5;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMBNAILATOR_TRANSFORMER__EXECUTOR = IMAGE_TRANSFORMER__EXECUTOR;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMBNAILATOR_TRANSFORMER__DESTINATION = IMAGE_TRANSFORMER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Thumbnailator Transformer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMBNAILATOR_TRANSFORMER_FEATURE_COUNT = IMAGE_TRANSFORMER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.soluvas.image.impl.UploadedImageImpl <em>Uploaded Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.image.impl.UploadedImageImpl
	 * @see org.soluvas.image.impl.ImagePackageImpl#getUploadedImage()
	 * @generated
	 */
	int UPLOADED_IMAGE = 6;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPLOADED_IMAGE__URI = 0;

	/**
	 * The feature id for the '<em><b>Origin Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPLOADED_IMAGE__ORIGIN_URI = 1;

	/**
	 * The feature id for the '<em><b>Style Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPLOADED_IMAGE__STYLE_CODE = 2;

	/**
	 * The feature id for the '<em><b>Style Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPLOADED_IMAGE__STYLE_VARIANT = 3;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPLOADED_IMAGE__EXTENSION = 4;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPLOADED_IMAGE__SIZE = 5;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPLOADED_IMAGE__WIDTH = 6;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPLOADED_IMAGE__HEIGHT = 7;

	/**
	 * The number of structural features of the '<em>Uploaded Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPLOADED_IMAGE_FEATURE_COUNT = 8;


	/**
	 * The meta object id for the '{@link org.soluvas.image.impl.ImageManagerImpl <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.image.impl.ImageManagerImpl
	 * @see org.soluvas.image.impl.ImagePackageImpl#getImageManager()
	 * @generated
	 */
	int IMAGE_MANAGER = 7;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MANAGER_FEATURE_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.soluvas.image.ImageTransform <em>Transform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.image.ImageTransform
	 * @see org.soluvas.image.impl.ImagePackageImpl#getImageTransform()
	 * @generated
	 */
	int IMAGE_TRANSFORM = 8;


	/**
	 * The number of structural features of the '<em>Transform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TRANSFORM_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.soluvas.image.impl.ResizeToFitImpl <em>Resize To Fit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.image.impl.ResizeToFitImpl
	 * @see org.soluvas.image.impl.ImagePackageImpl#getResizeToFit()
	 * @generated
	 */
	int RESIZE_TO_FIT = 9;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIZE_TO_FIT__WIDTH = IMAGE_TRANSFORM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIZE_TO_FIT__HEIGHT = IMAGE_TRANSFORM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Watermark File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIZE_TO_FIT__WATERMARK_FILE = IMAGE_TRANSFORM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Watermark Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIZE_TO_FIT__WATERMARK_OPACITY = IMAGE_TRANSFORM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Watermark Gravity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIZE_TO_FIT__WATERMARK_GRAVITY = IMAGE_TRANSFORM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Overlay File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIZE_TO_FIT__OVERLAY_FILE = IMAGE_TRANSFORM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Overlay Gravity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIZE_TO_FIT__OVERLAY_GRAVITY = IMAGE_TRANSFORM_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Only Shrink Larger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIZE_TO_FIT__ONLY_SHRINK_LARGER = IMAGE_TRANSFORM_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Extent Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIZE_TO_FIT__EXTENT_ENABLED = IMAGE_TRANSFORM_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Resize To Fit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIZE_TO_FIT_FEATURE_COUNT = IMAGE_TRANSFORM_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.soluvas.image.impl.ResizeToFillImpl <em>Resize To Fill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.image.impl.ResizeToFillImpl
	 * @see org.soluvas.image.impl.ImagePackageImpl#getResizeToFill()
	 * @generated
	 */
	int RESIZE_TO_FILL = 10;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIZE_TO_FILL__WIDTH = IMAGE_TRANSFORM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIZE_TO_FILL__HEIGHT = IMAGE_TRANSFORM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Watermark File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIZE_TO_FILL__WATERMARK_FILE = IMAGE_TRANSFORM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Watermark Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIZE_TO_FILL__WATERMARK_OPACITY = IMAGE_TRANSFORM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Watermark Gravity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIZE_TO_FILL__WATERMARK_GRAVITY = IMAGE_TRANSFORM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Overlay File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIZE_TO_FILL__OVERLAY_FILE = IMAGE_TRANSFORM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Overlay Gravity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIZE_TO_FILL__OVERLAY_GRAVITY = IMAGE_TRANSFORM_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Gravity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIZE_TO_FILL__GRAVITY = IMAGE_TRANSFORM_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Only Shrink Larger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIZE_TO_FILL__ONLY_SHRINK_LARGER = IMAGE_TRANSFORM_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Resize To Fill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIZE_TO_FILL_FEATURE_COUNT = IMAGE_TRANSFORM_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.soluvas.image.DimensionLike <em>Dimension Like</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.image.DimensionLike
	 * @see org.soluvas.image.impl.ImagePackageImpl#getDimensionLike()
	 * @generated
	 */
	int DIMENSION_LIKE = 11;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_LIKE__WIDTH = 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_LIKE__HEIGHT = 1;

	/**
	 * The number of structural features of the '<em>Dimension Like</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_LIKE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.soluvas.image.impl.ImageVariantImpl <em>Variant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.image.impl.ImageVariantImpl
	 * @see org.soluvas.image.impl.ImagePackageImpl#getImageVariant()
	 * @generated
	 */
	int IMAGE_VARIANT = 12;

	/**
	 * The feature id for the '<em><b>Style Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_VARIANT__STYLE_CODE = 0;

	/**
	 * The feature id for the '<em><b>Style Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_VARIANT__STYLE_VARIANT = 1;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_VARIANT__EXTENSION = 2;

	/**
	 * The number of structural features of the '<em>Variant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_VARIANT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.soluvas.image.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.image.impl.ImageImpl
	 * @see org.soluvas.image.impl.ImagePackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ID = CommonsPackage.IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__NAME = CommonsPackage.IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Creation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__CREATION_TIME = CommonsPackage.IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modification Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__MODIFICATION_TIME = CommonsPackage.IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__WIDTH = CommonsPackage.IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__HEIGHT = CommonsPackage.IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__STYLES = CommonsPackage.IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Schema Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__SCHEMA_VERSION = CommonsPackage.IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__URI = CommonsPackage.IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__FILE_NAME = CommonsPackage.IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__CONTENT_TYPE = CommonsPackage.IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__SIZE = CommonsPackage.IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__CREATED = CommonsPackage.IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Origin Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ORIGIN_URI = CommonsPackage.IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__EXTENSION = CommonsPackage.IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Linked File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__LINKED_FILE = CommonsPackage.IDENTIFIABLE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Original File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ORIGINAL_FILE = CommonsPackage.IDENTIFIABLE_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = CommonsPackage.IDENTIFIABLE_FEATURE_COUNT + 16;

	/**
	 * The meta object id for the '{@link org.soluvas.image.impl.StyledImageImpl <em>Styled Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.image.impl.StyledImageImpl
	 * @see org.soluvas.image.impl.ImagePackageImpl#getStyledImage()
	 * @generated
	 */
	int STYLED_IMAGE = 14;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_IMAGE__WIDTH = CommonsPackage.SCHEMA_VERSIONABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_IMAGE__HEIGHT = CommonsPackage.SCHEMA_VERSIONABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_IMAGE__NAME = CommonsPackage.SCHEMA_VERSIONABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Creation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_IMAGE__CREATION_TIME = CommonsPackage.SCHEMA_VERSIONABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Modification Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_IMAGE__MODIFICATION_TIME = CommonsPackage.SCHEMA_VERSIONABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Schema Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_IMAGE__SCHEMA_VERSION = CommonsPackage.SCHEMA_VERSIONABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_IMAGE__CODE = CommonsPackage.SCHEMA_VERSIONABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_IMAGE__URI = CommonsPackage.SCHEMA_VERSIONABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_IMAGE__SIZE = CommonsPackage.SCHEMA_VERSIONABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_IMAGE__VARIANT = CommonsPackage.SCHEMA_VERSIONABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_IMAGE__EXTENSION = CommonsPackage.SCHEMA_VERSIONABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Origin Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_IMAGE__ORIGIN_URI = CommonsPackage.SCHEMA_VERSIONABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_IMAGE__CONTENT_TYPE = CommonsPackage.SCHEMA_VERSIONABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Linked File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_IMAGE__LINKED_FILE = CommonsPackage.SCHEMA_VERSIONABLE_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Styled Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_IMAGE_FEATURE_COUNT = CommonsPackage.SCHEMA_VERSIONABLE_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link org.soluvas.image.impl.ImageCatalogImpl <em>Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.image.impl.ImageCatalogImpl
	 * @see org.soluvas.image.impl.ImagePackageImpl#getImageCatalog()
	 * @generated
	 */
	int IMAGE_CATALOG = 15;

	/**
	 * The feature id for the '<em><b>Images</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CATALOG__IMAGES = 0;

	/**
	 * The number of structural features of the '<em>Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CATALOG_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.soluvas.image.impl.ImageMagickTransformerImpl <em>Magick Transformer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.image.impl.ImageMagickTransformerImpl
	 * @see org.soluvas.image.impl.ImagePackageImpl#getImageMagickTransformer()
	 * @generated
	 */
	int IMAGE_MAGICK_TRANSFORMER = 16;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAGICK_TRANSFORMER__EXECUTOR = IMAGE_TRANSFORMER__EXECUTOR;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAGICK_TRANSFORMER__DESTINATION = IMAGE_TRANSFORMER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Magick Transformer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAGICK_TRANSFORMER_FEATURE_COUNT = IMAGE_TRANSFORMER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.soluvas.image.impl.FolderConnectorImpl <em>Folder Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.image.impl.FolderConnectorImpl
	 * @see org.soluvas.image.impl.ImagePackageImpl#getFolderConnector()
	 * @generated
	 */
	int FOLDER_CONNECTOR = 17;

	/**
	 * The feature id for the '<em><b>Hi Uri Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_CONNECTOR__HI_URI_TEMPLATE = IMAGE_CONNECTOR__HI_URI_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Uri Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_CONNECTOR__URI_TEMPLATE = IMAGE_CONNECTOR__URI_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_CONNECTOR__EXECUTOR = IMAGE_CONNECTOR__EXECUTOR;

	/**
	 * The feature id for the '<em><b>Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_CONNECTOR__FOLDER = IMAGE_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Folder Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_CONNECTOR_FEATURE_COUNT = IMAGE_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.soluvas.image.impl.DisplayImageImpl <em>Display Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.image.impl.DisplayImageImpl
	 * @see org.soluvas.image.impl.ImagePackageImpl#getDisplayImage()
	 * @generated
	 */
	int DISPLAY_IMAGE = 18;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_IMAGE__SRC = 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_IMAGE__WIDTH = 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_IMAGE__HEIGHT = 2;

	/**
	 * The feature id for the '<em><b>Alt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_IMAGE__ALT = 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_IMAGE__TITLE = 4;

	/**
	 * The number of structural features of the '<em>Display Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_IMAGE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.soluvas.image.impl.StyledImageEntryImpl <em>Styled Image Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.image.impl.StyledImageEntryImpl
	 * @see org.soluvas.image.impl.ImagePackageImpl#getStyledImageEntry()
	 * @generated
	 */
	int STYLED_IMAGE_ENTRY = 19;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_IMAGE_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_IMAGE_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Styled Image Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_IMAGE_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.soluvas.image.WatermarkLike <em>Watermark Like</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.image.WatermarkLike
	 * @see org.soluvas.image.impl.ImagePackageImpl#getWatermarkLike()
	 * @generated
	 */
	int WATERMARK_LIKE = 20;

	/**
	 * The feature id for the '<em><b>Watermark File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATERMARK_LIKE__WATERMARK_FILE = 0;

	/**
	 * The feature id for the '<em><b>Watermark Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATERMARK_LIKE__WATERMARK_OPACITY = 1;

	/**
	 * The feature id for the '<em><b>Watermark Gravity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATERMARK_LIKE__WATERMARK_GRAVITY = 2;

	/**
	 * The number of structural features of the '<em>Watermark Like</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATERMARK_LIKE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.soluvas.image.impl.MediaImpl <em>Media</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.image.impl.MediaImpl
	 * @see org.soluvas.image.impl.ImagePackageImpl#getMedia()
	 * @generated
	 */
	int MEDIA = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__ID = CommonsPackage.IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__GUID = CommonsPackage.IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__REVISION = CommonsPackage.IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Creation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__CREATION_TIME = CommonsPackage.IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Modification Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__MODIFICATION_TIME = CommonsPackage.IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__NAME = CommonsPackage.IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__DESCRIPTION = CommonsPackage.IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__TYPE = CommonsPackage.IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__STATUS = CommonsPackage.IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__ATTACHMENTS = CommonsPackage.IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Media</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_FEATURE_COUNT = CommonsPackage.IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.soluvas.image.impl.MediaAttachmentImpl <em>Media Attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.image.impl.MediaAttachmentImpl
	 * @see org.soluvas.image.impl.ImagePackageImpl#getMediaAttachment()
	 * @generated
	 */
	int MEDIA_ATTACHMENT = 22;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_ATTACHMENT__CONTENT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Rev Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_ATTACHMENT__REV_POS = 1;

	/**
	 * The feature id for the '<em><b>Digest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_ATTACHMENT__DIGEST = 2;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_ATTACHMENT__LENGTH = 3;

	/**
	 * The feature id for the '<em><b>Stub</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_ATTACHMENT__STUB = 4;

	/**
	 * The number of structural features of the '<em>Media Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_ATTACHMENT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.soluvas.image.impl.MediaAttachmentEntryImpl <em>Media Attachment Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.image.impl.MediaAttachmentEntryImpl
	 * @see org.soluvas.image.impl.ImagePackageImpl#getMediaAttachmentEntry()
	 * @generated
	 */
	int MEDIA_ATTACHMENT_ENTRY = 23;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_ATTACHMENT_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_ATTACHMENT_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Media Attachment Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_ATTACHMENT_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.soluvas.image.OverlayLike <em>Overlay Like</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.image.OverlayLike
	 * @see org.soluvas.image.impl.ImagePackageImpl#getOverlayLike()
	 * @generated
	 */
	int OVERLAY_LIKE = 24;

	/**
	 * The feature id for the '<em><b>Overlay File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_LIKE__OVERLAY_FILE = 0;

	/**
	 * The feature id for the '<em><b>Overlay Gravity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_LIKE__OVERLAY_GRAVITY = 1;

	/**
	 * The number of structural features of the '<em>Overlay Like</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_LIKE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.soluvas.image.ImageTransformType <em>Transform Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.image.ImageTransformType
	 * @see org.soluvas.image.impl.ImagePackageImpl#getImageTransformType()
	 * @generated
	 */
	int IMAGE_TRANSFORM_TYPE = 25;


	/**
	 * The meta object id for the '{@link org.soluvas.image.FileExport <em>File Export</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.image.FileExport
	 * @see org.soluvas.image.impl.ImagePackageImpl#getFileExport()
	 * @generated
	 */
	int FILE_EXPORT = 26;

	/**
	 * The meta object id for the '{@link org.soluvas.image.DuplicateIdHandling <em>Duplicate Id Handling</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.image.DuplicateIdHandling
	 * @see org.soluvas.image.impl.ImagePackageImpl#getDuplicateIdHandling()
	 * @generated
	 */
	int DUPLICATE_ID_HANDLING = 27;

	/**
	 * The meta object id for the '{@link org.soluvas.image.TransformGravity <em>Transform Gravity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.image.TransformGravity
	 * @see org.soluvas.image.impl.ImagePackageImpl#getTransformGravity()
	 * @generated
	 */
	int TRANSFORM_GRAVITY = 28;

	/**
	 * The meta object id for the '{@link org.soluvas.image.ImageTypes <em>Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.image.ImageTypes
	 * @see org.soluvas.image.impl.ImagePackageImpl#getImageTypes()
	 * @generated
	 */
	int IMAGE_TYPES = 29;

	/**
	 * The meta object id for the '{@link org.soluvas.image.ImageStyles <em>Styles</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.image.ImageStyles
	 * @see org.soluvas.image.impl.ImagePackageImpl#getImageStyles()
	 * @generated
	 */
	int IMAGE_STYLES = 30;

	/**
	 * The meta object id for the '{@link org.soluvas.image.MediaStatus <em>Media Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.image.MediaStatus
	 * @see org.soluvas.image.impl.ImagePackageImpl#getMediaStatus()
	 * @generated
	 */
	int MEDIA_STATUS = 31;

	/**
	 * The meta object id for the '<em>Repository</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.image.store.ImageRepository
	 * @see org.soluvas.image.impl.ImagePackageImpl#getImageRepository()
	 * @generated
	 */
	int IMAGE_REPOSITORY = 32;


	/**
	 * The meta object id for the '<em>Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.image.ImageType
	 * @see org.soluvas.image.impl.ImagePackageImpl#getImageType()
	 * @generated
	 */
	int IMAGE_TYPE = 33;

	/**
	 * The meta object id for the '<em>Style</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.image.ImageStyle
	 * @see org.soluvas.image.impl.ImagePackageImpl#getImageStyle()
	 * @generated
	 */
	int IMAGE_STYLE = 34;


	/**
	 * Returns the meta object for class '{@link org.soluvas.image.ImageConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see org.soluvas.image.ImageConnector
	 * @generated
	 */
	EClass getImageConnector();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.ImageConnector#getHiUriTemplate <em>Hi Uri Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hi Uri Template</em>'.
	 * @see org.soluvas.image.ImageConnector#getHiUriTemplate()
	 * @see #getImageConnector()
	 * @generated
	 */
	EAttribute getImageConnector_HiUriTemplate();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.ImageConnector#getUriTemplate <em>Uri Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri Template</em>'.
	 * @see org.soluvas.image.ImageConnector#getUriTemplate()
	 * @see #getImageConnector()
	 * @generated
	 */
	EAttribute getImageConnector_UriTemplate();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.ImageConnector#getExecutor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Executor</em>'.
	 * @see org.soluvas.image.ImageConnector#getExecutor()
	 * @see #getImageConnector()
	 * @generated
	 */
	EAttribute getImageConnector_Executor();

	/**
	 * Returns the meta object for class '{@link org.soluvas.image.S3Connector <em>S3 Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>S3 Connector</em>'.
	 * @see org.soluvas.image.S3Connector
	 * @generated
	 */
	EClass getS3Connector();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.S3Connector#getCanonicalUserId <em>Canonical User Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Canonical User Id</em>'.
	 * @see org.soluvas.image.S3Connector#getCanonicalUserId()
	 * @see #getS3Connector()
	 * @generated
	 */
	EAttribute getS3Connector_CanonicalUserId();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.S3Connector#getBucket <em>Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bucket</em>'.
	 * @see org.soluvas.image.S3Connector#getBucket()
	 * @see #getS3Connector()
	 * @generated
	 */
	EAttribute getS3Connector_Bucket();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.S3Connector#getTenantId <em>Tenant Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tenant Id</em>'.
	 * @see org.soluvas.image.S3Connector#getTenantId()
	 * @see #getS3Connector()
	 * @generated
	 */
	EAttribute getS3Connector_TenantId();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.S3Connector#getTenantEnv <em>Tenant Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tenant Env</em>'.
	 * @see org.soluvas.image.S3Connector#getTenantEnv()
	 * @see #getS3Connector()
	 * @generated
	 */
	EAttribute getS3Connector_TenantEnv();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.S3Connector#getOriginAlias <em>Origin Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin Alias</em>'.
	 * @see org.soluvas.image.S3Connector#getOriginAlias()
	 * @see #getS3Connector()
	 * @generated
	 */
	EAttribute getS3Connector_OriginAlias();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.S3Connector#getCdnAlias <em>Cdn Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cdn Alias</em>'.
	 * @see org.soluvas.image.S3Connector#getCdnAlias()
	 * @see #getS3Connector()
	 * @generated
	 */
	EAttribute getS3Connector_CdnAlias();

	/**
	 * Returns the meta object for class '{@link org.soluvas.image.BlitlineTransformer <em>Blitline Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blitline Transformer</em>'.
	 * @see org.soluvas.image.BlitlineTransformer
	 * @generated
	 */
	EClass getBlitlineTransformer();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.BlitlineTransformer#getApplicationId <em>Application Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application Id</em>'.
	 * @see org.soluvas.image.BlitlineTransformer#getApplicationId()
	 * @see #getBlitlineTransformer()
	 * @generated
	 */
	EAttribute getBlitlineTransformer_ApplicationId();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.BlitlineTransformer#getBucket <em>Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bucket</em>'.
	 * @see org.soluvas.image.BlitlineTransformer#getBucket()
	 * @see #getBlitlineTransformer()
	 * @generated
	 */
	EAttribute getBlitlineTransformer_Bucket();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.BlitlineTransformer#getTenantId <em>Tenant Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tenant Id</em>'.
	 * @see org.soluvas.image.BlitlineTransformer#getTenantId()
	 * @see #getBlitlineTransformer()
	 * @generated
	 */
	EAttribute getBlitlineTransformer_TenantId();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.BlitlineTransformer#getTenantEnv <em>Tenant Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tenant Env</em>'.
	 * @see org.soluvas.image.BlitlineTransformer#getTenantEnv()
	 * @see #getBlitlineTransformer()
	 * @generated
	 */
	EAttribute getBlitlineTransformer_TenantEnv();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.BlitlineTransformer#getCdnAlias <em>Cdn Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cdn Alias</em>'.
	 * @see org.soluvas.image.BlitlineTransformer#getCdnAlias()
	 * @see #getBlitlineTransformer()
	 * @generated
	 */
	EAttribute getBlitlineTransformer_CdnAlias();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.BlitlineTransformer#getKeyTemplate <em>Key Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Template</em>'.
	 * @see org.soluvas.image.BlitlineTransformer#getKeyTemplate()
	 * @see #getBlitlineTransformer()
	 * @generated
	 */
	EAttribute getBlitlineTransformer_KeyTemplate();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.BlitlineTransformer#getUriTemplate <em>Uri Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri Template</em>'.
	 * @see org.soluvas.image.BlitlineTransformer#getUriTemplate()
	 * @see #getBlitlineTransformer()
	 * @generated
	 */
	EAttribute getBlitlineTransformer_UriTemplate();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.BlitlineTransformer#getOriginUriTemplate <em>Origin Uri Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin Uri Template</em>'.
	 * @see org.soluvas.image.BlitlineTransformer#getOriginUriTemplate()
	 * @see #getBlitlineTransformer()
	 * @generated
	 */
	EAttribute getBlitlineTransformer_OriginUriTemplate();

	/**
	 * Returns the meta object for class '{@link org.soluvas.image.DavConnector <em>Dav Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dav Connector</em>'.
	 * @see org.soluvas.image.DavConnector
	 * @generated
	 */
	EClass getDavConnector();

	/**
	 * Returns the meta object for class '{@link org.soluvas.image.ImageTransformer <em>Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformer</em>'.
	 * @see org.soluvas.image.ImageTransformer
	 * @generated
	 */
	EClass getImageTransformer();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.ImageTransformer#getExecutor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Executor</em>'.
	 * @see org.soluvas.image.ImageTransformer#getExecutor()
	 * @see #getImageTransformer()
	 * @generated
	 */
	EAttribute getImageTransformer_Executor();

	/**
	 * Returns the meta object for class '{@link org.soluvas.image.ThumbnailatorTransformer <em>Thumbnailator Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thumbnailator Transformer</em>'.
	 * @see org.soluvas.image.ThumbnailatorTransformer
	 * @generated
	 */
	EClass getThumbnailatorTransformer();

	/**
	 * Returns the meta object for the reference '{@link org.soluvas.image.ThumbnailatorTransformer#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see org.soluvas.image.ThumbnailatorTransformer#getDestination()
	 * @see #getThumbnailatorTransformer()
	 * @generated
	 */
	EReference getThumbnailatorTransformer_Destination();

	/**
	 * Returns the meta object for class '{@link org.soluvas.image.UploadedImage <em>Uploaded Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uploaded Image</em>'.
	 * @see org.soluvas.image.UploadedImage
	 * @generated
	 */
	EClass getUploadedImage();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.UploadedImage#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.soluvas.image.UploadedImage#getUri()
	 * @see #getUploadedImage()
	 * @generated
	 */
	EAttribute getUploadedImage_Uri();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.UploadedImage#getOriginUri <em>Origin Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin Uri</em>'.
	 * @see org.soluvas.image.UploadedImage#getOriginUri()
	 * @see #getUploadedImage()
	 * @generated
	 */
	EAttribute getUploadedImage_OriginUri();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.UploadedImage#getStyleCode <em>Style Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Code</em>'.
	 * @see org.soluvas.image.UploadedImage#getStyleCode()
	 * @see #getUploadedImage()
	 * @generated
	 */
	EAttribute getUploadedImage_StyleCode();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.UploadedImage#getStyleVariant <em>Style Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Variant</em>'.
	 * @see org.soluvas.image.UploadedImage#getStyleVariant()
	 * @see #getUploadedImage()
	 * @generated
	 */
	EAttribute getUploadedImage_StyleVariant();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.UploadedImage#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see org.soluvas.image.UploadedImage#getExtension()
	 * @see #getUploadedImage()
	 * @generated
	 */
	EAttribute getUploadedImage_Extension();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.UploadedImage#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.soluvas.image.UploadedImage#getSize()
	 * @see #getUploadedImage()
	 * @generated
	 */
	EAttribute getUploadedImage_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.UploadedImage#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.soluvas.image.UploadedImage#getWidth()
	 * @see #getUploadedImage()
	 * @generated
	 */
	EAttribute getUploadedImage_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.UploadedImage#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.soluvas.image.UploadedImage#getHeight()
	 * @see #getUploadedImage()
	 * @generated
	 */
	EAttribute getUploadedImage_Height();

	/**
	 * Returns the meta object for class '{@link org.soluvas.image.ImageManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see org.soluvas.image.ImageManager
	 * @generated
	 */
	EClass getImageManager();

	/**
	 * Returns the meta object for class '{@link org.soluvas.image.ImageTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transform</em>'.
	 * @see org.soluvas.image.ImageTransform
	 * @generated
	 */
	EClass getImageTransform();

	/**
	 * Returns the meta object for class '{@link org.soluvas.image.ResizeToFit <em>Resize To Fit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resize To Fit</em>'.
	 * @see org.soluvas.image.ResizeToFit
	 * @generated
	 */
	EClass getResizeToFit();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.ResizeToFit#getOnlyShrinkLarger <em>Only Shrink Larger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Only Shrink Larger</em>'.
	 * @see org.soluvas.image.ResizeToFit#getOnlyShrinkLarger()
	 * @see #getResizeToFit()
	 * @generated
	 */
	EAttribute getResizeToFit_OnlyShrinkLarger();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.ResizeToFit#isExtentEnabled <em>Extent Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extent Enabled</em>'.
	 * @see org.soluvas.image.ResizeToFit#isExtentEnabled()
	 * @see #getResizeToFit()
	 * @generated
	 */
	EAttribute getResizeToFit_ExtentEnabled();

	/**
	 * Returns the meta object for class '{@link org.soluvas.image.ResizeToFill <em>Resize To Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resize To Fill</em>'.
	 * @see org.soluvas.image.ResizeToFill
	 * @generated
	 */
	EClass getResizeToFill();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.ResizeToFill#getGravity <em>Gravity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gravity</em>'.
	 * @see org.soluvas.image.ResizeToFill#getGravity()
	 * @see #getResizeToFill()
	 * @generated
	 */
	EAttribute getResizeToFill_Gravity();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.ResizeToFill#getOnlyShrinkLarger <em>Only Shrink Larger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Only Shrink Larger</em>'.
	 * @see org.soluvas.image.ResizeToFill#getOnlyShrinkLarger()
	 * @see #getResizeToFill()
	 * @generated
	 */
	EAttribute getResizeToFill_OnlyShrinkLarger();

	/**
	 * Returns the meta object for class '{@link org.soluvas.image.DimensionLike <em>Dimension Like</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension Like</em>'.
	 * @see org.soluvas.image.DimensionLike
	 * @generated
	 */
	EClass getDimensionLike();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.DimensionLike#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.soluvas.image.DimensionLike#getWidth()
	 * @see #getDimensionLike()
	 * @generated
	 */
	EAttribute getDimensionLike_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.DimensionLike#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.soluvas.image.DimensionLike#getHeight()
	 * @see #getDimensionLike()
	 * @generated
	 */
	EAttribute getDimensionLike_Height();

	/**
	 * Returns the meta object for class '{@link org.soluvas.image.ImageVariant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variant</em>'.
	 * @see org.soluvas.image.ImageVariant
	 * @generated
	 */
	EClass getImageVariant();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.ImageVariant#getStyleCode <em>Style Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Code</em>'.
	 * @see org.soluvas.image.ImageVariant#getStyleCode()
	 * @see #getImageVariant()
	 * @generated
	 */
	EAttribute getImageVariant_StyleCode();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.ImageVariant#getStyleVariant <em>Style Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Variant</em>'.
	 * @see org.soluvas.image.ImageVariant#getStyleVariant()
	 * @see #getImageVariant()
	 * @generated
	 */
	EAttribute getImageVariant_StyleVariant();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.ImageVariant#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see org.soluvas.image.ImageVariant#getExtension()
	 * @see #getImageVariant()
	 * @generated
	 */
	EAttribute getImageVariant_Extension();

	/**
	 * Returns the meta object for class '{@link org.soluvas.image.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see org.soluvas.image.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the map '{@link org.soluvas.image.Image#getStyles <em>Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Styles</em>'.
	 * @see org.soluvas.image.Image#getStyles()
	 * @see #getImage()
	 * @generated
	 */
	EReference getImage_Styles();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.Image#getSchemaVersion <em>Schema Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Version</em>'.
	 * @see org.soluvas.image.Image#getSchemaVersion()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_SchemaVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.Image#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.soluvas.image.Image#getUri()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Uri();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.Image#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see org.soluvas.image.Image#getFileName()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_FileName();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.Image#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Type</em>'.
	 * @see org.soluvas.image.Image#getContentType()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_ContentType();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.Image#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.soluvas.image.Image#getSize()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.Image#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see org.soluvas.image.Image#getCreated()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Created();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.Image#getOriginUri <em>Origin Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin Uri</em>'.
	 * @see org.soluvas.image.Image#getOriginUri()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_OriginUri();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.Image#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see org.soluvas.image.Image#getExtension()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Extension();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.Image#getLinkedFile <em>Linked File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Linked File</em>'.
	 * @see org.soluvas.image.Image#getLinkedFile()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_LinkedFile();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.Image#getOriginalFile <em>Original File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Original File</em>'.
	 * @see org.soluvas.image.Image#getOriginalFile()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_OriginalFile();

	/**
	 * Returns the meta object for class '{@link org.soluvas.image.StyledImage <em>Styled Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Styled Image</em>'.
	 * @see org.soluvas.image.StyledImage
	 * @generated
	 */
	EClass getStyledImage();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.StyledImage#getSchemaVersion <em>Schema Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Version</em>'.
	 * @see org.soluvas.image.StyledImage#getSchemaVersion()
	 * @see #getStyledImage()
	 * @generated
	 */
	EAttribute getStyledImage_SchemaVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.StyledImage#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.soluvas.image.StyledImage#getCode()
	 * @see #getStyledImage()
	 * @generated
	 */
	EAttribute getStyledImage_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.StyledImage#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.soluvas.image.StyledImage#getUri()
	 * @see #getStyledImage()
	 * @generated
	 */
	EAttribute getStyledImage_Uri();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.StyledImage#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.soluvas.image.StyledImage#getSize()
	 * @see #getStyledImage()
	 * @generated
	 */
	EAttribute getStyledImage_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.StyledImage#getVariant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variant</em>'.
	 * @see org.soluvas.image.StyledImage#getVariant()
	 * @see #getStyledImage()
	 * @generated
	 */
	EAttribute getStyledImage_Variant();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.StyledImage#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see org.soluvas.image.StyledImage#getExtension()
	 * @see #getStyledImage()
	 * @generated
	 */
	EAttribute getStyledImage_Extension();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.StyledImage#getOriginUri <em>Origin Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin Uri</em>'.
	 * @see org.soluvas.image.StyledImage#getOriginUri()
	 * @see #getStyledImage()
	 * @generated
	 */
	EAttribute getStyledImage_OriginUri();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.StyledImage#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Type</em>'.
	 * @see org.soluvas.image.StyledImage#getContentType()
	 * @see #getStyledImage()
	 * @generated
	 */
	EAttribute getStyledImage_ContentType();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.StyledImage#getLinkedFile <em>Linked File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Linked File</em>'.
	 * @see org.soluvas.image.StyledImage#getLinkedFile()
	 * @see #getStyledImage()
	 * @generated
	 */
	EAttribute getStyledImage_LinkedFile();

	/**
	 * Returns the meta object for class '{@link org.soluvas.image.ImageCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalog</em>'.
	 * @see org.soluvas.image.ImageCatalog
	 * @generated
	 */
	EClass getImageCatalog();

	/**
	 * Returns the meta object for the containment reference list '{@link org.soluvas.image.ImageCatalog#getImages <em>Images</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Images</em>'.
	 * @see org.soluvas.image.ImageCatalog#getImages()
	 * @see #getImageCatalog()
	 * @generated
	 */
	EReference getImageCatalog_Images();

	/**
	 * Returns the meta object for class '{@link org.soluvas.image.ImageMagickTransformer <em>Magick Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Magick Transformer</em>'.
	 * @see org.soluvas.image.ImageMagickTransformer
	 * @generated
	 */
	EClass getImageMagickTransformer();

	/**
	 * Returns the meta object for the reference '{@link org.soluvas.image.ImageMagickTransformer#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see org.soluvas.image.ImageMagickTransformer#getDestination()
	 * @see #getImageMagickTransformer()
	 * @generated
	 */
	EReference getImageMagickTransformer_Destination();

	/**
	 * Returns the meta object for class '{@link org.soluvas.image.FolderConnector <em>Folder Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder Connector</em>'.
	 * @see org.soluvas.image.FolderConnector
	 * @generated
	 */
	EClass getFolderConnector();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.FolderConnector#getFolder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Folder</em>'.
	 * @see org.soluvas.image.FolderConnector#getFolder()
	 * @see #getFolderConnector()
	 * @generated
	 */
	EAttribute getFolderConnector_Folder();

	/**
	 * Returns the meta object for class '{@link org.soluvas.image.DisplayImage <em>Display Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display Image</em>'.
	 * @see org.soluvas.image.DisplayImage
	 * @generated
	 */
	EClass getDisplayImage();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.DisplayImage#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see org.soluvas.image.DisplayImage#getSrc()
	 * @see #getDisplayImage()
	 * @generated
	 */
	EAttribute getDisplayImage_Src();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.DisplayImage#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.soluvas.image.DisplayImage#getWidth()
	 * @see #getDisplayImage()
	 * @generated
	 */
	EAttribute getDisplayImage_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.DisplayImage#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.soluvas.image.DisplayImage#getHeight()
	 * @see #getDisplayImage()
	 * @generated
	 */
	EAttribute getDisplayImage_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.DisplayImage#getAlt <em>Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt</em>'.
	 * @see org.soluvas.image.DisplayImage#getAlt()
	 * @see #getDisplayImage()
	 * @generated
	 */
	EAttribute getDisplayImage_Alt();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.DisplayImage#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.soluvas.image.DisplayImage#getTitle()
	 * @see #getDisplayImage()
	 * @generated
	 */
	EAttribute getDisplayImage_Title();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Styled Image Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Styled Image Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="org.soluvas.image.StyledImage" valueContainment="true" valueRequired="true"
	 * @generated
	 */
	EClass getStyledImageEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStyledImageEntry()
	 * @generated
	 */
	EAttribute getStyledImageEntry_Key();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStyledImageEntry()
	 * @generated
	 */
	EReference getStyledImageEntry_Value();

	/**
	 * Returns the meta object for class '{@link org.soluvas.image.WatermarkLike <em>Watermark Like</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Watermark Like</em>'.
	 * @see org.soluvas.image.WatermarkLike
	 * @generated
	 */
	EClass getWatermarkLike();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.WatermarkLike#getWatermarkFile <em>Watermark File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Watermark File</em>'.
	 * @see org.soluvas.image.WatermarkLike#getWatermarkFile()
	 * @see #getWatermarkLike()
	 * @generated
	 */
	EAttribute getWatermarkLike_WatermarkFile();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.WatermarkLike#getWatermarkOpacity <em>Watermark Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Watermark Opacity</em>'.
	 * @see org.soluvas.image.WatermarkLike#getWatermarkOpacity()
	 * @see #getWatermarkLike()
	 * @generated
	 */
	EAttribute getWatermarkLike_WatermarkOpacity();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.WatermarkLike#getWatermarkGravity <em>Watermark Gravity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Watermark Gravity</em>'.
	 * @see org.soluvas.image.WatermarkLike#getWatermarkGravity()
	 * @see #getWatermarkLike()
	 * @generated
	 */
	EAttribute getWatermarkLike_WatermarkGravity();

	/**
	 * Returns the meta object for class '{@link org.soluvas.image.Media <em>Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Media</em>'.
	 * @see org.soluvas.image.Media
	 * @generated
	 */
	EClass getMedia();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.Media#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.soluvas.image.Media#getType()
	 * @see #getMedia()
	 * @generated
	 */
	EAttribute getMedia_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.Media#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.soluvas.image.Media#getStatus()
	 * @see #getMedia()
	 * @generated
	 */
	EAttribute getMedia_Status();

	/**
	 * Returns the meta object for the map '{@link org.soluvas.image.Media#getAttachments <em>Attachments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Attachments</em>'.
	 * @see org.soluvas.image.Media#getAttachments()
	 * @see #getMedia()
	 * @generated
	 */
	EReference getMedia_Attachments();

	/**
	 * Returns the meta object for class '{@link org.soluvas.image.MediaAttachment <em>Media Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Media Attachment</em>'.
	 * @see org.soluvas.image.MediaAttachment
	 * @generated
	 */
	EClass getMediaAttachment();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.MediaAttachment#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Type</em>'.
	 * @see org.soluvas.image.MediaAttachment#getContentType()
	 * @see #getMediaAttachment()
	 * @generated
	 */
	EAttribute getMediaAttachment_ContentType();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.MediaAttachment#getRevPos <em>Rev Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rev Pos</em>'.
	 * @see org.soluvas.image.MediaAttachment#getRevPos()
	 * @see #getMediaAttachment()
	 * @generated
	 */
	EAttribute getMediaAttachment_RevPos();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.MediaAttachment#getDigest <em>Digest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Digest</em>'.
	 * @see org.soluvas.image.MediaAttachment#getDigest()
	 * @see #getMediaAttachment()
	 * @generated
	 */
	EAttribute getMediaAttachment_Digest();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.MediaAttachment#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.soluvas.image.MediaAttachment#getLength()
	 * @see #getMediaAttachment()
	 * @generated
	 */
	EAttribute getMediaAttachment_Length();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.MediaAttachment#isStub <em>Stub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stub</em>'.
	 * @see org.soluvas.image.MediaAttachment#isStub()
	 * @see #getMediaAttachment()
	 * @generated
	 */
	EAttribute getMediaAttachment_Stub();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Media Attachment Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Media Attachment Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString" keyRequired="true"
	 *        valueType="org.soluvas.image.MediaAttachment" valueContainment="true" valueRequired="true"
	 * @generated
	 */
	EClass getMediaAttachmentEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getMediaAttachmentEntry()
	 * @generated
	 */
	EAttribute getMediaAttachmentEntry_Key();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getMediaAttachmentEntry()
	 * @generated
	 */
	EReference getMediaAttachmentEntry_Value();

	/**
	 * Returns the meta object for class '{@link org.soluvas.image.OverlayLike <em>Overlay Like</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Overlay Like</em>'.
	 * @see org.soluvas.image.OverlayLike
	 * @generated
	 */
	EClass getOverlayLike();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.OverlayLike#getOverlayFile <em>Overlay File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overlay File</em>'.
	 * @see org.soluvas.image.OverlayLike#getOverlayFile()
	 * @see #getOverlayLike()
	 * @generated
	 */
	EAttribute getOverlayLike_OverlayFile();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.image.OverlayLike#getOverlayGravity <em>Overlay Gravity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overlay Gravity</em>'.
	 * @see org.soluvas.image.OverlayLike#getOverlayGravity()
	 * @see #getOverlayLike()
	 * @generated
	 */
	EAttribute getOverlayLike_OverlayGravity();

	/**
	 * Returns the meta object for enum '{@link org.soluvas.image.ImageTransformType <em>Transform Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transform Type</em>'.
	 * @see org.soluvas.image.ImageTransformType
	 * @generated
	 */
	EEnum getImageTransformType();

	/**
	 * Returns the meta object for enum '{@link org.soluvas.image.FileExport <em>File Export</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>File Export</em>'.
	 * @see org.soluvas.image.FileExport
	 * @generated
	 */
	EEnum getFileExport();

	/**
	 * Returns the meta object for enum '{@link org.soluvas.image.DuplicateIdHandling <em>Duplicate Id Handling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Duplicate Id Handling</em>'.
	 * @see org.soluvas.image.DuplicateIdHandling
	 * @generated
	 */
	EEnum getDuplicateIdHandling();

	/**
	 * Returns the meta object for enum '{@link org.soluvas.image.TransformGravity <em>Transform Gravity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transform Gravity</em>'.
	 * @see org.soluvas.image.TransformGravity
	 * @generated
	 */
	EEnum getTransformGravity();

	/**
	 * Returns the meta object for enum '{@link org.soluvas.image.ImageTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Types</em>'.
	 * @see org.soluvas.image.ImageTypes
	 * @generated
	 */
	EEnum getImageTypes();

	/**
	 * Returns the meta object for enum '{@link org.soluvas.image.ImageStyles <em>Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Styles</em>'.
	 * @see org.soluvas.image.ImageStyles
	 * @generated
	 */
	EEnum getImageStyles();

	/**
	 * Returns the meta object for enum '{@link org.soluvas.image.MediaStatus <em>Media Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Media Status</em>'.
	 * @see org.soluvas.image.MediaStatus
	 * @generated
	 */
	EEnum getMediaStatus();

	/**
	 * Returns the meta object for data type '{@link org.soluvas.image.store.ImageRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Repository</em>'.
	 * @see org.soluvas.image.store.ImageRepository
	 * @model instanceClass="org.soluvas.image.store.ImageRepository" serializeable="false"
	 * @generated
	 */
	EDataType getImageRepository();

	/**
	 * Returns the meta object for data type '{@link org.soluvas.image.ImageType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type</em>'.
	 * @see org.soluvas.image.ImageType
	 * @model instanceClass="org.soluvas.image.ImageType"
	 * @generated
	 */
	EDataType getImageType();

	/**
	 * Returns the meta object for data type '{@link org.soluvas.image.ImageStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Style</em>'.
	 * @see org.soluvas.image.ImageStyle
	 * @model instanceClass="org.soluvas.image.ImageStyle"
	 * @generated
	 */
	EDataType getImageStyle();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ImageFactory getImageFactory();

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
		 * The meta object literal for the '{@link org.soluvas.image.impl.ImageConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.image.impl.ImageConnectorImpl
		 * @see org.soluvas.image.impl.ImagePackageImpl#getImageConnector()
		 * @generated
		 */
		EClass IMAGE_CONNECTOR = eINSTANCE.getImageConnector();

		/**
		 * The meta object literal for the '<em><b>Hi Uri Template</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_CONNECTOR__HI_URI_TEMPLATE = eINSTANCE.getImageConnector_HiUriTemplate();

		/**
		 * The meta object literal for the '<em><b>Uri Template</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_CONNECTOR__URI_TEMPLATE = eINSTANCE.getImageConnector_UriTemplate();

		/**
		 * The meta object literal for the '<em><b>Executor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_CONNECTOR__EXECUTOR = eINSTANCE.getImageConnector_Executor();

		/**
		 * The meta object literal for the '{@link org.soluvas.image.impl.S3ConnectorImpl <em>S3 Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.image.impl.S3ConnectorImpl
		 * @see org.soluvas.image.impl.ImagePackageImpl#getS3Connector()
		 * @generated
		 */
		EClass S3_CONNECTOR = eINSTANCE.getS3Connector();

		/**
		 * The meta object literal for the '<em><b>Canonical User Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute S3_CONNECTOR__CANONICAL_USER_ID = eINSTANCE.getS3Connector_CanonicalUserId();

		/**
		 * The meta object literal for the '<em><b>Bucket</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute S3_CONNECTOR__BUCKET = eINSTANCE.getS3Connector_Bucket();

		/**
		 * The meta object literal for the '<em><b>Tenant Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute S3_CONNECTOR__TENANT_ID = eINSTANCE.getS3Connector_TenantId();

		/**
		 * The meta object literal for the '<em><b>Tenant Env</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute S3_CONNECTOR__TENANT_ENV = eINSTANCE.getS3Connector_TenantEnv();

		/**
		 * The meta object literal for the '<em><b>Origin Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute S3_CONNECTOR__ORIGIN_ALIAS = eINSTANCE.getS3Connector_OriginAlias();

		/**
		 * The meta object literal for the '<em><b>Cdn Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute S3_CONNECTOR__CDN_ALIAS = eINSTANCE.getS3Connector_CdnAlias();

		/**
		 * The meta object literal for the '{@link org.soluvas.image.impl.BlitlineTransformerImpl <em>Blitline Transformer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.image.impl.BlitlineTransformerImpl
		 * @see org.soluvas.image.impl.ImagePackageImpl#getBlitlineTransformer()
		 * @generated
		 */
		EClass BLITLINE_TRANSFORMER = eINSTANCE.getBlitlineTransformer();

		/**
		 * The meta object literal for the '<em><b>Application Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLITLINE_TRANSFORMER__APPLICATION_ID = eINSTANCE.getBlitlineTransformer_ApplicationId();

		/**
		 * The meta object literal for the '<em><b>Bucket</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLITLINE_TRANSFORMER__BUCKET = eINSTANCE.getBlitlineTransformer_Bucket();

		/**
		 * The meta object literal for the '<em><b>Tenant Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLITLINE_TRANSFORMER__TENANT_ID = eINSTANCE.getBlitlineTransformer_TenantId();

		/**
		 * The meta object literal for the '<em><b>Tenant Env</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLITLINE_TRANSFORMER__TENANT_ENV = eINSTANCE.getBlitlineTransformer_TenantEnv();

		/**
		 * The meta object literal for the '<em><b>Cdn Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLITLINE_TRANSFORMER__CDN_ALIAS = eINSTANCE.getBlitlineTransformer_CdnAlias();

		/**
		 * The meta object literal for the '<em><b>Key Template</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLITLINE_TRANSFORMER__KEY_TEMPLATE = eINSTANCE.getBlitlineTransformer_KeyTemplate();

		/**
		 * The meta object literal for the '<em><b>Uri Template</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLITLINE_TRANSFORMER__URI_TEMPLATE = eINSTANCE.getBlitlineTransformer_UriTemplate();

		/**
		 * The meta object literal for the '<em><b>Origin Uri Template</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLITLINE_TRANSFORMER__ORIGIN_URI_TEMPLATE = eINSTANCE.getBlitlineTransformer_OriginUriTemplate();

		/**
		 * The meta object literal for the '{@link org.soluvas.image.impl.DavConnectorImpl <em>Dav Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.image.impl.DavConnectorImpl
		 * @see org.soluvas.image.impl.ImagePackageImpl#getDavConnector()
		 * @generated
		 */
		EClass DAV_CONNECTOR = eINSTANCE.getDavConnector();

		/**
		 * The meta object literal for the '{@link org.soluvas.image.impl.ImageTransformerImpl <em>Transformer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.image.impl.ImageTransformerImpl
		 * @see org.soluvas.image.impl.ImagePackageImpl#getImageTransformer()
		 * @generated
		 */
		EClass IMAGE_TRANSFORMER = eINSTANCE.getImageTransformer();

		/**
		 * The meta object literal for the '<em><b>Executor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_TRANSFORMER__EXECUTOR = eINSTANCE.getImageTransformer_Executor();

		/**
		 * The meta object literal for the '{@link org.soluvas.image.impl.ThumbnailatorTransformerImpl <em>Thumbnailator Transformer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.image.impl.ThumbnailatorTransformerImpl
		 * @see org.soluvas.image.impl.ImagePackageImpl#getThumbnailatorTransformer()
		 * @generated
		 */
		EClass THUMBNAILATOR_TRANSFORMER = eINSTANCE.getThumbnailatorTransformer();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THUMBNAILATOR_TRANSFORMER__DESTINATION = eINSTANCE.getThumbnailatorTransformer_Destination();

		/**
		 * The meta object literal for the '{@link org.soluvas.image.impl.UploadedImageImpl <em>Uploaded Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.image.impl.UploadedImageImpl
		 * @see org.soluvas.image.impl.ImagePackageImpl#getUploadedImage()
		 * @generated
		 */
		EClass UPLOADED_IMAGE = eINSTANCE.getUploadedImage();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPLOADED_IMAGE__URI = eINSTANCE.getUploadedImage_Uri();

		/**
		 * The meta object literal for the '<em><b>Origin Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPLOADED_IMAGE__ORIGIN_URI = eINSTANCE.getUploadedImage_OriginUri();

		/**
		 * The meta object literal for the '<em><b>Style Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPLOADED_IMAGE__STYLE_CODE = eINSTANCE.getUploadedImage_StyleCode();

		/**
		 * The meta object literal for the '<em><b>Style Variant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPLOADED_IMAGE__STYLE_VARIANT = eINSTANCE.getUploadedImage_StyleVariant();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPLOADED_IMAGE__EXTENSION = eINSTANCE.getUploadedImage_Extension();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPLOADED_IMAGE__SIZE = eINSTANCE.getUploadedImage_Size();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPLOADED_IMAGE__WIDTH = eINSTANCE.getUploadedImage_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPLOADED_IMAGE__HEIGHT = eINSTANCE.getUploadedImage_Height();

		/**
		 * The meta object literal for the '{@link org.soluvas.image.impl.ImageManagerImpl <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.image.impl.ImageManagerImpl
		 * @see org.soluvas.image.impl.ImagePackageImpl#getImageManager()
		 * @generated
		 */
		EClass IMAGE_MANAGER = eINSTANCE.getImageManager();

		/**
		 * The meta object literal for the '{@link org.soluvas.image.ImageTransform <em>Transform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.image.ImageTransform
		 * @see org.soluvas.image.impl.ImagePackageImpl#getImageTransform()
		 * @generated
		 */
		EClass IMAGE_TRANSFORM = eINSTANCE.getImageTransform();

		/**
		 * The meta object literal for the '{@link org.soluvas.image.impl.ResizeToFitImpl <em>Resize To Fit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.image.impl.ResizeToFitImpl
		 * @see org.soluvas.image.impl.ImagePackageImpl#getResizeToFit()
		 * @generated
		 */
		EClass RESIZE_TO_FIT = eINSTANCE.getResizeToFit();

		/**
		 * The meta object literal for the '<em><b>Only Shrink Larger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESIZE_TO_FIT__ONLY_SHRINK_LARGER = eINSTANCE.getResizeToFit_OnlyShrinkLarger();

		/**
		 * The meta object literal for the '<em><b>Extent Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESIZE_TO_FIT__EXTENT_ENABLED = eINSTANCE.getResizeToFit_ExtentEnabled();

		/**
		 * The meta object literal for the '{@link org.soluvas.image.impl.ResizeToFillImpl <em>Resize To Fill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.image.impl.ResizeToFillImpl
		 * @see org.soluvas.image.impl.ImagePackageImpl#getResizeToFill()
		 * @generated
		 */
		EClass RESIZE_TO_FILL = eINSTANCE.getResizeToFill();

		/**
		 * The meta object literal for the '<em><b>Gravity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESIZE_TO_FILL__GRAVITY = eINSTANCE.getResizeToFill_Gravity();

		/**
		 * The meta object literal for the '<em><b>Only Shrink Larger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESIZE_TO_FILL__ONLY_SHRINK_LARGER = eINSTANCE.getResizeToFill_OnlyShrinkLarger();

		/**
		 * The meta object literal for the '{@link org.soluvas.image.DimensionLike <em>Dimension Like</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.image.DimensionLike
		 * @see org.soluvas.image.impl.ImagePackageImpl#getDimensionLike()
		 * @generated
		 */
		EClass DIMENSION_LIKE = eINSTANCE.getDimensionLike();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION_LIKE__WIDTH = eINSTANCE.getDimensionLike_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION_LIKE__HEIGHT = eINSTANCE.getDimensionLike_Height();

		/**
		 * The meta object literal for the '{@link org.soluvas.image.impl.ImageVariantImpl <em>Variant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.image.impl.ImageVariantImpl
		 * @see org.soluvas.image.impl.ImagePackageImpl#getImageVariant()
		 * @generated
		 */
		EClass IMAGE_VARIANT = eINSTANCE.getImageVariant();

		/**
		 * The meta object literal for the '<em><b>Style Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_VARIANT__STYLE_CODE = eINSTANCE.getImageVariant_StyleCode();

		/**
		 * The meta object literal for the '<em><b>Style Variant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_VARIANT__STYLE_VARIANT = eINSTANCE.getImageVariant_StyleVariant();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_VARIANT__EXTENSION = eINSTANCE.getImageVariant_Extension();

		/**
		 * The meta object literal for the '{@link org.soluvas.image.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.image.impl.ImageImpl
		 * @see org.soluvas.image.impl.ImagePackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Styles</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE__STYLES = eINSTANCE.getImage_Styles();

		/**
		 * The meta object literal for the '<em><b>Schema Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__SCHEMA_VERSION = eINSTANCE.getImage_SchemaVersion();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__URI = eINSTANCE.getImage_Uri();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__FILE_NAME = eINSTANCE.getImage_FileName();

		/**
		 * The meta object literal for the '<em><b>Content Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__CONTENT_TYPE = eINSTANCE.getImage_ContentType();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__SIZE = eINSTANCE.getImage_Size();

		/**
		 * The meta object literal for the '<em><b>Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__CREATED = eINSTANCE.getImage_Created();

		/**
		 * The meta object literal for the '<em><b>Origin Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__ORIGIN_URI = eINSTANCE.getImage_OriginUri();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__EXTENSION = eINSTANCE.getImage_Extension();

		/**
		 * The meta object literal for the '<em><b>Linked File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__LINKED_FILE = eINSTANCE.getImage_LinkedFile();

		/**
		 * The meta object literal for the '<em><b>Original File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__ORIGINAL_FILE = eINSTANCE.getImage_OriginalFile();

		/**
		 * The meta object literal for the '{@link org.soluvas.image.impl.StyledImageImpl <em>Styled Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.image.impl.StyledImageImpl
		 * @see org.soluvas.image.impl.ImagePackageImpl#getStyledImage()
		 * @generated
		 */
		EClass STYLED_IMAGE = eINSTANCE.getStyledImage();

		/**
		 * The meta object literal for the '<em><b>Schema Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLED_IMAGE__SCHEMA_VERSION = eINSTANCE.getStyledImage_SchemaVersion();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLED_IMAGE__CODE = eINSTANCE.getStyledImage_Code();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLED_IMAGE__URI = eINSTANCE.getStyledImage_Uri();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLED_IMAGE__SIZE = eINSTANCE.getStyledImage_Size();

		/**
		 * The meta object literal for the '<em><b>Variant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLED_IMAGE__VARIANT = eINSTANCE.getStyledImage_Variant();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLED_IMAGE__EXTENSION = eINSTANCE.getStyledImage_Extension();

		/**
		 * The meta object literal for the '<em><b>Origin Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLED_IMAGE__ORIGIN_URI = eINSTANCE.getStyledImage_OriginUri();

		/**
		 * The meta object literal for the '<em><b>Content Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLED_IMAGE__CONTENT_TYPE = eINSTANCE.getStyledImage_ContentType();

		/**
		 * The meta object literal for the '<em><b>Linked File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLED_IMAGE__LINKED_FILE = eINSTANCE.getStyledImage_LinkedFile();

		/**
		 * The meta object literal for the '{@link org.soluvas.image.impl.ImageCatalogImpl <em>Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.image.impl.ImageCatalogImpl
		 * @see org.soluvas.image.impl.ImagePackageImpl#getImageCatalog()
		 * @generated
		 */
		EClass IMAGE_CATALOG = eINSTANCE.getImageCatalog();

		/**
		 * The meta object literal for the '<em><b>Images</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE_CATALOG__IMAGES = eINSTANCE.getImageCatalog_Images();

		/**
		 * The meta object literal for the '{@link org.soluvas.image.impl.ImageMagickTransformerImpl <em>Magick Transformer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.image.impl.ImageMagickTransformerImpl
		 * @see org.soluvas.image.impl.ImagePackageImpl#getImageMagickTransformer()
		 * @generated
		 */
		EClass IMAGE_MAGICK_TRANSFORMER = eINSTANCE.getImageMagickTransformer();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE_MAGICK_TRANSFORMER__DESTINATION = eINSTANCE.getImageMagickTransformer_Destination();

		/**
		 * The meta object literal for the '{@link org.soluvas.image.impl.FolderConnectorImpl <em>Folder Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.image.impl.FolderConnectorImpl
		 * @see org.soluvas.image.impl.ImagePackageImpl#getFolderConnector()
		 * @generated
		 */
		EClass FOLDER_CONNECTOR = eINSTANCE.getFolderConnector();

		/**
		 * The meta object literal for the '<em><b>Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOLDER_CONNECTOR__FOLDER = eINSTANCE.getFolderConnector_Folder();

		/**
		 * The meta object literal for the '{@link org.soluvas.image.impl.DisplayImageImpl <em>Display Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.image.impl.DisplayImageImpl
		 * @see org.soluvas.image.impl.ImagePackageImpl#getDisplayImage()
		 * @generated
		 */
		EClass DISPLAY_IMAGE = eINSTANCE.getDisplayImage();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY_IMAGE__SRC = eINSTANCE.getDisplayImage_Src();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY_IMAGE__WIDTH = eINSTANCE.getDisplayImage_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY_IMAGE__HEIGHT = eINSTANCE.getDisplayImage_Height();

		/**
		 * The meta object literal for the '<em><b>Alt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY_IMAGE__ALT = eINSTANCE.getDisplayImage_Alt();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY_IMAGE__TITLE = eINSTANCE.getDisplayImage_Title();

		/**
		 * The meta object literal for the '{@link org.soluvas.image.impl.StyledImageEntryImpl <em>Styled Image Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.image.impl.StyledImageEntryImpl
		 * @see org.soluvas.image.impl.ImagePackageImpl#getStyledImageEntry()
		 * @generated
		 */
		EClass STYLED_IMAGE_ENTRY = eINSTANCE.getStyledImageEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLED_IMAGE_ENTRY__KEY = eINSTANCE.getStyledImageEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLED_IMAGE_ENTRY__VALUE = eINSTANCE.getStyledImageEntry_Value();

		/**
		 * The meta object literal for the '{@link org.soluvas.image.WatermarkLike <em>Watermark Like</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.image.WatermarkLike
		 * @see org.soluvas.image.impl.ImagePackageImpl#getWatermarkLike()
		 * @generated
		 */
		EClass WATERMARK_LIKE = eINSTANCE.getWatermarkLike();

		/**
		 * The meta object literal for the '<em><b>Watermark File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WATERMARK_LIKE__WATERMARK_FILE = eINSTANCE.getWatermarkLike_WatermarkFile();

		/**
		 * The meta object literal for the '<em><b>Watermark Opacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WATERMARK_LIKE__WATERMARK_OPACITY = eINSTANCE.getWatermarkLike_WatermarkOpacity();

		/**
		 * The meta object literal for the '<em><b>Watermark Gravity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WATERMARK_LIKE__WATERMARK_GRAVITY = eINSTANCE.getWatermarkLike_WatermarkGravity();

		/**
		 * The meta object literal for the '{@link org.soluvas.image.impl.MediaImpl <em>Media</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.image.impl.MediaImpl
		 * @see org.soluvas.image.impl.ImagePackageImpl#getMedia()
		 * @generated
		 */
		EClass MEDIA = eINSTANCE.getMedia();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA__TYPE = eINSTANCE.getMedia_Type();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA__STATUS = eINSTANCE.getMedia_Status();

		/**
		 * The meta object literal for the '<em><b>Attachments</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIA__ATTACHMENTS = eINSTANCE.getMedia_Attachments();

		/**
		 * The meta object literal for the '{@link org.soluvas.image.impl.MediaAttachmentImpl <em>Media Attachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.image.impl.MediaAttachmentImpl
		 * @see org.soluvas.image.impl.ImagePackageImpl#getMediaAttachment()
		 * @generated
		 */
		EClass MEDIA_ATTACHMENT = eINSTANCE.getMediaAttachment();

		/**
		 * The meta object literal for the '<em><b>Content Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_ATTACHMENT__CONTENT_TYPE = eINSTANCE.getMediaAttachment_ContentType();

		/**
		 * The meta object literal for the '<em><b>Rev Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_ATTACHMENT__REV_POS = eINSTANCE.getMediaAttachment_RevPos();

		/**
		 * The meta object literal for the '<em><b>Digest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_ATTACHMENT__DIGEST = eINSTANCE.getMediaAttachment_Digest();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_ATTACHMENT__LENGTH = eINSTANCE.getMediaAttachment_Length();

		/**
		 * The meta object literal for the '<em><b>Stub</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_ATTACHMENT__STUB = eINSTANCE.getMediaAttachment_Stub();

		/**
		 * The meta object literal for the '{@link org.soluvas.image.impl.MediaAttachmentEntryImpl <em>Media Attachment Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.image.impl.MediaAttachmentEntryImpl
		 * @see org.soluvas.image.impl.ImagePackageImpl#getMediaAttachmentEntry()
		 * @generated
		 */
		EClass MEDIA_ATTACHMENT_ENTRY = eINSTANCE.getMediaAttachmentEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_ATTACHMENT_ENTRY__KEY = eINSTANCE.getMediaAttachmentEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIA_ATTACHMENT_ENTRY__VALUE = eINSTANCE.getMediaAttachmentEntry_Value();

		/**
		 * The meta object literal for the '{@link org.soluvas.image.OverlayLike <em>Overlay Like</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.image.OverlayLike
		 * @see org.soluvas.image.impl.ImagePackageImpl#getOverlayLike()
		 * @generated
		 */
		EClass OVERLAY_LIKE = eINSTANCE.getOverlayLike();

		/**
		 * The meta object literal for the '<em><b>Overlay File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVERLAY_LIKE__OVERLAY_FILE = eINSTANCE.getOverlayLike_OverlayFile();

		/**
		 * The meta object literal for the '<em><b>Overlay Gravity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVERLAY_LIKE__OVERLAY_GRAVITY = eINSTANCE.getOverlayLike_OverlayGravity();

		/**
		 * The meta object literal for the '{@link org.soluvas.image.ImageTransformType <em>Transform Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.image.ImageTransformType
		 * @see org.soluvas.image.impl.ImagePackageImpl#getImageTransformType()
		 * @generated
		 */
		EEnum IMAGE_TRANSFORM_TYPE = eINSTANCE.getImageTransformType();

		/**
		 * The meta object literal for the '{@link org.soluvas.image.FileExport <em>File Export</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.image.FileExport
		 * @see org.soluvas.image.impl.ImagePackageImpl#getFileExport()
		 * @generated
		 */
		EEnum FILE_EXPORT = eINSTANCE.getFileExport();

		/**
		 * The meta object literal for the '{@link org.soluvas.image.DuplicateIdHandling <em>Duplicate Id Handling</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.image.DuplicateIdHandling
		 * @see org.soluvas.image.impl.ImagePackageImpl#getDuplicateIdHandling()
		 * @generated
		 */
		EEnum DUPLICATE_ID_HANDLING = eINSTANCE.getDuplicateIdHandling();

		/**
		 * The meta object literal for the '{@link org.soluvas.image.TransformGravity <em>Transform Gravity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.image.TransformGravity
		 * @see org.soluvas.image.impl.ImagePackageImpl#getTransformGravity()
		 * @generated
		 */
		EEnum TRANSFORM_GRAVITY = eINSTANCE.getTransformGravity();

		/**
		 * The meta object literal for the '{@link org.soluvas.image.ImageTypes <em>Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.image.ImageTypes
		 * @see org.soluvas.image.impl.ImagePackageImpl#getImageTypes()
		 * @generated
		 */
		EEnum IMAGE_TYPES = eINSTANCE.getImageTypes();

		/**
		 * The meta object literal for the '{@link org.soluvas.image.ImageStyles <em>Styles</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.image.ImageStyles
		 * @see org.soluvas.image.impl.ImagePackageImpl#getImageStyles()
		 * @generated
		 */
		EEnum IMAGE_STYLES = eINSTANCE.getImageStyles();

		/**
		 * The meta object literal for the '{@link org.soluvas.image.MediaStatus <em>Media Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.image.MediaStatus
		 * @see org.soluvas.image.impl.ImagePackageImpl#getMediaStatus()
		 * @generated
		 */
		EEnum MEDIA_STATUS = eINSTANCE.getMediaStatus();

		/**
		 * The meta object literal for the '<em>Repository</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.image.store.ImageRepository
		 * @see org.soluvas.image.impl.ImagePackageImpl#getImageRepository()
		 * @generated
		 */
		EDataType IMAGE_REPOSITORY = eINSTANCE.getImageRepository();

		/**
		 * The meta object literal for the '<em>Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.image.ImageType
		 * @see org.soluvas.image.impl.ImagePackageImpl#getImageType()
		 * @generated
		 */
		EDataType IMAGE_TYPE = eINSTANCE.getImageType();

		/**
		 * The meta object literal for the '<em>Style</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.image.ImageStyle
		 * @see org.soluvas.image.impl.ImagePackageImpl#getImageStyle()
		 * @generated
		 */
		EDataType IMAGE_STYLE = eINSTANCE.getImageStyle();

	}

} //ImagePackage
