/**
 */
package org.soluvas.data;

import org.soluvas.commons.BundleAware;
import org.soluvas.commons.NameContainer;
import org.soluvas.commons.NsPrefixable;
import org.soluvas.commons.ResourceAware;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * EXPERIMENTAL.
 * 
 * Two/three approaches:
 * 
 * 1. Mixin must be statically designed into Ecore EClass, e.g. BerbatikBags, which inherits from BerbatikMixin (inherits ClothingMixin = SizeMixin + ColorMixin), BatikMixin, and BagsMixin. The upside is all attributes/references merge into the EObject. Downside is we need to permutate all combinations into EClass.
 * Not sure yet how it goes with MongoDB, JSON, and XMI import/export. Not sure yet how it goes with VariedProduct, BundleProduct, SubscribedProduct, SharedProduct, etc.
 * 
 * 2. Mixin is dynamic. Each product object maintain a list of MixinTypes (which is by default specified when the product is created), and filled mixins are put in an EList. Mixins can be added and removed during runtime, without any build-time project rebuild or EMF regeneration.
 * So store owner, even staff, can define new mixin and manipulate existing products with ease. No Mall admin or schema changes required.
 * Store staff can browse available mixin types and just add any mixin they want.
 * Similar approach with Drupal taxonomy or JCR mixin. Magento is more restrictive because of its inflexible AttributeSet concept. Mixin is like AttributeSet but with cardinality 0..*.
 * Probably need better name than mixin though.
 * Seems to be most flexible, for Jackson we can have custom converter. My concern is MongoDB and XMI.
 * Not sure yet how it goes with MongoDB, JSON, and XMI import/export. Not sure yet how it goes with VariedProduct, BundleProduct, SubscribedProduct, SharedProduct, etc.
 * 
 * 3. Hybrid #1. Mixin is by default static, which hopefully covers 80% use case.
 * When you want dynamic, you can add more mixins.
 * But ain't this too complicated?
 * On the web client side, it's also more work. Not to mention inventory, etc. integration with other systems.
 * ProductInfo & principal etc. also use the fully dynamic approach.
 * 
 * 4. Hybrid #2. Mixin is by default dynamic, which covers 80% of the customization.
 * And for things like category, tag, color, size, they're static, with code support. i.e. must be generated by EMF.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.soluvas.data.AttributeType#getLabel <em>Label</em>}</li>
 *   <li>{@link org.soluvas.data.AttributeType#getMinValues <em>Min Values</em>}</li>
 *   <li>{@link org.soluvas.data.AttributeType#getMaxValues <em>Max Values</em>}</li>
 *   <li>{@link org.soluvas.data.AttributeType#getDataTypeName <em>Data Type Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.soluvas.data.DataPackage#getAttributeType()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AttributeType extends NsPrefixable, NameContainer, ResourceAware, BundleAware {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.soluvas.data.DataPackage#getAttributeType_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.soluvas.data.AttributeType#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Min Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 0 means optional, 1 means required, and so on.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Values</em>' attribute.
	 * @see #setMinValues(long)
	 * @see org.soluvas.data.DataPackage#getAttributeType_MinValues()
	 * @model
	 * @generated
	 */
	long getMinValues();

	/**
	 * Sets the value of the '{@link org.soluvas.data.AttributeType#getMinValues <em>Min Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Values</em>' attribute.
	 * @see #getMinValues()
	 * @generated
	 */
	void setMinValues(long value);

	/**
	 * Returns the value of the '<em><b>Max Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 1 means singular. -1 means no maximum number of values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Values</em>' attribute.
	 * @see #setMaxValues(long)
	 * @see org.soluvas.data.DataPackage#getAttributeType_MaxValues()
	 * @model
	 * @generated
	 */
	long getMaxValues();

	/**
	 * Sets the value of the '{@link org.soluvas.data.AttributeType#getMaxValues <em>Max Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Values</em>' attribute.
	 * @see #getMaxValues()
	 * @generated
	 */
	void setMaxValues(long value);

	/**
	 * Returns the value of the '<em><b>Data Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type Name</em>' attribute.
	 * @see #setDataTypeName(String)
	 * @see org.soluvas.data.DataPackage#getAttributeType_DataTypeName()
	 * @model
	 * @generated
	 */
	String getDataTypeName();

	/**
	 * Sets the value of the '{@link org.soluvas.data.AttributeType#getDataTypeName <em>Data Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type Name</em>' attribute.
	 * @see #getDataTypeName()
	 * @generated
	 */
	void setDataTypeName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Convert the string value to a mixin instance.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Value valueOf(String stringValue);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Value create();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if minValues > 0.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isRequired();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * true if maxValues is > 1.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isMultiple();

} // AttributeType
