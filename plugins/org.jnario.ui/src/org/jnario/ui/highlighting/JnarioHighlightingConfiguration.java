package org.jnario.ui.highlighting;

import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;
import org.jnario.xbase.richstring.ui.highlighting.XbaseWithRichstringHighlightingConfiguration;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 * @author Holger Schill
 */
public class JnarioHighlightingConfiguration extends XbaseWithRichstringHighlightingConfiguration {

	public static final String ACTIVE_ANNOTATION = "xtend.active.annotation";

	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(ACTIVE_ANNOTATION, "Active Annotation", activeAnnotationStyle());

		// acceptor.acceptDefaultHighlighting(SEMANTIC_LINE_BREAK, "",
		// insignificantTemplateTextStyle());
	}

	private TextStyle activeAnnotationStyle() {
		TextStyle textStyle = extensionMethodInvocation().copy();
		return textStyle;
	}

}
