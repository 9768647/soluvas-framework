/**
 */
package org.soluvas.commons;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parentable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.soluvas.commons.Parentable#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see org.soluvas.commons.CommonsPackage#getParentable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Parentable<P> extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Object)
	 * @see org.soluvas.commons.CommonsPackage#getParentable_Parent()
	 * @model kind="reference" transient="true"
	 * @generated
	 */
	P getParent();

	/**
	 * Sets the value of the '{@link org.soluvas.commons.Parentable#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(P value);

} // Parentable
