package org.soluvas.commons;

import java.net.URL;

import javax.annotation.Nonnull;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.osgi.framework.Bundle;

public interface XmiObjectLoaderFactory {

	public abstract <T extends EObject> StaticXmiLoader<T> create(
			EPackage ePackage, Class<?> loaderClass,
			String resourcePath);

	public abstract <T extends EObject> StaticXmiLoader<T> create(
			EPackage ePackage, String fileName);

	/**
	 * Loads from a file inside a {@link Bundle}.
	 * @param ePackage
	 * @param baseDir
	 * @param fileName
	 */
	public abstract <T extends EObject> StaticXmiLoader<T> create(
			EPackage ePackage, Bundle bundle,
			String fileName);

	/**
	 * Loads from a file inside a baseDir, this makes it much easier to configure in Blueprint XML, because Blueprint property configurer does not support expressions.
	 * @param ePackage
	 * @param baseDir
	 * @param fileName
	 */
	public abstract <T extends EObject> StaticXmiLoader<T> create(
			EPackage ePackage, String baseDir,
			String fileName);

	public abstract <T extends EObject> StaticXmiLoader<T> create(
			EPackage ePackage, URL resourceUrl,
			ResourceType resourceType);

}