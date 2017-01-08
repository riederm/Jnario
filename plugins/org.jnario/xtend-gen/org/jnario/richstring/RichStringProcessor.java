package org.jnario.richstring;

import com.google.common.base.Objects;
import com.google.common.base.Splitter;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.regex.Pattern;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import org.jnario.RichString;
import org.jnario.RichStringLiteral;
import org.jnario.compiler.JnarioCompiler;
import org.jnario.richstring.RichStringIndentationAnalyzer;

@SuppressWarnings("all")
public class RichStringProcessor {
  public static class RichStringAcceptor {
    private final static Pattern NEW_LINE_PATTERN = Pattern.compile("\r?\n");
    
    private List<Procedure2<ITreeAppendable, String>> toBeAppended = CollectionLiterals.<Procedure2<ITreeAppendable, String>>newArrayList();
    
    private final JnarioCompiler compiler;
    
    @Extension
    private final RichStringIndentationAnalyzer indentationAnalyzer;
    
    @FinalFieldsConstructor
    public RichStringAcceptor(final JnarioCompiler compiler, final RichStringIndentationAnalyzer indentationAnalyzer) {
      super();
      this.compiler = compiler;
      this.indentationAnalyzer = indentationAnalyzer;
    }
    
    protected Boolean _accept(final XBlockExpression block) {
      final Procedure2<ITreeAppendable, String> _function = new Procedure2<ITreeAppendable, String>() {
        @Override
        public void apply(final ITreeAppendable appendable, final String variableName) {
          final String blockName = RichStringAcceptor.this.compileBlock(block, appendable);
          boolean _notEquals = (!Objects.equal(blockName, null));
          if (_notEquals) {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append(variableName, "");
            _builder.append(".append(");
            _builder.append(blockName, "");
            _builder.append(");");
            appendable.append(_builder);
            appendable.newLine();
          }
        }
      };
      return Boolean.valueOf(this.toBeAppended.add(_function));
    }
    
    public String compileBlock(final XBlockExpression expression, final ITreeAppendable appendable) {
      EList<XExpression> _expressions = expression.getExpressions();
      int _size = _expressions.size();
      boolean _equals = (_size == 1);
      if (_equals) {
        this.compiler.toJavaStatement(expression, appendable, true);
        appendable.newLine();
        EList<XExpression> _expressions_1 = expression.getExpressions();
        XExpression _get = _expressions_1.get(0);
        return appendable.getName(_get);
      } else {
        EList<XExpression> _expressions_2 = expression.getExpressions();
        int _size_1 = _expressions_2.size();
        boolean _greaterThan = (_size_1 > 1);
        if (_greaterThan) {
          this.compiler.toJavaStatement(expression, appendable, true);
          appendable.newLine();
          return appendable.getName(expression);
        }
      }
      return null;
    }
    
    protected Boolean _accept(final XExpression literal) {
      final Procedure2<ITreeAppendable, String> _function = new Procedure2<ITreeAppendable, String>() {
        @Override
        public void apply(final ITreeAppendable appendable, final String name) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append(name, "");
          _builder.append(".append(");
          appendable.append(_builder);
          RichStringAcceptor.this.compiler.toJavaExpression(literal, appendable);
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append(");");
          appendable.append(_builder_1);
          appendable.newLine();
        }
      };
      return Boolean.valueOf(this.toBeAppended.add(_function));
    }
    
    protected Boolean _accept(final RichStringLiteral literal) {
      final String value = literal.getValue();
      this.processLiteral(value);
      return null;
    }
    
