package org.jnario.xbase.richstring;

import static org.eclipse.xtext.util.Strings.convertToJavaString;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import javax.inject.Provider;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.generator.trace.LocationData;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.util.ITextRegionWithLineInformation;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.typesystem.references.LightweightTypeReference;
import org.jnario.xbase.richstring.util.AbstractRichStringPartAcceptor;
import org.jnario.xbase.richstring.util.IRichStringIndentationHandler;
import org.jnario.xbase.richstring.util.RichStringProcessor;
import org.jnario.xbase.richstring.xbasewithrichstring.RichString;
import org.jnario.xbase.richstring.xbasewithrichstring.RichStringLiteral;

import com.google.common.collect.Lists;
import com.google.inject.Inject;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("restriction")
public class XbaseWithRichstringCompiler extends XbaseCompiler {

	@Inject
	Provider<IRichStringIndentationHandler> indentationHandler;

	@Inject
	private RichStringProcessor richStringProcessor;

	@Inject
	ISerializer serializer;

	@Override
	public void internalToConvertedExpression(XExpression obj, ITreeAppendable appendable) {
		if (obj instanceof RichString) {
			_toJavaExpression((RichString) obj, appendable);
		} else {
			super.internalToConvertedExpression(obj, appendable);
		}
	}

	
	@Override
	public void doInternalToJavaStatement(XExpression obj, ITreeAppendable appendable, boolean isReferenced) {
		if (obj instanceof RichString) {
			_toJavaStatement((RichString) obj, appendable, isReferenced);
		} else {
			super.doInternalToJavaStatement(obj, appendable, isReferenced);
		}
	}

	protected void _toJavaExpression(RichString richString, ITreeAppendable b) {
		b.append(getVarName(richString, b));
		if (getLightweightType(richString).isType(String.class))
			b.append(".toString()");
	}

	protected void _toJavaStatement(RichString richString, ITreeAppendable b, boolean isReferenced) {
//		b = b.trace(richString);
//		// declare variable
//		String variableName = b.declareSyntheticVariable(richString, "_builder");
//		b.newLine();
//		b.append(StringConcatenation.class);
//		b.append(" ");
//		b.append(variableName);
//		b.append(" = new ");
//		b.append(StringConcatenation.class);
//		b.append("();");
//		// Print each expression
//		b.newLine();
//
//		RichStringPrepareCompiler compiler = new RichStringPrepareCompiler(b, variableName, richString);
//		richStringProcessor.process(richString, compiler, indentationHandler.get());
//		
		LightweightTypeReference actualType = getLightweightType(richString);
		b = b.trace(richString);
		if (actualType.isType(StringConcatenationClient.class)) {
			String resultVariableName = b.declareSyntheticVariable(richString, "_client");
			b.newLine();
			b.append(actualType);
			b.append(" ");
			b.append(resultVariableName);
			b.append(" = new ");
			b.append(actualType);
			b.append("() {");
			b.openScope();
			reassignThisInClosure(b, actualType.getType());
			b.increaseIndentation().newLine();
			b.append("@");
			b.append(Override.class);
			b.newLine().append("protected void appendTo(");
			b.append(StringConcatenationClient.TargetStringConcatenation.class);
			String variableName = b.declareSyntheticVariable(richString, "_builder");
			b.append(" ").append(variableName).append(") {");
			b.increaseIndentation();
			RichStringPrepareCompiler compiler = new RichStringPrepareCompiler(b, variableName, richString);
			richStringProcessor.process(richString, compiler, indentationHandler.get());
			b.closeScope();
			b.decreaseIndentation().newLine().append("}").decreaseIndentation().newLine().append("};");
		} else {
			// declare variable
			String variableName = b.declareSyntheticVariable(richString, "_builder");
			b.newLine();
			b.append(StringConcatenation.class);
			b.append(" ");
			b.append(variableName);
			b.append(" = new ");
			b.append(StringConcatenation.class);
			b.append("();");
			RichStringPrepareCompiler compiler = new RichStringPrepareCompiler(b, variableName, richString);
			richStringProcessor.process(richString, compiler, indentationHandler.get());
		}
	}

	public class RichStringPrepareCompiler extends AbstractRichStringPartAcceptor.ForLoopOnce {

		private final LinkedList<ITreeAppendable> appendableStack;
		// private final LinkedList<RichStringIf> ifStack;
		// private final LinkedList<RichStringForLoop> forStack;
		private final String variableName;
		private ITreeAppendable appendable;
		private ITreeAppendable currentAppendable;

