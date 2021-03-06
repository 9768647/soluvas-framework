package org.soluvas.commons.tenant;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Collection;

import javax.annotation.Nonnull;
import javax.inject.Inject;

import org.osgi.framework.BundleContext;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.commons.CommonsException;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/**
 * JDK Proxy implementation for JSR330 {@link Inject}. Created by {@link ProxyTenantInjector}. 
 * @author ceefour
 */
public class TenantServiceProxy implements InvocationHandler {

	private static Logger log = LoggerFactory
			.getLogger(TenantServiceProxy.class);
	private final BundleContext bundleContext;
	private final String name;
	@SuppressWarnings("rawtypes")
	private final Class clazz;
	private final Supplier<String> filterSupplier;
	
	/**
	 * @param bundleContext
	 * @param name
	 * @param clazz
	 * @param filter
	 */
	public TenantServiceProxy(final BundleContext bundleContext, final String name,
			final Class<?> clazz, String filter) {
		super();
		this.bundleContext = bundleContext;
		this.name = name;
		this.clazz = clazz;
		this.filterSupplier = Suppliers.ofInstance(filter);
	}

	/**
	 * @param bundleContext
	 * @param name
	 * @param clazz
	 * @param filter
	 */
	public TenantServiceProxy(final BundleContext bundleContext, final String name,
			final Class<?> clazz, final Supplier<String> filterSupplier) {
		super();
		this.bundleContext = bundleContext;
		this.name = name;
		this.clazz = clazz;
		this.filterSupplier = filterSupplier;
	}

	/* (non-Javadoc)
	 * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		final String filter = filterSupplier.get();
		log.trace("Lookup {} for {} on {}", clazz.getName(), filter, method);
		final ServiceReference<?> serviceRef;
		try {
			final Collection<ServiceReference<?>> foundRefs = bundleContext.getServiceReferences(clazz, filter);
			if (foundRefs == null || foundRefs.isEmpty()) {
				throw new CommonsException("Cannot invoke " + method + " on " + name + ", " +
						clazz.getName() + " service with " + filter + " not found");
			}
			serviceRef = foundRefs.iterator().next();
		} catch (InvalidSyntaxException e) {
			throw new CommonsException("Cannot invoke " + method + " on " + name + ", invalid " +
					clazz.getName() + " service with filter " + filter, e);
		}
		final Object bean = bundleContext.getService(serviceRef);
		log.trace("Invoking {} on {} with {}", method, name, bean );
		try {
			return method.invoke(bean, args);
		} finally {
			bundleContext.ungetService(serviceRef);
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final String filter = filterSupplier.get();
		return "TenantServiceProxy ["
				+ (name != null ? "name=" + name + ", " : "")
				+ (clazz != null ? "clazz=" + clazz + ", " : "")
				+ (filter != null ? "filter=" + filter : "") + "]";
	}

}
