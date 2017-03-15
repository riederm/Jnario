/**
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.xbase.richstring.richstring;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.jnario.xbase.richstring.xbasewithrichstring.RichString;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processed Rich String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.jnario.xbase.richstring.richstring.ProcessedRichString#getRichString <em>Rich String</em>}</li>
 *   <li>{@link org.jnario.xbase.richstring.richstring.ProcessedRichString#getLines <em>Lines</em>}</li>
 * </ul>
 *
 * @see org.jnario.xbase.richstring.richstring.ProcessedRichStringPackage#getProcessedRichString()
 * @model
 * @generated
 */
public interface ProcessedRichString extends EObject {
	/**
	 * Returns the value of the '<em><b>Rich String</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rich String</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rich String</em>' reference.
	 * @see #setRichString(RichString)
	 * @see org.jnario.xbase.richstring.richstring.ProcessedRichStringPackage#getProcessedRichString_RichString()
	 * @model
	 * @generated
	 */
	RichString getRichString();

	/**
	 * Sets the value of the '{@link org.jnario.xbase.richstring.richstring.ProcessedRichString#getRichString <em>Rich String</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rich String</em>' reference.
	 * @see #getRichString()
	 * @generated
	 */
	void setRichString(RichString value);

	/**
	 * Returns the value of the '<em><b>Lines</b></em>' containment reference list.
	 * The list contents are of type {@link org.jnario.xbase.richstring.richstring.Line}.
	 * It is bidirectional and its opposite is '{@link org.jnario.xbase.richstring.richstring.Line#getRichString <em>Rich String</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lines</em>' containment reference list.
	 * @see org.jnario.xbase.richstring.richstring.ProcessedRichStringPackage#getProcessedRichString_Lines()
	 * @see org.jnario.xbase.richstring.richstring.Line#getRichString
	 * @model opposite="richString" containment="true"
	 * @generated
	 */
	EList<Line> getLines();

} // ProcessedRichString
