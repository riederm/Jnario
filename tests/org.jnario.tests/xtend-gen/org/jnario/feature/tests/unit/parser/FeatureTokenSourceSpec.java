/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.tests.unit.parser;

import java.util.List;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.parser.antlr.TokenAcceptor;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import org.jnario.feature.parser.FeatureTokenSource;
import org.jnario.feature.parser.antlr.internal.InternalFeatureLexer;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("FeatureTokenSource")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class FeatureTokenSourceSpec {
  @Subject
  public FeatureTokenSource subject;
  
  TokenAcceptor tokenAcceptor = new TokenAcceptor();
  
  static String prefix = "package test\n";
  
  CharSequence input;
  
  @Test
  @Named("Splits feature")
  @Order(1)
  public void _splitsFeature() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Feature: example");
    _builder.newLine();
    this.setInput(_builder.toString());
    CommonToken _ken = this.token(InternalFeatureLexer.RULE_FEATURE_TEXT, "Feature: example\n", 1);
    this.assertSplitsIn(_ken);
  }
  
  @Test
  @Named("Splits incomplete feature")
  @Order(2)
  public void _splitsIncompleteFeature() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Feature: example");
    this.setInput(_builder.toString());
    CommonToken _ken = this.token(InternalFeatureLexer.RULE_FEATURE_TEXT, "Feature: example", 1);
    this.assertSplitsIn(_ken);
  }
  
  @Test
  @Named("Splits incomplete feature with text")
  @Order(3)
  public void _splitsIncompleteFeatureWithText() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Feature: example");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("some text");
    this.setInput(_builder.toString());
    CommonToken _ken = this.token(InternalFeatureLexer.RULE_FEATURE_TEXT, "Feature: example\n", 1);
    CommonToken _ken_1 = this.token(InternalFeatureLexer.RULE_TEXT, " some text", 2);
    this.assertSplitsIn(_ken, _ken_1);
  }
  
  @Test
  @Named("Splits incomplete feature with text and new line")
  @Order(4)
  public void _splitsIncompleteFeatureWithTextAndNewLine() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Feature: example");
    _builder.newLine();
    _builder.append("some text");
    _builder.newLine();
    this.setInput(_builder.toString());
    CommonToken _ken = this.token(InternalFeatureLexer.RULE_FEATURE_TEXT, "Feature: example\n", 1);
    CommonToken _ken_1 = this.token(InternalFeatureLexer.RULE_TEXT, "some text\n", 2);
    this.assertSplitsIn(_ken, _ken_1);
  }
  
  @Test
  @Named("Splits feature with text and scenario")
  @Order(5)
  public void _splitsFeatureWithTextAndScenario() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Feature: example");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("Text1");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("Text2");
    _builder.newLine();
    _builder.append("Scenario: scenario1");
    _builder.newLine();
    this.setInput(_builder.toString());
    CommonToken _ken = this.token(InternalFeatureLexer.RULE_FEATURE_TEXT, "Feature: example\n", 1);
    CommonToken _ken_1 = this.token(InternalFeatureLexer.RULE_TEXT, "  Text1\n  Text2\n", 2);
    CommonToken _ken_2 = this.token(InternalFeatureLexer.RULE_SCENARIO_TEXT, "Scenario: scenario1\n", 4);
    this.assertSplitsIn(_ken, _ken_1, _ken_2);
  }
  
  @Test
  @Named("splits feature with text and background")
  @Order(6)
  public void _splitsFeatureWithTextAndBackground() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Feature: example");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("Text1");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("Text2");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("Background: scenario1");
    _builder.newLine();
    this.setInput(_builder.toString());
    CommonToken _ken = this.token(InternalFeatureLexer.RULE_FEATURE_TEXT, "Feature: example\n", 1);
    CommonToken _ken_1 = this.token(InternalFeatureLexer.RULE_TEXT, "  Text1\n  Text2\n  ", 2);
    CommonToken _ken_2 = this.token(InternalFeatureLexer.RULE_BACKGROUND_TEXT, "Background: scenario1\n", 4);
    this.assertSplitsIn(_ken, _ken_1, _ken_2);
  }
  
  @Test
  @Named("splits feature with text")
  @Order(7)
  public void _splitsFeatureWithText() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Feature: example");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("Text1");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("Text2");
    _builder.newLine();
    this.setInput(_builder.toString());
    CommonToken _ken = this.token(InternalFeatureLexer.RULE_FEATURE_TEXT, "Feature: example\n", 1);
    CommonToken _ken_1 = this.token(InternalFeatureLexer.RULE_TEXT, "  Text1\n  Text2\n", 2);
    this.assertSplitsIn(_ken, _ken_1);
  }
  
  @Test
  @Named("splits feature with scenario")
  @Order(8)
  public void _splitsFeatureWithScenario() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Feature: example");
    _builder.newLine();
    _builder.append("Scenario: scenario1");
    this.setInput(_builder.toString());
    CommonToken _ken = this.token(InternalFeatureLexer.RULE_FEATURE_TEXT, "Feature: example\n", 1);
    CommonToken _ken_1 = this.token(InternalFeatureLexer.RULE_SCENARIO_TEXT, "Scenario: scenario1", 2);
    this.assertSplitsIn(_ken, _ken_1);
  }
  
  @Test
  @Named("splits feature with scenario and line break")
  @Order(9)
  public void _splitsFeatureWithScenarioAndLineBreak() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Feature: example");
    _builder.newLine();
    _builder.append("Scenario: scenario1");
    _builder.newLine();
    this.setInput(_builder.toString());
    CommonToken _ken = this.token(InternalFeatureLexer.RULE_FEATURE_TEXT, "Feature: example\n", 1);
    CommonToken _ken_1 = this.token(InternalFeatureLexer.RULE_SCENARIO_TEXT, "Scenario: scenario1\n", 2);
    this.assertSplitsIn(_ken, _ken_1);
  }
  
  @Test
  @Named("splits feature with background")
  @Order(10)
  public void _splitsFeatureWithBackground() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Feature: example");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("Background:");
    _builder.newLine();
    this.setInput(_builder.toString());
    CommonToken _ken = this.token(InternalFeatureLexer.RULE_FEATURE_TEXT, "Feature: example\n", 1);
    CommonToken _ken_1 = this.token(InternalFeatureLexer.RULE_TEXT, " ", 2);
    CommonToken _ken_2 = this.token(InternalFeatureLexer.RULE_BACKGROUND_TEXT, "Background:\n", 2);
    this.assertSplitsIn(_ken, _ken_1, _ken_2);
  }
  
  public void assertSplitsIn(@Extension final CommonToken... expectedTokens) {
    CommonToken _ken = this.token(this.input);
    this.split(_ken);
    final List<Token> actualTokens = IteratorExtensions.<Token>toList(this.tokenAcceptor);
    int _size = actualTokens.size();
    int _size_1 = ((List<CommonToken>)Conversions.doWrapArray(expectedTokens)).size();
    boolean _doubleArrow = Should.<Integer>operator_doubleArrow(Integer.valueOf(_size), Integer.valueOf(_size_1));
    Assert.assertTrue("\nExpected actualTokens.size => expectedTokens.size but"
     + "\n     actualTokens.size is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_size)).toString()
     + "\n     actualTokens is " + new org.hamcrest.StringDescription().appendValue(actualTokens).toString()
     + "\n     expectedTokens.size is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_size_1)).toString()
     + "\n     expectedTokens is " + new org.hamcrest.StringDescription().appendValue(((List<CommonToken>)Conversions.doWrapArray(expectedTokens))).toString() + "\n", _doubleArrow);
    
    final Procedure2<Token, Integer> _function = new Procedure2<Token, Integer>() {
      @Override
      public void apply(final Token e, final Integer i) {
        final CommonToken expected = expectedTokens[(i).intValue()];
        final CommonToken actual = ((CommonToken) e);
        int _type = actual.getType();
        int _type_1 = expected.getType();
        boolean _doubleArrow = Should.<Integer>operator_doubleArrow(Integer.valueOf(_type), Integer.valueOf(_type_1));
        Assert.assertTrue("\nExpected actual.type => expected.type but"
         + "\n     actual.type is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_type)).toString()
         + "\n     actual is " + new org.hamcrest.StringDescription().appendValue(actual).toString()
         + "\n     expected.type is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_type_1)).toString()
         + "\n     expected is " + new org.hamcrest.StringDescription().appendValue(expected).toString() + "\n", _doubleArrow);
        
        String _text = actual.getText();
        String _text_1 = expected.getText();
        boolean _doubleArrow_1 = Should.<String>operator_doubleArrow(_text, _text_1);
        Assert.assertTrue("\nExpected actual.text => expected.text but"
         + "\n     actual.text is " + new org.hamcrest.StringDescription().appendValue(_text).toString()
         + "\n     actual is " + new org.hamcrest.StringDescription().appendValue(actual).toString()
         + "\n     expected.text is " + new org.hamcrest.StringDescription().appendValue(_text_1).toString()
         + "\n     expected is " + new org.hamcrest.StringDescription().appendValue(expected).toString() + "\n", _doubleArrow_1);
        
        int _line = actual.getLine();
        int _line_1 = expected.getLine();
        Assert.assertTrue("\nExpected actual.line => expected.line but"
         + "\n     actual.line is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_line)).toString()
         + "\n     actual is " + new org.hamcrest.StringDescription().appendValue(actual).toString()
         + "\n     expected.line is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_line_1)).toString()
         + "\n     expected is " + new org.hamcrest.StringDescription().appendValue(expected).toString() + "\n", Should.<Integer>operator_doubleArrow(Integer.valueOf(_line), Integer.valueOf(_line_1)));
        
      }
    };
    IterableExtensions.<Token>forEach(actualTokens, _function);
  }
  
  public CommonToken token(@Extension final int type, @Extension final String text, @Extension final int line) {
    final CommonToken result = new CommonToken(type, text);
    result.setLine(line);
    return result;
  }
  
  public CommonToken token(@Extension final CharSequence text) {
    CommonToken _xblockexpression = null;
    {
      String _string = text.toString();
      final ANTLRStringStream input = new ANTLRStringStream(_string);
      final int start = FeatureTokenSourceSpec.prefix.length();
      String _string_1 = text.toString();
      int _length = _string_1.length();
      final int stop = (_length - 1);
      _xblockexpression = new CommonToken(input, (-1), (-1), start, stop);
    }
    return _xblockexpression;
  }
  
  public CharSequence setInput(@Extension final CharSequence input) {
    String _string = input.toString();
    String _replace = _string.replace("\r", "");
    String _plus = (FeatureTokenSourceSpec.prefix + _replace);
    return this.input = _plus;
  }
  
  public void split(@Extension final Token token) {
    this.subject.doSplitToken(token, this.tokenAcceptor);
  }
}
