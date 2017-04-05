/**
 */
package org.jnario.xbase.richstring.xbasewithrichstring.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XForLoopExpression;
import org.eclipse.xtext.xbase.XStringLiteral;

import org.jnario.xbase.richstring.xbasewithrichstring.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.jnario.xbase.richstring.xbasewithrichstring.XbaseWithRichstringPackage
 * @generated
 */
public class XbaseWithRichstringAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XbaseWithRichstringPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XbaseWithRichstringAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = XbaseWithRichstringPackage.eINSTANCE;
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
	protected XbaseWithRichstringSwitch<Adapter> modelSwitch =
		new XbaseWithRichstringSwitch<Adapter>() {
			@Override
			public Adapter caseRichString(RichString object) {
				return createRichStringAdapter();
			}
			@Override
			public Adapter caseRichStringLiteral(RichStringLiteral object) {
				return createRichStringLiteralAdapter();
			}
			@Override
			public Adapter caseRichStringForLoop(RichStringForLoop object) {
				return createRichStringForLoopAdapter();
			}
			@Override
			public Adapter caseRichStringIf(RichStringIf object) {
				return createRichStringIfAdapter();
			}
			@Override
			public Adapter caseRichStringElseIf(RichStringElseIf object) {
				return createRichStringElseIfAdapter();
			}
			@Override
			public Adapter caseXExpression(XExpression object) {
				return createXExpressionAdapter();
			}
			@Override
			public Adapter caseXBlockExpression(XBlockExpression object) {
				return createXBlockExpressionAdapter();
			}
			@Override
			public Adapter caseXStringLiteral(XStringLiteral object) {
				return createXStringLiteralAdapter();
			}
			@Override
			public Adapter caseXForLoopExpression(XForLoopExpression object) {
				return createXForLoopExpressionAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.jnario.xbase.richstring.xbasewithrichstring.RichString <em>Rich String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.xbase.richstring.xbasewithrichstring.RichString
	 * @generated
	 */
	public Adapter createRichStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.xbase.richstring.xbasewithrichstring.RichStringLiteral <em>Rich String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.xbase.richstring.xbasewithrichstring.RichStringLiteral
	 * @generated
	 */
	public Adapter createRichStringLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.xbase.richstring.xbasewithrichstring.RichStringForLoop <em>Rich String For Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.xbase.richstring.xbasewithrichstring.RichStringForLoop
	 * @generated
	 */
	public Adapter createRichStringForLoopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.xbase.richstring.xbasewithrichstring.RichStringIf <em>Rich String If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.xbase.richstring.xbasewithrichstring.RichStringIf
	 * @generated
	 */
	public Adapter createRichStringIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnario.xbase.richstring.xbasewithrichstring.RichStringElseIf <em>Rich String Else If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnario.xbase.richstring.xbasewithrichstring.RichStringElseIf
	 * @generated
	 */
	public Adapter createRichStringElseIfAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xbase.XBlockExpression <em>XBlock Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xbase.XBlockExpression
	 * @generated
	 */
	public Adapter createXBlockExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xbase.XStringLiteral <em>XString Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xbase.XStringLiteral
	 * @generated
	 */
	public Adapter createXStringLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xbase.XForLoopExpression <em>XFor Loop Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xbase.XForLoopExpression
	 * @generated
	 */
	public Adapter createXForLoopExpressionAdapter() {
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

} //XbaseWithRichstringAdapterFactory
