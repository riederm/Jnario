package org.jnario.richstring;

import com.google.common.base.Objects;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.common.collect.Iterables;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.util.ITextRegion;
import org.eclipse.xtext.util.TextRegion;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.jnario.RichString;
import org.jnario.RichStringLiteral;

@SuppressWarnings("all")
public class RichStringIndentationAnalyzer {
  private final static String PLACEHOLDER_OPEN = "«";
  
  private final static String PLACEHOLDER_CLOSE = "»";
  
  private final static String THREE_TICKS = "\'\'\'";
  
  private final static Pattern LEADING_WHITESPACES_END_RICHSTRING = Pattern.compile((("^(\\s*)" + RichStringIndentationAnalyzer.THREE_TICKS) + "$"));
  
  private final static Pattern LEADING_WHITESPACES_PATTERN = Pattern.compile("(\\s*).*");
  
  private final static Pattern LINE_PATTERN = Pattern.compile("\r?\n");
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private String indentation = "";
  
  private RichStringIndentationAnalyzer() {
  }
  
  private String doAnalyze(final RichString rs) {
    String _xblockexpression = null;
    {
      EList<XExpression> _expressions = rs.getExpressions();
      Iterable<RichStringLiteral> _filter = Iterables.<RichStringLiteral>filter(_expressions, RichStringLiteral.class);
      final Function1<RichStringLiteral, Iterable<String>> _function = new Function1<RichStringLiteral, Iterable<String>>() {
        @Override
        public Iterable<String> apply(final RichStringLiteral it) {
          String _value = it.getValue();
          String _nullToEmpty = Strings.nullToEmpty(_value);
          return RichStringIndentationAnalyzer.this.getLines(_nullToEmpty);
        }
      };
      Iterable<Iterable<String>> _map = IterableExtensions.<RichStringLiteral, Iterable<String>>map(_filter, _function);
      Iterable<String> _flatten = Iterables.<String>concat(_map);
      Iterable<String> lines = IterableExtensions.<String>toList(_flatten);
      String _xifexpression = null;
      int _size = IterableExtensions.size(lines);
      boolean _equals = (_size == 1);
      if (_equals) {
        _xifexpression = this.indentation = "";
      } else {
        String _xblockexpression_1 = null;
        {
          if (((!Objects.equal(IterableExtensions.<String>head(lines), null)) && Objects.equal(IterableExtensions.<String>head(lines), "\'\'\'"))) {
            Iterable<String> _tail = IterableExtensions.<String>tail(lines);
            lines = _tail;
          }
          final String last = IterableExtensions.<String>last(lines);
          if (((!Objects.equal(last, null)) && this.isJustIndentation(last))) {
            int _size_1 = IterableExtensions.size(lines);
            int _minus = (_size_1 - 1);
            Iterable<String> _take = IterableExtensions.<String>take(lines, _minus);
            lines = _take;
          }
          final Function1<String, String> _function_1 = new Function1<String, String>() {
            @Override
            public String apply(final String it) {
              String _rawText = RichStringIndentationAnalyzer.this.getRawText(it);
              return RichStringIndentationAnalyzer.this.getIndentation(_rawText);
            }
          };
          Iterable<String> _map_1 = IterableExtensions.<String, String>map(lines, _function_1);
          final Function1<String, Integer> _function_2 = new Function1<String, Integer>() {
            @Override
            public Integer apply(final String it) {
              return Integer.valueOf(it.length());
            }
          };
          String _minBy = IterableExtensions.<String, Integer>minBy(_map_1, _function_2);
          _xblockexpression_1 = this.indentation = _minBy;
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public boolean isJustIndentation(final String string) {
    Matcher _matcher = RichStringIndentationAnalyzer.LEADING_WHITESPACES_END_RICHSTRING.matcher(string);
    return _matcher.matches();
  }
  
  private Iterable<String> getLines(final String string) {
    Splitter _on = Splitter.on(RichStringIndentationAnalyzer.LINE_PATTERN);
    return _on.split(string);
  }
  
  public static RichStringIndentationAnalyzer analzye(final RichString rs) {
    final RichStringIndentationAnalyzer analyzer = new RichStringIndentationAnalyzer();
    analyzer.doAnalyze(rs);
    return analyzer;
  }
  
  /**
   * returns the text-region that contains the raw-text (Without the rich-string related characters)
   */
  public ITextRegion getRawTextRegion(final String string) {
    String value = string;
    int offset = 0;
    int length = string.length();
    boolean _startsWith = value.startsWith(RichStringIndentationAnalyzer.THREE_TICKS);
    if (_startsWith) {
      int _offset = offset;
      int _length = RichStringIndentationAnalyzer.THREE_TICKS.length();
      offset = (_offset + _length);
    }
    boolean _startsWith_1 = value.startsWith(RichStringIndentationAnalyzer.PLACEHOLDER_CLOSE);
    if (_startsWith_1) {
      int _offset_1 = offset;
      int _length_1 = RichStringIndentationAnalyzer.PLACEHOLDER_CLOSE.length();
      offset = (_offset_1 + _length_1);
    }
    if ((value.endsWith(RichStringIndentationAnalyzer.PLACEHOLDER_OPEN) && (value.length() > RichStringIndentationAnalyzer.PLACEHOLDER_OPEN.length()))) {
      int _length_2 = length;
      int _length_3 = RichStringIndentationAnalyzer.PLACEHOLDER_OPEN.length();
      length = (_length_2 - _length_3);
    }
    if ((value.endsWith(RichStringIndentationAnalyzer.THREE_TICKS) && (value.length() > RichStringIndentationAnalyzer.THREE_TICKS.length()))) {
      int _length_4 = length;
      int _length_5 = RichStringIndentationAnalyzer.THREE_TICKS.length();
      length = (_length_4 - _length_5);
    }
    int _length_6 = length;
    length = (_length_6 - offset);
    return new TextRegion(offset, length);
  }
  
  /**
   * removes any Richstring-related prefix or suffix:´
   * ''' 	pre- and suffix
   * « 	prefix
   * » 	suffix
   */
  public String getRawText(final String string) {
    final ITextRegion region = this.getRawTextRegion(string);
    int _offset = region.getOffset();
    int _offset_1 = region.getOffset();
    int _length = region.getLength();
    int _plus = (_offset_1 + _length);
    CharSequence _subSequence = string.subSequence(_offset, _plus);
    return _subSequence.toString();
  }
  
  public int getCommonIndentationLength() {
    return this.indentation.length();
  }
  
  public boolean shouldCropIndentation(final String line) {
    return line.startsWith(this.indentation);
  }
  
  /**
   * removes unnecessary leading whitespaces from the given string
   */
  public String correctIndentation(final String string) {
    boolean _shouldCropIndentation = this.shouldCropIndentation(string);
    if (_shouldCropIndentation) {
      int _length = this.indentation.length();
      return string.substring(_length);
    }
    return string;
  }
  
  private String getIndentation(final String string) {
    final Pattern pattern = RichStringIndentationAnalyzer.LEADING_WHITESPACES_PATTERN;
    final Matcher matcher = pattern.matcher(string);
    boolean _matches = matcher.matches();
    if (_matches) {
      return matcher.group(1);
    }
    return "";
  }
  
  @Pure
  public String getIndentation() {
    return this.indentation;
  }
}
