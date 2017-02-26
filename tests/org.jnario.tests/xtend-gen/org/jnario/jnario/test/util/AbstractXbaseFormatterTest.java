package org.jnario.jnario.test.util;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.xtext.formatting2.FormatterPreferenceKeys;
import org.eclipse.xtext.junit4.formatter.FormatterTestRequest;
import org.eclipse.xtext.junit4.formatter.FormatterTester;
import org.eclipse.xtext.preferences.MapBasedPreferenceValues;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public abstract class AbstractXbaseFormatterTest {
  @Inject
  @Extension
  private FormatterTester _formatterTester;
  
  public void assertFormatted(final CharSequence toBeFormatted) {
    this.assertFormatted(toBeFormatted, toBeFormatted);
  }
  
  public void assertFormattedExpression(final Procedure1<? super MapBasedPreferenceValues> cfg, final CharSequence toBeFormatted) {
    this.assertFormattedExpression(cfg, toBeFormatted, toBeFormatted);
  }
  
  public void assertFormattedExpression(final CharSequence toBeFormatted) {
    this.assertFormattedExpression(null, toBeFormatted, toBeFormatted);
  }
  
  public void assertFormattedExpression(final String expectation, final CharSequence toBeFormatted) {
    this.assertFormattedExpression(null, expectation, toBeFormatted);
  }
  
  public void assertFormattedExpression(final Procedure1<? super MapBasedPreferenceValues> cfg, final CharSequence expectation, final CharSequence toBeFormatted) {
    this.assertFormattedExpression(cfg, expectation, toBeFormatted, false);
  }
  
  public void assertFormattedExpression(final Procedure1<? super MapBasedPreferenceValues> cfg, final CharSequence expectation, final CharSequence toBeFormatted, final boolean allowErrors) {
    this.assertFormatted(cfg, 
      this.indent(expectation.toString().trim(), "\t"), 
      this.indent(toBeFormatted.toString().trim(), "\t"), 
      "{\n\t", 
      "\n}", allowErrors);
  }
  
  protected String indent(final String string, final String indent) {
    final Function1<String, String> _function = new Function1<String, String>() {
      @Override
      public String apply(final String it) {
        String _xifexpression = null;
        boolean _equals = Objects.equal(it, "");
        if (_equals) {
          _xifexpression = it;
        } else {
          _xifexpression = (indent + it);
        }
        return _xifexpression;
      }
    };
    return IterableExtensions.join(ListExtensions.<String, String>map(((List<String>)Conversions.doWrapArray(string.split("\\r?\\n"))), _function), "\n");
  }
  
  public void assertFormatted(final Procedure1<? super MapBasedPreferenceValues> cfg, final CharSequence expectation) {
    this.assertFormatted(cfg, expectation, expectation);
  }
  
  public void assertFormatted(final CharSequence expectation, final CharSequence toBeFormatted) {
    this.assertFormatted(null, expectation, toBeFormatted);
  }
  
  public void assertFormatted(final Procedure1<? super MapBasedPreferenceValues> cfg, final CharSequence expectation, final CharSequence toBeFormatted) {
    this.assertFormatted(cfg, expectation, toBeFormatted, "", "", true);
  }
  
  public void assertFormatted(final Procedure1<? super MapBasedPreferenceValues> cfg, final CharSequence expectation, final CharSequence toBeFormatted, final String prefix, final String postfix, final boolean allowErrors) {
    final Procedure1<FormatterTestRequest> _function = new Procedure1<FormatterTestRequest>() {
      @Override
      public void apply(final FormatterTestRequest it) {
        final Procedure1<MapBasedPreferenceValues> _function = new Procedure1<MapBasedPreferenceValues>() {
          @Override
          public void apply(final MapBasedPreferenceValues it) {
            it.put(FormatterPreferenceKeys.maxLineWidth, Integer.valueOf(80).toString());
            if (cfg!=null) {
              cfg.apply(it);
            }
          }
        };
        it.preferences(_function);
        it.setExpectation(((prefix + expectation) + postfix));
        it.setToBeFormatted(((prefix + toBeFormatted) + postfix));
        it.setAllowSyntaxErrors(allowErrors);
      }
    };
    this._formatterTester.assertFormatted(_function);
  }
}
