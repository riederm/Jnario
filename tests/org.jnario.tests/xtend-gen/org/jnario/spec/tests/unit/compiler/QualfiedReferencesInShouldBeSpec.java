package org.jnario.spec.tests.unit.compiler;

import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("Qualfied References in should be")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class QualfiedReferencesInShouldBeSpec {
  @Test
  @Named("it should successfully generate asserts on QualifiedRefernces")
  @Order(1)
  public void _itShouldSuccessfullyGenerateAssertsOnQualifiedRefernces() throws Exception {
    boolean _doubleArrow = Should.operator_doubleArrow(
      System.class, System.class);
    Assert.assertTrue("\nExpected java.lang.System => java.lang.System but"
     + "\n     java.lang.System is " + new org.hamcrest.StringDescription().appendValue(System.class).toString() + "\n", _doubleArrow);
    
    boolean _should_be = Should.should_be(
      System.class, System.class);
    Assert.assertTrue("\nExpected java.lang.System should be java.lang.System but"
     + "\n     java.lang.System is " + new org.hamcrest.StringDescription().appendValue(System.class).toString() + "\n", _should_be);
    
    Assert.assertFalse("\nExpected java.lang.System should not be java.lang.String but"
     + "\n     java.lang.System is " + new org.hamcrest.StringDescription().appendValue(System.class).toString()
     + "\n     java.lang.String is " + new org.hamcrest.StringDescription().appendValue(String.class).toString() + "\n", Should.should_be(
      System.class, String.class));
    
  }
  
  @Test
  @Named("it should successfully generate asserts on members of QualifiedRefernces")
  @Order(2)
  public void _itShouldSuccessfullyGenerateAssertsOnMembersOfQualifiedRefernces() throws Exception {
    ClassLoader _classLoader = System.class.getClassLoader();
    ClassLoader _classLoader_1 = System.class.getClassLoader();
    boolean _doubleArrow = Should.<ClassLoader>operator_doubleArrow(_classLoader, _classLoader_1);
    Assert.assertTrue("\nExpected java.lang.System.classLoader => java.lang.System.classLoader but"
     + "\n     java.lang.System.classLoader is " + new org.hamcrest.StringDescription().appendValue(_classLoader).toString()
     + "\n     java.lang.System is " + new org.hamcrest.StringDescription().appendValue(System.class).toString() + "\n", _doubleArrow);
    
    ClassLoader _classLoader_2 = System.class.getClassLoader();
    ClassLoader _classLoader_3 = System.class.getClassLoader();
    boolean _should_be = Should.<ClassLoader>should_be(_classLoader_2, _classLoader_3);
    Assert.assertTrue("\nExpected java.lang.System.classLoader should be java.lang.System.classLoader but"
     + "\n     java.lang.System.classLoader is " + new org.hamcrest.StringDescription().appendValue(_classLoader_2).toString()
     + "\n     java.lang.System is " + new org.hamcrest.StringDescription().appendValue(System.class).toString() + "\n", _should_be);
    
    String _canonicalName = String.class.getCanonicalName();
    String _canonicalName_1 = Integer.class.getCanonicalName();
    Assert.assertFalse("\nExpected java.lang.String.canonicalName should not be java.lang.Integer.canonicalName but"
     + "\n     java.lang.String.canonicalName is " + new org.hamcrest.StringDescription().appendValue(_canonicalName).toString()
     + "\n     java.lang.String is " + new org.hamcrest.StringDescription().appendValue(String.class).toString()
     + "\n     java.lang.Integer.canonicalName is " + new org.hamcrest.StringDescription().appendValue(_canonicalName_1).toString()
     + "\n     java.lang.Integer is " + new org.hamcrest.StringDescription().appendValue(Integer.class).toString() + "\n", Should.<String>should_be(_canonicalName, _canonicalName_1));
    
  }
}
