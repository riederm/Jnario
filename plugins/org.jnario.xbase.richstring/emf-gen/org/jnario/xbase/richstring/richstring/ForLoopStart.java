/**
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.xbase.richstring.richstring;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Loop Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.jnario.xbase.richstring.richstring.ForLoopStart#getLoop <em>Loop</em>}</li>
 *   <li>{@link org.jnario.xbase.richstring.richstring.ForLoopStart#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see org.jnario.xbase.richstring.richstring.ProcessedRichStringPackage#getForLoopStart()
 * @model
 * @generated
 */
public interface ForLoopStart extends LinePart {
	/**
	 * Returns the value of the '<em><b>Loop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop</em>' reference.
	 * @see #setLoop(EObject)
	 * @see org.jnario.xbase.richstring.richstring.ProcessedRichStringPackage#getForLoopStart_Loop()
	 * @model
	 * @generated
	 */
	EObject getLoop();

	/**
	 * Sets the value of the '{@link org.jnario.xbase.richstring.richstring.ForLoopStart#getLoop <em>Loop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop</em>' reference.
	 * @see #getLoop()
	 * @generated
	 */
	void setLoop(EObject value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.jnario.xbase.richstring.richstring.ForLoopEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(ForLoopEnd)
	 * @see org.jnario.xbase.richstring.richstring.ProcessedRichStringPackage#getForLoopStart_End()
	 * @see org.jnario.xbase.richstring.richstring.ForLoopEnd#getStart
	 * @model opposite="start"
	 * @generated
	 */
	ForLoopEnd getEnd();

	/**
	 * Sets the value of the '{@link org.jnario.xbase.richstring.richstring.ForLoopStart#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(ForLoopEnd value);

} // ForLoopStart
