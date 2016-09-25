/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.spec.doc;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.ExampleTable;
import org.jnario.JnarioClass;
import org.jnario.JnarioMember;
import org.jnario.JnarioPackage;
import org.jnario.doc.AbstractDocGenerator;
import org.jnario.doc.Filter;
import org.jnario.doc.FilterExtractor;
import org.jnario.doc.FilteringResult;
import org.jnario.doc.HtmlFile;
import org.jnario.spec.naming.ExampleNameProvider;
import org.jnario.spec.spec.Example;
import org.jnario.spec.spec.ExampleGroup;

@SuppressWarnings("all")
public class SpecDocGenerator extends AbstractDocGenerator {
  @Inject
  @Extension
  private ExampleNameProvider _exampleNameProvider;
  
  @Inject
  @Extension
  private FilterExtractor _filterExtractor;
  
  @Override
  public HtmlFile createHtmlFile(final JnarioClass xtendClass) {
    HtmlFile _xblockexpression = null;
    {
      if ((!(xtendClass instanceof ExampleGroup))) {
        return HtmlFile.EMPTY_FILE;
      }
      final ExampleGroup exampleGroup = ((ExampleGroup) xtendClass);
      final Procedure1<HtmlFile> _function = new Procedure1<HtmlFile>() {
        @Override
        public void apply(final HtmlFile it) {
          String _javaClassName = SpecDocGenerator.this._exampleNameProvider.toJavaClassName(exampleGroup);
          it.setName(_javaClassName);
          String _asTitle = SpecDocGenerator.this.asTitle(exampleGroup);
          it.setTitle(_asTitle);
          CharSequence _generateContent = SpecDocGenerator.this.generateContent(exampleGroup);
          it.setContent(_generateContent);
          String _root = SpecDocGenerator.this.root(exampleGroup);
          it.setRootFolder(_root);
          EObject _eContainer = xtendClass.eContainer();
          CharSequence _pre = SpecDocGenerator.this.pre(_eContainer, "lang-spec");
          it.setSourceCode(_pre);
          String _fileName = SpecDocGenerator.this.fileName(xtendClass);
          it.setFileName(_fileName);
          String _executionStateClass = SpecDocGenerator.this.executionStateClass(exampleGroup);
          it.setExecutionStatus(_executionStateClass);
        }
      };
      _xblockexpression = HtmlFile.newHtmlFile(_function);
    }
    return _xblockexpression;
  }
  
