package org.jnario.spec.ui.highlighting;

import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;
import org.eclipse.xtext.xbase.ui.highlighting.XbaseHighlightingConfiguration;
import org.jnario.ui.highlighting.JnarioHighlightingCalculator;

@SuppressWarnings("all")
public class SpecHighlightingConfiguration extends XbaseHighlightingConfiguration {
  @Override
  public void configure(final IHighlightingConfigurationAcceptor acceptor) {
    super.configure(acceptor);
    acceptor.acceptDefaultHighlighting(JnarioHighlightingCalculator.RICH_STRING_STYLE, "RichString", this.richTextStyle());
  }
  
  public TextStyle richTextStyle() {
    final TextStyle textStyle = this.stringTextStyle().copy();
    RGB _rGB = new RGB(220, 220, 220);
    textStyle.setBackgroundColor(_rGB);
    return textStyle;
  }
}
