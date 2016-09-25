/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.spec.spec;

import org.eclipse.xtext.xbase.XExpression;

import org.jnario.Executable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Example</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.jnario.spec.spec.Example#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.jnario.spec.spec.Example#isPending <em>Pending</em>}</li>
 * </ul>
 *
 * @see org.jnario.spec.spec.SpecPackage#getExample()
 * @model
 * @generated
 */
public interface Example extends TestFunction, Executable
{
	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(XExpression)
	 * @see org.jnario.spec.spec.SpecPackage#getExample_Expr()
	 * @model containment="true"
	 * @generated
	 */
	XExpression getExpr();

	/**
	 * Sets the value of the '{@link org.jnario.spec.spec.Example#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(XExpression value);

	/**
	 * Returns the value of the '<em><b>Pending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pending</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pending</em>' attribute.
	 * @see #setPending(boolean)
	 * @see org.jnario.spec.spec.SpecPackage#getExample_Pending()
	 * @model
	 * @generated
	 */
	boolean isPending();

	/**
	 * Sets the value of the '{@link org.jnario.spec.spec.Example#isPending <em>Pending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pending</em>' attribute.
	 * @see #isPending()
	 * @generated
	 */
	void setPending(boolean value);

} // Example
