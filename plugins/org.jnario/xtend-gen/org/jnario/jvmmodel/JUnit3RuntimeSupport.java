package org.jnario.jvmmodel;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.Executable;
import org.jnario.JnarioClass;
import org.jnario.JnarioFunction;
import org.jnario.JnarioMember;
import org.jnario.Specification;
import org.jnario.jvmmodel.ExtendedJvmTypesBuilder;
import org.jnario.jvmmodel.JnarioNameProvider;
import org.jnario.jvmmodel.TestRuntimeSupport;

@SuppressWarnings("all")
public class JUnit3RuntimeSupport implements TestRuntimeSupport {
  @Inject
  @Extension
  private TypeReferences _typeReferences;
  
  @Inject
  @Extension
  private JnarioNameProvider _jnarioNameProvider;
  
  @Inject
  @Extension
  private ExtendedJvmTypesBuilder _extendedJvmTypesBuilder;
  
  @Override
  public void afterAllMethod(final JnarioMember before, final JvmOperation operation) {
  }
  
  @Override
  public void afterMethod(final JnarioMember before, final JvmOperation operation) {
  }
  
  @Override
  public void beforeAllMethod(final JnarioMember before, final JvmOperation operation) {
  }
  
  @Override
  public void beforeMethod(final JnarioMember before, final JvmOperation operation) {
  }
  
  @Override
  public void markAsPending(final Executable element, final JvmOperation operation) {
  }
  
  @Override
  public void addChildren(final Specification context, final JvmGenericType parent, final Collection<JvmTypeReference> children) {
    String _name = context.eClass().getName();
    boolean _equals = Objects.equal(_name, "Suite");
    if (_equals) {
      final Function1<JvmTypeReference, String> _function = new Function1<JvmTypeReference, String>() {
        @Override
        public String apply(final JvmTypeReference it) {
          return it.getSimpleName();
        }
      };
      this.addSuite(parent, context, IterableExtensions.<JvmTypeReference, String>map(children, _function), CollectionLiterals.<Executable>emptyList());
    }
  }
  
  @Override
  public void updateExampleGroup(final JnarioClass exampleGroup, final JvmGenericType inferredType) {
    this.makeTestCase(exampleGroup, inferredType);
    this.addTestCase(inferredType, exampleGroup);
    this.addSuite(inferredType, exampleGroup, this.children(exampleGroup), this.examples(exampleGroup));
    this.generateSetup("setUp", exampleGroup, inferredType, this.befores(exampleGroup));
    this.generateSetup("tearDown", exampleGroup, inferredType, this.afters(exampleGroup));
  }
  
