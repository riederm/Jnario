package org.jnario.feature.tests.unit.jvmmodel;

import java.util.Set;
import org.jnario.JnarioField;
import org.jnario.feature.tests.unit.jvmmodel.StepContextProviderSpec;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("usedFields")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class StepContextProviderUsedFieldsSpec extends StepContextProviderSpec {
  @Test
  @Named("returns all called fields of scenario")
  @Order(1)
  public void _returnsAllCalledFieldsOfScenario() throws Exception {
    final Set<JnarioField> usedFields = this.usedFields("\r\n\t\t\tFeature: My Feature\r\n\t\t\t\tScenario: My Scenario\r\n\t\t\t\t\tval field1 = \"\"\r\n\t\t\t\t\tval field2 = \"\"\r\n\r\n\t\t\t\tGiven a step\r\n\t\t\t\t\tprintln(field1)\r\n\t\t\t");
    Set<JnarioField> _fields = this.fields("field1");
    Assert.assertTrue("\nExpected usedFields => fields(\"field1\") but"
     + "\n     usedFields is " + new org.hamcrest.StringDescription().appendValue(usedFields).toString()
     + "\n     fields(\"field1\") is " + new org.hamcrest.StringDescription().appendValue(_fields).toString() + "\n", Should.<Set<JnarioField>>operator_doubleArrow(usedFields, _fields));
    
  }
  
  @Test
  @Named("returns all called fields of scenario and background")
  @Order(2)
  public void _returnsAllCalledFieldsOfScenarioAndBackground() throws Exception {
    final Set<JnarioField> usedFields = this.usedFields("\r\n\t\t\tFeature: My Feature\r\n\t\t\t\tBackground: \r\n\t\t\t\t\tval field3 = \"\"\r\n\t\t\t\t\tval field4 = \"\"\r\n\t\t\t\tScenario: My Scenario\r\n\t\t\t\t\tval field1 = \"\"\r\n\t\t\t\t\tval field2 = \"\"\r\n\r\n\t\t\t\tGiven a step\r\n\t\t\t\t\tprintln(field1)\r\n\t\t\t\t\tprintln(field3)\r\n\t\t\t");
    Set<JnarioField> _fields = this.fields("field1", "field3");
    Assert.assertTrue("\nExpected usedFields => fields(\"field1\", \"field3\") but"
     + "\n     usedFields is " + new org.hamcrest.StringDescription().appendValue(usedFields).toString()
     + "\n     fields(\"field1\", \"field3\") is " + new org.hamcrest.StringDescription().appendValue(_fields).toString() + "\n", Should.<Set<JnarioField>>operator_doubleArrow(usedFields, _fields));
    
  }
}
