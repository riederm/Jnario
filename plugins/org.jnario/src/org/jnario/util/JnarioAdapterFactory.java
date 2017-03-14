/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jnario.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XStringLiteral;
import org.eclipse.xtext.xbase.XTypeLiteral;
import org.jnario.*;
import org.jnario.Assertion;
import org.jnario.ExampleColumn;
import org.jnario.ExampleRow;
import org.jnario.ExampleTable;
import org.jnario.Executable;
import org.jnario.JnarioPackage;
import org.jnario.MockLiteral;
import org.jnario.Should;
import org.jnario.ShouldThrow;
import org.jnario.Specification;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.jnario.JnarioPackage
 * @generated
 */
public class JnarioAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JnarioPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JnarioAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = JnarioPackage.eINSTANCE;
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
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
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
	protected JnarioSwitch<Adapter> modelSwitch =
		new JnarioSwitch<Adapter>() {
			@Override
			public Adapter caseExampleTable(ExampleTable object) {
				return createExampleTableAdapter();
			}
			@Override
			public Adapter caseExampleRow(ExampleRow object) {
				return createExampleRowAdapter();
			}
			@Override
			public Adapter caseAssertion(Assertion object) {
				return createAssertionAdapter();
			}
			@Override
			public Adapter caseExampleColumn(ExampleColumn object) {
				return createExampleColumnAdapter();
			}
			@Override
			public Adapter caseShould(Should object) {
				return createShouldAdapter();
			}
			@Override
			public Adapter caseShouldThrow(ShouldThrow object) {
				return createShouldThrowAdapter();
			}
			@Override
			public Adapter caseSpecification(Specification object) {
				return createSpecificationAdapter();
			}
			@Override
			public Adapter caseExecutable(Executable object) {
				return createExecutableAdapter();
			}
			@Override
			public Adapter caseMockLiteral(MockLiteral object) {
				return createMockLiteralAdapter();
			}
			@Override
			public Adapter caseExampleCell(ExampleCell object) {
				return createExampleCellAdapter();
			}
			@Override
			public Adapter caseJnarioFile(JnarioFile object) {
				return createJnarioFileAdapter();
			}
			@Override
			public Adapter caseJnarioClass(JnarioClass object) {
				return createJnarioClassAdapter();
			}
			@Override
			public Adapter caseJnarioMember(JnarioMember object) {
				return createJnarioMemberAdapter();
			}
			@Override
			public Adapter caseJnarioFunction(JnarioFunction object) {
				return createJnarioFunctionAdapter();
			}
			@Override
			public Adapter caseJnarioField(JnarioField object) {
				return createJnarioFieldAdapter();
			}
			@Override
			public Adapter caseJnarioTypeDeclaration(JnarioTypeDeclaration object) {
				return createJnarioTypeDeclarationAdapter();
			}
			@Override
			public Adapter caseJnarioAnnotationTarget(JnarioAnnotationTarget object) {
				return createJnarioAnnotationTargetAdapter();
			}
			@Override
			public Adapter caseJnarioParameter(JnarioParameter object) {
				return createJnarioParameterAdapter();
			}
			@Override
			public Adapter caseXExpression(XExpression object) {
				return createXExpressionAdapter();
			}
			@Override
			public Adapter caseXAbstractFeatureCall(XAbstractFeatureCall object) {
				return createXAbstractFeatureCallAdapter();
			}
			@Override
			public Adapter caseXBinaryOperation(XBinaryOperation object) {
				return createXBinaryOperationAdapter();
			}
			@Override
			public Adapter caseXTypeLiteral(XTypeLiteral object) {
				return createXTypeLiteralAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
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
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.ExampleTable <em>Example Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.ExampleTable
	 * @generated
	 */
	public Adapter createExampleTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.ExampleRow <em>Example Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.ExampleRow
	 * @generated
	 */
	public Adapter createExampleRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.Assertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.Assertion
	 * @generated
	 */
	public Adapter createAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.ExampleColumn <em>Example Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.ExampleColumn
	 * @generated
	 */
	public Adapter createExampleColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.Should <em>Should</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.Should
	 * @generated
	 */
	public Adapter createShouldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.ShouldThrow <em>Should Throw</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.ShouldThrow
	 * @generated
	 */
	public Adapter createShouldThrowAdapter() {
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
	public Adapter createSpecificationAdapter() {
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
	public Adapter createExecutableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.MockLiteral <em>Mock Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.MockLiteral
	 * @generated
	 */
	public Adapter createMockLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.ExampleCell <em>Example Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.ExampleCell
	 * @generated
	 */
	public Adapter createExampleCellAdapter() {
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
	public Adapter createJnarioFileAdapter() {
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
	public Adapter createJnarioClassAdapter() {
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
	public Adapter createJnarioMemberAdapter() {
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
	public Adapter createJnarioFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.JnarioField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.JnarioField
	 * @generated
	 */
	public Adapter createJnarioFieldAdapter() {
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
	public Adapter createJnarioTypeDeclarationAdapter() {
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
	public Adapter createJnarioAnnotationTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.JnarioParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.JnarioParameter
	 * @generated
	 */
	public Adapter createJnarioParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xbase.XExpression <em>XExpression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xbase.XExpression
	 * @generated
	 */
	public Adapter createXExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xbase.XAbstractFeatureCall <em>XAbstract Feature Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xbase.XAbstractFeatureCall
	 * @generated
	 */
	public Adapter createXAbstractFeatureCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xbase.XBinaryOperation <em>XBinary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xbase.XBinaryOperation
	 * @generated
	 */
	public Adapter createXBinaryOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xbase.XTypeLiteral <em>XType Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xbase.XTypeLiteral
	 * @generated
	 */
	public Adapter createXTypeLiteralAdapter() {
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
	public Adapter createEObjectAdapter() {
		return null;
	}

} //JnarioAdapterFactory
