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
import java.util.function.Consumer;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.FileExtensionProvider;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.jnario.jnario.test.util.ClassPathUriProviderBuilder;
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
    final String fileExtension = IterableExtensions.<String>head(this.fileExtensionProvider.getFileExtensions());
    final Object factory = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().get(fileExtension);
    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put((fileExtension + "_"), factory);
  }
  
  @Test
  public void shouldParseAllFilesWithoutParseError() {
    Class<?> _context = this.context();
    boolean _equals = Objects.equal(_context, null);
    if (_equals) {
      return;
    }
    final Predicate<URI> _function = new Predicate<URI>() {
      @Override
      public boolean apply(final URI it) {
        return AbstractParserTest.this.onlySpecFiles(it);
      }
    };
    this._modelStore.load(ClassPathUriProviderBuilder.startingFrom(this.context()).select(_function));
    final Function1<Resource, Boolean> _function_1 = new Function1<Resource, Boolean>() {
      @Override
      public Boolean apply(final Resource it) {
        return Boolean.valueOf(AbstractParserTest.this.onlySpecFiles(it.getURI()));
      }
    };
    final ArrayList<Resource> specs = Lists.<Resource>newArrayList(IterableExtensions.<Resource>filter(this._modelStore.resources(), _function_1));
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
    return this.fileExtensionProvider.isValid(this.strippedFileExtension(uri));
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
    final URI resourceUri = issue.getUriToProblem().trimFragment();
    final StringBuilder issueBuilder = new StringBuilder("\n");
    issueBuilder.append(issue.getSeverity()).append(": \t");
    issueBuilder.append(resourceUri.lastSegment()).append(" - ");
    boolean _isFile = resourceUri.isFile();
    if (_isFile) {
      issueBuilder.append(resourceUri.toFileString());
    }
    issueBuilder.append("\n").append(issue.getLineNumber()).append(": ").append(issue.getMessage());
    return issueBuilder;
  }
}
