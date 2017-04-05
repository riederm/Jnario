/**
 */
package org.jnario.xbase.richstring.xbasewithrichstring;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rich String If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.jnario.xbase.richstring.xbasewithrichstring.RichStringIf#getIf <em>If</em>}</li>
 *   <li>{@link org.jnario.xbase.richstring.xbasewithrichstring.RichStringIf#getThen <em>Then</em>}</li>
 *   <li>{@link org.jnario.xbase.richstring.xbasewithrichstring.RichStringIf#getElseIfs <em>Else Ifs</em>}</li>
 *   <li>{@link org.jnario.xbase.richstring.xbasewithrichstring.RichStringIf#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @see org.jnario.xbase.richstring.xbasewithrichstring.XbaseWithRichstringPackage#getRichStringIf()
 * @model
 * @generated
 */
public interface RichStringIf extends XExpression {
	/**
	 * Returns the value of the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If</em>' containment reference.
	 * @see #setIf(XExpression)
	 * @see org.jnario.xbase.richstring.xbasewithrichstring.XbaseWithRichstringPackage#getRichStringIf_If()
	 * @model containment="true"
	 * @generated
	 */
	XExpression getIf();

	/**
	 * Sets the value of the '{@link org.jnario.xbase.richstring.xbasewithrichstring.RichStringIf#getIf <em>If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If</em>' containment reference.
	 * @see #getIf()
	 * @generated
	 */
	void setIf(XExpression value);

	/**
	 * Returns the value of the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' containment reference.
	 * @see #setThen(XExpression)
	 * @see org.jnario.xbase.richstring.xbasewithrichstring.XbaseWithRichstringPackage#getRichStringIf_Then()
	 * @model containment="true"
	 * @generated
	 */
	XExpression getThen();

	/**
	 * Sets the value of the '{@link org.jnario.xbase.richstring.xbasewithrichstring.RichStringIf#getThen <em>Then</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then</em>' containment reference.
	 * @see #getThen()
	 * @generated
	 */
	void setThen(XExpression value);

	/**
	 * Returns the value of the '<em><b>Else Ifs</b></em>' containment reference list.
	 * The list contents are of type {@link org.jnario.xbase.richstring.xbasewithrichstring.RichStringElseIf}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Ifs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Ifs</em>' containment reference list.
	 * @see org.jnario.xbase.richstring.xbasewithrichstring.XbaseWithRichstringPackage#getRichStringIf_ElseIfs()
	 * @model containment="true"
	 * @generated
	 */
	EList<RichStringElseIf> getElseIfs();

	/**
	 * Returns the value of the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' containment reference.
	 * @see #setElse(XExpression)
	 * @see org.jnario.xbase.richstring.xbasewithrichstring.XbaseWithRichstringPackage#getRichStringIf_Else()
	 * @model containment="true"
	 * @generated
	 */
	XExpression getElse();

	/**
	 * Sets the value of the '{@link org.jnario.xbase.richstring.xbasewithrichstring.RichStringIf#getElse <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' containment reference.
	 * @see #getElse()
	 * @generated
	 */
	void setElse(XExpression value);

} // RichStringIf