  private CharSequence generateContent(final ExampleGroup exampleGroup) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateDoc = this.generateDoc(exampleGroup);
    _builder.append(_generateDoc, "");
    _builder.newLineIfNotEmpty();
    StringConcatenation _generateMembers = this.generateMembers(exampleGroup, 1);
    _builder.append(_generateMembers, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private StringConcatenation generateMembers(final ExampleGroup exampleGroup, final int level) {
    final StringConcatenation result = new StringConcatenation();
    boolean inList = false;
    EList<JnarioMember> _members = exampleGroup.getMembers();
    final Function1<JnarioMember, Boolean> _function = new Function1<JnarioMember, Boolean>() {
      @Override
      public Boolean apply(final JnarioMember it) {
        return Boolean.valueOf((((it instanceof Example) || (it instanceof ExampleGroup)) || (it instanceof ExampleTable)));
      }
    };
    final Iterable<JnarioMember> members = IterableExtensions.<JnarioMember>filter(_members, _function);
    for (final JnarioMember member : members) {
      {
        final boolean isExampleGroup = (member instanceof ExampleGroup);
        if ((inList && (!isExampleGroup))) {
          result.append("<li>");
          CharSequence _generate = this.generate(member, level);
          result.append(_generate);
          result.append("</li>");
        } else {
          if (((!inList) && (!isExampleGroup))) {
            result.append("<ul>");
            result.append("<li>");
            CharSequence _generate_1 = this.generate(member, level);
            result.append(_generate_1);
            result.append("</li>");
            inList = true;
          } else {
            if ((inList && isExampleGroup)) {
              result.append("</ul>");
              CharSequence _generate_2 = this.generate(member, level);
              result.append(_generate_2);
              inList = false;
            } else {
              if (((!inList) && isExampleGroup)) {
                CharSequence _generate_3 = this.generate(member, level);
                result.append(_generate_3);
              }
            }
          }
        }
      }
    }
    if (inList) {
      result.append("</ul>");
    }
    return result;
  }
  
  private CharSequence generateDoc(final EObject eObject) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _documentation = this.documentation(eObject);
      boolean _notEquals = (!Objects.equal(_documentation, null));
      if (_notEquals) {
        String _documentation_1 = this.documentation(eObject);
        String _markdown2Html = this.markdown2Html(_documentation_1);
        _builder.append(_markdown2Html, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _generate(final JnarioMember member, final int level) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _generate(final Example example, final int level) {
    CharSequence _xblockexpression = null;
    {
      String docString = this.documentation(example);
      List<Filter> filters = CollectionLiterals.<Filter>emptyList();
      boolean _notEquals = (!Objects.equal(docString, null));
      if (_notEquals) {
        final FilteringResult filterResult = this._filterExtractor.apply(docString);
        List<Filter> _filters = filterResult.getFilters();
        filters = _filters;
        String _string = filterResult.getString();
        docString = _string;
        String _markdown2Html = this.markdown2Html(docString);
        docString = _markdown2Html;
      }
      StringConcatenation _builder = new StringConcatenation();
      {
        String _name = example.getName();
        boolean _notEquals_1 = (!Objects.equal(_name, null));
        if (_notEquals_1) {
          _builder.append("<p");
          String _name_1 = example.getName();
          String _id = this.id(_name_1);
          _builder.append(_id, "");
          _builder.append(" class=\"example ");
          String _executionStateClass = this.executionStateClass(example);
          _builder.append(_executionStateClass, "");
          _builder.append("\"><strong>");
          String _describe = this._exampleNameProvider.describe(example);
          String _decode = this.decode(_describe);
          _builder.append(_decode, "");
          _builder.append("</strong></p>");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append(docString, "");
      _builder.newLineIfNotEmpty();
      {
        if (((!example.isPending()) && example.eIsSet(JnarioPackage.Literals.JNARIO_FUNCTION__EXPRESSION))) {
          CharSequence _codeBlock = this.toCodeBlock(example, filters);
          _builder.append(_codeBlock, "");
          _builder.newLineIfNotEmpty();
        }
      }
      String _errorMessage = this.errorMessage(example);
      _builder.append(_errorMessage, "");
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence toCodeBlock(final Example example, final List<Filter> filters) {
    CharSequence _xblockexpression = null;
    {
      String prefix = "<pre class=\"prettyprint lang-spec linenums\">";
      String _apply = this.apply(filters, prefix);
      prefix = _apply;
      XExpression _expression = example.getExpression();
      final String code = this.serialize(_expression, filters);
      int _length = code.length();
      boolean _equals = (_length == 0);
      if (_equals) {
        return "";
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(prefix, "");
      _builder.newLineIfNotEmpty();
      _builder.append(code, "");
      _builder.append("</pre>");
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _generate(final ExampleTable table, final int level) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<p");
    String _fieldName = this._exampleNameProvider.toFieldName(table);
    String _id = this.id(_fieldName);
    _builder.append(_id, "");
    _builder.append("><strong>");
    String _fieldName_1 = this._exampleNameProvider.toFieldName(table);
    String _title = this.toTitle(_fieldName_1);
    _builder.append(_title, "");
    _builder.append("</strong></p>");
    _builder.newLineIfNotEmpty();
    CharSequence _generateDoc = this.generateDoc(table);
    _builder.append(_generateDoc, "");
    _builder.newLineIfNotEmpty();
    CharSequence _generate = super.generate(table);
    _builder.append(_generate, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generate(final ExampleGroup exampleGroup, final int level) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((level > 1)) {
        _builder.append("<div class=\"level\">");
        _builder.newLine();
      }
    }
    _builder.append("<h");
    String _header = this.header(exampleGroup, level);
    _builder.append(_header, "");
    _builder.append(" class=\"exampleGroup ");
    String _executionStateClass = this.executionStateClass(exampleGroup);
    _builder.append(_executionStateClass, "");
    _builder.append("\" ");
    String _describe = this._exampleNameProvider.describe(exampleGroup);
    String _id = this.id(_describe);
    _builder.append(_id, "");
    _builder.append(">");
    String _asTitle = this.asTitle(exampleGroup);
    _builder.append(_asTitle, "");
    _builder.append("</h");
    String _header_1 = this.header(exampleGroup, level);
    _builder.append(_header_1, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    CharSequence _generateDoc = this.generateDoc(exampleGroup);
    _builder.append(_generateDoc, "");
    _builder.newLineIfNotEmpty();
    StringConcatenation _generateMembers = this.generateMembers(exampleGroup, (level + 1));
    _builder.append(_generateMembers, "");
    _builder.newLineIfNotEmpty();
    {
      if ((level > 1)) {
        _builder.append("</div>");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  private String header(final ExampleGroup exampleGroup, final int level) {
    String _xifexpression = null;
    if ((level <= 1)) {
      _xifexpression = "3";
    } else {
      String _xifexpression_1 = null;
      if ((level == 2)) {
        _xifexpression_1 = "4";
      } else {
        _xifexpression_1 = "5";
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  protected String _asTitle(final ExampleGroup exampleGroup) {
    String _describe = this._exampleNameProvider.describe(exampleGroup);
    return this.toTitle(_describe);
  }
  
  protected String _asTitle(final Example example) {
    String _describe = this._exampleNameProvider.describe(example);
    return this.toTitle(_describe);
  }
  
  public CharSequence generate(final JnarioMember exampleGroup, final int level) {
    if (exampleGroup instanceof ExampleGroup) {
      return _generate((ExampleGroup)exampleGroup, level);
    } else if (exampleGroup instanceof Example) {
      return _generate((Example)exampleGroup, level);
    } else if (exampleGroup instanceof ExampleTable) {
      return _generate((ExampleTable)exampleGroup, level);
    } else if (exampleGroup != null) {
      return _generate(exampleGroup, level);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(exampleGroup, level).toString());
    }
  }
  
  public String asTitle(final EObject exampleGroup) {
    if (exampleGroup instanceof ExampleGroup) {
      return _asTitle((ExampleGroup)exampleGroup);
    } else if (exampleGroup instanceof Example) {
      return _asTitle((Example)exampleGroup);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(exampleGroup).toString());
    }
  }
}
