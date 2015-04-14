package org.jnario.feature.tests.unit.naming;

import com.google.common.base.Objects;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.feature.feature.Step;
import org.jnario.feature.naming.FeatureQualifiedNameProvider;
import org.jnario.feature.tests.unit.naming.FeatureQualifiedNameProviderPackageNameSpec;
import org.jnario.feature.tests.unit.naming.FeatureQualifiedNameProviderStepNameSpec;
import org.jnario.jnario.test.util.FeatureTestCreator;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Subject;
import org.junit.runner.RunWith;

@Contains({ FeatureQualifiedNameProviderPackageNameSpec.class, FeatureQualifiedNameProviderStepNameSpec.class })
@CreateWith(FeatureTestCreator.class)
@Named("FeatureQualifiedNameProvider")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class FeatureQualifiedNameProviderSpec {
  @Subject
  public FeatureQualifiedNameProvider subject;
  
  @Extension
  ModelStore _modelStore;
  
  IQualifiedNameConverter converter;
  
  public String implementedStepName(final CharSequence s) {
    String _plus = (s + "\'\r\n\t\tval x = \"\"\r\n\t\t");
    return this.stepName(_plus);
  }
  
  public String stepName(final CharSequence s) {
    return this.stepName(s, "myPackage");
  }
  
  public String stepName(final CharSequence s, final String packageName) {
    String _xblockexpression = null;
    {
      String _xifexpression = null;
      boolean _notEquals = (!Objects.equal(packageName, null));
      if (_notEquals) {
        _xifexpression = ("package " + packageName);
      } else {
        String _plus = ("" + " \r\n\t\t\tFeature: MyFeature\r\n\t\t\tScenario: The Scenario\r\n\t\t\t");
        String _plus_1 = (_plus + s);
        _xifexpression = (_plus_1 + "\r\n\t\t\t");
      }
      final String input = _xifexpression;
      this._modelStore.parseScenario(input);
      Step _first = this._modelStore.<Step>first(Step.class);
      QualifiedName _fullyQualifiedName = this.subject.getFullyQualifiedName(_first);
      _xblockexpression = this.converter.toString(_fullyQualifiedName);
    }
    return _xblockexpression;
  }
}
