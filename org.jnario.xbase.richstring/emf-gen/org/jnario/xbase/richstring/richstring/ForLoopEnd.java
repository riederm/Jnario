/**
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.xbase.richstring.richstring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Loop End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.jnario.xbase.richstring.richstring.ForLoopEnd#getStart <em>Start</em>}</li>
 * </ul>
 *
 * @see org.jnario.xbase.richstring.richstring.ProcessedRichStringPackage#getForLoopEnd()
 * @model
 * @generated
 */
public interface ForLoopEnd extends LinePart {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.jnario.xbase.richstring.richstring.ForLoopStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(ForLoopStart)
	 * @see org.jnario.xbase.richstring.richstring.ProcessedRichStringPackage#getForLoopEnd_Start()
	 * @see org.jnario.xbase.richstring.richstring.ForLoopStart#getEnd
	 * @model opposite="end"
	 * @generated
	 */
	ForLoopStart getStart();

	/**
	 * Sets the value of the '{@link org.jnario.xbase.richstring.richstring.ForLoopEnd#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(ForLoopStart value);

} // ForLoopEnd
