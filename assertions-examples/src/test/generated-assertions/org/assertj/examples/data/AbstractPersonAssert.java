package org.assertj.examples.data;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.util.Objects;

/**
 * Abstract base class for {@link Person} specific assertions - Generated by CustomAssertionGenerator.
 */
public abstract class AbstractPersonAssert<S extends AbstractPersonAssert<S, A>, A extends Person> extends AbstractAssert<S, A> {

  /**
   * Creates a new <code>{@link AbstractPersonAssert}</code> to make assertions on actual Person.
   * @param actual the Person we want to make assertions on.
   */
  protected AbstractPersonAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  /**
   * Verifies that the actual Person's age is equal to the given one.
   * @param age the given age to compare the actual Person's age to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Person's age is not equal to the given one.
   */
  public S hasAge(int age) {
    // check that actual Person we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting age of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // check
    int actualAge = actual.getAge();
    if (actualAge != age) {
      failWithMessage(assertjErrorMessage, actual, age, actualAge);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual Person's name is equal to the given one.
   * @param name the given name to compare the actual Person's name to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Person's name is not equal to the given one.
   */
  public S hasName(String name) {
    // check that actual Person we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting name of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    String actualName = actual.getName();
    if (!Objects.areEqual(actualName, name)) {
      failWithMessage(assertjErrorMessage, actual, name, actualName);
    }

    // return the current assertion for method chaining
    return myself;
  }

}
