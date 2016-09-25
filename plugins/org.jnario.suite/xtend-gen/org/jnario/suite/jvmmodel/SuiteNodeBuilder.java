/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.suite.jvmmodel;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.jnario.JnarioTypeDeclaration;
import org.jnario.Specification;
import org.jnario.suite.jvmmodel.SpecResolver;
import org.jnario.suite.jvmmodel.SuiteNode;
import org.jnario.suite.suite.Reference;
import org.jnario.suite.suite.Suite;
import org.jnario.suite.suite.SuiteFile;

@SuppressWarnings("all")
public class SuiteNodeBuilder {
  private final static char PREFIX = "#".charAt(0);
  
  @Inject
  @Extension
  private SpecResolver _specResolver;
  
  public Iterable<SuiteNode> buildNodeModel(final SuiteFile suiteFile) {
    ArrayList<SuiteNode> _xblockexpression = null;
    {
      EList<JnarioTypeDeclaration> _xtendTypes = suiteFile.getXtendTypes();
      Iterable<Suite> _filter = Iterables.<Suite>filter(_xtendTypes, Suite.class);
      final List<Suite> suites = IterableExtensions.<Suite>toList(_filter);
      final ArrayList<SuiteNode> result = CollectionLiterals.<SuiteNode>newArrayList();
      boolean _isEmpty = suites.isEmpty();
      if (_isEmpty) {
        return result;
      }
      final HashMap<EObject, SuiteNode> mapping = CollectionLiterals.<EObject, SuiteNode>newHashMap();
      int _size = suites.size();
      int _minus = (_size - 1);
      IntegerRange _upTo = new IntegerRange(0, _minus);
      for (final Integer i : _upTo) {
        {
          final Suite current = suites.get((i).intValue());
          Suite _parent = this.parent(suites, (i).intValue());
          final SuiteNode parentNode = mapping.get(_parent);
          final SuiteNode currentNode = this.createNode(current, parentNode);
          mapping.put(current, currentNode);
          boolean _equals = Objects.equal(parentNode, null);
          if (_equals) {
            result.add(currentNode);
          }
        }
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  public SuiteNode createNode(final Suite current, final SuiteNode parent) {
    EList<Reference> _elements = current.getElements();
    final Function1<Reference, List<Specification>> _function = new Function1<Reference, List<Specification>>() {
      @Override
      public List<Specification> apply(final Reference it) {
        return SuiteNodeBuilder.this._specResolver.resolveSpecs(it);
      }
    };
    List<List<Specification>> _map = ListExtensions.<Reference, List<Specification>>map(_elements, _function);
    final Iterable<Specification> specs = Iterables.<Specification>concat(_map);
    final SuiteNode node = new SuiteNode(current, specs);
    node.setParent(parent);
    return node;
  }
  
  public Suite parent(final List<Suite> suites, final int i) {
    if ((i == 0)) {
      return null;
    }
    Suite _get = suites.get(i);
    final int current = this.level(_get);
    IntegerRange _upTo = new IntegerRange((i - 1), 0);
    for (final Integer j : _upTo) {
      {
        final Suite candidate = suites.get((j).intValue());
        int _level = this.level(candidate);
        boolean _greaterThan = (current > _level);
        if (_greaterThan) {
          return candidate;
        }
      }
    }
    return null;
  }
  
  public int level(final Suite suite) {
    final String name = suite.getName();
    int i = 0;
    while ((i < name.length())) {
      {
        char _charAt = name.charAt(i);
        boolean _notEquals = (_charAt != SuiteNodeBuilder.PREFIX);
        if (_notEquals) {
          return i;
        }
        i = (i + 1);
      }
    }
    return i;
  }
}
