/**
 */
package org.jnario.xbase.richstring.xbasewithrichstring.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.jnario.xbase.richstring.xbasewithrichstring.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XbaseWithRichstringFactoryImpl extends EFactoryImpl implements XbaseWithRichstringFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XbaseWithRichstringFactory init() {
		try {
			XbaseWithRichstringFactory theXbaseWithRichstringFactory = (XbaseWithRichstringFactory)EPackage.Registry.INSTANCE.getEFactory(XbaseWithRichstringPackage.eNS_URI);
			if (theXbaseWithRichstringFactory != null) {
				return theXbaseWithRichstringFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XbaseWithRichstringFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XbaseWithRichstringFactoryImpl() {
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
			case XbaseWithRichstringPackage.RICH_STRING: return createRichString();
			case XbaseWithRichstringPackage.RICH_STRING_LITERAL: return createRichStringLiteral();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichString createRichString() {
		RichStringImpl richString = new RichStringImpl();
		return richString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringLiteral createRichStringLiteral() {
		RichStringLiteralImpl richStringLiteral = new RichStringLiteralImpl();
		return richStringLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XbaseWithRichstringPackage getXbaseWithRichstringPackage() {
		return (XbaseWithRichstringPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XbaseWithRichstringPackage getPackage() {
		return XbaseWithRichstringPackage.eINSTANCE;
	}

} //XbaseWithRichstringFactoryImpl
