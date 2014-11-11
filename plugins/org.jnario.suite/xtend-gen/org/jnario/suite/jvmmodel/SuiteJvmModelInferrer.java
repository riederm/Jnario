/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.suite.jvmmodel;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.typing.IJvmTypeReferenceProvider;
import org.eclipse.xtext.xtype.XComputedTypeReference;
import org.eclipse.xtext.xtype.XtypeFactory;
import org.eclipse.xtext.xtype.impl.XComputedTypeReferenceImplCustom;
import org.jnario.Specification;
import org.jnario.jvmmodel.ExtendedJvmTypesBuilder;
import org.jnario.jvmmodel.JnarioJvmModelInferrer;
import org.jnario.suite.jvmmodel.SpecResolver;
import org.jnario.suite.jvmmodel.SuiteClassNameProvider;
import org.jnario.suite.jvmmodel.SuiteNode;
import org.jnario.suite.jvmmodel.SuiteNodeBuilder;
import org.jnario.suite.suite.Suite;

@SuppressWarnings("all")
public class SuiteJvmModelInferrer extends JnarioJvmModelInferrer {
  @Inject
  @Extension
  private ExtendedJvmTypesBuilder _extendedJvmTypesBuilder;
  
  @Inject
  @Extension
  private SuiteClassNameProvider _suiteClassNameProvider;
  
  @Inject
  @Extension
  private SpecResolver _specResolver;
  
  @Inject
  @Extension
  private TypeReferences _typeReferences;
  
  @Inject
  @Extension
  private SuiteNodeBuilder _suiteNodeBuilder;
  
  @Inject
  private TypesFactory typesFactory;
  
  @Inject(optional = true)
  private XtypeFactory xtypesFactory = XtypeFactory.eINSTANCE;
  
  public void doInfer(final EObject e, final IJvmDeclaredTypeAcceptor acceptor, final boolean preIndexingPhase) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method xtendFile is undefined for the type SuiteJvmModelInferrer");
  }
  
  public JvmGenericType infer(final SuiteNode node, final IJvmDeclaredTypeAcceptor acceptor, final List<Runnable> doLater, final boolean preIndexingPhase) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method initialize is undefined for the type SuiteJvmModelInferrer");
  }
  
  public Iterable<JvmTypeReference> children(final Suite suite) {
    Iterable<JvmTypeReference> _xblockexpression = null;
    {
      List<Specification> _resolveSpecs = this._specResolver.resolveSpecs(suite);
      final Function1<Specification, Boolean> _function = new Function1<Specification, Boolean>() {
        public Boolean apply(final Specification it) {
          String _javaClassName = SuiteJvmModelInferrer.this._suiteClassNameProvider.toJavaClassName(it);
          return Boolean.valueOf((!Objects.equal(_javaClassName, null)));
        }
      };
      final Iterable<Specification> specs = IterableExtensions.<Specification>filter(_resolveSpecs, _function);
      final Function1<Specification, String> _function_1 = new Function1<Specification, String>() {
        public String apply(final Specification it) {
          return SuiteJvmModelInferrer.this._suiteClassNameProvider.toQualifiedJavaClassName(it);
        }
      };
      final Iterable<String> types = IterableExtensions.<Specification, String>map(specs, _function_1);
      final Function1<String, JvmTypeReference> _function_2 = new Function1<String, JvmTypeReference>() {
        public JvmTypeReference apply(final String it) {
          return SuiteJvmModelInferrer.this.inferredType(it, suite);
        }
      };
      _xblockexpression = IterableExtensions.<String, JvmTypeReference>map(types, _function_2);
    }
    return _xblockexpression;
  }
  
  public JvmTypeReference inferredType(final String name, final EObject context) {
    final XComputedTypeReference result = this.xtypesFactory.createXComputedTypeReference();
    final IJvmTypeReferenceProvider _function = new IJvmTypeReferenceProvider() {
      public JvmTypeReference getTypeReference(final XComputedTypeReferenceImplCustom it) {
        return SuiteJvmModelInferrer.this._typeReferences.getTypeForName(name, context);
      }
    };
    result.setTypeProvider(_function);
    return result;
  }
}
