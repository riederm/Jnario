/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.doc;

import com.google.inject.Inject;
import java.util.Arrays;
import java.util.regex.Matcher;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.JnarioClass;
import org.jnario.JnarioMember;
import org.jnario.doc.AbstractDocGenerator;
import org.jnario.doc.HtmlFile;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.feature.Step;
import org.jnario.feature.jvmmodel.StepArgumentsProvider;
import org.jnario.feature.naming.FeatureClassNameProvider;
import org.jnario.feature.naming.StepNameProvider;

@SuppressWarnings("all")
public class FeatureDocGenerator extends AbstractDocGenerator {
  @Inject
  @Extension
  private FeatureClassNameProvider _featureClassNameProvider;
  
  @Inject
  @Extension
  private StepNameProvider _stepNameProvider;
  
  @Override
  public HtmlFile createHtmlFile(final JnarioClass xtendClass) {
    if ((!(xtendClass instanceof Feature))) {
      return HtmlFile.EMPTY_FILE;
    }
    final Feature feature = ((Feature) xtendClass);
    final Procedure1<HtmlFile> _function = new Procedure1<HtmlFile>() {
      @Override
      public void apply(final HtmlFile it) {
        String _javaClassName = FeatureDocGenerator.this._featureClassNameProvider.toJavaClassName(feature);
        it.setName(_javaClassName);
        String _name = feature.getName();
        it.setTitle(_name);
        CharSequence _generateContent = FeatureDocGenerator.this.generateContent(feature);
        it.setContent(_generateContent);
        String _root = FeatureDocGenerator.this.root(feature);
        it.setRootFolder(_root);
        EObject _eContainer = feature.eContainer();
        CharSequence _pre = FeatureDocGenerator.this.pre(_eContainer, "lang-feature");
        it.setSourceCode(_pre);
        String _fileName = FeatureDocGenerator.this.fileName(feature);
        it.setFileName(_fileName);
        String _executionStateClass = FeatureDocGenerator.this.executionStateClass(feature);
        it.setExecutionStatus(_executionStateClass);
      }
    };
    return HtmlFile.newHtmlFile(_function);
  }
  
  public CharSequence generateContent(final Feature feature) {
    StringConcatenation _builder = new StringConcatenation();
    String _description = feature.getDescription();
    String _markdown2Html = null;
    if (_description!=null) {
      _markdown2Html=this.markdown2Html(_description);
    }
    _builder.append(_markdown2Html, "");
    _builder.newLineIfNotEmpty();
    {
      EList<JnarioMember> _members = feature.getMembers();
      for(final JnarioMember member : _members) {
        CharSequence _generate = this.generate(member);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _generate(final Scenario scenario) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div><h3 class=\"scenario ");
    String _executionStateClass = this.executionStateClass(scenario);
    _builder.append(_executionStateClass, "");
    _builder.append("\" ");
    String _name = scenario.getName();
    String _id = this.id(_name);
    _builder.append(_id, "");
    _builder.append(">");
    String _name_1 = scenario.getName();
    _builder.append(_name_1, "");
    _builder.append("</h3>");
    _builder.newLineIfNotEmpty();
    EList<Step> _steps = scenario.getSteps();
    CharSequence _generate = this.generate(_steps);
    _builder.append(_generate, "");
    _builder.append("</div>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generate(final Iterable<Step> steps) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ul>");
    _builder.newLine();
    {
      for(final Step step : steps) {
        _builder.append("<li>");
        Object _generate = this.generate(step);
        _builder.append(_generate, "");
        _builder.append("</li>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</ul>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generate(final Step step) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<span class=\"step ");
    String _executionStateClass = this.executionStateClass(step);
    _builder.append(_executionStateClass, "");
    _builder.append("\">");
    String _format = this.format(step);
    _builder.append(_format, "");
    _builder.append("</span>");
    _builder.newLineIfNotEmpty();
    String _errorMessage = this.errorMessage(step);
    _builder.append(_errorMessage, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private String format(final Step step) {
    String _describe = this._stepNameProvider.describe(step);
    String result = Strings.convertFromJavaString(_describe, true);
    String _highlighFirstWord = this.highlighFirstWord(result);
    result = _highlighFirstWord;
    String _highlightArguments = this.highlightArguments(result);
    result = _highlightArguments;
    String _markdown2Html = this.markdown2Html(result);
    result = _markdown2Html;
    String _addCodeBlock = this.addCodeBlock(step);
    String _plus = (result + _addCodeBlock);
    result = _plus;
    return result;
  }
  
  private String highlightArguments(final String s) {
    Matcher _matcher = StepArgumentsProvider.ARG_PATTERN.matcher((" " + s));
    return _matcher.replaceAll("<code>$0</code>");
  }
  
  private String highlighFirstWord(final String s) {
    return s;
  }
  
  private String addCodeBlock(final Step step) {
    final String text = this._stepNameProvider.nameOf(step);
    final int multiLineStart = text.indexOf("\n");
    if ((multiLineStart == (-1))) {
      return "";
    }
    String _substring = text.substring(multiLineStart);
    String codeBlock = _substring.trim();
    int _length = StepArgumentsProvider.MULTILINE_STRING.length();
    int _length_1 = codeBlock.length();
    int _length_2 = StepArgumentsProvider.MULTILINE_STRING.length();
    int _minus = (_length_1 - _length_2);
    String _substring_1 = codeBlock.substring(_length, _minus);
    codeBlock = _substring_1;
    String _codeToHtml = this.codeToHtml(codeBlock);
    codeBlock = _codeToHtml;
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<pre>");
    _builder.append(codeBlock, "");
    _builder.append("</pre>");
    return _builder.toString();
  }
  
  public CharSequence generate(final Object scenario) {
    if (scenario instanceof Scenario) {
      return _generate((Scenario)scenario);
    } else if (scenario instanceof Step) {
      return _generate((Step)scenario);
    } else if (scenario instanceof Iterable) {
      return _generate((Iterable<Step>)scenario);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(scenario).toString());
    }
  }
}
