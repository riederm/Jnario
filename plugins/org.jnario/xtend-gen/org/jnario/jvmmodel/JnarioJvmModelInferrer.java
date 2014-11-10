/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.jvmmodel;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.NoSuchElementException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.documentation.IFileHeaderProvider;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XTypeLiteral;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.jnario.JnarioClass;
import org.jnario.JnarioFile;
import org.jnario.JnarioTypeDeclaration;
import org.jnario.jvmmodel.JnarioNameProvider;
import org.jnario.jvmmodel.TestRuntimeProvider;
import org.jnario.jvmmodel.TestRuntimeSupport;
import org.jnario.runner.Extends;

/**
 * TODO NO_XTEND - verify all methods. Remove unused.
 * @author Birgit Engelmann
 * @author Sebastian Benz
 */
@SuppressWarnings("all")
public abstract class JnarioJvmModelInferrer implements IJvmModelInferrer {
  @Inject
  @Extension
  private IJvmModelAssociator _iJvmModelAssociator;
  
  @Inject
  @Extension
  private IFileHeaderProvider _iFileHeaderProvider;
  
  @Inject
  @Extension
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  public XbaseCompiler compiler;
  
  @Inject
  @Extension
  private TypeReferences _typeReferences;
  
  @Inject
  private TestRuntimeProvider runtime;
  
  @Inject
  @Extension
  private JnarioNameProvider _jnarioNameProvider;
  
  private TestRuntimeSupport testRuntime;
  
  public void infer(final EObject obj, final IJvmDeclaredTypeAcceptor acceptor, final boolean preIndexingPhase) {
    try {
      TestRuntimeSupport _get = this.runtime.get(obj);
      this.testRuntime = _get;
    } catch (final Throwable _t) {
      if (_t instanceof NoSuchElementException) {
        final NoSuchElementException ex = (NoSuchElementException)_t;
        return;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    this.doInfer(obj, acceptor, preIndexingPhase);
  }
  
  public void doInfer(final EObject e, final IJvmDeclaredTypeAcceptor acceptor, final boolean preIndexingPhase) {
    throw new UnsupportedOperationException();
  }
  
  public String serialize(final EObject obj) {
    ICompositeNode _node = NodeModelUtils.getNode(obj);
    String _text = null;
    if (_node!=null) {
      _text=_node.getText();
    }
    return _text;
  }
  
  public JnarioFile jnarioFile(final EObject obj) {
    return EcoreUtil2.<JnarioFile>getContainerOfType(obj, JnarioFile.class);
  }
  
  public String packageName(final EObject obj) {
    JnarioFile _jnarioFile = this.jnarioFile(obj);
    String _package = null;
    if (_jnarioFile!=null) {
      _package=_jnarioFile.getPackage();
    }
    return _package;
  }
  
  protected TestRuntimeSupport getTestRuntime() {
    return this.testRuntime;
  }
  
  protected void addSuperClass(final JnarioClass jnarioClass) {
    EObject xtendType = jnarioClass;
    while (((!Objects.equal(xtendType, null)) && (xtendType instanceof JnarioClass))) {
      {
        final JnarioClass current = ((JnarioClass) xtendType);
        EList<XAnnotation> _annotations = current.getAnnotations();
        final Function1<XAnnotation, Boolean> _function = new Function1<XAnnotation, Boolean>() {
          public Boolean apply(final XAnnotation it) {
            return Boolean.valueOf(JnarioJvmModelInferrer.this.hasExtendsAnnotation(it));
          }
        };
        Iterable<XAnnotation> _filter = IterableExtensions.<XAnnotation>filter(_annotations, _function);
        final Function1<XAnnotation, XTypeLiteral> _function_1 = new Function1<XAnnotation, XTypeLiteral>() {
          public XTypeLiteral apply(final XAnnotation it) {
            XExpression _value = it.getValue();
            return ((XTypeLiteral) _value);
          }
        };
        Iterable<XTypeLiteral> _map = IterableExtensions.<XAnnotation, XTypeLiteral>map(_filter, _function_1);
        for (final XTypeLiteral extendedType : _map) {
          JvmType _type = extendedType.getType();
          boolean _notEquals = (!Objects.equal(_type, null));
          if (_notEquals) {
            JvmType _type_1 = extendedType.getType();
            JvmParameterizedTypeReference _createTypeRef = this._typeReferences.createTypeRef(_type_1);
            jnarioClass.setExtends(_createTypeRef);
            return;
          }
        }
        EObject _eContainer = xtendType.eContainer();
        xtendType = _eContainer;
      }
    }
  }
  
  protected boolean hasExtendsAnnotation(final XAnnotation annotation) {
    boolean _and = false;
    JvmType _annotationType = annotation.getAnnotationType();
    String _qualifiedName = null;
    if (_annotationType!=null) {
      _qualifiedName=_annotationType.getQualifiedName();
    }
    String _name = Extends.class.getName();
    boolean _equals = Objects.equal(_qualifiedName, _name);
    if (!_equals) {
      _and = false;
    } else {
      XExpression _value = annotation.getValue();
      _and = (_value instanceof XTypeLiteral);
    }
    return _and;
  }
  
  protected void setNameAndAssociate(final JnarioFile file, final JnarioTypeDeclaration jnarioType, final JvmDeclaredType javaType) {
    String _package = file.getPackage();
    javaType.setPackageName(_package);
    String _javaClassName = this._jnarioNameProvider.toJavaClassName(jnarioType);
    javaType.setSimpleName(_javaClassName);
    javaType.setVisibility(JvmVisibility.PUBLIC);
    this.setFileHeader(file, javaType);
    this._iJvmModelAssociator.associatePrimary(jnarioType, javaType);
  }
  
  protected void setFileHeader(final JnarioFile jnarioFile, final JvmDeclaredType jvmDeclaredType) {
    Resource _eResource = jnarioFile.eResource();
    String _fileHeader = this._iFileHeaderProvider.getFileHeader(_eResource);
    this._jvmTypesBuilder.setFileHeader(jvmDeclaredType, _fileHeader);
  }
}
