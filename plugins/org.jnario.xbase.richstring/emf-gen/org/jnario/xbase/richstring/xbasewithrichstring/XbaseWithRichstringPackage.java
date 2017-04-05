/**
 */
package org.jnario.xbase.richstring.xbasewithrichstring;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.xbase.XbasePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.jnario.xbase.richstring.xbasewithrichstring.XbaseWithRichstringFactory
 * @model kind="package"
 * @generated
 */
public interface XbaseWithRichstringPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xbasewithrichstring";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/xbase/RichString";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xbrs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XbaseWithRichstringPackage eINSTANCE = org.jnario.xbase.richstring.xbasewithrichstring.impl.XbaseWithRichstringPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.jnario.xbase.richstring.xbasewithrichstring.impl.RichStringImpl <em>Rich String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.xbase.richstring.xbasewithrichstring.impl.RichStringImpl
	 * @see org.jnario.xbase.richstring.xbasewithrichstring.impl.XbaseWithRichstringPackageImpl#getRichString()
	 * @generated
	 */
	int RICH_STRING = 0;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING__EXPRESSIONS = XbasePackage.XBLOCK_EXPRESSION__EXPRESSIONS;

	/**
	 * The number of structural features of the '<em>Rich String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_FEATURE_COUNT = XbasePackage.XBLOCK_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jnario.xbase.richstring.xbasewithrichstring.impl.RichStringLiteralImpl <em>Rich String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.xbase.richstring.xbasewithrichstring.impl.RichStringLiteralImpl
	 * @see org.jnario.xbase.richstring.xbasewithrichstring.impl.XbaseWithRichstringPackageImpl#getRichStringLiteral()
	 * @generated
	 */
	int RICH_STRING_LITERAL = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_LITERAL__VALUE = XbasePackage.XSTRING_LITERAL__VALUE;

	/**
	 * The number of structural features of the '<em>Rich String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_LITERAL_FEATURE_COUNT = XbasePackage.XSTRING_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jnario.xbase.richstring.xbasewithrichstring.impl.RichStringForLoopImpl <em>Rich String For Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.xbase.richstring.xbasewithrichstring.impl.RichStringForLoopImpl
	 * @see org.jnario.xbase.richstring.xbasewithrichstring.impl.XbaseWithRichstringPackageImpl#getRichStringForLoop()
	 * @generated
	 */
	int RICH_STRING_FOR_LOOP = 2;

	/**
	 * The feature id for the '<em><b>For Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_FOR_LOOP__FOR_EXPRESSION = XbasePackage.XFOR_LOOP_EXPRESSION__FOR_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Each Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_FOR_LOOP__EACH_EXPRESSION = XbasePackage.XFOR_LOOP_EXPRESSION__EACH_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Declared Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_FOR_LOOP__DECLARED_PARAM = XbasePackage.XFOR_LOOP_EXPRESSION__DECLARED_PARAM;

	/**
	 * The feature id for the '<em><b>Separator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_FOR_LOOP__SEPARATOR = XbasePackage.XFOR_LOOP_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Before</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_FOR_LOOP__BEFORE = XbasePackage.XFOR_LOOP_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>After</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_FOR_LOOP__AFTER = XbasePackage.XFOR_LOOP_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rich String For Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_FOR_LOOP_FEATURE_COUNT = XbasePackage.XFOR_LOOP_EXPRESSION_FEATURE_COUNT + 3;


	/**
	 * The meta object id for the '{@link org.jnario.xbase.richstring.xbasewithrichstring.impl.RichStringIfImpl <em>Rich String If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.xbase.richstring.xbasewithrichstring.impl.RichStringIfImpl
	 * @see org.jnario.xbase.richstring.xbasewithrichstring.impl.XbaseWithRichstringPackageImpl#getRichStringIf()
	 * @generated
	 */
	int RICH_STRING_IF = 3;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_IF__IF = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_IF__THEN = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Ifs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_IF__ELSE_IFS = XbasePackage.XEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_IF__ELSE = XbasePackage.XEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Rich String If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_IF_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 4;


	/**
	 * The meta object id for the '{@link org.jnario.xbase.richstring.xbasewithrichstring.impl.RichStringElseIfImpl <em>Rich String Else If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.xbase.richstring.xbasewithrichstring.impl.RichStringElseIfImpl
	 * @see org.jnario.xbase.richstring.xbasewithrichstring.impl.XbaseWithRichstringPackageImpl#getRichStringElseIf()
	 * @generated
	 */
	int RICH_STRING_ELSE_IF = 4;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_ELSE_IF__IF = 0;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_ELSE_IF__THEN = 1;

	/**
	 * The number of structural features of the '<em>Rich String Else If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_ELSE_IF_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rich String Else If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_ELSE_IF_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.jnario.xbase.richstring.xbasewithrichstring.RichString <em>Rich String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rich String</em>'.
	 * @see org.jnario.xbase.richstring.xbasewithrichstring.RichString
	 * @generated
	 */
	EClass getRichString();

	/**
	 * Returns the meta object for class '{@link org.jnario.xbase.richstring.xbasewithrichstring.RichStringLiteral <em>Rich String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rich String Literal</em>'.
	 * @see org.jnario.xbase.richstring.xbasewithrichstring.RichStringLiteral
	 * @generated
	 */
	EClass getRichStringLiteral();

	/**
	 * Returns the meta object for class '{@link org.jnario.xbase.richstring.xbasewithrichstring.RichStringForLoop <em>Rich String For Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rich String For Loop</em>'.
	 * @see org.jnario.xbase.richstring.xbasewithrichstring.RichStringForLoop
	 * @generated
	 */
	EClass getRichStringForLoop();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnario.xbase.richstring.xbasewithrichstring.RichStringForLoop#getSeparator <em>Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Separator</em>'.
	 * @see org.jnario.xbase.richstring.xbasewithrichstring.RichStringForLoop#getSeparator()
	 * @see #getRichStringForLoop()
	 * @generated
	 */
	EReference getRichStringForLoop_Separator();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnario.xbase.richstring.xbasewithrichstring.RichStringForLoop#getBefore <em>Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Before</em>'.
	 * @see org.jnario.xbase.richstring.xbasewithrichstring.RichStringForLoop#getBefore()
	 * @see #getRichStringForLoop()
	 * @generated
	 */
	EReference getRichStringForLoop_Before();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnario.xbase.richstring.xbasewithrichstring.RichStringForLoop#getAfter <em>After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>After</em>'.
	 * @see org.jnario.xbase.richstring.xbasewithrichstring.RichStringForLoop#getAfter()
	 * @see #getRichStringForLoop()
	 * @generated
	 */
	EReference getRichStringForLoop_After();

	/**
	 * Returns the meta object for class '{@link org.jnario.xbase.richstring.xbasewithrichstring.RichStringIf <em>Rich String If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rich String If</em>'.
	 * @see org.jnario.xbase.richstring.xbasewithrichstring.RichStringIf
	 * @generated
	 */
	EClass getRichStringIf();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnario.xbase.richstring.xbasewithrichstring.RichStringIf#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If</em>'.
	 * @see org.jnario.xbase.richstring.xbasewithrichstring.RichStringIf#getIf()
	 * @see #getRichStringIf()
	 * @generated
	 */
	EReference getRichStringIf_If();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnario.xbase.richstring.xbasewithrichstring.RichStringIf#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see org.jnario.xbase.richstring.xbasewithrichstring.RichStringIf#getThen()
	 * @see #getRichStringIf()
	 * @generated
	 */
	EReference getRichStringIf_Then();

	/**
	 * Returns the meta object for the containment reference list '{@link org.jnario.xbase.richstring.xbasewithrichstring.RichStringIf#getElseIfs <em>Else Ifs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Else Ifs</em>'.
	 * @see org.jnario.xbase.richstring.xbasewithrichstring.RichStringIf#getElseIfs()
	 * @see #getRichStringIf()
	 * @generated
	 */
	EReference getRichStringIf_ElseIfs();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnario.xbase.richstring.xbasewithrichstring.RichStringIf#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see org.jnario.xbase.richstring.xbasewithrichstring.RichStringIf#getElse()
	 * @see #getRichStringIf()
	 * @generated
	 */
	EReference getRichStringIf_Else();

	/**
	 * Returns the meta object for class '{@link org.jnario.xbase.richstring.xbasewithrichstring.RichStringElseIf <em>Rich String Else If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rich String Else If</em>'.
	 * @see org.jnario.xbase.richstring.xbasewithrichstring.RichStringElseIf
	 * @generated
	 */
	EClass getRichStringElseIf();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnario.xbase.richstring.xbasewithrichstring.RichStringElseIf#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If</em>'.
	 * @see org.jnario.xbase.richstring.xbasewithrichstring.RichStringElseIf#getIf()
	 * @see #getRichStringElseIf()
	 * @generated
	 */
	EReference getRichStringElseIf_If();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnario.xbase.richstring.xbasewithrichstring.RichStringElseIf#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see org.jnario.xbase.richstring.xbasewithrichstring.RichStringElseIf#getThen()
	 * @see #getRichStringElseIf()
	 * @generated
	 */
	EReference getRichStringElseIf_Then();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XbaseWithRichstringFactory getXbaseWithRichstringFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.jnario.xbase.richstring.xbasewithrichstring.impl.RichStringImpl <em>Rich String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.xbase.richstring.xbasewithrichstring.impl.RichStringImpl
		 * @see org.jnario.xbase.richstring.xbasewithrichstring.impl.XbaseWithRichstringPackageImpl#getRichString()
		 * @generated
		 */
		EClass RICH_STRING = eINSTANCE.getRichString();

		/**
		 * The meta object literal for the '{@link org.jnario.xbase.richstring.xbasewithrichstring.impl.RichStringLiteralImpl <em>Rich String Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.xbase.richstring.xbasewithrichstring.impl.RichStringLiteralImpl
		 * @see org.jnario.xbase.richstring.xbasewithrichstring.impl.XbaseWithRichstringPackageImpl#getRichStringLiteral()
		 * @generated
		 */
		EClass RICH_STRING_LITERAL = eINSTANCE.getRichStringLiteral();

		/**
		 * The meta object literal for the '{@link org.jnario.xbase.richstring.xbasewithrichstring.impl.RichStringForLoopImpl <em>Rich String For Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.xbase.richstring.xbasewithrichstring.impl.RichStringForLoopImpl
		 * @see org.jnario.xbase.richstring.xbasewithrichstring.impl.XbaseWithRichstringPackageImpl#getRichStringForLoop()
		 * @generated
		 */
		EClass RICH_STRING_FOR_LOOP = eINSTANCE.getRichStringForLoop();

		/**
		 * The meta object literal for the '<em><b>Separator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RICH_STRING_FOR_LOOP__SEPARATOR = eINSTANCE.getRichStringForLoop_Separator();

		/**
		 * The meta object literal for the '<em><b>Before</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RICH_STRING_FOR_LOOP__BEFORE = eINSTANCE.getRichStringForLoop_Before();

		/**
		 * The meta object literal for the '<em><b>After</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RICH_STRING_FOR_LOOP__AFTER = eINSTANCE.getRichStringForLoop_After();

		/**
		 * The meta object literal for the '{@link org.jnario.xbase.richstring.xbasewithrichstring.impl.RichStringIfImpl <em>Rich String If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.xbase.richstring.xbasewithrichstring.impl.RichStringIfImpl
		 * @see org.jnario.xbase.richstring.xbasewithrichstring.impl.XbaseWithRichstringPackageImpl#getRichStringIf()
		 * @generated
		 */
		EClass RICH_STRING_IF = eINSTANCE.getRichStringIf();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RICH_STRING_IF__IF = eINSTANCE.getRichStringIf_If();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RICH_STRING_IF__THEN = eINSTANCE.getRichStringIf_Then();

		/**
		 * The meta object literal for the '<em><b>Else Ifs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RICH_STRING_IF__ELSE_IFS = eINSTANCE.getRichStringIf_ElseIfs();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RICH_STRING_IF__ELSE = eINSTANCE.getRichStringIf_Else();

		/**
		 * The meta object literal for the '{@link org.jnario.xbase.richstring.xbasewithrichstring.impl.RichStringElseIfImpl <em>Rich String Else If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.xbase.richstring.xbasewithrichstring.impl.RichStringElseIfImpl
		 * @see org.jnario.xbase.richstring.xbasewithrichstring.impl.XbaseWithRichstringPackageImpl#getRichStringElseIf()
		 * @generated
		 */
		EClass RICH_STRING_ELSE_IF = eINSTANCE.getRichStringElseIf();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RICH_STRING_ELSE_IF__IF = eINSTANCE.getRichStringElseIf_If();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RICH_STRING_ELSE_IF__THEN = eINSTANCE.getRichStringElseIf_Then();

	}

} //XbaseWithRichstringPackage