  public boolean generateSetup(final String methodName, final JnarioClass exampleGroup, final JvmGenericType type, final Iterable<JnarioFunction> executables) {
    boolean _xblockexpression = false;
    {
      final JvmTypeReference voidType = this._typeReferences.getTypeForName(Void.TYPE, exampleGroup);
      EList<JvmMember> _members = type.getMembers();
      final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
        @Override
        public void apply(final JvmOperation it) {
          it.setVisibility(JvmVisibility.PUBLIC);
          EList<JvmTypeReference> _exceptions = it.getExceptions();
          JvmTypeReference _typeForName = JUnit3RuntimeSupport.this._typeReferences.getTypeForName(Exception.class, exampleGroup);
          JUnit3RuntimeSupport.this._extendedJvmTypesBuilder.<JvmTypeReference>operator_add(_exceptions, _typeForName);
          final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
            @Override
            public void apply(final ITreeAppendable it) {
              StringConcatenation _builder = new StringConcatenation();
              _builder.append("super.");
              _builder.append(methodName);
              _builder.append("();");
              _builder.newLineIfNotEmpty();
              {
                for(final JnarioFunction executable : executables) {
                  String _methodName = JUnit3RuntimeSupport.this._jnarioNameProvider.toMethodName(executable);
                  _builder.append(_methodName);
                  _builder.append("();");
                  _builder.newLineIfNotEmpty();
                }
              }
              it.append(_builder);
            }
          };
          JUnit3RuntimeSupport.this._extendedJvmTypesBuilder.setBody(it, _function);
        }
      };
      JvmOperation _method = this._extendedJvmTypesBuilder.toMethod(exampleGroup, methodName, voidType, _function);
      _xblockexpression = this._extendedJvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
    }
    return _xblockexpression;
  }
  
  private Iterable<JnarioFunction> befores(final JnarioClass exampleGroup) {
    final Function1<JnarioFunction, Boolean> _function = new Function1<JnarioFunction, Boolean>() {
      @Override
      public Boolean apply(final JnarioFunction it) {
        String _name = it.eClass().getName();
        return Boolean.valueOf(Objects.equal(_name, "Before"));
      }
    };
    return IterableExtensions.<JnarioFunction>filter(Iterables.<JnarioFunction>filter(exampleGroup.getMembers(), JnarioFunction.class), _function);
  }
  
  private Iterable<JnarioFunction> afters(final JnarioClass exampleGroup) {
    final Function1<JnarioFunction, Boolean> _function = new Function1<JnarioFunction, Boolean>() {
      @Override
      public Boolean apply(final JnarioFunction it) {
        String _name = it.eClass().getName();
        return Boolean.valueOf(Objects.equal(_name, "After"));
      }
    };
    return IterableExtensions.<JnarioFunction>filter(Iterables.<JnarioFunction>filter(exampleGroup.getMembers(), JnarioFunction.class), _function);
  }
  
  private boolean addSuite(final JvmGenericType it, final JnarioClass context, final Iterable<String> children, final Iterable<Executable> tests) {
    boolean _xblockexpression = false;
    {
      final JvmTypeReference testType = this._typeReferences.getTypeForName("junit.framework.Test", context);
      EList<JvmMember> _members = it.getMembers();
      final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
        @Override
        public void apply(final JvmOperation it) {
          it.setStatic(true);
          final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
            @Override
            public void apply(final ITreeAppendable it) {
              StringConcatenation _builder = new StringConcatenation();
              _builder.append("org.jnario.junit3.JnarioTestSuite suite = new org.jnario.junit3.JnarioTestSuite(\"");
              String _describe = JUnit3RuntimeSupport.this._jnarioNameProvider.describe(context);
              _builder.append(_describe);
              _builder.append("\");");
              _builder.newLineIfNotEmpty();
              {
                for(final Executable test : tests) {
                  _builder.append("suite.addTest(new ");
                  String _javaClassName = JUnit3RuntimeSupport.this._jnarioNameProvider.toJavaClassName(context);
                  _builder.append(_javaClassName);
                  _builder.append("(\"");
                  String _testName = JUnit3RuntimeSupport.this.testName(test);
                  _builder.append(_testName);
                  _builder.append("\"));");
                  _builder.newLineIfNotEmpty();
                }
              }
              {
                for(final String child : children) {
                  _builder.append("suite.addTest(");
                  _builder.append(child);
                  _builder.append(".suite());");
                  _builder.newLineIfNotEmpty();
                }
              }
              _builder.append("return suite;");
              _builder.newLine();
              it.append(_builder);
            }
          };
          JUnit3RuntimeSupport.this._extendedJvmTypesBuilder.setBody(it, _function);
        }
      };
      JvmOperation _method = this._extendedJvmTypesBuilder.toMethod(context, "suite", testType, _function);
      _xblockexpression = this._extendedJvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
    }
    return _xblockexpression;
  }
  
  private boolean makeTestCase(final JnarioClass exampleGroup, final JvmGenericType inferredType) {
    boolean _xblockexpression = false;
    {
      final JvmTypeReference stringType = this._typeReferences.getTypeForName("java.lang.String", exampleGroup);
      EList<JvmMember> _members = inferredType.getMembers();
      JvmField _field = this._extendedJvmTypesBuilder.toField(exampleGroup, "__name", stringType);
      this._extendedJvmTypesBuilder.<JvmField>operator_add(_members, _field);
      EList<JvmMember> _members_1 = inferredType.getMembers();
      final Procedure1<JvmConstructor> _function = new Procedure1<JvmConstructor>() {
        @Override
        public void apply(final JvmConstructor it) {
          EList<JvmFormalParameter> _parameters = it.getParameters();
          JvmFormalParameter _parameter = JUnit3RuntimeSupport.this._extendedJvmTypesBuilder.toParameter(exampleGroup, "name", stringType);
          JUnit3RuntimeSupport.this._extendedJvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
          final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
            @Override
            public void apply(final ITreeAppendable it) {
              StringConcatenation _builder = new StringConcatenation();
              _builder.append("setName(name);");
              _builder.newLine();
              _builder.append("this.__name = name;");
              it.append(_builder);
            }
          };
          JUnit3RuntimeSupport.this._extendedJvmTypesBuilder.setBody(it, _function);
        }
      };
      JvmConstructor _constructor = this._extendedJvmTypesBuilder.toConstructor(exampleGroup, _function);
      this._extendedJvmTypesBuilder.<JvmConstructor>operator_add(_members_1, _constructor);
      EList<JvmMember> _members_2 = inferredType.getMembers();
      final Procedure1<JvmOperation> _function_1 = new Procedure1<JvmOperation>() {
        @Override
        public void apply(final JvmOperation it) {
          final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
            @Override
            public void apply(final ITreeAppendable it) {
              StringConcatenation _builder = new StringConcatenation();
              _builder.append("return org.jnario.runner.NameProvider.create().nameOf(getClass(), __name);");
              it.append(_builder);
            }
          };
          JUnit3RuntimeSupport.this._extendedJvmTypesBuilder.setBody(it, _function);
        }
      };
      JvmOperation _method = this._extendedJvmTypesBuilder.toMethod(exampleGroup, "getName", stringType, _function_1);
      _xblockexpression = this._extendedJvmTypesBuilder.<JvmOperation>operator_add(_members_2, _method);
    }
    return _xblockexpression;
  }
  
  public Object addTestCase(final JvmGenericType inferredType, final JnarioClass context) {
    Object _xifexpression = null;
    boolean _isEmpty = inferredType.getSuperTypes().isEmpty();
    if (_isEmpty) {
      EList<JvmTypeReference> _superTypes = inferredType.getSuperTypes();
      JvmTypeReference _typeForName = this._typeReferences.getTypeForName("junit.framework.TestCase", context);
      _xifexpression = Boolean.valueOf(this._extendedJvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _typeForName));
    } else {
      JvmTypeReference _xifexpression_1 = null;
      String _simpleName = inferredType.getSuperTypes().get(0).getSimpleName();
      boolean _equals = Objects.equal(_simpleName, "Object");
      if (_equals) {
        _xifexpression_1 = inferredType.getSuperTypes().set(0, this._typeReferences.getTypeForName("junit.framework.TestCase", context));
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  private Iterable<String> children(final JnarioClass exampleGroup) {
    final Function1<Specification, String> _function = new Function1<Specification, String>() {
      @Override
      public String apply(final Specification it) {
        return JUnit3RuntimeSupport.this._jnarioNameProvider.toJavaClassName(it);
      }
    };
    return IterableExtensions.<Specification, String>map(Iterables.<Specification>filter(exampleGroup.getMembers(), Specification.class), _function);
  }
  
  private Iterable<Executable> examples(final JnarioClass exampleGroup) {
    final Function1<Executable, Boolean> _function = new Function1<Executable, Boolean>() {
      @Override
      public Boolean apply(final Executable it) {
        return Boolean.valueOf((!(it instanceof Specification)));
      }
    };
    return IterableExtensions.<Executable>filter(Iterables.<Executable>filter(exampleGroup.getMembers(), Executable.class), _function);
  }
  
  @Override
  public void markAsTestMethod(final Executable element, final JvmOperation operation) {
    operation.setSimpleName(this.testName(element));
  }
  
  private String testName(final Executable e) {
    String _methodName = this._jnarioNameProvider.toMethodName(e);
    return ("test" + _methodName);
  }
  
  @Override
  public void updateFeature(final JnarioClass feature, final JvmGenericType inferredType, final List<JvmTypeReference> scenarios) {
    this.addTestCase(inferredType, feature);
    final Function1<JvmTypeReference, String> _function = new Function1<JvmTypeReference, String>() {
      @Override
      public String apply(final JvmTypeReference it) {
        return it.getSimpleName();
      }
    };
    this.addSuite(inferredType, feature, ListExtensions.<JvmTypeReference, String>map(scenarios, _function), CollectionLiterals.<Executable>emptyList());
  }
  
  @Override
  public void updateScenario(final JnarioClass scenario, final JvmGenericType inferredType) {
    final JvmTypeReference testType = this._typeReferences.getTypeForName("junit.framework.Test", scenario);
    final Iterable<Executable> tests = this.examples(scenario);
    EList<JvmMember> _members = inferredType.getMembers();
    final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
      @Override
      public void apply(final JvmOperation it) {
        it.setStatic(true);
        final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
          @Override
          public void apply(final ITreeAppendable it) {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("org.jnario.junit3.JnarioTestSuite suite = new org.jnario.junit3.JnarioTestSuite(\"");
            String _describe = JUnit3RuntimeSupport.this._jnarioNameProvider.describe(scenario);
            _builder.append(_describe);
            _builder.append("\");");
            _builder.newLineIfNotEmpty();
            String _javaClassName = JUnit3RuntimeSupport.this._jnarioNameProvider.toJavaClassName(scenario);
            _builder.append(_javaClassName);
            _builder.append(" scenario = new ");
            String _javaClassName_1 = JUnit3RuntimeSupport.this._jnarioNameProvider.toJavaClassName(scenario);
            _builder.append(_javaClassName_1);
            _builder.append("(");
            _builder.newLineIfNotEmpty();
            _builder.append("new org.jnario.junit3.TestQueue(");
            _builder.newLine();
            {
              boolean _hasElements = false;
              for(final Executable test : tests) {
                if (!_hasElements) {
                  _hasElements = true;
                } else {
                  _builder.appendImmediate(", ", "");
                }
                _builder.append("\"");
                String _testName = JUnit3RuntimeSupport.this.testName(test);
                _builder.append(_testName);
                _builder.append("\"");
              }
            }
            _builder.append("));");
            _builder.newLineIfNotEmpty();
            {
              for(final Executable test_1 : tests) {
                _builder.append("suite.addTest(new org.jnario.junit3.DelegatingTestCase(\"");
                String _describe_1 = JUnit3RuntimeSupport.this._jnarioNameProvider.describe(test_1);
                _builder.append(_describe_1);
                _builder.append("\", scenario));");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("return suite;");
            _builder.newLine();
            it.append(_builder);
          }
        };
        JUnit3RuntimeSupport.this._extendedJvmTypesBuilder.setBody(it, _function);
      }
    };
    JvmOperation _method = this._extendedJvmTypesBuilder.toMethod(scenario, "suite", testType, _function);
    this._extendedJvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
    final JvmTypeReference queueType = this._typeReferences.getTypeForName("org.jnario.junit3.TestQueue", scenario);
    EList<JvmMember> _members_1 = inferredType.getMembers();
    JvmField _field = this._extendedJvmTypesBuilder.toField(scenario, "testQueue", queueType);
    this._extendedJvmTypesBuilder.<JvmField>operator_add(_members_1, _field);
    EList<JvmMember> _members_2 = inferredType.getMembers();
    final Procedure1<JvmConstructor> _function_1 = new Procedure1<JvmConstructor>() {
      @Override
      public void apply(final JvmConstructor it) {
        EList<JvmFormalParameter> _parameters = it.getParameters();
        JvmFormalParameter _parameter = JUnit3RuntimeSupport.this._extendedJvmTypesBuilder.toParameter(scenario, "testQueue", queueType);
        JUnit3RuntimeSupport.this._extendedJvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
        final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
          @Override
          public void apply(final ITreeAppendable it) {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("setName(testQueue.next());");
            _builder.newLine();
            _builder.append("this.testQueue = testQueue;");
            it.append(_builder);
          }
        };
        JUnit3RuntimeSupport.this._extendedJvmTypesBuilder.setBody(it, _function);
      }
    };
    JvmConstructor _constructor = this._extendedJvmTypesBuilder.toConstructor(scenario, _function_1);
    this._extendedJvmTypesBuilder.<JvmConstructor>operator_add(_members_2, _constructor);
    final JvmTypeReference voidType = this._typeReferences.getTypeForName(Void.TYPE, scenario);
    EList<JvmMember> _members_3 = inferredType.getMembers();
    final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
      @Override
      public void apply(final JvmOperation it) {
        it.setVisibility(JvmVisibility.PUBLIC);
        EList<JvmTypeReference> _exceptions = it.getExceptions();
        JvmTypeReference _typeForName = JUnit3RuntimeSupport.this._typeReferences.getTypeForName(Exception.class, scenario);
        JUnit3RuntimeSupport.this._extendedJvmTypesBuilder.<JvmTypeReference>operator_add(_exceptions, _typeForName);
        final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
          @Override
          public void apply(final ITreeAppendable it) {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("if(testQueue.isRunning()){");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("return;");
            _builder.newLine();
            _builder.append("}");
            _builder.newLine();
            _builder.append("super.");
            _builder.append("setUp");
            _builder.append("();");
            it.append(_builder);
          }
        };
        JUnit3RuntimeSupport.this._extendedJvmTypesBuilder.setBody(it, _function);
      }
    };
    JvmOperation _method_1 = this._extendedJvmTypesBuilder.toMethod(scenario, "setUp", voidType, _function_2);
    this._extendedJvmTypesBuilder.<JvmOperation>operator_add(_members_3, _method_1);
    EList<JvmMember> _members_4 = inferredType.getMembers();
    final Procedure1<JvmOperation> _function_3 = new Procedure1<JvmOperation>() {
      @Override
      public void apply(final JvmOperation it) {
        it.setVisibility(JvmVisibility.PUBLIC);
        EList<JvmTypeReference> _exceptions = it.getExceptions();
        JvmTypeReference _typeForName = JUnit3RuntimeSupport.this._typeReferences.getTypeForName(Exception.class, scenario);
        JUnit3RuntimeSupport.this._extendedJvmTypesBuilder.<JvmTypeReference>operator_add(_exceptions, _typeForName);
        final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
          @Override
          public void apply(final ITreeAppendable it) {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("if(testQueue.isDone()){");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("super.");
            _builder.append("tearDown", "\t");
            _builder.append("();");
            _builder.newLineIfNotEmpty();
            _builder.append("}else{");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("setName(testQueue.next());");
            _builder.newLine();
            _builder.append("}");
            _builder.newLine();
            it.append(_builder);
          }
        };
        JUnit3RuntimeSupport.this._extendedJvmTypesBuilder.setBody(it, _function);
      }
    };
    JvmOperation _method_2 = this._extendedJvmTypesBuilder.toMethod(scenario, "tearDown", voidType, _function_3);
    this._extendedJvmTypesBuilder.<JvmOperation>operator_add(_members_4, _method_2);
  }
  
  @Override
  public void updateSuite(final JnarioClass exampleGroup, final JvmGenericType inferredType) {
  }
}
