/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.jnario.test.util;

import com.google.inject.Inject;
import java.util.Iterator;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.Resources;
import org.jnario.lib.JnarioIterableExtensions;

@SuppressWarnings("all")
public class ScopeTestExtension implements Iterable {
  @Inject
  private ModelStore store;
  
  @Inject
  @Extension
  private IScopeProvider _iScopeProvider;
  
  public Resource parseSpec(final CharSequence content) {
    return this.store.parseSpec(content);
  }
  
  public Resource parseSuite(final CharSequence content) {
    return this.store.parseSuite(content);
  }
  
  public Resource parseFeature(final CharSequence content) {
    return this.store.parseScenario(content);
  }
  
  public Set<String> scope(final EObject context, final EReference ref) {
    Set<String> _xblockexpression = null;
    {
      Resources.addContainerStateAdapter(this.store.getResourceSet());
      _xblockexpression = this.scope(this._iScopeProvider.getScope(context, ref));
    }
    return _xblockexpression;
  }
  
  public Set<String> scope(final IScope scope) {
    final Function1<IEObjectDescription, String> _function = new Function1<IEObjectDescription, String>() {
      @Override
      public String apply(final IEObjectDescription it) {
        return it.toString();
      }
    };
    return IterableExtensions.<String>toSet(IterableExtensions.<IEObjectDescription, String>map(scope.getAllElements(), _function));
  }
  
  @Override
  public Iterator iterator() {
    return this.store.iterator();
  }
  
  public EObject first(final Class<? extends EObject> type) {
    return JnarioIterableExtensions.first(this, type);
  }
  
  public EObject second(final Class<? extends EObject> type) {
    return JnarioIterableExtensions.second(this, type);
  }
}
