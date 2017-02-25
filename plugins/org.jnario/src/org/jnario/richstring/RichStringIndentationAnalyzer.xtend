//package org.jnario.richstring
//
//import com.google.common.base.Splitter
//import java.util.Collections
//import java.util.List
//import java.util.regex.Pattern
//import org.eclipse.emf.ecore.EObject
//import org.eclipse.xtend.lib.annotations.Accessors
//import org.eclipse.xtext.util.ITextRegion
//import org.eclipse.xtext.util.TextRegion
//import org.eclipse.xtext.xbase.XExpression
//import org.jnario.RichString
//import org.jnario.RichStringLiteral
//
//import static extension com.google.common.base.Strings.nullToEmpty
//import org.eclipse.xtext.xbase.XBlockExpression
//
//class RichStringIndentationAnalyzer {
//
//	public static val PLACEHOLDER_OPEN = '«'
//	public static val PLACEHOLDER_CLOSE = '»'
//	public static val THREE_TICKS = "'''"
//
//	static val LEADING_WHITESPACES_END_RICHSTRING = Pattern.compile("^(\\s*)" + THREE_TICKS + "$")
//	static val JUST_OPEN_EXPRESSION = Pattern.compile("^(\\s*)" + PLACEHOLDER_OPEN + "$")
//	static val LEADING_WHITESPACES_PATTERN = Pattern.compile("(\\s+).*\\r?")
//	static val LINE_PATTERN = Pattern.compile("\n")
//
//	@Accessors(PUBLIC_GETTER)
//	var String indentation = "";
//
//	val List<IRichStringProcessable> rsSegments = newArrayList()
//
//	@Accessors()
//	val Iterable<IRichStringProcessable> segments = rsSegments;
//
//	private new() {
//	}
//
//	public def boolean shouldIndent(EObject o) {
//		return o instanceof RichStringLiteral
//	}
//
//	private def doAnalyze(RichString rs) {
//		// if the first one is just the empty rich-string opener, we dont care about it
//		var Iterable<Pair<? extends XExpression, String>> lines = rs.expressions//							.filter(RichStringLiteral)
//		.map [semanticObject2LiteralPair(it)].flatten 
//		.toList
//
//		indentation = null
//
//		var semanticObject = lines.head?.key
//		var linesOffset = 0;
//		for (l : lines) {
//
//			if (semanticObject !== l.key) {
//				linesOffset = 0;
//				semanticObject = l.key
//			}
//
//			val key = l.key
//			if (key instanceof RichStringLiteral) {
//				val lineLength = l.value.length
//
//					if (l.value.shouldGenerate){
//						rsSegments.add(new RichStringSegment(l.key, new TextRegion(linesOffset, lineLength)))
//					}
//				if (l.isRelevantForIndentation(lines)) {
//					updateIndentation(l.value.rawText.indentation)
//				}
//				linesOffset = linesOffset + lineLength + 1
//			} else if (key instanceof XExpression){
//				rsSegments.add(new RichStringExpression(key))
//			}
//		}
//		
//		if (lines.size == 1){
//			indentation = ""
//		}
//	}
//	
//	def getShouldGenerate(String string) {
//		!JUST_OPEN_EXPRESSION.matcher(string).matches
//	}
//	
//	private def isRelevantForGeneration(Pair<? extends XExpression, String> pair, Iterable<Pair<? extends XExpression, String>> pairs) {
//		return !(pair.value.isJustIndentation || JUST_OPEN_EXPRESSION.matcher(pair.value).matches)
//	}
//	
//	private def semanticObject2LiteralPair(XExpression literal) {
//			if (literal instanceof RichStringLiteral) {
//				return literal.value.nullToEmpty.getLines.map[literal -> it]
//			}
//			return Collections.singleton(literal -> "")
//	}
//
//	private def updateIndentation(String currIndentation) {
//		if (indentation == null || currIndentation.length < indentation.length) {
//			indentation = currIndentation
//		}
//	}
//
//	private def isRelevantForIndentation(Pair<?, String> l, Iterable<?> lines) {
//		if (l === lines.head && l.value == "'''" || l.value == "'''\r") {
//			return false
//		} else if (l === lines.last && l.value.isJustIndentation) {
//			return false
//		} else if (l.value.startsWith(PLACEHOLDER_CLOSE)) {
//			return false
//		}
//		return true
//	}
//
//	private def isJustIndentation(String string) {
//		return LEADING_WHITESPACES_END_RICHSTRING.matcher(string).matches
//	}
//
//	private def getLines(String string) {
//		Splitter.on(LINE_PATTERN).splitToList(string)
//	}
//
//	public static def analzye(RichString rs) {
//		val analyzer = new RichStringIndentationAnalyzer();
//		analyzer.doAnalyze(rs);
//		return analyzer
//	}
//
//	/**
//	 * returns the text-region that contains the raw-text (Without the rich-string related characters)
//	 */
//	private def ITextRegion getRawTextRegion(String string) {
//		var value = string
//		var int offset = 0;
//		var int length = string.length;
//
//		if (value.endsWith("\r")) {
//			value = value.substring(0, value.length - 1)
//			length = length - 1
//		}
//
//		if (value.startsWith(THREE_TICKS)) {
//			// '''bla bla bla...
//			offset += THREE_TICKS.length
//		}
//		if (value.startsWith(PLACEHOLDER_CLOSE)) {
//			// » bla bla bla...
//			offset += PLACEHOLDER_CLOSE.length
//		}
//		if (value.endsWith(PLACEHOLDER_OPEN) && value.length > PLACEHOLDER_OPEN.length) {
//			// bla bla bla «...
//			length -= PLACEHOLDER_OPEN.length;
//		}
//		if (value.endsWith(THREE_TICKS) && value.length > THREE_TICKS.length) {
//			// / bla bla bla'''
//			length -= THREE_TICKS.length
//		}
//		length -= offset
//		return new TextRegion(offset, length)
//	}
//
//	/**
//	 * removes any Richstring-related prefix or suffix:´
//	 * ''' 	pre- and suffix
//	 * « 	prefix
//	 * » 	suffix
//	 */
//	def getRawText(String string) {
//		val region = string.rawTextRegion
//		return string.subSequence(region.offset, region.offset + region.length).toString
//	}
//
//	def getCommonIndentationLength() {
//		return indentation.length
//	}
//
//	def shouldCropIndentation(String line) {
//		return line.startsWith(indentation)
//	}
//
//	/**
//	 * removes unnecessary leading whitespaces from the given string  
//	 */
//	def correctIndentation(String string) {
//		if (string.shouldCropIndentation) {
//			return string.substring(indentation.length)
//		}
//		return string
//	}
//
//	private def String getIndentation(String string) {
//		val pattern = LEADING_WHITESPACES_PATTERN
//		// Get first char that is not a whitespace
//		val matcher = pattern.matcher(string)
//		if (matcher.matches) {
//			return matcher.group(1)
//		}
//		return ""
//	}
//
//}
