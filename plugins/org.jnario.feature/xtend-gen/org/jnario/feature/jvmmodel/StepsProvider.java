package org.jnario.feature.jvmmodel;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Collections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.jnario.JnarioTypeDeclaration;
import org.jnario.feature.feature.Background;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.FeatureFile;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.feature.Step;
import org.jnario.feature.feature.StepImplementation;

@SuppressWarnings("all")
public class StepsProvider {
  public Iterable<StepImplementation> getSteps(final EObject context) {
    Iterable<StepImplementation> _xblockexpression = null;
    {
      Resource _eResource = context.eResource();
      boolean _equals = Objects.equal(_eResource, null);
      if (_equals) {
        return CollectionLiterals.<StepImplementation>emptyList();
      }
      Resource _eResource_1 = context.eResource();
      EList<EObject> _contents = _eResource_1.getContents();
      final Iterable<FeatureFile> featureFiles = Iterables.<FeatureFile>filter(_contents, FeatureFile.class);
      final Function1<FeatureFile, EList<JnarioTypeDeclaration>> _function = new Function1<FeatureFile, EList<JnarioTypeDeclaration>>() {
        @Override
        public EList<JnarioTypeDeclaration> apply(final FeatureFile it) {
          return it.getXtendTypes();
        }
      };
      Iterable<EList<JnarioTypeDeclaration>> _map = IterableExtensions.<FeatureFile, EList<JnarioTypeDeclaration>>map(featureFiles, _function);
      Iterable<JnarioTypeDeclaration> _flatten = Iterables.<JnarioTypeDeclaration>concat(_map);
      final Iterable<Feature> features = Iterables.<Feature>filter(_flatten, Feature.class);
      final Function1<Feature, Iterable<Scenario>> _function_1 = new Function1<Feature, Iterable<Scenario>>() {
        @Override
        public Iterable<Scenario> apply(final Feature it) {
          Iterable<Scenario> _xblockexpression = null;
          {
            Background _background = it.getBackground();
            boolean _equals = Objects.equal(_background, null);
            if (_equals) {
              return it.getScenarios();
            }
            EList<Scenario> _scenarios = it.getScenarios();
            Background _background_1 = it.getBackground();
            _xblockexpression = Iterables.<Scenario>concat(_scenarios, Collections.<Background>unmodifiableList(CollectionLiterals.<Background>newArrayList(_background_1)));
          }
          return _xblockexpression;
        }
      };
      Iterable<Iterable<Scenario>> _map_1 = IterableExtensions.<Feature, Iterable<Scenario>>map(features, _function_1);
      Iterable<Scenario> _flatten_1 = Iterables.<Scenario>concat(_map_1);
      final Iterable<Scenario> scenarios = IterableExtensions.<Scenario>filterNull(_flatten_1);
      final Function1<Scenario, EList<Step>> _function_2 = new Function1<Scenario, EList<Step>>() {
        @Override
        public EList<Step> apply(final Scenario it) {
          return it.getSteps();
        }
      };
      Iterable<EList<Step>> _map_2 = IterableExtensions.<Scenario, EList<Step>>map(scenarios, _function_2);
      Iterable<Step> _flatten_2 = Iterables.<Step>concat(_map_2);
      _xblockexpression = Iterables.<StepImplementation>filter(_flatten_2, StepImplementation.class);
    }
    return _xblockexpression;
  }
}
