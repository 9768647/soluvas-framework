package org.soluvas.image.impl;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.annotation.Nullable;
import javax.inject.Inject;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.commons.Gender;
import org.soluvas.commons.Identifiable;
import org.soluvas.commons.Imageable;
import org.soluvas.commons.NotNullPredicate;
import org.soluvas.commons.Person;
import org.soluvas.commons.PersonLike;
import org.soluvas.commons.ProgressMonitor;
import org.soluvas.commons.ProgressStatus;
import org.soluvas.commons.WebAddress;
import org.soluvas.commons.impl.ProgressMonitorImpl;
import org.soluvas.image.DimensionLike;
import org.soluvas.image.DisplayImage2;
import org.soluvas.image.DuplicateIdHandling;
import org.soluvas.image.FileExport;
import org.soluvas.image.ImageCatalog;
import org.soluvas.image.ImageException;
import org.soluvas.image.ImageFactory;
import org.soluvas.image.ImageManager;
import org.soluvas.image.ImagePackage;
import org.soluvas.image.ImageStyle;
import org.soluvas.image.ImageStyles;
import org.soluvas.image.ImageTransform;
import org.soluvas.image.ImageType;
import org.soluvas.image.ImageTypes;
import org.soluvas.image.store.Image;
import org.soluvas.image.store.ImageRepository;
import org.soluvas.image.store.StyledImage;
import org.soluvas.image.util.ImageUtils;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Strings;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ImageManagerImpl extends EObjectImpl implements ImageManager {
	
	private static final Logger log = LoggerFactory
			.getLogger(ImageManagerImpl.class);
	
	private String maleDefaultPhotoId;
	private String femaleDefaultPhotoId;
	private String unknownDefaultPhotoId;
	private String unsecureImagesUri;
	final Map<ImageType, ImageRepository> imageRepos;
	private boolean sslSupported;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected ImageManagerImpl() {
		throw new UnsupportedOperationException();
	}

	/**
	 *
	 * @param sslSupported
	 * @param webAddress
	 * @param imageRepos
	 * @deprecated Use {@link #ImageManagerImpl(boolean, String, Map)}.
	 */
	@Inject @Deprecated
	public ImageManagerImpl(boolean sslSupported, WebAddress webAddress, Map<ImageType, ImageRepository> imageRepos) {
		super();
		this.sslSupported = sslSupported;
		this.unsecureImagesUri = webAddress.getImagesUri();
		this.imageRepos = imageRepos;
	}

	/**
	 *
	 * @param sslSupported
	 * @param unsecureImagesUri e.g. from absolute template "http://{+webHost}:8080/img/", but expanded as absolute URI e.g. "http://localhost:8080/img/"
	 * @param imageRepos
	 */
	public ImageManagerImpl(boolean sslSupported, String unsecureImagesUri, Map<ImageType, ImageRepository> imageRepos) {
		super();
		this.sslSupported = sslSupported;
		this.unsecureImagesUri = unsecureImagesUri;
		this.imageRepos = imageRepos;
	}
	
	protected ImageRepository getPersonImageRepository() {
		return getImageRepositoryChecked(ImageTypes.PERSON);
	}

	/**
	 * @return
	 */
	protected ImageRepository getImageRepositoryChecked(ImageType namespace) {
		return Preconditions.checkNotNull(imageRepos.get(namespace),
				"Cannot get '%s' image repository", namespace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImagePackage.Literals.IMAGE_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String getNoImageUri() {
		return unsecureImagesUri + "org.soluvas.commons/noimage.png";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String getDefaultPhotoId(@Nullable Gender gender) {
		if (gender == null) {
			return unknownDefaultPhotoId;
		}
		switch (gender) {
		case MALE:
			return maleDefaultPhotoId;
		case FEMALE:
			return femaleDefaultPhotoId;
		default:
			return unknownDefaultPhotoId;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String getPersonIconUri(@Nullable Gender gender) {
		if (gender == null) {
			return unsecureImagesUri + "org.soluvas.commons/user_unknown.png";
		}
		switch (gender) {
		case MALE:
			return unsecureImagesUri + "org.soluvas.commons/user_male.png";
		case FEMALE:
			return unsecureImagesUri + "org.soluvas.commons/user_female.png";
		default:
			return unsecureImagesUri + "org.soluvas.commons/user_unknown.png";
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String getPersonPhotoUri(String uri, Gender gender) {
		if (!Strings.isNullOrEmpty(uri)) {
			return uri;
		} else {
			return getPersonPhotoUri(gender);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String getObjectPhotoUri(String uri) {
		if (!Strings.isNullOrEmpty(uri)) {
			return uri;
		} else {
			return getNoImageUri();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public long export(ImageRepository imageRepo, boolean metadata, FileExport files, File destFolder, ProgressMonitor monitor) {
		final ProgressMonitor submon = ProgressMonitorImpl.convert(monitor, 2);
		submon.beginTask("Finding all " + imageRepo.getNamespace() + " images", 1);
		final List<Image> images = imageRepo.findAll();
		submon.worked(1);
		submon.done(); // TODO: shouldn't be done in proper implementation
		
		final File imageParentFolder = new File(destFolder, "image_" + imageRepo.getNamespace());
		final File originalImageFolder = new File(imageParentFolder, imageRepo.ORIGINAL_CODE);
		final File imageParentRelFolder = new File("image_" + imageRepo.getNamespace());
		final File originalImageRelFolder = new File(imageParentRelFolder, imageRepo.ORIGINAL_CODE);
		
		final File file = new File(destFolder, imageRepo.getNamespace() + ".ImageCatalog.xmi");
		submon.beginTask("Exporting " + images.size() + " image metadatas to " + file, images.size());
		if (metadata) {
			log.info("Exporting {} image metadatas to {}", images.size(), file);
			final ResourceSet rsi = new ResourceSetImpl();
			rsi.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
			
			final Resource rs = rsi.createResource(URI.createFileURI(file.getPath()));
			final ImageCatalog catalog = ImageFactory.eINSTANCE.createImageCatalog();
			for (final Image image : images) {
				final org.soluvas.image.Image exportedImage = ImageFactory.eINSTANCE.createImage();
				// TODO: when everything has been migrated, get extension from Image object
				final String extension = ImageUtils.getExtensionOrJpg(image.getFileName());
				exportedImage.setId(image.getId());
				exportedImage.setContentType(image.getContentType());
				exportedImage.setCreated(new DateTime());
				exportedImage.setCreationTime(image.getCreated());
				exportedImage.setModificationTime(image.getCreated());
				exportedImage.setExtension(extension);
				exportedImage.setFileName(image.getFileName());
				//exportedImage.setWidth()
				//exportedImage.setHeight()
				exportedImage.setLinkedFile(new File(originalImageRelFolder, image.getId() + "_" + imageRepo.ORIGINAL_CODE + "." + extension).getPath());
				exportedImage.setName(image.getName()); // was null, should not be null
				//exportedImage.setOriginalFile(image.getOriginalFile()); // always null
				exportedImage.setOriginUri(image.getOriginUri());
				exportedImage.setSize(image.getSize());
				exportedImage.setUri(image.getUri());
				
				// styleds
				for (final Entry<String, StyledImage> entry : image.getStyles().entrySet()) {
					final String styleName = entry.getKey();
					final StyledImage styled = entry.getValue();
					final org.soluvas.image.StyledImage exportedStyled = ImageFactory.eINSTANCE.createStyledImage();
					exportedStyled.setName(styleName);
					exportedStyled.setCode(styled.getCode());
					exportedStyled.setContentType(styled.getContentType());
					exportedStyled.setCreationTime(image.getCreated());
					exportedStyled.setModificationTime(image.getCreated());
					final String styledExt = "jpg";  // TODO: do not hardcode
					exportedStyled.setExtension(styledExt);
					exportedStyled.setUri(styled.getUri());
					final String originUri = imageRepo.getConnector().getOriginUri(imageRepo.getNamespace(), image.getId(), styled.getCode(), styled.getCode(), styledExt);
					exportedStyled.setOriginUri(originUri);
					exportedStyled.setSize(styled.getSize());
					exportedStyled.setWidth(styled.getWidth());
					exportedStyled.setHeight(styled.getHeight());
					exportedStyled.setVariant(styled.getCode());
					final File styledImageRelFolder = new File(imageParentRelFolder, styled.getCode());
					exportedStyled.setLinkedFile(new File(styledImageRelFolder , image.getId() + "_" + exportedStyled.getVariant() + "." + extension).getPath());
				}
				catalog.getImages().add(exportedImage);
				
				submon.worked(1);
			}
			rs.getContents().add(catalog);
			try {
				rs.save(ImmutableMap.of(XMIResource.OPTION_LINE_WIDTH, 80));
			} catch (IOException e) {
				throw new ImageException(e, "Cannot save %d image metadatas to %s",
						images.size(), file);
			}
			log.info("Exported {} image metadatas to {}", images.size(), file);
			submon.done(); // TODO: shouldn't be done in proper implementation
		} else {
			submon.done(ProgressStatus.SKIPPED);
		}
		
		submon.beginTask("Exporting " + images.size() + " original images", images.size());
		if (files == FileExport.ALL || files == FileExport.ORIGINAL) {
			log.info("Exporting {} original images", images.size());
			ProgressStatus exportOriginalStatus = ProgressStatus.OK;
			for (final Image image : images) {
				// TODO: when everything has been migrated, get extension from Image object
				final String extension = ImageUtils.getExtensionOrJpg(image.getFileName());
				final File exportedFile = new File(originalImageFolder,
						image.getId() + "_" + imageRepo.ORIGINAL_CODE + "." + extension);
				try {
	//				submon.beginTask("Fetching " + image.getId() + " from " + image.getUri() + " to " + tempFile, 1);
					log.info("Downloading {} from {} to {}", image.getId(), image.getUri(), exportedFile);
					final boolean downloaded = imageRepo.getConnector().download(
							imageRepo.getNamespace(), image.getId(), ImageRepository.ORIGINAL_CODE, ImageRepository.ORIGINAL_CODE,
							extension, exportedFile);
					if (!downloaded) {
						log.error("Cannot download {} because connector {} returned false",
								image.getId(), imageRepo.getConnector().getClass().getName());
						exportOriginalStatus = ProgressStatus.WARNING;
					}
					submon.worked(1);
				} catch (Exception e) {
					// log, but continue
					log.error("Cannot download image " + image.getId() + " to " + exportedFile, e);
					submon.worked(1, ProgressStatus.ERROR);
					exportOriginalStatus = ProgressStatus.WARNING;
				}
			}
			submon.done(exportOriginalStatus); // TODO: shouldn't be done in proper implementation
		} else {
			submon.done(ProgressStatus.SKIPPED);
		}
		
		submon.beginTask("Exporting " + images.size() + " styled images", images.size());
		if (files == FileExport.ALL || files == FileExport.STYLE) {
			log.info("Exporting {} styled images", images.size());
			ProgressStatus exportStyledStatus = ProgressStatus.OK;
			for (final Image image : images) {
				for (final StyledImage styled : image.getStyles().values()) {
					// TODO: when everything has been migrated, get extension from StyledImage object
					final String styledExt = "jpg";
					final String styledFileName = image.getId() + "_" + styled.getCode() + "." + styledExt;
					final File exportedFile = new File(imageParentFolder, new File(styled.getCode(), styledFileName).getPath());
					try {
		//				submon.beginTask("Fetching " + image.getId() + " from " + image.getUri() + " to " + tempFile, 1);
						log.info("Downloading {} from {} to {}", image.getId(), image.getUri(), exportedFile);
						final boolean downloaded = imageRepo.getConnector().download(
								imageRepo.getNamespace(), image.getId(), styled.getCode(), styled.getCode(),
								styledExt, exportedFile);
						if (!downloaded) {
							log.error("Cannot download {} because connector {} returned false",
									image.getId(), imageRepo.getConnector().getClass().getName());
							exportStyledStatus = ProgressStatus.WARNING;
						}
					} catch (Exception e) {
						// log, but continue
						log.error("Cannot download image " + image.getId() + " to " + exportedFile, e);
						exportStyledStatus = ProgressStatus.WARNING;
					}
				}
				submon.worked(1);
			}
			submon.done(exportStyledStatus); // TODO: shouldn't be done in proper implementation
		} else {
			submon.done(ProgressStatus.SKIPPED);
		}
		
		return images.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public long importImages(File srcFolder, boolean metadata, FileExport files, ImageRepository imageRepo,
			DuplicateIdHandling duplicateIdHandling, ProgressMonitor monitor) {
		final ProgressMonitor submon = ProgressMonitorImpl.convert(monitor, 2);
		final File file = new File(srcFolder, imageRepo.getNamespace() + ".ImageCatalog.xmi");
		
		submon.beginTask("Reading " + file, 1);
		final ResourceSet rsi = new ResourceSetImpl();
		rsi.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		final Resource rs = rsi.getResource(URI.createFileURI(file.getPath()), true);
		final ImageCatalog catalog = (ImageCatalog) rs.getContents().get(0);
		submon.done();
		
		long importedCount = 0;
		ProgressStatus importStatus = ProgressStatus.OK;
		final EList<org.soluvas.image.Image> images = catalog.getImages();
		submon.beginTask("Importing " + images.size() + " images from " + file, images.size());
		log.info("Importing {} images from {}", images.size(), file);
		for (final org.soluvas.image.Image image : images) {
			final File originalFile = new File(srcFolder, image.getLinkedFile());
			try {
				final boolean existed = imageRepo.exists(image.getId());
				final Image newImage;
				if (existed) {
					// handling for existing image is more complex
					switch (duplicateIdHandling) {
					case SKIP:
						log.info("Skipping import of {} because already exists", image.getId());
						submon.worked(1, ProgressStatus.SKIPPED);
						break;
					case ADD:
						final Predicate<String> predicate = new Predicate<String>() {
							@Override
							public boolean apply(String input) {
								return !imageRepo.exists(input);
							}
						};
						final Image addImage = new Image(null, originalFile, image.getContentType(),
								Optional.fromNullable(image.getName()).or(image.getId()), predicate);
						final String addImageId = imageRepo.add(addImage).getId();
						log.info("Added possibly duplicate image {} as {}", image.getId(), addImageId);
						importedCount++;
						submon.worked(1);
						break;
					case OVERWRITE:
						final Image overwriteImage = new Image(image.getId(), originalFile, image.getContentType(),
								Optional.fromNullable(image.getName()).or(image.getId()), null);
						final String overwriteImageId = imageRepo.add(overwriteImage).getId();
						log.info("Overwritten image {} as {}", image.getId(), overwriteImageId);
						importedCount++;
						submon.worked(1);
						break;
					case ERROR:
						throw new ImageException("Image " + image.getId() + " already exists.");
					}
				} else {
					newImage = new Image(image.getId(), originalFile, image.getContentType(),
							Optional.fromNullable(image.getName()).or(image.getId()), null);
					final String newImageId = imageRepo.add(newImage).getId();
					log.info("Imported image {} as {}", image.getId(), newImageId);
					importedCount++;
					submon.worked(1);
				}
			} catch (Exception e) {
				log.error("Cannot import " + image.getId() + " from " + originalFile, e);
				submon.worked(1, ProgressStatus.ERROR);
				importStatus = ProgressStatus.WARNING;
			}
		}
		log.info("Imported {} of {} images from {}", importedCount, images.size(), srcFolder);
		submon.done(importStatus);
		
		return importedCount;
	}
	
	/**
	 * Return HTTPS URI if {@link #sslSupported}.
	 * @param insecureImageUri
	 * @return
	 */
	protected String getSecurableUri(String insecureImageUri) {
		if (sslSupported) {
			return insecureImageUri.replaceFirst("^http:", "https:");
		} else {
			return insecureImageUri;
		}
	}

	private DisplayImage2 grabDisplayImage(ImageType namespace,
			List<org.soluvas.image.store.ImageStyle> styleDefs, @Nullable final String imageId,
			@Nullable final ImageStyle style, @Nullable final Image image) {
		final String styleKey = style != null ? style.name().toLowerCase() : null;
		final DisplayImage2 displayImage = new DisplayImage2();
		
		if (image != null) {
			if (style == ImageStyles.ORIGINAL) {
				displayImage.setSrc(getSecurableUri(image.getUri()));
				displayImage.setAlt(image.getName());
				displayImage.setTitle(image.getName());
//				TODO: where is original width & height?
//				displayImage.setWidth(image.getWidth());
//				displayImage.setHeight(image.getHeight());
			} else if (image.getStyles() != null && image.getStyles().get(styleKey) != null
					&& image.getStyles().get(styleKey).getUri() != null) {
				displayImage.setSrc(getSecurableUri(image.getStyles().get(styleKey).getUri()));
				displayImage.setAlt(image.getName());
				displayImage.setTitle(image.getName());
			} else {
				displayImage.setSrc(getNoImageUri());
				log.warn("grabDisplayImage: Cannot get {} style for '{}' imageId={}", 
						styleKey, namespace, imageId);
			}
		} else {
			if (imageId != null) {
				log.warn("grabDisplayImage: Cannot get '{}' image, invalid imageId={}", 
						namespace, imageId);
			}
			displayImage.setAlt("No Image");
			displayImage.setTitle("No Image");
			displayImage.setSrc(getNoImageUri());
		}

		final Optional<org.soluvas.image.store.ImageStyle> styleDef = Iterables.tryFind(
				styleDefs, new Predicate<org.soluvas.image.store.ImageStyle>() {
			@Override
			public boolean apply(
					@Nullable org.soluvas.image.store.ImageStyle input) {
				return Objects.equal(styleKey, input.getName());
			}
		});
		if (styleDef.isPresent()) {
			final ImageTransform fx = styleDef.get().getTransform();
			if (fx instanceof DimensionLike) {
				final Integer maxWidth = ((DimensionLike) fx).getWidth();
				if (displayImage.getWidth() == null && maxWidth != null) {
					displayImage.setWidth(maxWidth);
				}
				final Integer maxHeight = ((DimensionLike) fx).getHeight();
				if (displayImage.getHeight() == null && maxHeight != null) {
					displayImage.setHeight(maxHeight);
				}
			}
		}
		
		return displayImage;
	}

	private DisplayImage2 grabDisplayPhoto(ImageType namespace,
			List<org.soluvas.image.store.ImageStyle> styleDefs, @Nullable final String imageId,
			@Nullable final ImageStyle style, @Nullable final Image image,
			@Nullable final Gender gender) {
		final String styleKey = style != null ? style.name().toLowerCase() : null;
		final DisplayImage2 displayImage = new DisplayImage2();
		
		if (image != null) {
			if (image.getStyles() != null && image.getStyles().get(styleKey) != null
					&& image.getStyles().get(styleKey).getUri() != null) {
				displayImage.setSrc(getSecurableUri(image.getStyles().get(styleKey).getUri()));
				displayImage.setAlt(image.getName());
				displayImage.setTitle(image.getName());
			} else {
				displayImage.setSrc(getPersonPhotoUri(gender));
				log.warn("grabDisplayPhoto: Cannot get {} style for '{}' image imageId={}", 
						styleKey, namespace, imageId);
			}
		} else {
			if (imageId != null) {
				log.warn("grabDisplayPhoto: Cannot get '{}' image, invalid imageId={}",
						namespace, imageId);
			}
			displayImage.setSrc(getPersonPhotoUri(gender));
		}

		final Optional<org.soluvas.image.store.ImageStyle> styleDef = Iterables.tryFind(
				styleDefs, new Predicate<org.soluvas.image.store.ImageStyle>() {
			@Override
			public boolean apply(
					@Nullable org.soluvas.image.store.ImageStyle input) {
				return Objects.equal(styleKey, input.getName());
			}
		});
		if (styleDef.isPresent()) {
			final ImageTransform fx = styleDef.get().getTransform();
			if (fx instanceof DimensionLike) {
				final Integer maxWidth = ((DimensionLike) fx).getWidth();
				if (displayImage.getWidth() == null && maxWidth != null) {
					displayImage.setWidth(maxWidth);
				}
				final Integer maxHeight = ((DimensionLike) fx).getHeight();
				if (displayImage.getHeight() == null && maxHeight != null) {
					displayImage.setHeight(maxHeight);
				}
			}
		}
		
		return displayImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public DisplayImage2 getSafeImage(ImageType namespace, @Nullable String imageId, @Nullable ImageStyle style) {
		final ImageRepository imageRepo = getImageRepositoryChecked(namespace);
		@Nullable final Image image = imageRepo.findOne(imageId);
		
		final DisplayImage2 displayImage = grabDisplayImage(namespace, imageRepo.getStyles(), 
				imageId, style, image);
		return displayImage;
	}
	
	@Override @Nullable
	public DisplayImage2 getImage(ImageType namespace, @Nullable String imageId, @Nullable ImageStyle style) {
		final ImageRepository imageRepo = getImageRepositoryChecked(namespace);
		@Nullable final Image image = imageRepo.findOne(imageId);
		log.debug("Got {} image for '{}' - id '{}'", image, namespace, imageId);
		if (image == null) {
			return null;
		}
		
		final DisplayImage2 displayImage = grabDisplayImage(namespace, imageRepo.getStyles(), 
				imageId, style, image);
		return displayImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Map<String, DisplayImage2> getSafeImages(ImageType namespace, Collection<? extends Imageable> imageables, ImageStyle style) {
		final ImageRepository imageRepo = getImageRepositoryChecked(namespace);
		final List<String> imageIds = ImmutableList.copyOf(Iterables.filter(Collections2.transform(imageables, 
				new Function<Imageable, String>() {
			@Override @Nullable
			public String apply(@Nullable Imageable input) {
				return input.getImageId();
			}
		}), new NotNullPredicate<>()));
		final List<Image> images = imageRepo.findAll(imageIds);
		final Map<String, Image> imageMap = Maps.uniqueIndex(images, new Function<Image, String>() {
			@Override @Nullable
			public String apply(@Nullable Image input) {
				return input.getId();
			}
		});
		
		final ImmutableMap.Builder<String, DisplayImage2> b = ImmutableMap.builder();
		for (final Imageable imageable : imageables) {
			final Image image = imageable.getImageId() != null ? imageMap.get(imageable.getImageId()) : null;
			
			final DisplayImage2 displayImage = grabDisplayImage(namespace, imageRepo.getStyles(),
					imageable.getImageId(), style, image);
			
			b.put(((Identifiable) imageable).getId(), displayImage);
		}
		return b.build();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Map<String, DisplayImage2> getSafeImagesByIds(ImageType namespace, Collection<String> imageIds, ImageStyle style) {
		final ImageRepository imageRepo = getImageRepositoryChecked(namespace);
		final List<Image> images = imageRepo.findAll(imageIds);
		final Map<String, Image> imageMap = Maps.uniqueIndex(images, new Function<Image, String>() {
			@Override @Nullable
			public String apply(@Nullable Image input) {
				return input.getId();
			}
		});
		
		/**
		 * pake map biasa karna:
		 * https://idbippo.atlassian.net/browse/BC-4581
		 */
//		final ImmutableMap.Builder<String, DisplayImage2> b = ImmutableMap.builder();
		final Map<String, DisplayImage2> displayImageMap = new HashMap<>();
		for (final String imageId : imageIds) {
			final Image image = imageMap.get(imageId);
			final DisplayImage2 displayImage = grabDisplayImage(namespace, imageRepo.getStyles(),
					imageId, style, image);
//			log.debug("Display image: {}", displayImage);
			
//			b.put(imageId, displayImage);
			if (!displayImageMap.containsKey(imageId)) {
				displayImageMap.put(imageId, displayImage);
			} else {
				log.warn(String.format("There are duplicate images for id '%s - nameSpace '%s''",
						imageId, namespace));
			}
		}
//		return b.build();
		return ImmutableMap.copyOf(displayImageMap);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public DisplayImage2 getSafePersonPhoto(ImageType namespace, String imageId, ImageStyle style, Gender gender) {
		final ImageRepository imageRepo = getImageRepositoryChecked(namespace);
		final Image image = imageRepo.findOne(imageId);
		
		final DisplayImage2 displayImage = grabDisplayPhoto(namespace, imageRepo.getStyles(), 
				imageId, style, image, gender);
		
		return displayImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public DisplayImage2 getSafePersonPhoto(ImageType namespace, PersonLike person, ImageStyle style) {
		return getSafePersonPhoto(namespace, person != null ? person.getPhotoId() : null, style,
				person != null ? person.getGender() : null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Map<String, DisplayImage2> getSafePersonPhotos(ImageType namespace, Collection<? extends PersonLike> people, ImageStyle style) {
		final ImageRepository imageRepo = getImageRepositoryChecked(namespace);
		final Set<String> imageIds = ImmutableSet.copyOf(Iterables.filter(
				Collections2.transform(people, new Function<PersonLike, String>() {
			@Override @Nullable
			public String apply(@Nullable PersonLike input) {
				return input != null ? input.getPhotoId() : null;
			}
		}), new NotNullPredicate()));
		final List<Image> images = imageRepo.findAll(imageIds);
		final Map<String, Image> imageMap = Maps.uniqueIndex(images, new Function<Image, String>() {
			@Override @Nullable
			public String apply(@Nullable Image input) {
				return input.getId();
			}
		});
		
		final Map<String, DisplayImage2> displayPhotos = new HashMap<>();
		for (PersonLike person : people) {
			if (person == null || displayPhotos.containsKey(person.getId())) {
				continue;
			}
			
			final Image image = person.getPhotoId() != null ? imageMap.get(person.getPhotoId()) : null;
			final Gender gender = person.getGender();
			
			final DisplayImage2 displayImage = grabDisplayPhoto(namespace, imageRepo.getStyles(),
					person.getPhotoId(), style, image, gender);
			
			displayPhotos.put(person.getId(), displayImage);
		}
		return displayPhotos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Map<String, DisplayImage2> getSafeSocialPersonPhotos(ImageType namespace, Collection<Person> people, ImageStyle style) {
		final ImageRepository imageRepo = getImageRepositoryChecked(namespace);
		final Set<String> imageIds = ImmutableSet.copyOf(Iterables.filter(
				Collections2.transform(people, new Function<Person, String>() {
			@Override @Nullable
			public String apply(@Nullable Person input) {
				return input != null ? input.getPhotoId() : null;
			}
		}), new NotNullPredicate()));
		final List<Image> images = imageRepo.findAll(imageIds);
		final Map<String, Image> imageMap = Maps.uniqueIndex(images, new Function<Image, String>() {
			@Override @Nullable
			public String apply(@Nullable Image input) {
				return input.getId();
			}
		});
		
		final Map<String, DisplayImage2> displayPhotos = new HashMap<>();
		for (final Person person : people) {
			if (person == null || displayPhotos.containsKey(person.getId())) {
				continue;
			}
			
			final Image image = person.getPhotoId() != null ? imageMap.get(person.getPhotoId()) : null;
			final Gender gender = person.getGender();
			
			final DisplayImage2 displayImage = grabDisplayPhoto(namespace, imageRepo.getStyles(),
					person.getPhotoId(), style, image, gender);
			
			displayPhotos.put(person.getId(), displayImage);
		}
		return displayPhotos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public ImageRepository getRepository(ImageType imageType) {
		return Preconditions.checkNotNull(imageRepos.get(imageType),
				"%s image repository not available. %s available repositories: %s",
				imageType, imageRepos.size(), imageRepos.keySet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Map<?, ?> getImageUris() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Map<String, Map<String, String>> getImageUris(ImageType namespace, List<String> imageIds) {
		final Map<String, Map<String, String>> imageUris = new HashMap<>();
		final ImageRepository imageRepo = getImageRepositoryChecked(namespace);
		List<Image> images = imageRepo.findAll(imageIds);
		for (Image image : images) {
			Map<String, String> imageUri = new HashMap<>();
			for (Map.Entry<String, StyledImage> entry : image.getStyles().entrySet()) {
				imageUri.put(entry.getKey(), entry.getValue().getUri());
			}
			imageUris.put(image.getId(), imageUri);
		}
		
		return imageUris;
	}

	public String getPersonPhotoUri(@Nullable Gender gender) {
		if (gender == null) {
			return unsecureImagesUri + "org.soluvas.commons/nophoto_person.png";
		}
		switch (gender) {
		case MALE:
			return unsecureImagesUri + "org.soluvas.commons/nophoto_male.png";
		case FEMALE:
			return unsecureImagesUri + "org.soluvas.commons/nophoto_female.png";
		default:
			return unsecureImagesUri + "org.soluvas.commons/nophoto_person.png";	
		}
	}

	@Override
	public String getThumbnailPhotoUri(Person person) {
		if (person != null) {					
			final String photoId = person.getPhotoId();
			final Image personImage = getPersonImageRepository().findOne(photoId);
			if (personImage != null) {
				log.debug("Photo id {}", personImage.getId());
				final StyledImage personThumbnailImage = personImage.getStyles().get("thumbnail");
				if (personThumbnailImage != null) {
					return getSecurableUri(personThumbnailImage.getUri());
				} else {
					log.warn("Cannot get thumbnail image {} for person {} using {}", photoId, person.getId(), getPersonImageRepository());
					return getPersonPhotoUri(person.getGender());
				}
			} else {
				log.warn("Cannot find image {} for person {} using {}",
						photoId, person.getId(), getPersonImageRepository());
				return getPersonPhotoUri(person.getGender());
			}
		} else {
			return unsecureImagesUri + "org.soluvas.commons/nophoto_person.png";
		}
	}
	
} //ImageManagerImpl
