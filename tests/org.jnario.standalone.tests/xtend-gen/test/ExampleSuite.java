package test;

import linking.ExampleSpec;
import linking.ExampleSuiteSuite;
import linking.ExamplesFeature;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.standalone.tests.JnarioDocCompilerSpec;
import org.junit.runner.RunWith;
import test.SpecExampleSpec;

@Named("Example")
@Contains({ ExampleSpec.class, ExampleSuiteSuite.class, ExamplesFeature.class, test.ExamplesFeature.class, JnarioDocCompilerSpec.class, SpecExampleSpec.class })
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class ExampleSuite {
}
