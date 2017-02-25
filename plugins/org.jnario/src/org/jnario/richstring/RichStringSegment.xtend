//package org.jnario.richstring
//
//import org.eclipse.emf.ecore.EObject
//import org.eclipse.xtend.lib.annotations.Data
//import org.eclipse.xtext.nodemodel.util.NodeModelUtils
//import org.eclipse.xtext.util.ITextRegion
//import org.eclipse.xtext.util.TextRegion
//import org.eclipse.xtext.xbase.XExpression
//import org.jnario.RichStringLiteral
//import org.jnario.richstring.RichStringProcessor.RichStringAcceptor
//
//import static org.jnario.richstring.RichStringIndentationAnalyzer.PLACEHOLDER_CLOSE
//import static org.jnario.richstring.RichStringIndentationAnalyzer.PLACEHOLDER_OPEN
//import static org.jnario.richstring.RichStringIndentationAnalyzer.THREE_TICKS
//
//interface IRichStringProcessable {
//	def void process(RichStringAcceptor acceptor, String indentation);
//}
//
//interface IRichStringHighlightable{
//	public def ITextRegion getHighlightArea(int indentation)
//}
//
//@Data
//class RichStringExpression implements IRichStringProcessable{
//	
//	val XExpression semanticObject
//	
//	override process(RichStringAcceptor acceptor, String indentation) {
//		acceptor.accept(semanticObject, indentation)
//	}
//	
//}
//
//@Data
//class RichStringSegment implements IRichStringProcessable, IRichStringHighlightable{
//
//	val EObject literal;
//	val ITextRegion region;
//
//	public def getSegment() {
//		return getSegment(0)
//	}
//
//	private def getSegment(int indentation) {
//		if (literal instanceof RichStringLiteral) {
//			val offset = region.offset + indentation
//			return literal.value.substring(offset, offset + region.length - indentation)
//		}
//		return "";
//	}
//
//	private def int getAbsOffset() {
//		return NodeModelUtils.getNode(literal).offset + region.offset
//	}
//
//	private def int getLength() {
//		return region.length
//	}
//
//	public override ITextRegion getHighlightArea(int indentation) {
//		var offset = getAbsOffset()
//		var length = getLength()
//		val segment = getSegment(0);
//
//		if (segment.startsWith(THREE_TICKS)) {
//			// [''' abc «]
//			offset = offset + THREE_TICKS.length
//			length = length - THREE_TICKS.length
//		} else if (segment.startsWith(PLACEHOLDER_CLOSE)) {
//			// [» abc''']
//			offset = offset + PLACEHOLDER_CLOSE.length
//			length = length - PLACEHOLDER_CLOSE.length
//		}
//
//		if (segment.endsWith(PLACEHOLDER_OPEN)) {
//			// [''' abc «]
//			length = length - PLACEHOLDER_OPEN.length
//		} else if (segment.endsWith(THREE_TICKS)) {
//			// [» abc''']
//			length = length - THREE_TICKS.length
//		}
//
//		return new TextRegion(offset + indentation, if (length - indentation > 0) length - indentation else 0)
//	}
//	
//	override process(RichStringAcceptor acceptor, String indentation){
//		acceptor.processLine(getSegment(indentation.length))
//	}
//	
//}