    public void processLiteral(final String literal) {
      Splitter _on = Splitter.on(RichStringProcessor.RichStringAcceptor.NEW_LINE_PATTERN);
      String _rawText = this.indentationAnalyzer.getRawText(literal);
      Iterable<String> _split = _on.split(_rawText);
      final List<String> lines = IterableExtensions.<String>toList(_split);
      final String last = IterableExtensions.<String>last(lines);
      final String first = IterableExtensions.<String>head(lines);
      final Consumer<String> _function = new Consumer<String>() {
        @Override
        public void accept(final String it) {
          if (((it == first) && it.isEmpty())) {
            return;
          }
          final Procedure2<ITreeAppendable, String> _function = new Procedure2<ITreeAppendable, String>() {
            @Override
            public void apply(final ITreeAppendable appendable, final String variableName) {
              StringConcatenation _builder = new StringConcatenation();
              _builder.append(variableName, "");
              _builder.append(".append(\"");
              String _correctIndentation = RichStringAcceptor.this.indentationAnalyzer.correctIndentation(it);
              _builder.append(_correctIndentation, "");
              _builder.append("\");");
              appendable.append(_builder);
              appendable.newLine();
              if ((it != last)) {
                StringConcatenation _builder_1 = new StringConcatenation();
                _builder_1.append(variableName, "");
                _builder_1.append(".newLine();");
                appendable.append(_builder_1);
                appendable.newLine();
              }
            }
          };
          RichStringAcceptor.this.toBeAppended.add(_function);
        }
      };
      lines.forEach(_function);
    }
    
    public void appendTo(final ITreeAppendable appendable, final String variableName) {
      final Consumer<Procedure2<ITreeAppendable, String>> _function = new Consumer<Procedure2<ITreeAppendable, String>>() {
        @Override
        public void accept(final Procedure2<ITreeAppendable, String> it) {
          it.apply(appendable, variableName);
        }
      };
      this.toBeAppended.forEach(_function);
    }
    
    public Boolean accept(final XExpression literal) {
      if (literal instanceof RichStringLiteral) {
        return _accept((RichStringLiteral)literal);
      } else if (literal instanceof XBlockExpression) {
        return _accept((XBlockExpression)literal);
      } else if (literal != null) {
        return _accept(literal);
      } else {
        throw new IllegalArgumentException("Unhandled parameter types: " +
          Arrays.<Object>asList(literal).toString());
      }
    }
  }
  
  /**
   * generates the code that assigns the given RichString to variableName.
   */
  public void buildRichString(final RichString richString, final String variableName, final ITreeAppendable appendable, final JnarioCompiler compiler) {
    final RichStringIndentationAnalyzer analyzer = RichStringIndentationAnalyzer.analzye(richString);
    final RichStringProcessor.RichStringAcceptor acceptor = new RichStringProcessor.RichStringAcceptor(compiler, analyzer);
    EList<XExpression> _expressions = richString.getExpressions();
    final int noOfSegments = ((Object[])Conversions.unwrapArray(_expressions, Object.class)).length;
    EList<XExpression> _expressions_1 = richString.getExpressions();
    Iterable<XExpression> _take = IterableExtensions.<XExpression>take(_expressions_1, (noOfSegments - 1));
    final Procedure2<XExpression, Integer> _function = new Procedure2<XExpression, Integer>() {
      @Override
      public void apply(final XExpression it, final Integer index) {
        acceptor.accept(it);
      }
    };
    IterableExtensions.<XExpression>forEach(_take, _function);
    EList<XExpression> _expressions_2 = richString.getExpressions();
    final XExpression last = IterableExtensions.<XExpression>last(_expressions_2);
    if ((last instanceof RichStringLiteral)) {
      String value = ((RichStringLiteral)last).getValue();
      String newline = "\r\n";
      String _indentation = analyzer.getIndentation();
      String _plus = (newline + _indentation);
      String emptyLastLine = (_plus + "\'\'\'");
      boolean _endsWith = value.endsWith(emptyLastLine);
      if (_endsWith) {
        int _length = value.length();
        int _length_1 = emptyLastLine.length();
        int _minus = (_length - _length_1);
        String _substring = value.substring(0, _minus);
        value = _substring;
      } else {
        newline = "\n";
        String _indentation_1 = analyzer.getIndentation();
        String _plus_1 = (newline + _indentation_1);
        String _plus_2 = (_plus_1 + "\'\'\'");
        emptyLastLine = _plus_2;
        boolean _endsWith_1 = value.endsWith(emptyLastLine);
        if (_endsWith_1) {
          int _length_2 = value.length();
          int _length_3 = emptyLastLine.length();
          int _minus_1 = (_length_2 - _length_3);
          String _substring_1 = value.substring(0, _minus_1);
          value = _substring_1;
        }
      }
      acceptor.processLiteral(value);
    }
    acceptor.appendTo(appendable, variableName);
  }
}
