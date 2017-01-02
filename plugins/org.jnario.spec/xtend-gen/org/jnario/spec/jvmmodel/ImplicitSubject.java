/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.spec.jvmmodel;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
import com.google.inject.Inject;
import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.JnarioFunction;
import org.jnario.JnarioMember;
import org.jnario.jvmmodel.ExtendedJvmTypesBuilder;
import org.jnario.runner.Subject;
import org.jnario.spec.jvmmodel.Constants;
import org.jnario.spec.spec.ExampleGroup;
import org.jnario.spec.spec.TestFunction;
import org.jnario.util.Nodes;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("all")
public class ImplicitSubject {
  @Inject
  @Extension
  private ExtendedJvmTypesBuilder _extendedJvmTypesBuilder;
  
  public void addImplicitSubject(final JvmGenericType type, final ExampleGroup exampleGroup) {
    final JvmTypeReference targetType = this.resolveTargetType(exampleGroup);
    if ((Objects.equal(targetType, null) || targetType.eIsProxy())) {
      return;
    }
    boolean _hasSubject = this.hasSubject(type);
    if (_hasSubject) {
      return;
    }
    boolean _neverUsesSubject = this.neverUsesSubject(exampleGroup);
    if (_neverUsesSubject) {
      return;
    }
    EList<JvmMember> _members = type.getMembers();
    final Procedure1<JvmField> _function = new Procedure1<JvmField>() {
      @Override
      public void apply(final JvmField it) {
        boolean _doesNotInitializeSubject = ImplicitSubject.this.doesNotInitializeSubject(exampleGroup);
        if (_doesNotInitializeSubject) {
          EList<JvmAnnotationReference> _annotations = it.getAnnotations();
          JvmAnnotationReference _annotation = ImplicitSubject.this._extendedJvmTypesBuilder.toAnnotation(exampleGroup, Subject.class);
          ImplicitSubject.this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotation);
        }
        it.setVisibility(JvmVisibility.PUBLIC);
      }
    };
    JvmField _field = this._extendedJvmTypesBuilder.toField(exampleGroup, Constants.SUBJECT_FIELD_NAME, targetType, _function);
    _members.add(0, _field);
  }
  
  public JvmTypeReference resolveTargetType(final ExampleGroup exampleGroup) {
    JvmTypeReference _targetType = exampleGroup.getTargetType();
    boolean _notEquals = (!Objects.equal(_targetType, null));
    if (_notEquals) {
      JvmTypeReference _targetType_1 = exampleGroup.getTargetType();
      return this._extendedJvmTypesBuilder.cloneWithProxies(_targetType_1);
    }
    final ExampleGroup parentGroup = this.parent(exampleGroup);
    boolean _equals = Objects.equal(parentGroup, null);
    if (_equals) {
      return null;
    }
    return this.resolveTargetType(parentGroup);
  }
  
  public ExampleGroup parent(final ExampleGroup exampleGroup) {
    EObject _eContainer = exampleGroup.eContainer();
    return EcoreUtil2.<ExampleGroup>getContainerOfType(_eContainer, ExampleGroup.class);
  }
  
  public boolean hasSubject(final JvmGenericType type) {
    EList<JvmMember> _members = type.getMembers();
    final Iterable<JvmField> fields = Iterables.<JvmField>filter(_members, JvmField.class);
    final Function1<JvmField, Boolean> _function = new Function1<JvmField, Boolean>() {
      @Override
      public Boolean apply(final JvmField it) {
        String _simpleName = it.getSimpleName();
        return Boolean.valueOf(Objects.equal(_simpleName, Constants.SUBJECT_FIELD_NAME));
      }
    };
    final JvmField subjectField = IterableExtensions.<JvmField>findFirst(fields, _function);
    boolean _notEquals = (!Objects.equal(subjectField, null));
    if (_notEquals) {
      return true;
    }
    JvmTypeReference _extendedClass = type.getExtendedClass();
    JvmType _type = null;
    if (_extendedClass!=null) {
      _type=_extendedClass.getType();
    }
    final JvmType extendedClass = _type;
    boolean _equals = Objects.equal(extendedClass, null);
    if (_equals) {
      return false;
    }
    return this.hasSubject(((JvmGenericType) extendedClass));
  }
  
  public boolean neverUsesSubject(final ExampleGroup exampleGroup) {
    Iterator<XAbstractFeatureCall> allFeatureCalls = Iterators.<XAbstractFeatureCall>emptyIterator();
    final EList<JnarioMember> members = exampleGroup.getMembers();
    Iterable<JnarioFunction> _filter = Iterables.<JnarioFunction>filter(members, JnarioFunction.class);
    Iterable<TestFunction> _filter_1 = Iterables.<TestFunction>filter(members, TestFunction.class);
    Iterable<JnarioFunction> _plus = Iterables.<JnarioFunction>concat(_filter, _filter_1);
    for (final JnarioFunction example : _plus) {
      TreeIterator<EObject> _eAllContents = example.eAllContents();
      UnmodifiableIterator<XAbstractFeatureCall> _filter_2 = Iterators.<XAbstractFeatureCall>filter(_eAllContents, XAbstractFeatureCall.class);
      Iterator<XAbstractFeatureCall> _concat = Iterators.<XAbstractFeatureCall>concat(allFeatureCalls, _filter_2);
      allFeatureCalls = _concat;
    }
    final Function1<XAbstractFeatureCall, Boolean> _function = new Function1<XAbstractFeatureCall, Boolean>() {
      @Override
      public Boolean apply(final XAbstractFeatureCall it) {
        String _concreteSyntaxFeatureName = it.getConcreteSyntaxFeatureName();
        return Boolean.valueOf(Objects.equal(_concreteSyntaxFeatureName, Constants.SUBJECT_FIELD_NAME));
      }
    };
    XAbstractFeatureCall _findFirst = IteratorExtensions.<XAbstractFeatureCall>findFirst(allFeatureCalls, _function);
    return Objects.equal(null, _findFirst);
  }
  
  public boolean doesNotInitializeSubject(final ExampleGroup exampleGroup) {
    Iterator<XAssignment> allAssignments = Iterators.<XAssignment>emptyIterator();
    final EList<JnarioMember> members = exampleGroup.getMembers();
    Iterable<JnarioFunction> _filter = Iterables.<JnarioFunction>filter(members, JnarioFunction.class);
    Iterable<TestFunction> _filter_1 = Iterables.<TestFunction>filter(members, TestFunction.class);
    Iterable<JnarioFunction> _plus = Iterables.<JnarioFunction>concat(_filter, _filter_1);
    for (final JnarioFunction example : _plus) {
      TreeIterator<EObject> _eAllContents = example.eAllContents();
      UnmodifiableIterator<XAssignment> _filter_2 = Iterators.<XAssignment>filter(_eAllContents, XAssignment.class);
      Iterator<XAssignment> _concat = Iterators.<XAssignment>concat(allAssignments, _filter_2);
      allAssignments = _concat;
    }
    final Function1<XAssignment, Boolean> _function = new Function1<XAssignment, Boolean>() {
      @Override
      public Boolean apply(final XAssignment it) {
        EReference _xAbstractFeatureCall_Feature = XbasePackage.eINSTANCE.getXAbstractFeatureCall_Feature();
        final String assignable = Nodes.textForFeature(it, _xAbstractFeatureCall_Feature);
        return Boolean.valueOf(Objects.equal(assignable, Constants.SUBJECT_FIELD_NAME));
      }
    };
    XAssignment _findFirst = IteratorExtensions.<XAssignment>findFirst(allAssignments, _function);
    return Objects.equal(null, _findFirst);
  }
}
