/**
 */
package org.soluvas.commons;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imageable</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.soluvas.commons.CommonsPackage#getImageable()
 * @model interface="true" abstract="true"
 * @generated NOT
 */
public interface Imageable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the primary image ID for square proportion.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	@JsonProperty
	String getImageId();

} // Imageable
