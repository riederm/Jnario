/*
 * generated by Xtext
 */
package org.jnario.feature.formatting2;

import com.google.inject.Inject;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XInstanceOfExpression;
import org.eclipse.xtext.xbase.annotations.formatting2.XbaseWithAnnotationsFormatter;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.jnario.Assertion;
import org.jnario.JnarioField;
import org.jnario.JnarioFunction;
import org.jnario.JnarioMember;
import org.jnario.JnarioParameter;
import org.jnario.JnarioTypeDeclaration;
import org.jnario.Should;
import org.jnario.ShouldThrow;
import org.jnario.feature.feature.And;
import org.jnario.feature.feature.Background;
import org.jnario.feature.feature.But;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.FeatureFile;
import org.jnario.feature.feature.Given;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.feature.Then;
import org.jnario.feature.feature.When;
import org.jnario.feature.services.FeatureGrammarAccess;

class FeatureFormatter extends XbaseWithAnnotationsFormatter {
	//TODO MARI redo formatter
//	
//	@Inject extension FeatureGrammarAccess
//
//	def dispatch void format(FeatureFile featurefile, extension IFormattableDocument document) {
//		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
//		format(featurefile.getImportSection(), document);
//		for (JnarioTypeDeclaration xtendTypes : featurefile.getXtendTypes()) {
//			format(xtendTypes, document);
//		}
//	}
//
//	def dispatch void format(Feature feature, extension IFormattableDocument document) {
//		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
//		for (XAnnotation annotations : feature.getAnnotations()) {
//			format(annotations, document);
//		}
//		for (JnarioMember members : feature.getMembers()) {
//			format(members, document);
//		}
//	}
//
//	def dispatch void format(Background background, extension IFormattableDocument document) {
//		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
//		for (JnarioMember members : background.getMembers()) {
//			format(members, document);
//		}
//	}
//
//	def dispatch void format(Scenario scenario, extension IFormattableDocument document) {
//		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
//		for (JnarioMember members : scenario.getMembers()) {
//			format(members, document);
//		}
//	}
//
//	def dispatch void format(JnarioMember jnariomember, extension IFormattableDocument document) {
//		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
//		for (XAnnotation annotations : jnariomember.getAnnotations()) {
//			format(annotations, document);
//		}
//	}
//
//	def dispatch void format(JnarioField jnariofield, extension IFormattableDocument document) {
//		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
//		format(jnariofield.getType(), document);
//		format(jnariofield.getInitialValue(), document);
//		format(jnariofield.getAnnotationInfo(), document);
//	}
//
//	def dispatch void format(Given given, extension IFormattableDocument document) {
//		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
//		format(given.getExpression(), document);
//	}
//
//	def dispatch void format(When when, extension IFormattableDocument document) {
//		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
//		format(when.getExpression(), document);
//	}
//
//	def dispatch void format(Then then, extension IFormattableDocument document) {
//		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
//		format(then.getExpression(), document);
//	}
//
//	def dispatch void format(And and, extension IFormattableDocument document) {
//		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
//		format(and.getExpression(), document);
//	}
//
//	def dispatch void format(But but, extension IFormattableDocument document) {
//		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
//		format(but.getExpression(), document);
//	}
//
//	override dispatch void format(XBlockExpression xblockexpression, extension IFormattableDocument document) {
//		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
//		for (XExpression expressions : xblockexpression.getExpressions()) {
//			format(expressions, document);
//		}
//	}
//
//	def dispatch void format(Should should, extension IFormattableDocument document) {
//		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
//		format(should.getRightOperand(), document);
//		format(should.getLeftOperand(), document);
//	}
//
//	def dispatch void format(ShouldThrow shouldthrow, extension IFormattableDocument document) {
//		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
//		format(shouldthrow.getType(), document);
//		format(shouldthrow.getExpression(), document);
//	}
//
//
//	def dispatch void format(XInstanceOfExpression xinstanceofexpression, extension IFormattableDocument document) {
//		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
//		format(xinstanceofexpression.getType(), document);
//		format(xinstanceofexpression.getExpression(), document);
//	}
//
//	override dispatch void format(XBinaryOperation xbinaryoperation, extension IFormattableDocument document) {
//		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
//		format(xbinaryoperation.getRightOperand(), document);
//		format(xbinaryoperation.getLeftOperand(), document);
//	}
//
//	def dispatch void format(Assertion assertion, extension IFormattableDocument document) {
//		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
//		format(assertion.getExpression(), document);
//	}
//
//	def dispatch void format(JnarioFunction jnariofunction, extension IFormattableDocument document) {
//		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
//		for (JvmTypeParameter typeParameters : jnariofunction.getTypeParameters()) {
//			format(typeParameters, document);
//		}
//		format(jnariofunction.getReturnType(), document);
//		for (JnarioParameter parameters : jnariofunction.getParameters()) {
//			format(parameters, document);
//		}
//		for (JvmTypeReference exceptions : jnariofunction.getExceptions()) {
//			format(exceptions, document);
//		}
//		format(jnariofunction.getExpression(), document);
//		format(jnariofunction.getAnnotationInfo(), document);
//	}
//
//	def dispatch void format(JnarioParameter jnarioparameter, extension IFormattableDocument document) {
//		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
//		for (XAnnotation annotations : jnarioparameter.getAnnotations()) {
//			format(annotations, document);
//		}
//		format(jnarioparameter.getParameterType(), document);
//	}
}
