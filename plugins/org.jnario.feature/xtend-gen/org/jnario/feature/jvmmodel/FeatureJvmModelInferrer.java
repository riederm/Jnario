/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.jvmmodel;

import com.google.common.base.Objects;
import com.google.common.base.Strings;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmAnnotationValue;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmIntAnnotationValue;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XStringLiteral;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.XbaseFactory;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.JnarioClass;
import org.jnario.JnarioField;
import org.jnario.JnarioFile;
import org.jnario.JnarioMember;
import org.jnario.JnarioTypeDeclaration;
import org.jnario.feature.feature.Background;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.FeatureFile;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.feature.Step;
import org.jnario.feature.feature.StepImplementation;
import org.jnario.feature.feature.StepReference;
import org.jnario.feature.jvmmodel.JvmFieldReferenceUpdater;
import org.jnario.feature.jvmmodel.StepArgumentsProvider;
import org.jnario.feature.jvmmodel.StepExpressionProvider;
import org.jnario.feature.jvmmodel.StepReferenceFieldCreator;
import org.jnario.feature.naming.StepNameProvider;
import org.jnario.jvmmodel.ExtendedJvmTypesBuilder;
import org.jnario.jvmmodel.JnarioJvmModelInferrer;
import org.jnario.jvmmodel.TestRuntimeSupport;
import org.jnario.lib.StepArguments;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.util.SourceAdapter;

/**
 * @author Birgit Engelmann - Initial contribution and API
 * @author Sebastian Benz
 */
@SuppressWarnings("all")
public class FeatureJvmModelInferrer extends JnarioJvmModelInferrer {
  public final static String STEP_VALUES = "args";
  
  @Inject
  @Extension
  private ExtendedJvmTypesBuilder _extendedJvmTypesBuilder;
  
  @Inject
  @Extension
  private TypeReferences _typeReferences;
  
  @Inject
  @Extension
  private StepNameProvider _stepNameProvider;
  
  @Inject
  @Extension
  private StepExpressionProvider _stepExpressionProvider;
  
  @Inject
  @Extension
  private StepReferenceFieldCreator _stepReferenceFieldCreator;
  
  @Inject
  @Extension
  private StepArgumentsProvider stepArgumentsProvider;
  
  @Inject
  @Extension
  private IJvmModelAssociator _iJvmModelAssociator;
  
  @Inject
  @Extension
  private IJvmModelAssociations _iJvmModelAssociations;
  
  @Inject
  @Extension
  private JvmFieldReferenceUpdater _jvmFieldReferenceUpdater;
  
  @Inject
  @Extension
  private TypesFactory typesFactory;
  
  @Override
  public void doInfer(final EObject object, final IJvmDeclaredTypeAcceptor acceptor, final boolean preIndexingPhase) {
    if ((!(object instanceof JnarioFile))) {
      return;
    }
    final ArrayList<Runnable> doLater = CollectionLiterals.<Runnable>newArrayList();
    final Feature feature = this.resolveFeature(object);
    if ((Objects.equal(feature, null) || Strings.isNullOrEmpty(feature.getName()))) {
      return;
    }
    Background _background = feature.getBackground();
    final JvmGenericType background = this.toClass(_background, acceptor, doLater, preIndexingPhase);
    EList<Scenario> _scenarios = feature.getScenarios();
    final ArrayList<JvmGenericType> scenarios = this.toClass(_scenarios, acceptor, background, doLater, preIndexingPhase);
    this.toClass(feature, acceptor, scenarios, background, doLater, preIndexingPhase);
    if ((!preIndexingPhase)) {
      for (final Runnable runnable : doLater) {
        runnable.run();
      }
    }
  }
  
  public Feature resolveFeature(final EObject root) {
    final FeatureFile featureFile = ((FeatureFile) root);
    EList<JnarioTypeDeclaration> _xtendTypes = featureFile.getXtendTypes();
    boolean _isEmpty = _xtendTypes.isEmpty();
    if (_isEmpty) {
      return null;
    }
    EList<JnarioTypeDeclaration> _xtendTypes_1 = featureFile.getXtendTypes();
    final JnarioTypeDeclaration xtendClass = _xtendTypes_1.get(0);
    return ((Feature) xtendClass);
  }
  
