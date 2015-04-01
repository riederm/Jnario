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
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.documentation.IFileHeaderProvider;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.util.Strings;
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
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.JnarioClass;
import org.jnario.JnarioField;
import org.jnario.JnarioFile;
import org.jnario.JnarioFunction;
import org.jnario.JnarioMember;
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
  
  @Inject
  @Extension
  private TypesFactory typesFactory;
  
  @Override
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
          @Override
          public Boolean apply(final XAnnotation it) {
            return Boolean.valueOf(JnarioJvmModelInferrer.this.hasExtendsAnnotation(it));
          }
        };
        Iterable<XAnnotation> _filter = IterableExtensions.<XAnnotation>filter(_annotations, _function);
        final Function1<XAnnotation, XTypeLiteral> _function_1 = new Function1<XAnnotation, XTypeLiteral>() {
          @Override
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
  
  protected void initialize(final JnarioClass source, final JvmGenericType inferredJvmType) {
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
      @Override
      public void apply(final JvmGenericType it) {
        it.setVisibility(JvmVisibility.PUBLIC);
        boolean _isStatic = source.isStatic();
        it.setStatic(_isStatic);
      }
    };
    ObjectExtensions.<JvmGenericType>operator_doubleArrow(inferredJvmType, _function);
    EList<XAnnotation> _annotations = source.getAnnotations();
    this._jvmTypesBuilder.translateAnnotationsTo(_annotations, inferredJvmType);
    final JvmTypeReference extendsClause = source.getExtends();
    boolean _or = false;
    boolean _equals = Objects.equal(extendsClause, null);
    if (_equals) {
      _or = true;
    } else {
      JvmType _type = extendsClause.getType();
      boolean _equals_1 = Objects.equal(_type, null);
      _or = _equals_1;
    }
    if (_or) {
      EList<JvmTypeReference> _superTypes = inferredJvmType.getSuperTypes();
      JvmTypeReference _typeForName = this._typeReferences.getTypeForName(Object.class, source);
      _superTypes.add(_typeForName);
    } else {
      EList<JvmTypeReference> _superTypes_1 = inferredJvmType.getSuperTypes();
      JvmTypeReference _cloneWithProxies = this._jvmTypesBuilder.cloneWithProxies(extendsClause);
      _superTypes_1.add(_cloneWithProxies);
    }
    EList<JnarioMember> _members = source.getMembers();
    for (final JnarioMember member : _members) {
      boolean _or_1 = false;
      if ((member instanceof JnarioField)) {
        _or_1 = true;
      } else {
        boolean _and = false;
        if (!(member instanceof JnarioFunction)) {
          _and = false;
        } else {
          String _name = ((JnarioFunction) member).getName();
          boolean _notEquals = (!Objects.equal(_name, null));
          _and = _notEquals;
        }
        _or_1 = _and;
      }
      if (_or_1) {
        this.transform(member, inferredJvmType);
      }
    }
    this._jvmTypesBuilder.copyDocumentationTo(source, inferredJvmType);
  }
  
  protected void _transform(final JnarioField source, final JvmGenericType container) {
    boolean _or = false;
    boolean _and = false;
    boolean _isExtension = source.isExtension();
    if (!_isExtension) {
      _and = false;
    } else {
      JvmTypeReference _type = source.getType();
      boolean _notEquals = (!Objects.equal(_type, null));
      _and = _notEquals;
    }
    if (_and) {
      _or = true;
    } else {
      String _name = source.getName();
      boolean _notEquals_1 = (!Objects.equal(_name, null));
      _or = _notEquals_1;
    }
    if (_or) {
      JvmField _createJvmField = this.typesFactory.createJvmField();
      final Procedure1<JvmField> _function = new Procedure1<JvmField>() {
        @Override
        public void apply(final JvmField it) {
          String _computeFieldName = JnarioJvmModelInferrer.this.computeFieldName(source);
          it.setSimpleName(_computeFieldName);
          JvmVisibility _visibility = source.getVisibility();
          it.setVisibility(_visibility);
          boolean _isStatic = source.isStatic();
          it.setStatic(_isStatic);
          boolean _isTransient = source.isTransient();
          it.setTransient(_isTransient);
          boolean _isVolatile = source.isVolatile();
          it.setVolatile(_isVolatile);
          boolean _isFinal = source.isFinal();
          it.setFinal(_isFinal);
          JvmTypeReference _type = source.getType();
          boolean _notEquals = (!Objects.equal(_type, null));
          if (_notEquals) {
            JvmTypeReference _type_1 = source.getType();
            JvmTypeReference _cloneWithProxies = JnarioJvmModelInferrer.this._jvmTypesBuilder.cloneWithProxies(_type_1);
            it.setType(_cloneWithProxies);
          } else {
            XExpression _initialValue = source.getInitialValue();
            boolean _notEquals_1 = (!Objects.equal(_initialValue, null));
            if (_notEquals_1) {
              XExpression _initialValue_1 = source.getInitialValue();
              JvmTypeReference _inferredType = JnarioJvmModelInferrer.this._jvmTypesBuilder.inferredType(_initialValue_1);
              it.setType(_inferredType);
            }
          }
          boolean _and = false;
          boolean _isExtension = source.isExtension();
          if (!_isExtension) {
            _and = false;
          } else {
            JvmType _findDeclaredType = JnarioJvmModelInferrer.this._typeReferences.findDeclaredType(Extension.class, source);
            boolean _notEquals_2 = (!Objects.equal(_findDeclaredType, null));
            _and = _notEquals_2;
          }
          if (_and) {
            EList<JvmAnnotationReference> _annotations = it.getAnnotations();
            JvmAnnotationReference _annotation = JnarioJvmModelInferrer.this._jvmTypesBuilder.toAnnotation(source, Extension.class);
            _annotations.add(_annotation);
          }
          EList<XAnnotation> _annotations_1 = source.getAnnotations();
          for (final XAnnotation anno : _annotations_1) {
            {
              final JvmAnnotationReference annotationReference = JnarioJvmModelInferrer.this._jvmTypesBuilder.getJvmAnnotationReference(anno);
              boolean _notEquals_3 = (!Objects.equal(annotationReference, null));
              if (_notEquals_3) {
                EList<JvmAnnotationReference> _annotations_2 = it.getAnnotations();
                _annotations_2.add(annotationReference);
              }
            }
          }
          XExpression _initialValue_2 = source.getInitialValue();
          JnarioJvmModelInferrer.this._jvmTypesBuilder.setInitializer(it, _initialValue_2);
        }
      };
      final JvmField field = ObjectExtensions.<JvmField>operator_doubleArrow(_createJvmField, _function);
      EList<JvmMember> _members = container.getMembers();
      _members.add(field);
      this._iJvmModelAssociator.associatePrimary(source, field);
      this._jvmTypesBuilder.copyDocumentationTo(source, field);
    }
  }
  
  protected void _transform(final JnarioMember source, final JvmGenericType container) {
    throw new RuntimeException("Not implemented");
  }
  
  protected String computeFieldName(final JnarioField field) {
    String _xblockexpression = null;
    {
      String _name = field.getName();
      boolean _notEquals = (!Objects.equal(_name, null));
      if (_notEquals) {
        return field.getName();
      }
      JvmTypeReference type = field.getType();
      String name = null;
      boolean _notEquals_1 = (!Objects.equal(type, null));
      if (_notEquals_1) {
        while ((type instanceof JvmGenericArrayTypeReference)) {
          JvmTypeReference _componentType = ((JvmGenericArrayTypeReference)type).getComponentType();
          type = _componentType;
        }
        if ((type instanceof JvmParameterizedTypeReference)) {
          final List<INode> nodes = NodeModelUtils.findNodesForFeature(type, 
            TypesPackage.Literals.JVM_PARAMETERIZED_TYPE_REFERENCE__TYPE);
          boolean _isEmpty = nodes.isEmpty();
          boolean _not = (!_isEmpty);
          if (_not) {
            INode _get = nodes.get(0);
            String _text = _get.getText();
            String typeName = _text.trim();
            final int lastDot = typeName.lastIndexOf(".");
            if ((lastDot != (-1))) {
              String _substring = typeName.substring((lastDot + 1));
              typeName = _substring;
            }
            String _firstLower = Strings.toFirstLower(typeName);
            String _plus = ("_" + _firstLower);
            name = _plus;
          }
        }
      }
      _xblockexpression = name;
    }
    return _xblockexpression;
  }
  
  protected void transform(final JnarioMember source, final JvmGenericType container) {
    if (source instanceof JnarioField) {
      _transform((JnarioField)source, container);
      return;
    } else if (source != null) {
      _transform(source, container);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(source, container).toString());
    }
  }
}
