package org.jnario.xbase.richstring.conversion;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.xbase.conversion.XbaseValueConverterService;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class XbaseWithRichstringValueConverterService extends XbaseValueConverterService {

	@Inject
	private RichTextEndValueConverter richTextEndValueConverter;

	@ValueConverter(rule = "RICH_TEXT_END")
	public IValueConverter<String> getRichTextEndValueConverter() {
		return richTextEndValueConverter;
	}

	@Inject
	private RichTextStartValueConverter richTextStartValueConverter;
	
	@ValueConverter(rule = "RICH_TEXT_START")
	public IValueConverter<String> getRichTextStartValueConverter() {
		return richTextStartValueConverter;
	}

	@Inject
	private RichTextInBetweenValueConverter richTextInbetweenValueConverter;
	
	@ValueConverter(rule = "RICH_TEXT_INBETWEEN")
	public IValueConverter<String> getRichTextInbetweenValueConverter() {
		return richTextInbetweenValueConverter;
	}
	
	@Inject
	private RichTextValueConverter richTextValueConverter;
	
	@ValueConverter(rule = "RICH_TEXT")
	public IValueConverter<String> getRichTextValueConverter() {
		return richTextValueConverter;
	}
	
//	@Inject
//	private JnarioCommentRichTextInBetweenValueConverter commentRichTextInBetweenValueConverter;

	// TODO NO_XTEND
//	@ValueConverter(rule = "COMMENT_RICH_TEXT_INBETWEEN")
//	public IValueConverter<String> getCommentRichTextInBetweenValueConverter() {
//		return commentRichTextInBetweenValueConverter;
//	}

	//TODO NO_XTEND
//	@Inject
//	private JnarioCommentRichTextEndValueConverter commentRichTextEndValueConverter;
////
//	@ValueConverter(rule = "COMMENT_RICH_TEXT_END")
//	public IValueConverter<String> getCommentRichTextEndValueConverter() {
//		return commentRichTextEndValueConverter;
//	}

//	@ValueConverter(rule = "STRING")
//	public IValueConverter<String> getRichStringValueConverter() {
//		return richStringValueConverter;
//	}
}
