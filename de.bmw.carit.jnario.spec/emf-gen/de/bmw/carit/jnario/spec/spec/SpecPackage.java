/**
 * <copyright>
 * </copyright>
 *
 */
package de.bmw.carit.jnario.spec.spec;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.xtext.xtend2.xtend2.Xtend2Package;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.bmw.carit.jnario.spec.spec.SpecFactory
 * @model kind="package"
 * @generated
 */
public interface SpecPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "spec";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.bmw.de/carit/jnario/spec/Spec";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "spec";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpecPackage eINSTANCE = de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.bmw.carit.jnario.spec.spec.impl.SpecFileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bmw.carit.jnario.spec.spec.impl.SpecFileImpl
	 * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getSpecFile()
	 * @generated
	 */
	int SPEC_FILE = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_FILE__IMPORTS = Xtend2Package.XTEND_FILE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Xtend Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_FILE__XTEND_CLASS = Xtend2Package.XTEND_FILE__XTEND_CLASS;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_FILE__PACKAGE = Xtend2Package.XTEND_FILE__PACKAGE;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_FILE_FEATURE_COUNT = Xtend2Package.XTEND_FILE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.bmw.carit.jnario.spec.spec.impl.ExampleGroupImpl <em>Example Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bmw.carit.jnario.spec.spec.impl.ExampleGroupImpl
	 * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getExampleGroup()
	 * @generated
	 */
	int EXAMPLE_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_GROUP__ANNOTATIONS = Xtend2Package.XTEND_CLASS__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_GROUP__NAME = Xtend2Package.XTEND_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_GROUP__EXTENDS = Xtend2Package.XTEND_CLASS__EXTENDS;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_GROUP__IMPLEMENTS = Xtend2Package.XTEND_CLASS__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_GROUP__SUPER_TYPES = Xtend2Package.XTEND_CLASS__SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_GROUP__MEMBERS = Xtend2Package.XTEND_CLASS__MEMBERS;

	/**
	 * The feature id for the '<em><b>Super Call Referable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_GROUP__SUPER_CALL_REFERABLE = Xtend2Package.XTEND_CLASS__SUPER_CALL_REFERABLE;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_GROUP__TYPE_PARAMETERS = Xtend2Package.XTEND_CLASS__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_GROUP__ANNOTATION_INFO = Xtend2Package.XTEND_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Preamble</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_GROUP__PREAMBLE = Xtend2Package.XTEND_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_GROUP__TARGET_TYPE = Xtend2Package.XTEND_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_GROUP__TARGET_OPERATION = Xtend2Package.XTEND_CLASS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Example Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_GROUP_FEATURE_COUNT = Xtend2Package.XTEND_CLASS_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.bmw.carit.jnario.spec.spec.impl.ExampleImpl <em>Example</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bmw.carit.jnario.spec.spec.impl.ExampleImpl
	 * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getExample()
	 * @generated
	 */
	int EXAMPLE = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__ANNOTATIONS = Xtend2Package.XTEND_MEMBER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__ANNOTATION_INFO = Xtend2Package.XTEND_MEMBER__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Preamble</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__PREAMBLE = Xtend2Package.XTEND_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__EXCEPTION = Xtend2Package.XTEND_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__NAME = Xtend2Package.XTEND_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__BODY = Xtend2Package.XTEND_MEMBER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Example</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_FEATURE_COUNT = Xtend2Package.XTEND_MEMBER_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.bmw.carit.jnario.spec.spec.impl.ExampleTableImpl <em>Example Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bmw.carit.jnario.spec.spec.impl.ExampleTableImpl
	 * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getExampleTable()
	 * @generated
	 */
	int EXAMPLE_TABLE = 3;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TABLE__ANNOTATIONS = Xtend2Package.XTEND_MEMBER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TABLE__ANNOTATION_INFO = Xtend2Package.XTEND_MEMBER__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TABLE__HEADING = Xtend2Package.XTEND_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TABLE__ROWS = Xtend2Package.XTEND_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TABLE__NAME = Xtend2Package.XTEND_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Example Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TABLE_FEATURE_COUNT = Xtend2Package.XTEND_MEMBER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.bmw.carit.jnario.spec.spec.impl.ExampleHeadingImpl <em>Example Heading</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bmw.carit.jnario.spec.spec.impl.ExampleHeadingImpl
	 * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getExampleHeading()
	 * @generated
	 */
	int EXAMPLE_HEADING = 4;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_HEADING__TABLE = 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_HEADING__VALUES = 1;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_HEADING__CELLS = 2;

	/**
	 * The number of structural features of the '<em>Example Heading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_HEADING_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.bmw.carit.jnario.spec.spec.impl.ExampleRowImpl <em>Example Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bmw.carit.jnario.spec.spec.impl.ExampleRowImpl
	 * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getExampleRow()
	 * @generated
	 */
	int EXAMPLE_ROW = 5;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_ROW__TABLE = 0;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_ROW__CELLS = 1;

	/**
	 * The number of structural features of the '<em>Example Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_ROW_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link de.bmw.carit.jnario.spec.spec.SpecFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see de.bmw.carit.jnario.spec.spec.SpecFile
	 * @generated
	 */
	EClass getSpecFile();

	/**
	 * Returns the meta object for class '{@link de.bmw.carit.jnario.spec.spec.ExampleGroup <em>Example Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example Group</em>'.
	 * @see de.bmw.carit.jnario.spec.spec.ExampleGroup
	 * @generated
	 */
	EClass getExampleGroup();

	/**
	 * Returns the meta object for the attribute '{@link de.bmw.carit.jnario.spec.spec.ExampleGroup#getPreamble <em>Preamble</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preamble</em>'.
	 * @see de.bmw.carit.jnario.spec.spec.ExampleGroup#getPreamble()
	 * @see #getExampleGroup()
	 * @generated
	 */
	EAttribute getExampleGroup_Preamble();

	/**
	 * Returns the meta object for the reference '{@link de.bmw.carit.jnario.spec.spec.ExampleGroup#getTargetType <em>Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Type</em>'.
	 * @see de.bmw.carit.jnario.spec.spec.ExampleGroup#getTargetType()
	 * @see #getExampleGroup()
	 * @generated
	 */
	EReference getExampleGroup_TargetType();

	/**
	 * Returns the meta object for the reference '{@link de.bmw.carit.jnario.spec.spec.ExampleGroup#getTargetOperation <em>Target Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Operation</em>'.
	 * @see de.bmw.carit.jnario.spec.spec.ExampleGroup#getTargetOperation()
	 * @see #getExampleGroup()
	 * @generated
	 */
	EReference getExampleGroup_TargetOperation();

	/**
	 * Returns the meta object for class '{@link de.bmw.carit.jnario.spec.spec.Example <em>Example</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example</em>'.
	 * @see de.bmw.carit.jnario.spec.spec.Example
	 * @generated
	 */
	EClass getExample();

	/**
	 * Returns the meta object for the attribute '{@link de.bmw.carit.jnario.spec.spec.Example#getPreamble <em>Preamble</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preamble</em>'.
	 * @see de.bmw.carit.jnario.spec.spec.Example#getPreamble()
	 * @see #getExample()
	 * @generated
	 */
	EAttribute getExample_Preamble();

	/**
	 * Returns the meta object for the reference '{@link de.bmw.carit.jnario.spec.spec.Example#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exception</em>'.
	 * @see de.bmw.carit.jnario.spec.spec.Example#getException()
	 * @see #getExample()
	 * @generated
	 */
	EReference getExample_Exception();

	/**
	 * Returns the meta object for the attribute '{@link de.bmw.carit.jnario.spec.spec.Example#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.bmw.carit.jnario.spec.spec.Example#getName()
	 * @see #getExample()
	 * @generated
	 */
	EAttribute getExample_Name();

	/**
	 * Returns the meta object for the containment reference '{@link de.bmw.carit.jnario.spec.spec.Example#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see de.bmw.carit.jnario.spec.spec.Example#getBody()
	 * @see #getExample()
	 * @generated
	 */
	EReference getExample_Body();

	/**
	 * Returns the meta object for class '{@link de.bmw.carit.jnario.spec.spec.ExampleTable <em>Example Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example Table</em>'.
	 * @see de.bmw.carit.jnario.spec.spec.ExampleTable
	 * @generated
	 */
	EClass getExampleTable();

	/**
	 * Returns the meta object for the containment reference '{@link de.bmw.carit.jnario.spec.spec.ExampleTable#getHeading <em>Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Heading</em>'.
	 * @see de.bmw.carit.jnario.spec.spec.ExampleTable#getHeading()
	 * @see #getExampleTable()
	 * @generated
	 */
	EReference getExampleTable_Heading();

	/**
	 * Returns the meta object for the containment reference list '{@link de.bmw.carit.jnario.spec.spec.ExampleTable#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see de.bmw.carit.jnario.spec.spec.ExampleTable#getRows()
	 * @see #getExampleTable()
	 * @generated
	 */
	EReference getExampleTable_Rows();

	/**
	 * Returns the meta object for the attribute '{@link de.bmw.carit.jnario.spec.spec.ExampleTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.bmw.carit.jnario.spec.spec.ExampleTable#getName()
	 * @see #getExampleTable()
	 * @generated
	 */
	EAttribute getExampleTable_Name();

	/**
	 * Returns the meta object for class '{@link de.bmw.carit.jnario.spec.spec.ExampleHeading <em>Example Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example Heading</em>'.
	 * @see de.bmw.carit.jnario.spec.spec.ExampleHeading
	 * @generated
	 */
	EClass getExampleHeading();

	/**
	 * Returns the meta object for the container reference '{@link de.bmw.carit.jnario.spec.spec.ExampleHeading#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Table</em>'.
	 * @see de.bmw.carit.jnario.spec.spec.ExampleHeading#getTable()
	 * @see #getExampleHeading()
	 * @generated
	 */
	EReference getExampleHeading_Table();

	/**
	 * Returns the meta object for the reference list '{@link de.bmw.carit.jnario.spec.spec.ExampleHeading#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Values</em>'.
	 * @see de.bmw.carit.jnario.spec.spec.ExampleHeading#getValues()
	 * @see #getExampleHeading()
	 * @generated
	 */
	EReference getExampleHeading_Values();

	/**
	 * Returns the meta object for the containment reference list '{@link de.bmw.carit.jnario.spec.spec.ExampleHeading#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cells</em>'.
	 * @see de.bmw.carit.jnario.spec.spec.ExampleHeading#getCells()
	 * @see #getExampleHeading()
	 * @generated
	 */
	EReference getExampleHeading_Cells();

	/**
	 * Returns the meta object for class '{@link de.bmw.carit.jnario.spec.spec.ExampleRow <em>Example Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example Row</em>'.
	 * @see de.bmw.carit.jnario.spec.spec.ExampleRow
	 * @generated
	 */
	EClass getExampleRow();

	/**
	 * Returns the meta object for the container reference '{@link de.bmw.carit.jnario.spec.spec.ExampleRow#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Table</em>'.
	 * @see de.bmw.carit.jnario.spec.spec.ExampleRow#getTable()
	 * @see #getExampleRow()
	 * @generated
	 */
	EReference getExampleRow_Table();

	/**
	 * Returns the meta object for the containment reference list '{@link de.bmw.carit.jnario.spec.spec.ExampleRow#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cells</em>'.
	 * @see de.bmw.carit.jnario.spec.spec.ExampleRow#getCells()
	 * @see #getExampleRow()
	 * @generated
	 */
	EReference getExampleRow_Cells();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SpecFactory getSpecFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link de.bmw.carit.jnario.spec.spec.impl.SpecFileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bmw.carit.jnario.spec.spec.impl.SpecFileImpl
		 * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getSpecFile()
		 * @generated
		 */
		EClass SPEC_FILE = eINSTANCE.getSpecFile();

		/**
		 * The meta object literal for the '{@link de.bmw.carit.jnario.spec.spec.impl.ExampleGroupImpl <em>Example Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bmw.carit.jnario.spec.spec.impl.ExampleGroupImpl
		 * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getExampleGroup()
		 * @generated
		 */
		EClass EXAMPLE_GROUP = eINSTANCE.getExampleGroup();

		/**
		 * The meta object literal for the '<em><b>Preamble</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLE_GROUP__PREAMBLE = eINSTANCE.getExampleGroup_Preamble();

		/**
		 * The meta object literal for the '<em><b>Target Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_GROUP__TARGET_TYPE = eINSTANCE.getExampleGroup_TargetType();

		/**
		 * The meta object literal for the '<em><b>Target Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_GROUP__TARGET_OPERATION = eINSTANCE.getExampleGroup_TargetOperation();

		/**
		 * The meta object literal for the '{@link de.bmw.carit.jnario.spec.spec.impl.ExampleImpl <em>Example</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bmw.carit.jnario.spec.spec.impl.ExampleImpl
		 * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getExample()
		 * @generated
		 */
		EClass EXAMPLE = eINSTANCE.getExample();

		/**
		 * The meta object literal for the '<em><b>Preamble</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLE__PREAMBLE = eINSTANCE.getExample_Preamble();

		/**
		 * The meta object literal for the '<em><b>Exception</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE__EXCEPTION = eINSTANCE.getExample_Exception();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLE__NAME = eINSTANCE.getExample_Name();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE__BODY = eINSTANCE.getExample_Body();

		/**
		 * The meta object literal for the '{@link de.bmw.carit.jnario.spec.spec.impl.ExampleTableImpl <em>Example Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bmw.carit.jnario.spec.spec.impl.ExampleTableImpl
		 * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getExampleTable()
		 * @generated
		 */
		EClass EXAMPLE_TABLE = eINSTANCE.getExampleTable();

		/**
		 * The meta object literal for the '<em><b>Heading</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_TABLE__HEADING = eINSTANCE.getExampleTable_Heading();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_TABLE__ROWS = eINSTANCE.getExampleTable_Rows();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLE_TABLE__NAME = eINSTANCE.getExampleTable_Name();

		/**
		 * The meta object literal for the '{@link de.bmw.carit.jnario.spec.spec.impl.ExampleHeadingImpl <em>Example Heading</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bmw.carit.jnario.spec.spec.impl.ExampleHeadingImpl
		 * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getExampleHeading()
		 * @generated
		 */
		EClass EXAMPLE_HEADING = eINSTANCE.getExampleHeading();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_HEADING__TABLE = eINSTANCE.getExampleHeading_Table();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_HEADING__VALUES = eINSTANCE.getExampleHeading_Values();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_HEADING__CELLS = eINSTANCE.getExampleHeading_Cells();

		/**
		 * The meta object literal for the '{@link de.bmw.carit.jnario.spec.spec.impl.ExampleRowImpl <em>Example Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bmw.carit.jnario.spec.spec.impl.ExampleRowImpl
		 * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getExampleRow()
		 * @generated
		 */
		EClass EXAMPLE_ROW = eINSTANCE.getExampleRow();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_ROW__TABLE = eINSTANCE.getExampleRow_Table();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_ROW__CELLS = eINSTANCE.getExampleRow_Cells();

	}

} //SpecPackage