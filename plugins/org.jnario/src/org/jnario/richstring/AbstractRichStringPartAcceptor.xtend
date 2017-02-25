package org.jnario.richstring

import java.util.BitSet
import org.eclipse.xtext.common.types.JvmFormalParameter
import org.eclipse.xtext.xbase.XExpression
import org.jnario.RichStringLiteral

public abstract class AbstractRichStringPartAcceptor implements IRichStringPartAcceptor {
	override void acceptSemanticText(CharSequence text, /* @Nullable */ RichStringLiteral origin) {
	}

	override void acceptTemplateText(CharSequence text, /* @Nullable */ RichStringLiteral origin) {
	}

	override void acceptSemanticLineBreak(int charCount, RichStringLiteral origin, boolean controlStructureSeen) {
	}

	override void acceptTemplateLineBreak(int charCount, RichStringLiteral origin) {
	}

	override void acceptIfCondition(XExpression condition) {
	}

	override void acceptElseIfCondition(XExpression condition) {
	}

	override void acceptElse() {
	}

	override void acceptEndIf() {
	}

	override void acceptForLoop(JvmFormalParameter parameter, XExpression expression) {
	}

	override void acceptEndFor( /* @Nullable */ XExpression after, CharSequence indentation) {
	}

	override void acceptExpression(XExpression expression, CharSequence indentation) {
	}

	override void announceNextLiteral(RichStringLiteral object) {
	}

	static class ForLoopOnce extends AbstractRichStringPartAcceptor {
		BitSet forLoopStack = new BitSet()
		int forLoopStackPointer = -1

		override void acceptForLoop(JvmFormalParameter parameter, /* @Nullable */ XExpression expression) {
			forLoopStackPointer++
			forLoopStack.set(forLoopStackPointer)
		}

		override boolean forLoopHasNext( /* @Nullable */ XExpression before, /* @Nullable */ XExpression separator,
			CharSequence indentation) {
			if (forLoopStack.get(forLoopStackPointer)) {
				forLoopStack.set(forLoopStackPointer, false)
				return true
			}
			return false
		}

		override void acceptEndFor( /* @Nullable */ XExpression after, CharSequence indentation) {
			forLoopStackPointer--
		}
	}
}