  public JvmGenericType toClass(final Background background, final IJvmDeclaredTypeAcceptor acceptor, final List<Runnable> doLater, final boolean preIndexingPhase) {
    JvmGenericType _xblockexpression = null;
    {
      boolean _equals = Objects.equal(background, null);
      if (_equals) {
        return null;
      }
      List<JvmGenericType> _emptyList = CollectionLiterals.<JvmGenericType>emptyList();
      _xblockexpression = this.toClass(background, _emptyList, acceptor, doLater, preIndexingPhase);
    }
    return _xblockexpression;
  }
  
  public ArrayList<JvmGenericType> toClass(final List<Scenario> scenarios, final IJvmDeclaredTypeAcceptor acceptor, final JvmGenericType backgroundType, final List<Runnable> doLater, final boolean preIndexingPhase) {
    final ArrayList<JvmGenericType> result = CollectionLiterals.<JvmGenericType>newArrayList();
    final Consumer<Scenario> _function = new Consumer<Scenario>() {
      @Override
      public void accept(final Scenario it) {
        List<JvmGenericType> _emptyList = CollectionLiterals.<JvmGenericType>emptyList();
        final JvmGenericType inferredJvmType = FeatureJvmModelInferrer.this.toClass(it, _emptyList, acceptor, doLater, preIndexingPhase);
        result.add(inferredJvmType);
      }
    };
    scenarios.forEach(_function);
    return result;
  }
  
  public void toClass(final Feature feature, final IJvmDeclaredTypeAcceptor acceptor, final List<JvmGenericType> scenarios, final JvmGenericType background, final List<Runnable> doLater, final boolean preIndexingPhase) {
    this.addSuperClass(feature);
    final JvmGenericType inferredJvmType = this.toClass(feature, scenarios, acceptor, doLater, preIndexingPhase);
    boolean _equals = Objects.equal(background, null);
    if (_equals) {
      final Consumer<JvmGenericType> _function = new Consumer<JvmGenericType>() {
        @Override
        public void accept(final JvmGenericType it) {
          EList<JvmTypeReference> _superTypes = it.getSuperTypes();
          JvmParameterizedTypeReference _createTypeRef = FeatureJvmModelInferrer.this._typeReferences.createTypeRef(inferredJvmType);
          FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmParameterizedTypeReference>operator_add(_superTypes, _createTypeRef);
        }
      };
      scenarios.forEach(_function);
    } else {
      EList<JvmTypeReference> _superTypes = background.getSuperTypes();
      JvmParameterizedTypeReference _createTypeRef = this._typeReferences.createTypeRef(inferredJvmType);
      this._extendedJvmTypesBuilder.<JvmParameterizedTypeReference>operator_add(_superTypes, _createTypeRef);
      final Consumer<JvmGenericType> _function_1 = new Consumer<JvmGenericType>() {
        @Override
        public void accept(final JvmGenericType it) {
          EList<JvmTypeReference> _superTypes = it.getSuperTypes();
          JvmParameterizedTypeReference _createTypeRef = FeatureJvmModelInferrer.this._typeReferences.createTypeRef(background);
          FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmParameterizedTypeReference>operator_add(_superTypes, _createTypeRef);
        }
      };
      scenarios.forEach(_function_1);
    }
  }
  
  public boolean register(final IJvmDeclaredTypeAcceptor acceptor, final JnarioClass source, final JvmGenericType inferredJvmType, final List<JvmGenericType> scenarios, final List<Runnable> doLater, final boolean preIndexingPhase) {
    boolean _xifexpression = false;
    if ((!preIndexingPhase)) {
      final Runnable _function = new Runnable() {
        @Override
        public void run() {
          FeatureJvmModelInferrer.this.init(source, inferredJvmType, scenarios);
        }
      };
      _xifexpression = doLater.add(_function);
    }
    return _xifexpression;
  }
  
