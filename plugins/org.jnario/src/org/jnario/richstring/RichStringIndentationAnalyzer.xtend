package org.jnario.richstring

import com.google.common.base.Splitter
import java.util.regex.Pattern
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.util.ITextRegion
import org.eclipse.xtext.util.TextRegion
import org.jnario.RichString
import org.jnario.RichStringLiteral

import static extension com.google.common.base.Strings.nullToEmpty

class RichStringIndentationAnalyzer {

	static val PLACEHOLDER_OPEN = '«'
	static val PLACEHOLDER_CLOSE = '»'
	static val THREE_TICKS = "'''"

	static val LEADING_WHITESPACES_END_RICHSTRING = Pattern.compile("^(\\s*)" + THREE_TICKS + "$")
	static val LEADING_WHITESPACES_PATTERN = Pattern.compile("(\\s*).*")
	static val LINE_PATTERN = Pattern.compile("\r?\n")
	
	

	@Accessors(PUBLIC_GETTER)
	var String indentation = "";

	private new() {
	}

	private def doAnalyze(RichString rs) {
		// if the first one is just the empty rich-string opener, we dont care about it
		var Iterable<String> lines = rs.expressions
										.filter(RichStringLiteral)
										.map[it.value.nullToEmpty.getLines]
										.flatten
										.toList

		if (lines.size == 1) {
			//if this is just one line, we dont do anything about the indentation
			indentation = "";
		} else {
			if (lines.head != null && lines.head == "'''") {
				lines = lines.tail
			}
			
			val last = lines.last;
			if (last != null && last.isJustIndentation){
				lines = lines.take(lines.size - 1)
			}

			indentation = lines.map[it.rawText.indentation]
								.minBy[it.length]
		}

	}
	
	def isJustIndentation(String string) {
		return LEADING_WHITESPACES_END_RICHSTRING.matcher(string).matches
	}

	private def getLines(String string) {
		Splitter.on(LINE_PATTERN).split(string)
	}

	public static def analzye(RichString rs) {
		val analyzer = new RichStringIndentationAnalyzer();
		analyzer.doAnalyze(rs);
		return analyzer
	}

	/**
	 * returns the text-region that contains the raw-text (Without the rich-string related characters)
	 */
	def ITextRegion getRawTextRegion(String string) {
		var value = string
		var int offset = 0;
		var int length = string.length;

		if (value.startsWith(THREE_TICKS)) {
			// '''bla bla bla...
			offset += THREE_TICKS.length
		}
		if (value.startsWith(PLACEHOLDER_CLOSE)) {
			// » bla bla bla...
			offset += PLACEHOLDER_CLOSE.length
		}
		if (value.endsWith(PLACEHOLDER_OPEN) && value.length > PLACEHOLDER_OPEN.length) {
			// bla bla bla «...
			length -= PLACEHOLDER_OPEN.length;
		}
		if (value.endsWith(THREE_TICKS) && value.length > THREE_TICKS.length) {
			// / bla bla bla'''
			length -= THREE_TICKS.length
		}
		length -= offset
		return new TextRegion(offset, length)
	}

	/**
	 * removes any Richstring-related prefix or suffix:´
	 * ''' 	pre- and suffix
	 * « 	prefix
	 * » 	suffix
	 */
	def getRawText(String string) {
		val region = string.rawTextRegion
		return string.subSequence(region.offset, region.offset + region.length).toString
	}

	def getCommonIndentationLength() {
		return indentation.length
	}

	def shouldCropIndentation(String line) {
		return line.startsWith(indentation)
	}

	/**
	 * removes unnecessary leading whitespaces from the given string  
	 */
	def correctIndentation(String string) {
		if (string.shouldCropIndentation) {
			return string.substring(indentation.length)
		}
		return string
	}

	private def String getIndentation(String string) {
		val pattern = LEADING_WHITESPACES_PATTERN
		// Get first char that is not a whitespace
		val matcher = pattern.matcher(string)
		if (matcher.matches) {
			return matcher.group(1)
		}
		return ""
	}

}
