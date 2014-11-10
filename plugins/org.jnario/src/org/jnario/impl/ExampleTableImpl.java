/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.impl.XExpressionImpl;
import org.jnario.ExampleColumn;
import org.jnario.ExampleRow;
import org.jnario.ExampleTable;
import org.jnario.JnarioAnnotationTarget;
import org.jnario.JnarioMember;
import org.jnario.JnarioPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Example Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jnario.impl.ExampleTableImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.jnario.impl.ExampleTableImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.jnario.impl.ExampleTableImpl#getAnnotationInfo <em>Annotation Info</em>}</li>
 *   <li>{@link org.jnario.impl.ExampleTableImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.jnario.impl.ExampleTableImpl#getRows <em>Rows</em>}</li>
 *   <li>{@link org.jnario.impl.ExampleTableImpl#getColumns <em>Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExampleTableImpl extends XExpressionImpl implements ExampleTable {
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<XAnnotation> annotations;

	/**
	 * The cached value of the '{@link #getModifiers() <em>Modifiers</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<String> modifiers;

	/**
	 * The cached value of the '{@link #getAnnotationInfo() <em>Annotation Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationInfo()
	 * @generated
	 * @ordered
	 */
	protected JnarioAnnotationTarget annotationInfo;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRows() <em>Rows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected EList<ExampleRow> rows;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<ExampleColumn> columns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExampleTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JnarioPackage.Literals.EXAMPLE_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XAnnotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList<XAnnotation>(XAnnotation.class, this, JnarioPackage.EXAMPLE_TABLE__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getModifiers() {
		if (modifiers == null) {
			modifiers = new EDataTypeEList<String>(String.class, this, JnarioPackage.EXAMPLE_TABLE__MODIFIERS);
		}
		return modifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JnarioAnnotationTarget getAnnotationInfo() {
		return annotationInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotationInfo(JnarioAnnotationTarget newAnnotationInfo, NotificationChain msgs) {
		JnarioAnnotationTarget oldAnnotationInfo = annotationInfo;
		annotationInfo = newAnnotationInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JnarioPackage.EXAMPLE_TABLE__ANNOTATION_INFO, oldAnnotationInfo, newAnnotationInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotationInfo(JnarioAnnotationTarget newAnnotationInfo) {
		if (newAnnotationInfo != annotationInfo) {
			NotificationChain msgs = null;
			if (annotationInfo != null)
				msgs = ((InternalEObject)annotationInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JnarioPackage.EXAMPLE_TABLE__ANNOTATION_INFO, null, msgs);
			if (newAnnotationInfo != null)
				msgs = ((InternalEObject)newAnnotationInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JnarioPackage.EXAMPLE_TABLE__ANNOTATION_INFO, null, msgs);
			msgs = basicSetAnnotationInfo(newAnnotationInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JnarioPackage.EXAMPLE_TABLE__ANNOTATION_INFO, newAnnotationInfo, newAnnotationInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JnarioPackage.EXAMPLE_TABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExampleRow> getRows() {
		if (rows == null) {
			rows = new EObjectContainmentWithInverseEList<ExampleRow>(ExampleRow.class, this, JnarioPackage.EXAMPLE_TABLE__ROWS, JnarioPackage.EXAMPLE_ROW__TABLE);
		}
		return rows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExampleColumn> getColumns() {
		if (columns == null) {
			columns = new EObjectContainmentWithInverseEList<ExampleColumn>(ExampleColumn.class, this, JnarioPackage.EXAMPLE_TABLE__COLUMNS, JnarioPackage.EXAMPLE_COLUMN__TABLE);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isValid() {
		int columnCount = getColumns().size();
		for (ExampleRow row : getRows()) {
			if(row.getCells().size() != columnCount){
				return false;
			}
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStatic() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JnarioPackage.EXAMPLE_TABLE__ROWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRows()).basicAdd(otherEnd, msgs);
			case JnarioPackage.EXAMPLE_TABLE__COLUMNS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getColumns()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JnarioPackage.EXAMPLE_TABLE__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case JnarioPackage.EXAMPLE_TABLE__ANNOTATION_INFO:
				return basicSetAnnotationInfo(null, msgs);
			case JnarioPackage.EXAMPLE_TABLE__ROWS:
				return ((InternalEList<?>)getRows()).basicRemove(otherEnd, msgs);
			case JnarioPackage.EXAMPLE_TABLE__COLUMNS:
				return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JnarioPackage.EXAMPLE_TABLE__ANNOTATIONS:
				return getAnnotations();
			case JnarioPackage.EXAMPLE_TABLE__MODIFIERS:
				return getModifiers();
			case JnarioPackage.EXAMPLE_TABLE__ANNOTATION_INFO:
				return getAnnotationInfo();
			case JnarioPackage.EXAMPLE_TABLE__NAME:
				return getName();
			case JnarioPackage.EXAMPLE_TABLE__ROWS:
				return getRows();
			case JnarioPackage.EXAMPLE_TABLE__COLUMNS:
				return getColumns();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JnarioPackage.EXAMPLE_TABLE__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends XAnnotation>)newValue);
				return;
			case JnarioPackage.EXAMPLE_TABLE__MODIFIERS:
				getModifiers().clear();
				getModifiers().addAll((Collection<? extends String>)newValue);
				return;
			case JnarioPackage.EXAMPLE_TABLE__ANNOTATION_INFO:
				setAnnotationInfo((JnarioAnnotationTarget)newValue);
				return;
			case JnarioPackage.EXAMPLE_TABLE__NAME:
				setName((String)newValue);
				return;
			case JnarioPackage.EXAMPLE_TABLE__ROWS:
				getRows().clear();
				getRows().addAll((Collection<? extends ExampleRow>)newValue);
				return;
			case JnarioPackage.EXAMPLE_TABLE__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends ExampleColumn>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JnarioPackage.EXAMPLE_TABLE__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case JnarioPackage.EXAMPLE_TABLE__MODIFIERS:
				getModifiers().clear();
				return;
			case JnarioPackage.EXAMPLE_TABLE__ANNOTATION_INFO:
				setAnnotationInfo((JnarioAnnotationTarget)null);
				return;
			case JnarioPackage.EXAMPLE_TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JnarioPackage.EXAMPLE_TABLE__ROWS:
				getRows().clear();
				return;
			case JnarioPackage.EXAMPLE_TABLE__COLUMNS:
				getColumns().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JnarioPackage.EXAMPLE_TABLE__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case JnarioPackage.EXAMPLE_TABLE__MODIFIERS:
				return modifiers != null && !modifiers.isEmpty();
			case JnarioPackage.EXAMPLE_TABLE__ANNOTATION_INFO:
				return annotationInfo != null;
			case JnarioPackage.EXAMPLE_TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case JnarioPackage.EXAMPLE_TABLE__ROWS:
				return rows != null && !rows.isEmpty();
			case JnarioPackage.EXAMPLE_TABLE__COLUMNS:
				return columns != null && !columns.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == JnarioAnnotationTarget.class) {
			switch (derivedFeatureID) {
				case JnarioPackage.EXAMPLE_TABLE__ANNOTATIONS: return JnarioPackage.JNARIO_ANNOTATION_TARGET__ANNOTATIONS;
				default: return -1;
			}
		}
		if (baseClass == JnarioMember.class) {
			switch (derivedFeatureID) {
				case JnarioPackage.EXAMPLE_TABLE__MODIFIERS: return JnarioPackage.JNARIO_MEMBER__MODIFIERS;
				case JnarioPackage.EXAMPLE_TABLE__ANNOTATION_INFO: return JnarioPackage.JNARIO_MEMBER__ANNOTATION_INFO;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == JnarioAnnotationTarget.class) {
			switch (baseFeatureID) {
				case JnarioPackage.JNARIO_ANNOTATION_TARGET__ANNOTATIONS: return JnarioPackage.EXAMPLE_TABLE__ANNOTATIONS;
				default: return -1;
			}
		}
		if (baseClass == JnarioMember.class) {
			switch (baseFeatureID) {
				case JnarioPackage.JNARIO_MEMBER__MODIFIERS: return JnarioPackage.EXAMPLE_TABLE__MODIFIERS;
				case JnarioPackage.JNARIO_MEMBER__ANNOTATION_INFO: return JnarioPackage.EXAMPLE_TABLE__ANNOTATION_INFO;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (modifiers: ");
		result.append(modifiers);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ExampleTableImpl