  public JvmGenericType toClass(final JnarioClass xtendClass, final List<JvmGenericType> scenarios, final IJvmDeclaredTypeAcceptor acceptor, final List<Runnable> doLater, final boolean preIndexingPhase) {
    JvmGenericType _xblockexpression = null;
    {
      final JvmGenericType javaType = this.typesFactory.createJvmGenericType();
      Resource _eResource = xtendClass.eResource();
      EList<EObject> _contents = _eResource.getContents();
      this._extendedJvmTypesBuilder.<JvmGenericType>operator_add(_contents, javaType);
      JnarioFile _jnarioFile = this.jnarioFile(xtendClass);
      this.setNameAndAssociate(_jnarioFile, xtendClass, javaType);
      acceptor.<JvmGenericType>accept(javaType);
      if ((!preIndexingPhase)) {
        final Runnable _function = new Runnable() {
          @Override
          public void run() {
            FeatureJvmModelInferrer.this.init(xtendClass, javaType, scenarios);
          }
        };
        doLater.add(_function);
      }
      _xblockexpression = javaType;
    }
    return _xblockexpression;
  }
  
  protected void _init(final Feature feature, final JvmGenericType inferredJvmType, final List<JvmGenericType> scenarios) {
    final EList<JvmAnnotationReference> annotations = inferredJvmType.getAnnotations();
    boolean _isEmpty = scenarios.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      TestRuntimeSupport _testRuntime = this.getTestRuntime();
      final Function1<JvmGenericType, JvmTypeReference> _function = new Function1<JvmGenericType, JvmTypeReference>() {
        @Override
        public JvmTypeReference apply(final JvmGenericType it) {
          return FeatureJvmModelInferrer.this._typeReferences.createTypeRef(it);
        }
      };
      List<JvmTypeReference> _map = ListExtensions.<JvmGenericType, JvmTypeReference>map(scenarios, _function);
      _testRuntime.addChildren(feature, inferredJvmType, _map);
    }
    String _describe = this._stepNameProvider.describe(feature);
    JvmAnnotationReference _annotationRef = this._annotationTypesBuilder.annotationRef(Named.class, _describe);
    this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(annotations, _annotationRef);
    final Procedure1<JvmGenericType> _function_1 = new Procedure1<JvmGenericType>() {
      @Override
      public void apply(final JvmGenericType it) {
        it.setVisibility(JvmVisibility.PUBLIC);
        boolean _isStatic = feature.isStatic();
        it.setStatic(_isStatic);
      }
    };
    ObjectExtensions.<JvmGenericType>operator_doubleArrow(inferredJvmType, _function_1);
    EList<XAnnotation> _annotations = feature.getAnnotations();
    this.translateAnnotations(inferredJvmType, _annotations);
    this._extendedJvmTypesBuilder.copyDocumentationTo(feature, inferredJvmType);
    TestRuntimeSupport _testRuntime_1 = this.getTestRuntime();
    final Function1<JvmGenericType, JvmTypeReference> _function_2 = new Function1<JvmGenericType, JvmTypeReference>() {
      @Override
      public JvmTypeReference apply(final JvmGenericType it) {
        return FeatureJvmModelInferrer.this._typeReferences.createTypeRef(it);
      }
    };
    List<JvmTypeReference> _map_1 = ListExtensions.<JvmGenericType, JvmTypeReference>map(scenarios, _function_2);
    _testRuntime_1.updateFeature(feature, inferredJvmType, _map_1);
  }
  
  protected void _init(final Scenario scenario, final JvmGenericType inferredJvmType, final List<JvmGenericType> scenarios) {
    this._stepReferenceFieldCreator.copyJnarioMemberForReferences(scenario);
    EList<JnarioMember> _members = scenario.getMembers();
    Iterable<JnarioField> _filter = Iterables.<JnarioField>filter(_members, JnarioField.class);
    final Consumer<JnarioField> _function = new Consumer<JnarioField>() {
      @Override
      public void accept(final JnarioField it) {
        FeatureJvmModelInferrer.this.transform(it, inferredJvmType);
      }
    };
    _filter.forEach(_function);
    final EList<JvmAnnotationReference> annotations = inferredJvmType.getAnnotations();
    TestRuntimeSupport _testRuntime = this.getTestRuntime();
    _testRuntime.updateScenario(scenario, inferredJvmType);
    String _describe = this._stepNameProvider.describe(scenario);
    JvmAnnotationReference _annotationRef = this._annotationTypesBuilder.annotationRef(Named.class, _describe);
    this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(annotations, _annotationRef);
    final Feature feature = this.feature(scenario);
    int start = 0;
    EList<XAnnotation> _annotations = feature.getAnnotations();
    this.translateAnnotations(inferredJvmType, _annotations);
    final Background background = feature.getBackground();
    if (((!(scenario instanceof Background)) && (!Objects.equal(background, null)))) {
      EList<Step> _steps = background.getSteps();
      int _generateBackgroundStepCalls = this.generateBackgroundStepCalls(_steps, inferredJvmType, scenario);
      start = _generateBackgroundStepCalls;
    }
    EList<Step> _steps_1 = scenario.getSteps();
    this.generateSteps(_steps_1, inferredJvmType, start, scenario);
    EList<Step> _steps_2 = scenario.getSteps();
    Iterable<StepReference> _filter_1 = Iterables.<StepReference>filter(_steps_2, StepReference.class);
    final Consumer<StepReference> _function_1 = new Consumer<StepReference>() {
      @Override
      public void accept(final StepReference it) {
        StepImplementation _reference = it.getReference();
        boolean _equals = Objects.equal(_reference, null);
        if (_equals) {
          return;
        }
        StepImplementation _reference_1 = it.getReference();
        final Scenario original = EcoreUtil2.<Scenario>getContainerOfType(_reference_1, Scenario.class);
        boolean _equals_1 = Objects.equal(original, null);
        if (_equals_1) {
          return;
        }
        final XExpression expr = FeatureJvmModelInferrer.this._stepExpressionProvider.expressionOf(it);
        FeatureJvmModelInferrer.this.updateReferences(original, expr, inferredJvmType);
      }
    };
    _filter_1.forEach(_function_1);
    EList<JnarioMember> _members_1 = scenario.getMembers();
    Iterable<JnarioField> _filter_2 = Iterables.<JnarioField>filter(_members_1, JnarioField.class);
    final Function1<JnarioField, Boolean> _function_2 = new Function1<JnarioField, Boolean>() {
      @Override
      public Boolean apply(final JnarioField it) {
        XExpression _initialValue = it.getInitialValue();
        return Boolean.valueOf((!Objects.equal(_initialValue, null)));
      }
    };
    Iterable<JnarioField> _filter_3 = IterableExtensions.<JnarioField>filter(_filter_2, _function_2);
    final Consumer<JnarioField> _function_3 = new Consumer<JnarioField>() {
      @Override
      public void accept(final JnarioField it) {
        final EObject source = SourceAdapter.find(it);
        boolean _equals = Objects.equal(source, null);
        if (_equals) {
          return;
        }
        final Scenario original = EcoreUtil2.<Scenario>getContainerOfType(source, Scenario.class);
        XExpression _initialValue = it.getInitialValue();
        FeatureJvmModelInferrer.this.updateReferences(original, _initialValue, inferredJvmType);
      }
    };
    _filter_3.forEach(_function_3);
  }
  
  public void updateReferences(final Scenario original, final XExpression expr, final JvmGenericType inferredJvmType) {
    Set<EObject> _jvmElements = this._iJvmModelAssociations.getJvmElements(original);
    Iterable<JvmGenericType> _filter = Iterables.<JvmGenericType>filter(_jvmElements, JvmGenericType.class);
    final Function1<JvmGenericType, Boolean> _function = new Function1<JvmGenericType, Boolean>() {
      @Override
      public Boolean apply(final JvmGenericType it) {
        EObject _primarySourceElement = FeatureJvmModelInferrer.this._iJvmModelAssociations.getPrimarySourceElement(it);
        return Boolean.valueOf(Objects.equal(_primarySourceElement, original));
      }
    };
    final JvmGenericType originalType = IterableExtensions.<JvmGenericType>findFirst(_filter, _function);
    this._jvmFieldReferenceUpdater.updateReferences(expr, originalType, inferredJvmType);
  }
  
  @Override
  protected void _transform(final JnarioField source, final JvmGenericType container) {
    super._transform(source, container);
    boolean _isExtension = source.isExtension();
    if (_isExtension) {
      Set<EObject> _jvmElements = this._iJvmModelAssociations.getJvmElements(source);
      EObject _head = IterableExtensions.<EObject>head(_jvmElements);
      final JvmField field = ((JvmField) _head);
      boolean _equals = Objects.equal(field, null);
      if (_equals) {
        return;
      }
      field.setVisibility(JvmVisibility.PUBLIC);
      EList<JvmAnnotationReference> _annotations = field.getAnnotations();
      JvmAnnotationReference _annotationRef = this._annotationTypesBuilder.annotationRef(org.jnario.runner.Extension.class);
      this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotationRef);
    }
  }
  
  public void generateStepValues(final Step step) {
    final List<String> arguments = this.stepArgumentsProvider.findStepArguments(step);
    final XExpression stepExpression = step.getExpression();
    if ((arguments.isEmpty() || Objects.equal(stepExpression, null))) {
      return;
    }
    TreeIterator<EObject> _eAllContents = stepExpression.eAllContents();
    Iterator<XVariableDeclaration> _filter = Iterators.<XVariableDeclaration>filter(_eAllContents, XVariableDeclaration.class);
    final Function1<XVariableDeclaration, Boolean> _function = new Function1<XVariableDeclaration, Boolean>() {
      @Override
      public Boolean apply(final XVariableDeclaration it) {
        String _name = it.getName();
        return Boolean.valueOf(Objects.equal(_name, FeatureJvmModelInferrer.STEP_VALUES));
      }
    };
    Iterator<XVariableDeclaration> decs = IteratorExtensions.<XVariableDeclaration>filter(_filter, _function);
    boolean _isEmpty = IteratorExtensions.isEmpty(decs);
    if (_isEmpty) {
      return;
    }
    final XVariableDeclaration dec = IteratorExtensions.<XVariableDeclaration>head(decs);
    this.setStepValueType(dec, ((Step) step));
    if ((step instanceof StepImplementation)) {
      return;
    }
    TreeIterator<EObject> _eAllContents_1 = stepExpression.eAllContents();
    Iterator<XConstructorCall> calls = Iterators.<XConstructorCall>filter(_eAllContents_1, XConstructorCall.class);
    final XConstructorCall argsConstructor = IteratorExtensions.<XConstructorCall>head(calls);
    EList<XExpression> _arguments = argsConstructor.getArguments();
    _arguments.clear();
    final Consumer<String> _function_1 = new Consumer<String>() {
      @Override
      public void accept(final String it) {
        final XStringLiteral arg = XbaseFactory.eINSTANCE.createXStringLiteral();
        arg.setValue(it);
        EList<XExpression> _arguments = argsConstructor.getArguments();
        FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.<XStringLiteral>operator_add(_arguments, arg);
      }
    };
    arguments.forEach(_function_1);
  }
  
  public void setStepValueType(final XVariableDeclaration variableDec, final Step step) {
    JvmTypeReference typeRef = this._typeReferences.getTypeForName(StepArguments.class, step);
    if ((Objects.equal(typeRef, null) || typeRef.eIsProxy())) {
      return;
    }
    variableDec.setType(typeRef);
    JvmType _type = typeRef.getType();
    final JvmGenericType type = ((JvmGenericType) _type);
    if ((Objects.equal(type, null) || type.eIsProxy())) {
      return;
    }
    XExpression _right = variableDec.getRight();
    XConstructorCall constructor = ((XConstructorCall) _right);
    EList<JvmMember> _members = type.getMembers();
    Iterator<JvmMember> _iterator = _members.iterator();
    final UnmodifiableIterator<JvmConstructor> constructors = Iterators.<JvmConstructor>filter(_iterator, JvmConstructor.class);
    JvmConstructor _next = constructors.next();
    constructor.setConstructor(_next);
  }
  
  public int generateBackgroundStepCalls(final Iterable<Step> steps, final JvmGenericType inferredJvmType, final Scenario scenario) {
    int _xblockexpression = (int) 0;
    {
      int order = 0;
      for (final Step step : steps) {
        int _transformCalls = this.transformCalls(step, inferredJvmType, order, scenario);
        order = _transformCalls;
      }
      _xblockexpression = order;
    }
    return _xblockexpression;
  }
  
  public int transformCalls(final Step step, final JvmGenericType inferredJvmType, final int order, final Scenario scenario) {
    int _xblockexpression = (int) 0;
    {
      final String methodName = this._stepNameProvider.getMethodName(step);
      EList<JvmMember> _members = inferredJvmType.getMembers();
      JvmTypeReference _typeForName = this._typeReferences.getTypeForName(Void.TYPE, step);
      final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
        @Override
        public void apply(final JvmOperation it) {
          final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
            @Override
            public void apply(final ITreeAppendable a) {
              a.append((("super." + methodName) + "();"));
            }
          };
          FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.setBody(it, _function);
          FeatureJvmModelInferrer.this.markAsPending(it, step, scenario);
          FeatureJvmModelInferrer.this._iJvmModelAssociator.associatePrimary(step, it);
          TestRuntimeSupport _testRuntime = FeatureJvmModelInferrer.this.getTestRuntime();
          _testRuntime.markAsTestMethod(step, it);
          EList<JvmAnnotationReference> _annotations = it.getAnnotations();
          JvmAnnotationReference _annotationRef = FeatureJvmModelInferrer.this._annotationTypesBuilder.annotationRef(Order.class);
          final Procedure1<JvmAnnotationReference> _function_1 = new Procedure1<JvmAnnotationReference>() {
            @Override
            public void apply(final JvmAnnotationReference it) {
              EList<JvmAnnotationValue> _explicitValues = it.getExplicitValues();
              JvmIntAnnotationValue _createJvmIntAnnotationValue = FeatureJvmModelInferrer.this.typesFactory.createJvmIntAnnotationValue();
              final Procedure1<JvmIntAnnotationValue> _function = new Procedure1<JvmIntAnnotationValue>() {
                @Override
                public void apply(final JvmIntAnnotationValue it) {
                  EList<Integer> _values = it.getValues();
                  int _intValue = Integer.valueOf(order).intValue();
                  FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.<Integer>operator_add(_values, Integer.valueOf(_intValue));
                }
              };
              JvmIntAnnotationValue _doubleArrow = ObjectExtensions.<JvmIntAnnotationValue>operator_doubleArrow(_createJvmIntAnnotationValue, _function);
              FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmAnnotationValue>operator_add(_explicitValues, _doubleArrow);
            }
          };
          JvmAnnotationReference _doubleArrow = ObjectExtensions.<JvmAnnotationReference>operator_doubleArrow(_annotationRef, _function_1);
          FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _doubleArrow);
          EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
          String _describe = FeatureJvmModelInferrer.this._stepNameProvider.describe(step);
          JvmAnnotationReference _annotationRef_1 = FeatureJvmModelInferrer.this._annotationTypesBuilder.annotationRef(Named.class, _describe);
          FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations_1, _annotationRef_1);
        }
      };
      JvmOperation _method = this._extendedJvmTypesBuilder.toMethod(step, methodName, _typeForName, _function);
      this._extendedJvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
      _xblockexpression = (order + 1);
    }
    return _xblockexpression;
  }
  
  public void generateSteps(final Iterable<Step> steps, final JvmGenericType inferredJvmType, final int start, final Scenario scenario) {
    int order = start;
    for (final Step step : steps) {
      int _transform = this.transform(step, inferredJvmType, order, scenario);
      order = _transform;
    }
  }
  
  public int transform(final Step step, final JvmGenericType inferredJvmType, final int order, final Scenario scenario) {
    int _xblockexpression = (int) 0;
    {
      EList<JvmMember> _members = inferredJvmType.getMembers();
      String _methodName = this._stepNameProvider.getMethodName(step);
      JvmTypeReference _typeForName = this._typeReferences.getTypeForName(Void.TYPE, step);
      final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
        @Override
        public void apply(final JvmOperation it) {
          it.setDeclaringType(inferredJvmType);
          final XExpression stepExpression = FeatureJvmModelInferrer.this._stepExpressionProvider.expressionOf(step);
          FeatureJvmModelInferrer.this._iJvmModelAssociator.associatePrimary(step, it);
          FeatureJvmModelInferrer.this.generateStepValues(step);
          FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.setBody(it, stepExpression);
          TestRuntimeSupport _testRuntime = FeatureJvmModelInferrer.this.getTestRuntime();
          _testRuntime.markAsTestMethod(step, it);
          EList<JvmAnnotationReference> _annotations = it.getAnnotations();
          JvmAnnotationReference _annotationRef = FeatureJvmModelInferrer.this._annotationTypesBuilder.annotationRef(Order.class);
          final Procedure1<JvmAnnotationReference> _function = new Procedure1<JvmAnnotationReference>() {
            @Override
            public void apply(final JvmAnnotationReference it) {
              EList<JvmAnnotationValue> _explicitValues = it.getExplicitValues();
              JvmIntAnnotationValue _createJvmIntAnnotationValue = FeatureJvmModelInferrer.this.typesFactory.createJvmIntAnnotationValue();
              final Procedure1<JvmIntAnnotationValue> _function = new Procedure1<JvmIntAnnotationValue>() {
                @Override
                public void apply(final JvmIntAnnotationValue it) {
                  EList<Integer> _values = it.getValues();
                  int _intValue = Integer.valueOf(order).intValue();
                  FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.<Integer>operator_add(_values, Integer.valueOf(_intValue));
                }
              };
              JvmIntAnnotationValue _doubleArrow = ObjectExtensions.<JvmIntAnnotationValue>operator_doubleArrow(_createJvmIntAnnotationValue, _function);
              FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmAnnotationValue>operator_add(_explicitValues, _doubleArrow);
            }
          };
          JvmAnnotationReference _doubleArrow = ObjectExtensions.<JvmAnnotationReference>operator_doubleArrow(_annotationRef, _function);
          FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _doubleArrow);
          String name = FeatureJvmModelInferrer.this._stepNameProvider.describe(step);
          FeatureJvmModelInferrer.this._iJvmModelAssociator.associatePrimary(step, it);
          FeatureJvmModelInferrer.this.markAsPending(it, step, scenario);
          EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
          JvmAnnotationReference _annotationRef_1 = FeatureJvmModelInferrer.this._annotationTypesBuilder.annotationRef(Named.class, name);
          FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations_1, _annotationRef_1);
        }
      };
      JvmOperation _method = this._extendedJvmTypesBuilder.toMethod(step, _methodName, _typeForName, _function);
      this._extendedJvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
      _xblockexpression = (order + 1);
    }
    return _xblockexpression;
  }
  
  public Feature feature(final EObject context) {
    return EcoreUtil2.<Feature>getContainerOfType(context, Feature.class);
  }
  
  public void markAsPending(final JvmOperation operation, final Step step, final Scenario scenario) {
    EList<Step> _pendingSteps = scenario.getPendingSteps();
    boolean _contains = _pendingSteps.contains(step);
    if (_contains) {
      TestRuntimeSupport _testRuntime = this.getTestRuntime();
      _testRuntime.markAsPending(step, operation);
    }
  }
  
  public void init(final EObject feature, final JvmGenericType inferredJvmType, final List<JvmGenericType> scenarios) {
    if (feature instanceof Feature) {
      _init((Feature)feature, inferredJvmType, scenarios);
      return;
    } else if (feature instanceof Scenario) {
      _init((Scenario)feature, inferredJvmType, scenarios);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(feature, inferredJvmType, scenarios).toString());
    }
  }
}
