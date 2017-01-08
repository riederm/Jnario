package org.jnario.richstring

import com.google.common.base.Splitter
import java.util.List
import java.util.regex.Pattern
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtext.xbase.XBlockExpression
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2
import org.jnario.RichString
import org.jnario.RichStringLiteral
import org.jnario.compiler.JnarioCompiler

class RichStringProcessor {

	static class RichStringAcceptor {
		static val NEW_LINE_PATTERN = Pattern.compile("\r?\n")

		List<Procedure2<ITreeAppendable, String>> toBeAppended = newArrayList;

		val JnarioCompiler compiler
		val extension RichStringIndentationAnalyzer indentationAnalyzer

		@FinalFieldsConstructor
		new() {
		}

		def dispatch accept(XBlockExpression block) {
			toBeAppended.add([ appendable, variableName |
				val blockName = compileBlock(block, appendable)
				if (blockName != null) {
					appendable.append('''«variableName».append(«blockName»);''')
					appendable.newLine
				}
			])
		}

		def compileBlock(XBlockExpression expression, ITreeAppendable appendable) {
			if (expression.expressions.size == 1) {
				compiler.toJavaStatement(expression, appendable, true)
				appendable.newLine
				return appendable.getName(expression.expressions.get(0))
			} else if (expression.expressions.size > 1) {
				// compile the block's result to a variable
				compiler.toJavaStatement(expression, appendable, true)
				appendable.newLine
				return appendable.getName(expression)
			}
			return null
		}

		def dispatch accept(XExpression literal) {
			toBeAppended.add([ appendable, name |
				appendable.append('''«name».append(''')
				compiler.toJavaExpression(literal, appendable)
				appendable.append(''');''')
				appendable.newLine
			])
		}

		def dispatch accept(RichStringLiteral literal) {
			val value = literal.value
			processLiteral(value)
		}

		def void processLiteral(String literal) {
			val lines = Splitter.on(NEW_LINE_PATTERN).split(literal.rawText).toList

			val last = lines.last
			val first = lines.head

			lines.forEach [
				if (it === first && it.empty) {
					// the very first empty line
					return
				}

				toBeAppended.add([ appendable, variableName |
					appendable.append('''«variableName».append("«it.correctIndentation»");''')
					appendable.newLine
					if (it !== last) {
						appendable.append('''«variableName».newLine();''')
						appendable.newLine
					}
				])
			]
		}

		def appendTo(ITreeAppendable appendable, String variableName) {
			toBeAppended.forEach [
				it.apply(appendable, variableName)
			]
		}
	}

	/**
	 * generates the code that assigns the given RichString to variableName.
	 */
	def void buildRichString(RichString richString, String variableName, ITreeAppendable appendable,
		JnarioCompiler compiler) {
		val analyzer = RichStringIndentationAnalyzer.analzye(richString)
		val acceptor = new RichStringProcessor.RichStringAcceptor(compiler, analyzer)

		val noOfSegments = richString.expressions.length
		richString.expressions.take(noOfSegments - 1).forEach [ it, index |
			acceptor.accept(it)
		]

		// try to see if the last segment ends with a \n'''
		// if so, we ignore this newline
		val last = richString.expressions.last
		if (last instanceof RichStringLiteral) {
			var value = last.value
			var newline = "\r\n"
			var emptyLastLine = newline + analyzer.indentation + "'''"
			if (value.endsWith(emptyLastLine)) {
				value = value.substring(0, value.length - emptyLastLine.length)
			} else {
				newline = "\n"
				emptyLastLine = newline + analyzer.indentation + "'''"
				if (value.endsWith(emptyLastLine)) {
					value = value.substring(0, value.length - emptyLastLine.length)
				}
			}

			acceptor.processLiteral(value)
		}

		acceptor.appendTo(appendable, variableName)
	}

}
