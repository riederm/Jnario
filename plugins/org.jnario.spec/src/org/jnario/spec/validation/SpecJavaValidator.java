/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.validation;

import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Maps.newHashMap;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ComposedChecks;
import org.eclipse.xtext.xbase.XExpression;
import org.jnario.Assertion;
import org.jnario.JnarioPackage;
import org.jnario.RichString;
import org.jnario.spec.naming.ExampleNameProvider;
import org.jnario.spec.spec.Example;
import org.jnario.spec.spec.ExampleGroup;
import org.jnario.validation.JnarioJavaValidator;

import com.google.inject.Inject;
 
/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("restriction")
@ComposedChecks(validators={JnarioJavaValidator.class})
public class SpecJavaValidator extends AbstractSpecJavaValidator {
	
	@Inject
	private ExampleNameProvider exampleNameProvider;
	
// TODO NO_XTEND
//	private SpecModifierValidator setupModifierValidator = new SpecModifierValidator(newArrayList("all"), this);

// TODO NO_XTEND
//	@Override
//	@Check
//	protected void checkModifiers(JnarioClass xtendClass) {
//		EObject eContainer = xtendClass.eContainer();
//		if (!(eContainer instanceof ExampleGroup)) {
//			super.checkModifiers(xtendClass);
//		}
//	}
//	
//	@Override
//	@Check
//	protected void checkModifiers(JnarioFunction xtendFunction) {
//		if ((xtendFunction instanceof Before) || (xtendFunction instanceof After)) {
//			setupModifierValidator.checkModifiers(xtendFunction, exampleNameProvider.toMethodName(xtendFunction));
//		}else{
//			super.checkModifiers(xtendFunction);
//		}
//	}
//	
//	@Check
//	public void checkClasses(JnarioFile file) {
//		//TODO this check should not be file local, but instead check for any other sources which might declare a
//		// java type with the same name. Also this then belongs to Xbase and should be defined on JvmDeclaredType
//		Set<String> names = newLinkedHashSet();
//		for (JnarioTypeDeclaration clazz : file.getXtendTypes()) {	
//			String name = exampleNameProvider.toJavaClassName(clazz);
//			if (!names.add(name))
//				error("The type "+clazz.getName()+" is already defined.", clazz, JnarioPackage.Literals.XTEND_TYPE_DECLARATION__NAME, -1, IssueCodes.DUPLICATE_TYPE_NAME);
//		}
//	}
//
//	@Check
//	public void checkClasses(ExampleGroup exampleGroup) {
//		checkClasses(filter(exampleGroup.getMembers(), JnarioClass.class));
//		if(exampleGroup.getTargetOperation() == null && exampleGroup.getName() == null && exampleGroup.getTargetType() == null){
//			error("Example groups must have a name", JnarioPackage.Literals.XTEND_TYPE_DECLARATION__NAME);
//		}
//	}
//	
//
//	protected void checkClasses(Iterable<JnarioClass> xtendClasses) {
//		Set<String> names = newLinkedHashSet();
//		for (JnarioClass clazz : xtendClasses) {	
//			String name = exampleNameProvider.toJavaClassName(clazz);
//			if (!names.add(name))
//				error("The spec '"+exampleNameProvider.describe((ExampleGroup) clazz)+"' is already defined.", clazz, JnarioPackage.Literals.XTEND_TYPE_DECLARATION__NAME, -1, IssueCodes.DUPLICATE_TYPE_NAME);
//		}
//	}
//	
//	
//	protected void error(String message, EObject source, EStructuralFeature feature, String code, String... issueData) {
//		if(issueData.length == 0){
//			super.error(message, source, feature, code, issueData);
//		}else if(!IssueCodes.DUPLICATE_METHOD.equals(issueData[0])){
//			super.error(message, source, feature, code, issueData);
//		}else if(!(source instanceof Example)){
//			super.error(message, source, feature, code, issueData);
//		}
//	}
//	
//	@Override
//	public void checkLocalUsageOfDeclaredFields(JnarioField field) {
//		if(!(field instanceof ExampleColumn)){
//			super.checkLocalUsageOfDeclaredFields(field);
//		}
//	}
//	
//	@Check
//	public void checkExamplesHaveNames(TestFunction example){
//		String methodName = exampleNameProvider.toMethodName(example);
//		if(isNullOrEmpty(methodName)){
//			error("Name must not be empty", JnarioPackage.Literals.XTEND_FUNCTION__NAME);
//		}
//	}
//	
//	protected void mustBeJavaStatementExpression(XExpression expr) {
//		// disabled as this is the case for example definitions
//	}
//	
//	@Override
//	protected void checkNoJavaKeyword(EObject obj, EAttribute attribute) {
//		if (obj instanceof ExampleGroup) {
//			return;
//		}
//		super.checkNoJavaKeyword(obj, attribute);
//	}
	
	
	
	
//	@Check
//	public void checkImports(JnarioFile file) {
//		final Map<JvmType, XImportDeclaration> imports = newHashMap();
//		final Map<JvmType, XImportDeclaration> staticImports = newHashMap();
//		final Map<String, JvmType> importedNames = newHashMap();
//		
//		for (XImportDeclaration imp : file.getImports()) {
//			if (imp.getImportedNamespace() != null) {
//				warning("The use of wildcard imports is deprecated.", imp, null, IssueCodes.IMPORT_WILDCARD_DEPRECATED);
//			} else {
//				JvmType importedType = imp.getImportedType();
//				if (importedType != null && !importedType.eIsProxy()) {
//					Map<JvmType, XImportDeclaration> map = imp.isStatic() ? staticImports : imports;
//					if (map.containsKey(importedType)) {
//						warning("Duplicate import of '" + importedType.getSimpleName() + "'.", imp, null,
//								IssueCodes.IMPORT_DUPLICATE);
//					} else {
//						map.put(importedType, imp);
//						if (!imp.isStatic()) {
//							JvmType currentType = importedType;
//							String currentSuffix = currentType.getSimpleName();
//							JvmType collidingImport = importedNames.put(currentSuffix, importedType);
//							if(collidingImport != null)
//								error("The import '" + importedType.getIdentifier() + "' collides with the import '" 
//										+ collidingImport.getIdentifier() + "'.", imp, null, IssueCodes.IMPORT_COLLISION);
//							while (currentType.eContainer() instanceof JvmType) {
//								currentType = (JvmType) currentType.eContainer();
//								currentSuffix = currentType.getSimpleName()+"$"+currentSuffix;
//								JvmType collidingImport2 = importedNames.put(currentSuffix, importedType);
//								if(collidingImport2 != null)
//									error("The import '" + importedType.getIdentifier() + "' collides with the import '" 
//											+ collidingImport2.getIdentifier() + "'.", imp, null, IssueCodes.IMPORT_COLLISION);
//							}
//						}
//					}
//				}
//			}
//		}
//
//		for (final JnarioClass xtendClass : file.getXtendTypes()) {
//			String clazzName = exampleNameProvider.toJavaClassName(xtendClass);
//			if(importedNames.containsKey(clazzName)){
//				JvmType importedType = importedNames.get(clazzName);
//				if(importedType != null){
//					XImportDeclaration xtendImport = imports.get(importedType);
//					if(xtendImport != null)
//						error("The import '" + importedType.getIdentifier() + "' conflicts with a type defined in the same file", xtendImport, null, IssueCodes.IMPORT_CONFLICT );
//				}
//			}
//			ICompositeNode node = NodeModelUtils.findActualNodeFor(xtendClass);
//			if (node != null) {
//				for (INode n : node.getAsTreeIterable()) {
//					if (n.getGrammarElement() instanceof CrossReference) {
//						EClassifier classifier = ((CrossReference) n.getGrammarElement()).getType().getClassifier();
//						if (classifier instanceof EClass
//								&& (TypesPackage.Literals.JVM_TYPE.isSuperTypeOf((EClass) classifier) || TypesPackage.Literals.JVM_CONSTRUCTOR
//										.isSuperTypeOf((EClass) classifier))) {
//							String simpleName = n.getText().trim();
//							// handle StaticQualifier Workaround (see Xbase grammar)
//							if (simpleName.endsWith("::"))
//								simpleName = simpleName.substring(0, simpleName.length() - 2);
//							if (importedNames.containsKey(simpleName)) {
//								JvmType type = importedNames.remove(simpleName);
//								imports.remove(type);
//							} else {
//								while (simpleName.contains("$")) {
//									simpleName = simpleName.substring(0, simpleName.lastIndexOf('$'));
//									if (importedNames.containsKey(simpleName)) {
//										imports.remove(importedNames.remove(simpleName));
//										break;
//									}
//								}
//							}
//						}
//					}
//				}
//			}
//		}
//		for (XImportDeclaration imp : imports.values()) {
//			warning("The import '" + imp.getImportedTypeName() + "' is never used.", imp, null,
//					IssueCodes.IMPORT_UNUSED);
//		}
//	}
	
	@Check
	public void checkDuplicateFacts(ExampleGroup exampleGroup){
		Map<String, Example> names = newHashMap();
		for (Example example : filter(exampleGroup.getMembers(), Example.class)) {
			String exampleName = exampleNameProvider.toMethodName(example);
			Example duplicate = names.get(exampleName);
			if(duplicate != null){
				markAsDuplicate(duplicate);
				markAsDuplicate(example);
			}else{
				names.put(exampleName, example);
			}
		}
	}

	public void markAsDuplicate(Example duplicate) {
		error("Duplicate fact", duplicate, JnarioPackage.Literals.JNARIO_FUNCTION__NAME, -1);
	}

	// TODO NO_XTEND
//	@Check
//	public void checkAbstract(JnarioFunction function) {
//		if (function instanceof TestFunction) {
//			return;
//		}
//		super.checkAbstract(function);
//	}

	protected boolean isValueExpectedRecursive(XExpression expr) {
		EObject container = expr.eContainer();
		if (container instanceof Assertion
				|| container instanceof RichString) {
			return true;
		}
		return super.isValueExpectedRecursive(expr);
	}

}
