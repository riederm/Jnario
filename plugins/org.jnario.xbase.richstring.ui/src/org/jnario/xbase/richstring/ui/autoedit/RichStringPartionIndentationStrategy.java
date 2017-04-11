package org.jnario.xbase.richstring.ui.autoedit;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.DefaultIndentLineAutoEditStrategy;
import org.eclipse.jface.text.DocumentCommand;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.TextUtilities;

public class RichStringPartionIndentationStrategy extends DefaultIndentLineAutoEditStrategy {
	public void customizeDocumentCommand(IDocument d, DocumentCommand c) {
			if (c.text.length() > 1 && !TextUtilities.getDefaultLineDelimiter(d).contains(c.text)) {
				try {
					List<String> legalLineDelimiters = Arrays.asList(d.getLegalLineDelimiters());
					legalLineDelimiters	.sort((s1, s2) ->  Integer.compare(s1.length(),  s2.length()));
					Collections.reverse(legalLineDelimiters);
					
					String lineIndentation = getLineIndentation(d, c.offset);
					String defaultLineDelimiter = TextUtilities.getDefaultLineDelimiter(d);

					String regex = legalLineDelimiters.stream()
								.map(delimiter -> Pattern.quote(delimiter))
								.collect(Collectors.joining(")|(", "(", ")"));
					
							
					Pattern pattern = Pattern.compile(regex);
					Matcher matcher = pattern.matcher(c.text);
					StringBuilder convertedText = new StringBuilder();
					int currentStart = 0;
					int currentEnd = 0;
					while(matcher.find()) {
						currentEnd = matcher.start();
						if(currentStart != 0) 
							convertedText.append(lineIndentation);
						convertedText.append(c.text.substring(currentStart, currentEnd));
						convertedText.append(defaultLineDelimiter);
						currentStart = matcher.end();
					}
					if(currentStart < c.text.length()) {
						if(currentStart != 0) 
							convertedText.append(lineIndentation);
						convertedText.append(c.text.substring(currentStart));
					}
					c.text = convertedText.toString();
				} catch (BadLocationException e) {
					super.customizeDocumentCommand(d, c);
				}
			}
			super.customizeDocumentCommand(d, c);
		}


	public String getLineIndentation(IDocument document, int offset) throws BadLocationException {
		int adjustedOffset = (offset == document.getLength()) ? offset - 1 : offset;
		IRegion line = document.getLineInformationOfOffset(adjustedOffset);
		int start = line.getOffset();
		int end = findEndOfWhiteSpace(document, start, offset);
		return document.get(start, end - start);
	}
}
