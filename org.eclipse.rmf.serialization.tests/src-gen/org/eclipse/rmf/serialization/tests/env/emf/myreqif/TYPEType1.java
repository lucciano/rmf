/**
 */
package org.eclipse.rmf.serialization.tests.env.emf.myreqif;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TYPE Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.serialization.tests.env.emf.myreqif.TYPEType1#getSPECIFICATIONTYPEREF <em>SPECIFICATIONTYPEREF</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.serialization.tests.env.emf.myreqif.MyreqifPackage#getTYPEType1()
 * @model extendedMetaData="name='TYPE_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface TYPEType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>SPECIFICATIONTYPEREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPECIFICATIONTYPEREF</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPECIFICATIONTYPEREF</em>' attribute.
	 * @see #setSPECIFICATIONTYPEREF(String)
	 * @see org.eclipse.rmf.serialization.tests.env.emf.myreqif.MyreqifPackage#getTYPEType1_SPECIFICATIONTYPEREF()
	 * @model dataType="org.eclipse.rmf.serialization.tests.env.emf.myreqif.LOCALREF"
	 *        extendedMetaData="kind='element' name='SPECIFICATION-TYPE-REF' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSPECIFICATIONTYPEREF();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.serialization.tests.env.emf.myreqif.TYPEType1#getSPECIFICATIONTYPEREF <em>SPECIFICATIONTYPEREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPECIFICATIONTYPEREF</em>' attribute.
	 * @see #getSPECIFICATIONTYPEREF()
	 * @generated
	 */
	void setSPECIFICATIONTYPEREF(String value);

} // TYPEType1
