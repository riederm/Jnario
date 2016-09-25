/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.spec.spec.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.jnario.Executable;
import org.jnario.JnarioAnnotationTarget;
import org.jnario.JnarioClass;
import org.jnario.JnarioFile;
import org.jnario.JnarioFunction;
import org.jnario.JnarioMember;
import org.jnario.JnarioTypeDeclaration;
import org.jnario.Specification;

import org.jnario.spec.spec.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.jnario.spec.spec.SpecPackage
 * @generated
 */
public class SpecAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SpecPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = SpecPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecSwitch<Adapter> modelSwitch =
		new SpecSwitch<Adapter>()
		{
			@Override
			public Adapter caseSpecFile(SpecFile object)
			{
				return createSpecFileAdapter();
			}
			@Override
			public Adapter caseExampleGroup(ExampleGroup object)
			{
				return createExampleGroupAdapter();
			}
			@Override
			public Adapter caseExample(Example object)
			{
				return createExampleAdapter();
			}
			@Override
			public Adapter caseBefore(Before object)
			{
				return createBeforeAdapter();
			}
			@Override
			public Adapter caseAfter(After object)
			{
				return createAfterAdapter();
			}
			@Override
			public Adapter caseTestFunction(TestFunction object)
			{
				return createTestFunctionAdapter();
			}
			@Override
			public Adapter caseJnarioFile(JnarioFile object)
			{
				return createJnarioFileAdapter();
			}
			@Override
			public Adapter caseExecutable(Executable object)
			{
				return createExecutableAdapter();
			}
			@Override
			public Adapter caseJnarioAnnotationTarget(JnarioAnnotationTarget object)
			{
				return createJnarioAnnotationTargetAdapter();
			}
			@Override
			public Adapter caseJnarioMember(JnarioMember object)
			{
				return createJnarioMemberAdapter();
			}
			@Override
			public Adapter caseJnarioTypeDeclaration(JnarioTypeDeclaration object)
			{
				return createJnarioTypeDeclarationAdapter();
			}
			@Override
			public Adapter caseJnarioClass(JnarioClass object)
			{
				return createJnarioClassAdapter();
			}
			@Override
			public Adapter caseSpecification(Specification object)
			{
				return createSpecificationAdapter();
			}
			@Override
			public Adapter caseJnarioFunction(JnarioFunction object)
			{
				return createJnarioFunctionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object)
			{
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.spec.spec.SpecFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.spec.spec.SpecFile
	 * @generated
	 */
	public Adapter createSpecFileAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.spec.spec.ExampleGroup <em>Example Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.spec.spec.ExampleGroup
	 * @generated
	 */
	public Adapter createExampleGroupAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.spec.spec.Example <em>Example</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.spec.spec.Example
	 * @generated
	 */
	public Adapter createExampleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.spec.spec.Before <em>Before</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.spec.spec.Before
	 * @generated
	 */
	public Adapter createBeforeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.spec.spec.After <em>After</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.spec.spec.After
	 * @generated
	 */
	public Adapter createAfterAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.spec.spec.TestFunction <em>Test Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.spec.spec.TestFunction
	 * @generated
	 */
	public Adapter createTestFunctionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.JnarioFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.JnarioFile
	 * @generated
	 */
	public Adapter createJnarioFileAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.Executable <em>Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.Executable
	 * @generated
	 */
	public Adapter createExecutableAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.JnarioAnnotationTarget <em>Annotation Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.JnarioAnnotationTarget
	 * @generated
	 */
	public Adapter createJnarioAnnotationTargetAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.JnarioMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.JnarioMember
	 * @generated
	 */
	public Adapter createJnarioMemberAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.JnarioTypeDeclaration <em>Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.JnarioTypeDeclaration
	 * @generated
	 */
	public Adapter createJnarioTypeDeclarationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.JnarioClass <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.JnarioClass
	 * @generated
	 */
	public Adapter createJnarioClassAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.Specification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.Specification
	 * @generated
	 */
	public Adapter createSpecificationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.JnarioFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.JnarioFunction
	 * @generated
	 */
	public Adapter createJnarioFunctionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //SpecAdapterFactory
