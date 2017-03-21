/**
 */
package org.jnario.xbase.richstring.xbasewithrichstring;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.jnario.xbase.richstring.xbasewithrichstring.XbaseWithRichstringPackage
 * @generated
 */
public interface XbaseWithRichstringFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XbaseWithRichstringFactory eINSTANCE = org.jnario.xbase.richstring.xbasewithrichstring.impl.XbaseWithRichstringFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Rich String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rich String</em>'.
	 * @generated
	 */
	RichString createRichString();

	/**
	 * Returns a new object of class '<em>Rich String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rich String Literal</em>'.
	 * @generated
	 */
	RichStringLiteral createRichStringLiteral();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	XbaseWithRichstringPackage getXbaseWithRichstringPackage();

} //XbaseWithRichstringFactory
