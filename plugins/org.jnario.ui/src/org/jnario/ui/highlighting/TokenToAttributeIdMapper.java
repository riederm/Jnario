package org.jnario.ui.highlighting;

import org.eclipse.xtext.ide.editor.syntaxcoloring.HighlightingStyles;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;

import com.google.inject.Singleton;

import static org.jnario.ui.highlighting.JnarioHighlightingConfiguration.*;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 * @author Holger Schill
 */
@Singleton
public class TokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {

	@Override
	protected String getMappedValue(int tokenType) {
//		if(tokenType == XtendDocumentTokenSource.JAVA_DOC_TOKEN_TYPE){
//			return HighlightingStyles.COMMENT_ID;
//		}
		return super.getMappedValue(tokenType);
	}

	@Override
	protected String calculateId(String tokenName, int tokenType) {
		if(
			"RULE_RICH_TEXT".equals(tokenName) || 
			"RULE_RICH_TEXT_START".equals(tokenName) ||
			"RULE_RICH_TEXT_END".equals(tokenName) ||
			"RULE_RICH_TEXT_INBETWEEN".equals(tokenName) ||
			"RULE_COMMENT_RICH_TEXT_END".equals(tokenName) ||
			"RULE_COMMENT_RICH_TEXT_INBETWEEN".equals(tokenName)) {
			return RICH_TEXT_ID;
			
//		} else if ("RULE_SL_COMMENT".equals(tokenName)) {
//			return SINGLE_LINE_COMMENT;
//		
//		} else if("RULE_ML_COMMENT".equals(tokenName)) {
//			return MULTI_LINE_COMMENT;
			
		} else {
			return super.calculateId(tokenName, tokenType);			
		}
	}
}
