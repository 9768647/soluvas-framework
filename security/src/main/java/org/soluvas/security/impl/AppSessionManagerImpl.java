/**
 */
package org.soluvas.security.impl;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ThreadContext;
import org.apache.shiro.web.subject.WebSubject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.commons.PersonRelated;
import org.soluvas.commons.entity.Person2;
import org.soluvas.data.EntityLookup;
import org.soluvas.security.AppSessionManager;
import org.soluvas.security.NotLoggedInException;
import org.soluvas.security.SecurityPackage;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.google.common.base.Preconditions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>App Session Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.soluvas.security.impl.AppSessionManagerImpl#getSecurityManager <em>Security Manager</em>}</li>
 *   <li>{@link org.soluvas.security.impl.AppSessionManagerImpl#getPersonLookup <em>Person Lookup</em>}</li>
 * </ul>
 *
 * @generated
 */
@Service("appSessionMgr") @Lazy
public class AppSessionManagerImpl extends EObjectImpl implements AppSessionManager {
	
	private static final Logger log = LoggerFactory
			.getLogger(AppSessionManagerImpl.class);
	
	/**
	 * The default value of the '{@link #getSecurityManager() <em>Security Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityManager()
	 * @generated
	 * @ordered
	 */
	protected static final org.apache.shiro.mgt.SecurityManager SECURITY_MANAGER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSecurityManager() <em>Security Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityManager()
	 * @generated
	 * @ordered
	 */
	protected org.apache.shiro.mgt.SecurityManager securityManager = SECURITY_MANAGER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPersonLookup() <em>Person Lookup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonLookup()
	 * @generated
	 * @ordered
	 */
	protected EntityLookup<? extends Person2, String> personLookup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public AppSessionManagerImpl() {
		throw new UnsupportedOperationException("Use the argument constructor");
	}
	
	/**
	 * @param securityManager
	 * @param personLookup
	 */
	@Inject
	public AppSessionManagerImpl(SecurityManager securityManager,
			@PersonRelated EntityLookup<? extends Person2, String> personLookup) {
		super();
		this.securityManager = securityManager;
		this.personLookup = personLookup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPackage.Literals.APP_SESSION_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.apache.shiro.mgt.SecurityManager getSecurityManager() {
		return securityManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntityLookup<? extends Person2, String> getPersonLookup() {
		return personLookup;
	}

	/**
	 * Get the security {@link Subject} (currently logged in user). The access token
	 * is fetched from either of: (in order of importance)
	 * 
	 * <ol>
	 * <li>the current request's {@literal accessToken} Form parameter</li>
	 * <li>the current request's {@literal accessToken} Query parameter</li>
	 * <li>the current request's {@literal accessToken} cookie</li>
	 * </ol>
	 * 
	 * <p>Important: This will bind the created {@link Subject} to the current thread's context.
	 *
	 * <p>See https://shiro.apache.org/session-management.html
	 * @param httpResponse TODO
	 * 
	 * @return
	 */
	public Subject getSubject(final HttpServletRequest httpRequest,
			final HttpServletResponse httpResponse) {
		Subject subject = ThreadContext.getSubject();
		if (subject == null) {
			log.debug("Binding thread {} to Request {} using SecurityManager {}",
					Thread.currentThread().getName(), httpRequest.getRequestURL(), securityManager);
//				ThreadContext.bind(securityMgr);
			subject = new WebSubject.Builder(securityManager, httpRequest, httpResponse).buildSubject();
//        Subject subject = (new Subject.Builder()).buildSubject();
			final Session session = subject.getSession(false);
			log.debug("Thread {} / Request {} uses Subject {} ({})",
					Thread.currentThread().getName(), httpRequest.getRequestURL(), subject.getPrincipal(),
					session != null ? session.getId() : null);
			ThreadContext.bind(subject);
		}
		return subject;
	}

	/**
	 * Get the security {@link Session} for currently logged in user.
	 * 
	 * <p>The {@link Subject} is fetched using {@link #getSubject(HttpServletRequest, HttpServletResponse)}.
	 * 
	 * <p>If no Session is available, the call will fail and throw {@link NullPointerException}.
	 * @param httpResponse TODO
	 * 
	 * @return
	 */
	public Session requireSession(final HttpServletRequest httpRequest, HttpServletResponse httpResponse) {
		final Session session = getSubject(httpRequest, httpResponse).getSession(false);
		if (session == null) {
			throw new NotLoggedInException(String.format("Cannot get security session for %s Request: %s",
				Thread.currentThread().getName(), httpRequest.getRequestURL()) );
		}
		return session;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public <T extends Person2> T requirePerson(HttpServletRequest httpRequest, HttpServletResponse httpResponse) {
		final Subject subject = getSubject(httpRequest, httpResponse);
		return requirePerson(subject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	@SuppressWarnings("unchecked")
	public <T extends Person2> T requirePerson(Subject subject) {
		final String personId = (String) subject.getPrincipal();
		if (personId == null) {
			throw new NotLoggedInException("User is not logged in");
		}
		final Person2 person = Preconditions.checkNotNull(personLookup.findOne(personId),
				"Cannot find user %s", personId);
		return (T) person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecurityPackage.APP_SESSION_MANAGER__SECURITY_MANAGER:
				return getSecurityManager();
			case SecurityPackage.APP_SESSION_MANAGER__PERSON_LOOKUP:
				return getPersonLookup();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SecurityPackage.APP_SESSION_MANAGER__SECURITY_MANAGER:
				return SECURITY_MANAGER_EDEFAULT == null ? securityManager != null : !SECURITY_MANAGER_EDEFAULT.equals(securityManager);
			case SecurityPackage.APP_SESSION_MANAGER__PERSON_LOOKUP:
				return personLookup != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (securityManager: ");
		result.append(securityManager);
		result.append(", personLookup: ");
		result.append(personLookup);
		result.append(')');
		return result.toString();
	}

} //AppSessionManagerImpl