		public RichStringPrepareCompiler(ITreeAppendable appendable, String variableName, RichString richString) {
			// this.ifStack = Lists.newLinkedList();
			// this.forStack = Lists.newLinkedList();
			this.appendableStack = Lists.newLinkedList();
			this.appendable = appendable;
			this.variableName = variableName;
			List<XExpression> expressions = richString.getExpressions();
			if (!expressions.isEmpty() && expressions.get(0) instanceof RichStringLiteral)
				setCurrentAppendable((RichStringLiteral) expressions.get(0));
		}

		@Override
		public void acceptSemanticLineBreak(int charCount, RichStringLiteral origin, boolean controlStructureSeen) {
			setCurrentAppendable(origin);
			currentAppendable.newLine();
			currentAppendable.append(variableName);
			if (!controlStructureSeen) {
				currentAppendable.append(".newLine();");
			} else {
				currentAppendable.append(".newLineIfNotEmpty();");
			}
		}

		protected void setCurrentAppendable(/* @Nullable */ RichStringLiteral origin) {
			if (currentAppendable == null && origin != null) {
				ITextRegionWithLineInformation region = (ITextRegionWithLineInformation) getLocationInFileProvider()
						.getSignificantTextRegion(origin, XbasePackage.Literals.XSTRING_LITERAL__VALUE, 0);
				currentAppendable = appendable.trace(new LocationData(region, null), true);
			}
		}

		@Override
		public void acceptTemplateLineBreak(int charCount, RichStringLiteral origin) {
			setCurrentAppendable(origin);
		}

		@Override
		public void acceptSemanticText(CharSequence text, /* @Nullable */ RichStringLiteral origin) {
			setCurrentAppendable(origin);
			if (text.length() == 0)
				return;
			currentAppendable.newLine();
			currentAppendable.append(variableName);
			currentAppendable.append(".append(\"");
			currentAppendable.append(Strings.convertToJavaString(text.toString(), false));
			currentAppendable.append("\");");
		}

		// @Override
		// public void acceptIfCondition(XExpression condition) {
		// currentAppendable = null;
		// ifStack.add((RichStringIf) condition.eContainer());
		// appendable.newLine();
		// pushAppendable(condition.eContainer());
		// appendable.append("{").increaseIndentation();
		// writeIf(condition);
		// }

		protected void pushAppendable(EObject traceInfo) {
			appendableStack.add(appendable);
			appendable = appendable.trace(traceInfo);
		}

		protected void popAppendable() {
			appendable = appendableStack.removeLast();
		}

		@Override
		public void acceptElseIfCondition(XExpression condition) {
			currentAppendable = null;
			writeElse();
			writeIf(condition);
		}

		protected void writeIf(XExpression condition) {
			ITreeAppendable debugAppendable = appendable.trace(condition.eContainer(), true);
			internalToJavaStatement(condition, debugAppendable, true);
			debugAppendable.newLine();
			debugAppendable.append("if (");
			internalToJavaExpression(condition, debugAppendable);
			debugAppendable.append(") {").increaseIndentation();
		}

		protected void writeElse() {
			currentAppendable = null;
			appendable.decreaseIndentation();
			appendable.newLine();
			appendable.append("} else {");
			appendable.increaseIndentation();
		}

		@Override
		public void acceptElse() {
			currentAppendable = null;
			writeElse();
		}

