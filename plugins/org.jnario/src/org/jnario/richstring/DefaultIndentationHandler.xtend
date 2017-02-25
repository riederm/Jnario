package org.jnario.richstring;

import java.util.LinkedList;

import com.google.common.collect.Lists;

/** 
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
/** 
 * Default indentation handler for rich strings. Tries to be graceful with
 * inconsistent indentation.
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class DefaultIndentationHandler implements IRichStringIndentationHandler {
	protected static abstract class IndentationData {
		protected CharSequence value

		protected new(CharSequence value) {
			this.value = value
		}

		def protected abstract void accept(IRichStringPartAcceptor acceptor)

		override String toString() {
			return '''«getClass().getSimpleName()» [«value»]'''
		}
	}

	protected static class SemanticIndentationData extends IndentationData {
		protected new(CharSequence value) {
			super(value)
		}

		override protected void accept(IRichStringPartAcceptor acceptor) {
			acceptor.acceptSemanticText(value, null)
		}
	}

	protected static class TemplateIndentationData extends IndentationData {
		protected new(CharSequence value) {
			super(value)
		}

		override protected void accept(IRichStringPartAcceptor acceptor) {
			acceptor.acceptTemplateText(value, null)
		}
	}

	LinkedList<IndentationData> indentationData
	LinkedList<LinkedList<IndentationData>> indentationDataStack

	new() {
		this.indentationData = Lists.newLinkedList()
		this.indentationDataStack = Lists.newLinkedList()
		indentationDataStack.add(indentationData)
	}

	override void popIndentation() {
		indentationData.removeLast()
		if (indentationData.isEmpty() && indentationDataStack.size() > 1) {
			indentationDataStack.removeLast()
			indentationData = indentationDataStack.getLast()
		}
	}

	override void pushTemplateIndentation(CharSequence indentation) {
		if (indentationData.isEmpty()) {
			indentationData.add(new TemplateIndentationData(indentation))
		} else {
			var String currentIndentation = getTotalIndentation()
			if (indentation.toString().startsWith(currentIndentation)) {
				var String trimmedIndentation = indentation.toString().substring(currentIndentation.length())
				indentationData.add(new TemplateIndentationData(trimmedIndentation))
			} else {
				var LinkedList<IndentationData> newIndentationData = Lists.newLinkedList()
				newIndentationData.add(new TemplateIndentationData(indentation))
				indentationDataStack.add(newIndentationData)
				indentationData = newIndentationData
			}
		}
	}

	override void pushSemanticIndentation(CharSequence indentation) {
		if (indentationData.isEmpty()) {
			indentationData.add(new SemanticIndentationData(indentation))
		} else {
			var String currentIndentation = getTotalIndentation()
			if (indentation.toString().startsWith(currentIndentation)) {
				var String trimmedIndentation = indentation.toString().substring(currentIndentation.length())
				indentationData.add(new SemanticIndentationData(trimmedIndentation))
			} else {
				var LinkedList<IndentationData> newIndentationData = Lists.newLinkedList()
				newIndentationData.add(new SemanticIndentationData(indentation))
				indentationDataStack.add(newIndentationData)
				indentationData = newIndentationData
			}
		}
	}

	override CharSequence getTotalSemanticIndentation() {
		var StringBuilder result = new StringBuilder()
		for (IndentationData data : indentationData) {
			if(data instanceof SemanticIndentationData) result.append(data.value)
		}
		return result.toString()
	}

	override String getTotalIndentation() {
		var StringBuilder result = new StringBuilder()
		for (IndentationData data : indentationData) {
			result.append(data.value)
		}
		return result.toString()
	}

	override void accept(IRichStringPartAcceptor acceptor) {
		for (IndentationData data : indentationData) {
			data.accept(acceptor)
		}
	}
}