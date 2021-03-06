/**
 */
package org.soluvas.image.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.soluvas.image.BlitlineTransformer;
import org.soluvas.image.DavConnector;
import org.soluvas.image.DisplayImage;
import org.soluvas.image.DuplicateIdHandling;
import org.soluvas.image.FileExport;
import org.soluvas.image.FolderConnector;
import org.soluvas.image.Image;
import org.soluvas.image.ImageCatalog;
import org.soluvas.image.ImageFactory;
import org.soluvas.image.ImageMagickTransformer;
import org.soluvas.image.ImageManager;
import org.soluvas.image.ImagePackage;
import org.soluvas.image.ImageStyle;
import org.soluvas.image.ImageStyles;
import org.soluvas.image.ImageTransformType;
import org.soluvas.image.ImageType;
import org.soluvas.image.ImageTypes;
import org.soluvas.image.ImageVariant;
import org.soluvas.image.Media;
import org.soluvas.image.MediaAttachment;
import org.soluvas.image.MediaStatus;
import org.soluvas.image.ResizeToFill;
import org.soluvas.image.ResizeToFit;
import org.soluvas.image.S3Connector;
import org.soluvas.image.StyledImage;
import org.soluvas.image.ThumbnailatorTransformer;
import org.soluvas.image.TransformGravity;
import org.soluvas.image.UploadedImage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImageFactoryImpl extends EFactoryImpl implements ImageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ImageFactory init() {
		try {
			ImageFactory theImageFactory = (ImageFactory)EPackage.Registry.INSTANCE.getEFactory(ImagePackage.eNS_URI);
			if (theImageFactory != null) {
				return theImageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ImageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
//			case ImagePackage.DAV_CONNECTOR: return createDavConnector();
//			case ImagePackage.S3_CONNECTOR: return createS3Connector();
			case ImagePackage.BLITLINE_TRANSFORMER: return createBlitlineTransformer();
			case ImagePackage.THUMBNAILATOR_TRANSFORMER: return createThumbnailatorTransformer();
			case ImagePackage.UPLOADED_IMAGE: return createUploadedImage();
//			case ImagePackage.IMAGE_MANAGER: return createImageManager();
			case ImagePackage.RESIZE_TO_FIT: return createResizeToFit();
			case ImagePackage.RESIZE_TO_FILL: return createResizeToFill();
			case ImagePackage.IMAGE_VARIANT: return createImageVariant();
			case ImagePackage.IMAGE: return createImage();
			case ImagePackage.STYLED_IMAGE: return createStyledImage();
			case ImagePackage.IMAGE_CATALOG: return createImageCatalog();
			case ImagePackage.IMAGE_MAGICK_TRANSFORMER: return createImageMagickTransformer();
//			case ImagePackage.FOLDER_CONNECTOR: return createFolderConnector();
			case ImagePackage.DISPLAY_IMAGE: return createDisplayImage();
			case ImagePackage.STYLED_IMAGE_ENTRY: return (EObject)createStyledImageEntry();
			case ImagePackage.MEDIA: return createMedia();
			case ImagePackage.MEDIA_ATTACHMENT: return createMediaAttachment();
			case ImagePackage.MEDIA_ATTACHMENT_ENTRY: return (EObject)createMediaAttachmentEntry();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ImagePackage.IMAGE_TRANSFORM_TYPE:
				return createImageTransformTypeFromString(eDataType, initialValue);
			case ImagePackage.FILE_EXPORT:
				return createFileExportFromString(eDataType, initialValue);
			case ImagePackage.DUPLICATE_ID_HANDLING:
				return createDuplicateIdHandlingFromString(eDataType, initialValue);
			case ImagePackage.TRANSFORM_GRAVITY:
				return createTransformGravityFromString(eDataType, initialValue);
			case ImagePackage.IMAGE_TYPES:
				return createImageTypesFromString(eDataType, initialValue);
			case ImagePackage.IMAGE_STYLES:
				return createImageStylesFromString(eDataType, initialValue);
			case ImagePackage.MEDIA_STATUS:
				return createMediaStatusFromString(eDataType, initialValue);
			case ImagePackage.IMAGE_TYPE:
				return createImageTypeFromString(eDataType, initialValue);
			case ImagePackage.IMAGE_STYLE:
				return createImageStyleFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ImagePackage.IMAGE_TRANSFORM_TYPE:
				return convertImageTransformTypeToString(eDataType, instanceValue);
			case ImagePackage.FILE_EXPORT:
				return convertFileExportToString(eDataType, instanceValue);
			case ImagePackage.DUPLICATE_ID_HANDLING:
				return convertDuplicateIdHandlingToString(eDataType, instanceValue);
			case ImagePackage.TRANSFORM_GRAVITY:
				return convertTransformGravityToString(eDataType, instanceValue);
			case ImagePackage.IMAGE_TYPES:
				return convertImageTypesToString(eDataType, instanceValue);
			case ImagePackage.IMAGE_STYLES:
				return convertImageStylesToString(eDataType, instanceValue);
			case ImagePackage.MEDIA_STATUS:
				return convertMediaStatusToString(eDataType, instanceValue);
			case ImagePackage.IMAGE_TYPE:
				return convertImageTypeToString(eDataType, instanceValue);
			case ImagePackage.IMAGE_STYLE:
				return convertImageStyleToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public S3Connector createS3Connector() {
		S3ConnectorImpl s3Connector = new S3ConnectorImpl();
		return s3Connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlitlineTransformer createBlitlineTransformer() {
		BlitlineTransformerImpl blitlineTransformer = new BlitlineTransformerImpl();
		return blitlineTransformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DavConnector createDavConnector() {
		DavConnectorImpl davConnector = new DavConnectorImpl();
		return davConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThumbnailatorTransformer createThumbnailatorTransformer() {
		ThumbnailatorTransformerImpl thumbnailatorTransformer = new ThumbnailatorTransformerImpl();
		return thumbnailatorTransformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UploadedImage createUploadedImage() {
		UploadedImageImpl uploadedImage = new UploadedImageImpl();
		return uploadedImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImageManager createImageManager() {
		ImageManagerImpl imageManager = new ImageManagerImpl();
		return imageManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResizeToFit createResizeToFit() {
		ResizeToFitImpl resizeToFit = new ResizeToFitImpl();
		return resizeToFit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResizeToFill createResizeToFill() {
		ResizeToFillImpl resizeToFill = new ResizeToFillImpl();
		return resizeToFill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImageVariant createImageVariant() {
		ImageVariantImpl imageVariant = new ImageVariantImpl();
		return imageVariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StyledImage createStyledImage() {
		StyledImageImpl styledImage = new StyledImageImpl();
		return styledImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImageCatalog createImageCatalog() {
		ImageCatalogImpl imageCatalog = new ImageCatalogImpl();
		return imageCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImageMagickTransformer createImageMagickTransformer() {
		ImageMagickTransformerImpl imageMagickTransformer = new ImageMagickTransformerImpl();
		return imageMagickTransformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FolderConnector createFolderConnector() {
		FolderConnectorImpl folderConnector = new FolderConnectorImpl();
		return folderConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DisplayImage createDisplayImage() {
		DisplayImageImpl displayImage = new DisplayImageImpl();
		return displayImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, StyledImage> createStyledImageEntry() {
		StyledImageEntryImpl styledImageEntry = new StyledImageEntryImpl();
		return styledImageEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Media createMedia() {
		MediaImpl media = new MediaImpl();
		return media;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MediaAttachment createMediaAttachment() {
		MediaAttachmentImpl mediaAttachment = new MediaAttachmentImpl();
		return mediaAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, MediaAttachment> createMediaAttachmentEntry() {
		MediaAttachmentEntryImpl mediaAttachmentEntry = new MediaAttachmentEntryImpl();
		return mediaAttachmentEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageTransformType createImageTransformTypeFromString(EDataType eDataType, String initialValue) {
		ImageTransformType result = ImageTransformType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImageTransformTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileExport createFileExportFromString(EDataType eDataType, String initialValue) {
		FileExport result = FileExport.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFileExportToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DuplicateIdHandling createDuplicateIdHandlingFromString(EDataType eDataType, String initialValue) {
		DuplicateIdHandling result = DuplicateIdHandling.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDuplicateIdHandlingToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformGravity createTransformGravityFromString(EDataType eDataType, String initialValue) {
		TransformGravity result = TransformGravity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransformGravityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageTypes createImageTypesFromString(EDataType eDataType, String initialValue) {
		ImageTypes result = ImageTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImageTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageStyles createImageStylesFromString(EDataType eDataType, String initialValue) {
		ImageStyles result = ImageStyles.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImageStylesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaStatus createMediaStatusFromString(EDataType eDataType, String initialValue) {
		MediaStatus result = MediaStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMediaStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageType createImageTypeFromString(EDataType eDataType, String initialValue) {
		return (ImageType)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImageTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageStyle createImageStyleFromString(EDataType eDataType, String initialValue) {
		return (ImageStyle)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImageStyleToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImagePackage getImagePackage() {
		return (ImagePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ImagePackage getPackage() {
		return ImagePackage.eINSTANCE;
	}

} //ImageFactoryImpl
