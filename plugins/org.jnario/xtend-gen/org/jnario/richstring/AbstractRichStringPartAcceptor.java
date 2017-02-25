package org.jnario.richstring;

import java.util.BitSet;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.xbase.XExpression;
import org.jnario.RichStringLiteral;
import org.jnario.richstring.IRichStringPartAcceptor;

@SuppressWarnings("all")
public abstract class AbstractRichStringPartAcceptor implements IRichStringPartAcceptor {
  public static class ForLoopOnce extends AbstractRichStringPartAcceptor {
    private BitSet forLoopStack = new BitSet();
    
    private int forLoopStackPointer = (-1);
    
    @Override
    public void acceptForLoop(final JvmFormalParameter parameter, final XExpression expression) {
      this.forLoopStackPointer++;
      this.forLoopStack.set(this.forLoopStackPointer);
    }
    
    @Override
    public boolean forLoopHasNext(final XExpression before, final XExpression separator, final CharSequence indentation) {
      boolean _get = this.forLoopStack.get(this.forLoopStackPointer);
      if (_get) {
        this.forLoopStack.set(this.forLoopStackPointer, false);
        return true;
      }
      return false;
    }
    
    @Override
    public void acceptEndFor(final XExpression after, final CharSequence indentation) {
      this.forLoopStackPointer--;
    }
  }
  
  @Override
  public void acceptSemanticText(final CharSequence text, final RichStringLiteral origin) {
  }
  
  @Override
  public void acceptTemplateText(final CharSequence text, final RichStringLiteral origin) {
  }
  
  @Override
  public void acceptSemanticLineBreak(final int charCount, final RichStringLiteral origin, final boolean controlStructureSeen) {
  }
  
  @Override
  public void acceptTemplateLineBreak(final int charCount, final RichStringLiteral origin) {
  }
  
  @Override
  public void acceptIfCondition(final XExpression condition) {
  }
  
  @Override
  public void acceptElseIfCondition(final XExpression condition) {
  }
  
  @Override
  public void acceptElse() {
  }
  
  @Override
  public void acceptEndIf() {
  }
  
  @Override
  public void acceptForLoop(final JvmFormalParameter parameter, final XExpression expression) {
  }
  
  @Override
  public void acceptEndFor(final XExpression after, final CharSequence indentation) {
  }
  
  @Override
  public void acceptExpression(final XExpression expression, final CharSequence indentation) {
  }
  
  @Override
  public void announceNextLiteral(final RichStringLiteral object) {
  }
}
