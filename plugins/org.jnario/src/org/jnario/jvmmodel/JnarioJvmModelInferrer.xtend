/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jvmmodel

import com.google.inject.Inject
import java.util.NoSuchElementException
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.documentation.IFileHeaderProvider
import org.eclipse.xtext.xbase.XTypeLiteral
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation
import org.eclipse.xtext.xbase.compiler.XbaseCompiler
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.jnario.JnarioClass
import org.jnario.JnarioFile
import org.jnario.JnarioTypeDeclaration
import org.jnario.runner.Extends

import static extension org.eclipse.xtext.nodemodel.util.NodeModelUtils.*

/**
 * TODO NO_XTEND - verify all methods. Remove unused.
 * @author Birgit Engelmann
 * @author Sebastian Benz
 */
abstract class JnarioJvmModelInferrer /* extends XtendJvmModelInferrer */ implements IJvmModelInferrer {
    @Inject extension IJvmModelAssociator 
    @Inject extension IFileHeaderProvider
    @Inject extension JvmTypesBuilder

	@Inject public XbaseCompiler compiler
	@Inject extension TypeReferences
//	@Inject extension IJvmModelAssociations
	@Inject TestRuntimeProvider runtime
	@Inject extension JnarioNameProvider
	TestRuntimeSupport testRuntime
//	@Inject	extension JvmTypesBuilder jvmTypesBuilder
//  @Inject extension TypesFactory typesFactory

	override infer(EObject obj, IJvmDeclaredTypeAcceptor acceptor, boolean preIndexingPhase) {
		try{
			testRuntime = runtime.get(obj)
		}catch(NoSuchElementException ex){
			return
		}
		doInfer(obj, acceptor, preIndexingPhase)
	}
	
	def doInfer(EObject e, IJvmDeclaredTypeAcceptor acceptor, boolean preIndexingPhase) {
		throw new UnsupportedOperationException
	}
	
//	def protected transform(XtendField source, JvmGenericType container) {
//	  
//	  
//    if ((source.isExtension() && source.getType() != null) || source.getName() != null) {
//      val field = typesFactory.createJvmField();
//      val computeFieldName = computeFieldName(source);
//      field.setSimpleName(computeFieldName);
//      container.getMembers().add(field);
//      associator.associatePrimary(source, field);
//      field.setVisibility(source.getVisibility());
//      field.setStatic(source.isStatic());
//      field.setTransient(source.isTransient());
//      field.setVolatile(source.isVolatile());
//      field.setFinal(source.isFinal());
//      if (source.getType() != null) {
//        field.setType(jvmTypesBuilder.cloneWithProxies(source.getType()));
//      } else if (source.getInitialValue() != null) {
//        field.setType(jvmTypesBuilder.inferredType(source.getInitialValue()));
//      }
//      for (XAnnotation anno : source.getAnnotations()) {
//        if (!annotationTranslationFilter.apply(anno))
//          continue;
//        JvmAnnotationReference annotationReference = jvmTypesBuilder.getJvmAnnotationReference(anno);
//        if(annotationReference != null)
//          field.getAnnotations().add(annotationReference);
//      }
//      if (source.isExtension() && typeReferences.findDeclaredType(Extension.class, source) != null) {
//        field.getAnnotations().add(jvmTypesBuilder.toAnnotation(source, Extension.class));
//      }
//      jvmTypesBuilder.copyDocumentationTo(source, field);
//      jvmTypesBuilder.setInitializer(field, source.getInitialValue());
//      initializeLocalTypes(field, source.getInitialValue());
//    }
//	  
//	  
//	  
//		super.transform(source, container)
//		val field = source.jvmElements.head as JvmField
//		if(field == null){
//			return
//		}
//		if(field.visibility == JvmVisibility::PRIVATE){
//			field.setVisibility(JvmVisibility::DEFAULT)
//		}
//		if (source.isExtension()){
//			field.setVisibility(JvmVisibility::PUBLIC)
//			field.annotations += source.toAnnotation(typeof(Extension))
//		}
//	}
	
	def serialize(EObject obj){
		return obj.node?.text
	}
	
	def jnarioFile(EObject obj){
		EcoreUtil2::getContainerOfType(obj, JnarioFile)
	}
	
	def packageName(EObject obj){
		obj.jnarioFile?.^package
	}
	
	def protected getTestRuntime(){
		testRuntime
	}
	
	def protected void addSuperClass(JnarioClass jnarioClass){
		var EObject xtendType = jnarioClass
		while(xtendType != null && xtendType instanceof JnarioClass){
			val current = xtendType as JnarioClass
			for(extendedType : current.annotations.filter[it.hasExtendsAnnotation].map[value as XTypeLiteral]){
				if(/* current.^implements.empty && */ extendedType.type != null){
					jnarioClass.^extends = extendedType.type.createTypeRef()
					return
				}
			}	
			xtendType = xtendType.eContainer
		}
	}
	
	def protected hasExtendsAnnotation(XAnnotation annotation){
		annotation.annotationType?.qualifiedName == typeof(Extends).name && annotation.value instanceof XTypeLiteral
	}
	
	def protected void setNameAndAssociate(JnarioFile file, JnarioTypeDeclaration jnarioType, JvmDeclaredType javaType) {
        javaType.packageName = file.package
		javaType.simpleName = jnarioType.toJavaClassName
        javaType.visibility = JvmVisibility.PUBLIC
        file.setFileHeader(javaType)
        jnarioType.associatePrimary(javaType)
	}

    def protected void setFileHeader(JnarioFile jnarioFile, JvmDeclaredType jvmDeclaredType) {
        jvmDeclaredType.fileHeader = jnarioFile.eResource.fileHeader
    }
}