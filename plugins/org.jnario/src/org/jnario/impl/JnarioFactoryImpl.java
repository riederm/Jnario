/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.jnario.*;
import org.jnario.Assertion;
import org.jnario.ExampleColumn;
import org.jnario.ExampleRow;
import org.jnario.ExampleTable;
import org.jnario.JnarioFactory;
import org.jnario.JnarioPackage;
import org.jnario.MockLiteral;
import org.jnario.Should;
import org.jnario.ShouldThrow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JnarioFactoryImpl extends EFactoryImpl implements JnarioFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JnarioFactory init() {
		try {
			JnarioFactory theJnarioFactory = (JnarioFactory)EPackage.Registry.INSTANCE.getEFactory(JnarioPackage.eNS_URI);
			if (theJnarioFactory != null) {
				return theJnarioFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JnarioFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JnarioFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case JnarioPackage.EXAMPLE_TABLE: return createExampleTable();
			case JnarioPackage.EXAMPLE_ROW: return createExampleRow();
			case JnarioPackage.ASSERTION: return createAssertion();
			case JnarioPackage.EXAMPLE_COLUMN: return createExampleColumn();
			case JnarioPackage.SHOULD: return createShould();
			case JnarioPackage.SHOULD_THROW: return createShouldThrow();
			case JnarioPackage.SPECIFICATION: return createSpecification();
			case JnarioPackage.MOCK_LITERAL: return createMockLiteral();
			case JnarioPackage.EXAMPLE_CELL: return createExampleCell();
			case JnarioPackage.JNARIO_FILE: return createJnarioFile();
			case JnarioPackage.JNARIO_CLASS: return createJnarioClass();
			case JnarioPackage.JNARIO_MEMBER: return createJnarioMember();
			case JnarioPackage.JNARIO_FUNCTION: return createJnarioFunction();
			case JnarioPackage.JNARIO_FIELD: return createJnarioField();
			case JnarioPackage.JNARIO_TYPE_DECLARATION: return createJnarioTypeDeclaration();
			case JnarioPackage.JNARIO_ANNOTATION_TARGET: return createJnarioAnnotationTarget();
			case JnarioPackage.JNARIO_PARAMETER: return createJnarioParameter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleTable createExampleTable() {
		ExampleTableImpl exampleTable = new ExampleTableImpl();
		return exampleTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleRow createExampleRow() {
		ExampleRowImpl exampleRow = new ExampleRowImpl();
		return exampleRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assertion createAssertion() {
		AssertionImpl assertion = new AssertionImpl();
		return assertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleColumn createExampleColumn() {
		ExampleColumnImpl exampleColumn = new ExampleColumnImpl();
		return exampleColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Should createShould() {
		ShouldImpl should = new ShouldImpl();
		return should;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShouldThrow createShouldThrow() {
		ShouldThrowImpl shouldThrow = new ShouldThrowImpl();
		return shouldThrow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification createSpecification() {
		SpecificationImpl specification = new SpecificationImpl();
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MockLiteral createMockLiteral() {
		MockLiteralImpl mockLiteral = new MockLiteralImpl();
		return mockLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleCell createExampleCell() {
		ExampleCellImpl exampleCell = new ExampleCellImpl();
		return exampleCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JnarioFile createJnarioFile() {
		JnarioFileImpl jnarioFile = new JnarioFileImpl();
		return jnarioFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JnarioClass createJnarioClass() {
		JnarioClassImpl jnarioClass = new JnarioClassImpl();
		return jnarioClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JnarioMember createJnarioMember() {
		JnarioMemberImpl jnarioMember = new JnarioMemberImpl();
		return jnarioMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JnarioFunction createJnarioFunction() {
		JnarioFunctionImpl jnarioFunction = new JnarioFunctionImpl();
		return jnarioFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JnarioField createJnarioField() {
		JnarioFieldImpl jnarioField = new JnarioFieldImpl();
		return jnarioField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JnarioTypeDeclaration createJnarioTypeDeclaration() {
		JnarioTypeDeclarationImpl jnarioTypeDeclaration = new JnarioTypeDeclarationImpl();
		return jnarioTypeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JnarioAnnotationTarget createJnarioAnnotationTarget() {
		JnarioAnnotationTargetImpl jnarioAnnotationTarget = new JnarioAnnotationTargetImpl();
		return jnarioAnnotationTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JnarioParameter createJnarioParameter() {
		JnarioParameterImpl jnarioParameter = new JnarioParameterImpl();
		return jnarioParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JnarioPackage getJnarioPackage() {
		return (JnarioPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JnarioPackage getPackage() {
		return JnarioPackage.eINSTANCE;
	}

} //JnarioFactoryImpl
