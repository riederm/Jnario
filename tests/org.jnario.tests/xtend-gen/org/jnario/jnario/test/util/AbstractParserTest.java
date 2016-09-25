/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.jnario.test.util;

import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.resource.FileExtensionProvider;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.jnario.jnario.test.util.ClassPathUriProviderBuilder;
import org.jnario.jnario.test.util.IUriProvider;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.Resources;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("all")
public class AbstractParserTest {
  @Inject
  @Extension
  private ModelStore _modelStore;
  
  @Inject
  private FileExtensionProvider fileExtensionProvider;
  
  @Before
  public void setup() {
    boolean _equals = Objects.equal(this.fileExtensionProvider, null);
    if (_equals) {
      return;
    }
    Set<String> _fileExtensions = this.fileExtensionProvider.getFileExtensions();
    final String fileExtension = IterableExtensions.<String>head(_fileExtensions);
    Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
    final Object factory = _extensionToFactoryMap.get(fileExtension);
    Map<String, Object> _extensionToFactoryMap_1 = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
    _extensionToFactoryMap_1.put((fileExtension + "_"), factory);
  }
  
  @Test
  public void shouldParseAllFilesWithoutParseError() {
    Class<?> _context = this.context();
    boolean _equals = Objects.equal(_context, null);
    if (_equals) {
      return;
    }
    Class<?> _context_1 = this.context();
    ClassPathUriProviderBuilder _startingFrom = ClassPathUriProviderBuilder.startingFrom(_context_1);
    final Predicate<URI> _function = new Predicate<URI>() {
      @Override
      public boolean apply(final URI it) {
        return AbstractParserTest.this.onlySpecFiles(it);
      }
    };
    IUriProvider _select = _startingFrom.select(_function);
    this._modelStore.load(_select);
    List<Resource> _resources = this._modelStore.resources();
    final Function1<Resource, Boolean> _function_1 = new Function1<Resource, Boolean>() {
      @Override
      public Boolean apply(final Resource it) {
        URI _uRI = it.getURI();
        return Boolean.valueOf(AbstractParserTest.this.onlySpecFiles(_uRI));
      }
    };
    Iterable<Resource> _filter = IterableExtensions.<Resource>filter(_resources, _function_1);
    final ArrayList<Resource> specs = Lists.<Resource>newArrayList(_filter);
    final Consumer<Resource> _function_2 = new Consumer<Resource>() {
      @Override
      public void accept(final Resource resource) {
        Resources.checkForParseErrors(resource);
      }
    };
    specs.forEach(_function_2);
  }
  
  public Class<?> context() {
    return null;
  }
  
  public boolean onlySpecFiles(final URI uri) {
    String _strippedFileExtension = this.strippedFileExtension(uri);
    return this.fileExtensionProvider.isValid(_strippedFileExtension);
  }
  
  public String strippedFileExtension(final URI uri) {
    String _xblockexpression = null;
    {
      String _fileExtension = null;
      if (uri!=null) {
        _fileExtension=uri.fileExtension();
      }
      final String fileExtension = _fileExtension;
      boolean _equals = Objects.equal(fileExtension, null);
      if (_equals) {
        return "";
      }
      int _length = fileExtension.length();
      int _minus = (_length - 1);
      _xblockexpression = fileExtension.substring(0, _minus);
    }
    return _xblockexpression;
  }
  
  public String errorMessage(final Iterable<Issue> issues) {
    final StringBuilder result = new StringBuilder();
    for (final Issue issue : issues) {
      {
        final StringBuilder issueBuilder = this.createIssueMessage(issue);
        result.append(issueBuilder);
      }
    }
    return result.toString();
  }
  
  public StringBuilder createIssueMessage(final Issue issue) {
    URI _uriToProblem = issue.getUriToProblem();
    final URI resourceUri = _uriToProblem.trimFragment();
    final StringBuilder issueBuilder = new StringBuilder("\n");
    Severity _severity = issue.getSeverity();
    StringBuilder _append = issueBuilder.append(_severity);
    _append.append(": \t");
    String _lastSegment = resourceUri.lastSegment();
    StringBuilder _append_1 = issueBuilder.append(_lastSegment);
    _append_1.append(" - ");
    boolean _isFile = resourceUri.isFile();
    if (_isFile) {
      String _fileString = resourceUri.toFileString();
      issueBuilder.append(_fileString);
    }
    StringBuilder _append_2 = issueBuilder.append("\n");
    Integer _lineNumber = issue.getLineNumber();
    StringBuilder _append_3 = _append_2.append(_lineNumber);
    StringBuilder _append_4 = _append_3.append(": ");
    String _message = issue.getMessage();
    _append_4.append(_message);
    return issueBuilder;
  }
}
