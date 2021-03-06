/**
 */
package org.soluvas.commons;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person Catalog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.soluvas.commons.PersonCatalog#getPeople <em>People</em>}</li>
 * </ul>
 *
 * @see org.soluvas.commons.CommonsPackage#getPersonCatalog()
 * @model
 * @generated
 */
public interface PersonCatalog extends EObject {
	/**
	 * Returns the value of the '<em><b>People</b></em>' containment reference list.
	 * The list contents are of type {@link org.soluvas.commons.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>People</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>People</em>' containment reference list.
	 * @see org.soluvas.commons.CommonsPackage#getPersonCatalog_People()
	 * @model containment="true"
	 * @generated
	 */
	List<org.soluvas.commons.entity.Person2> getPeople();

} // PersonCatalog
