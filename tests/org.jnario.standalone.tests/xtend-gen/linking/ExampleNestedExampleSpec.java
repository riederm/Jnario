package linking;

import linking.ExampleSpec;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("Nested Example")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class ExampleNestedExampleSpec extends ExampleSpec {
  @Test
  @Named("should pass aswell")
  @Order(1)
  public void _shouldPassAswell() throws Exception {
    Should.<Integer>operator_doubleArrow(
      Integer.valueOf((1 + 1)), Integer.valueOf(2));
  }
}
