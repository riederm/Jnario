package org.jnario.formatter

import org.eclipse.xtext.xbase.annotations.formatting2.XbaseWithAnnotationsFormatter

/**
 * TODO NO_XTEND - Verify implementation
 * @author Sebastian Benz - Initial contribution and API
 */
class JnarioFormatter extends XbaseWithAnnotationsFormatter {
//	def private void formatRows(EList<ExampleRow> rows, extension IFormattableDocument format) {
//		rows.forEach [
//		    append[newLine]
//		]
//	}
//
//	def private void formatColumns(EList<ExampleColumn> columns, extension IFormattableDocument format) {
//		columns.forEach [
//			val nameNode = regionForFeature(JnarioPackage.Literals.EXAMPLE_COLUMN__NAME)
//			val typeNode = type
//			val headerLength = if (typeNode == null) {
//					nameNode.length
//				} else {
//					nameNode.offset + nameNode.length - typeNode.regionForEObject.offset
//				}
//			val maxExprLength = cells.map[getMultilineLength(format, expression.regionForEObject)].reduce[p1, p2|
//				Math.max(p1, p2)] ?: 0
//			val maxLength = Math.max(headerLength, maxExprLength)
//			val columnLength = 1 + maxLength - headerLength
//			prepend[oneSpace]
//			regionForKeyword("|").prepend[spaces(columnLength)]
//			cells.forEach [
//				expression.prepend[oneSpace]
//				val length = 1 + maxLength - getMultilineLastSegmentLength(format, expression.regionForEObject)
//				expression.append[spaces(length)]
//			]
//		]
//		columns.last.append[newLine]
//	}
//
//	def spaces(IHiddenRegionFormatter init, int i) {
//		init.space = (1 .. i).fold("", [p1, p2|p1 + " "])
//	}
//
//	def private getSplittedMultilineCell(IFormattableDocument format, ITextSegment segment) {
//		format.region.text.substring(
//		    segment.offset - format.region.offset,
//		    segment.offset + segment.length - format.region.offset
//		).split("\r?\n")
//	}
//
//	def private getMultilineLastSegmentLength(IFormattableDocument format, ITextSegment segment) {
//		getSplittedMultilineCell(format, segment).last.trim.length
//	}
//
//	def private getMultilineLength(IFormattableDocument format, ITextSegment segment) {
//		getSplittedMultilineCell(format, segment).map[trim.length].reduce[p1, p2|Math.max(p1, p2)]
//	}
//
//	def dispatch void format(ExampleTable table, extension IFormattableDocument format) {
//		table.regionForKeyword("{").append [
//			increaseIndentation
//			newLine
//		]
//		table.regionForKeyword("}").prepend[
//		    decreaseIndentation
//		    newLine
//		]
//		formatRows(table.rows, format)
//		formatColumns(table.columns, format)
//	}
//
//	/**
//	 * Hack: No node for type Void - prevent NullPointerException
//	 */
//	override protected dispatch void format(JvmParameterizedTypeReference type, IFormattableDocument format) {
//	    // TODO Do we still need it?
//		if (NodeModelUtils.findActualNodeFor(type) != null) {
//			super._format(type, format)
//		}
//	}
}