		// @Override
		// public void acceptEndIf() {
		// currentAppendable = null;
		// RichStringIf richStringIf = ifStack.removeLast();
		// for (int i = 0; i < richStringIf.getElseIfs().size() + 2; i++) {
		// appendable.decreaseIndentation();
		// appendable.newLine();
		// appendable.append("}");
		// }
		// popAppendable();
		// }
		//
		// @Override
		// public void acceptForLoop(JvmFormalParameter parameter, /* @Nullable
		// */ XExpression expression) {
		// currentAppendable = null;
		// super.acceptForLoop(parameter, expression);
		// if (expression == null)
		// throw new IllegalArgumentException("expression may not be null");
		// RichStringForLoop forLoop = (RichStringForLoop)
		// expression.eContainer();
		// forStack.add(forLoop);
		// appendable.newLine();
		// pushAppendable(forLoop);
		// appendable.append("{").increaseIndentation();
		//
		// ITreeAppendable debugAppendable = appendable.trace(forLoop, true);
		// internalToJavaStatement(expression, debugAppendable, true);
		// String variableName = null;
		// if (forLoop.getBefore() != null || forLoop.getSeparator() != null ||
		// forLoop.getAfter() != null) {
		// variableName = debugAppendable.declareSyntheticVariable(forLoop,
		// "_hasElements");
		// debugAppendable.newLine();
		// debugAppendable.append("boolean ");
		// debugAppendable.append(variableName);
		// debugAppendable.append(" = false;");
		// }
		// debugAppendable.newLine();
		// debugAppendable.append("for(final ");
		// // TODO tracing if parameter was explicitly declared
		// LightweightTypeReference paramType = getLightweightType(parameter);
		// if (paramType != null) {
		// debugAppendable.append(paramType);
		// } else {
		// debugAppendable.append("Object");
		// }
		// debugAppendable.append(" ");
		// String loopParam = debugAppendable.declareVariable(parameter,
		// parameter.getName());
		// debugAppendable.append(loopParam);
		// debugAppendable.append(" : ");
		// internalToJavaExpression(expression, debugAppendable);
		// debugAppendable.append(") {").increaseIndentation();
		// }
		//
		// @Override
		// public boolean forLoopHasNext(/* @Nullable */ XExpression before, /*
		// @Nullable */ XExpression separator, CharSequence indentation) {
		// currentAppendable = null;
		// if (!super.forLoopHasNext(before, separator, indentation))
		// return false;
		// RichStringForLoop forLoop = forStack.getLast();
		// if (appendable.hasName(forLoop)) {
		// String varName = getVarName(forLoop, appendable);
		// appendable.newLine();
		// appendable.append("if (!");
		// appendable.append(varName);
		// appendable.append(") {");
		// appendable.increaseIndentation();
		// appendable.newLine();
		// appendable.append(varName);
		// appendable.append(" = true;");
		// if (before != null) {
		// writeExpression(before, indentation, false);
		// }
		// appendable.decreaseIndentation();
		// appendable.newLine();
		// appendable.append("}");
		// if (separator != null) {
		// appendable.append(" else {");
		// appendable.increaseIndentation();
		// writeExpression(separator, indentation, true);
		// appendable.decreaseIndentation();
		// appendable.newLine();
		// appendable.append("}");
		// }
		// }
		// return true;
		// }
		//
		// @Override
		// public void acceptEndFor(/* @Nullable */ XExpression after,
		// CharSequence indentation) {
		// currentAppendable = null;
		// super.acceptEndFor(after, indentation);
		// appendable.decreaseIndentation();
		// appendable.newLine();
		// appendable.append("}");
		//
		// RichStringForLoop forLoop = forStack.removeLast();
		// if (after != null) {
		// String varName = getVarName(forLoop, appendable);
		// appendable.newLine();
		// appendable.append("if (");
		// appendable.append(varName);
		// appendable.append(") {");
		// appendable.increaseIndentation();
		// writeExpression(after, indentation, false);
		// appendable.decreaseIndentation();
		// appendable.newLine();
		// appendable.append("}");
		// }
		//
		// appendable.decreaseIndentation();
		// appendable.newLine();
		// appendable.append("}");
		// popAppendable();
		// }

		@Override
		public void acceptExpression(XExpression expression, CharSequence indentation) {
			currentAppendable = null;
			writeExpression(expression, indentation, false);
		}

		protected void writeExpression(XExpression expression, CharSequence indentation, boolean immediate) {
			boolean referenced = !isPrimitiveVoid(expression);
			internalToJavaStatement(expression, appendable, referenced);
			if (referenced) {
				ITreeAppendable tracingAppendable = appendable.trace(expression, true);
				tracingAppendable.newLine();
				tracingAppendable.append(variableName);
				if (immediate)
					tracingAppendable.append(".appendImmediate(");
				else
					tracingAppendable.append(".append(");
				internalToJavaExpression(expression, tracingAppendable);
				tracingAppendable.append(", \"");
				tracingAppendable.append(Strings.convertToJavaString(indentation.toString(), false));
				tracingAppendable.append("\");");
			}
		}

	}
	
	@Override
	protected XExpression normalizeBlockExpression(XExpression expr) {
		if (expr instanceof RichString)	//RichStrings MUST not be normalized!!
			return expr;
		return super.normalizeBlockExpression(expr);
	}

}