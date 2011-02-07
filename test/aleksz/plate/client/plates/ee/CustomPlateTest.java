package aleksz.plate.client.plates.ee;

import org.junit.Test;

import aleksz.plate.client.plates.ee.CustomPlate;


public class CustomPlateTest {

  @Test
  public void acceptsLegalSequence() {
    new CustomPlate("12AB CDEF");
  }

  @Test
  public void acceptsLegalSequenceWithOnlyNumbers() {
    new CustomPlate("111111111");
  }

  @Test(expected = IllegalArgumentException.class)
  public void doesNotAcceptSequenceLongerThan9Symbols() {
    new CustomPlate("12AB CDEF1");
  }

  @Test(expected = IllegalArgumentException.class)
  public void doesNotAcceptSequenceWithLessThanOneDigit() {
    new CustomPlate("ABCDEFGHI");
  }

  @Test(expected = IllegalArgumentException.class)
  public void doesNotAcceptNull() {
    new CustomPlate(null);
  }

  @Test(expected = IllegalArgumentException.class)
  public void doesNotAcceptEmptySequence() {
    new CustomPlate("");
  }

  @Test(expected = IllegalArgumentException.class)
  public void doesNotAcceptStringOnlyWithSpaces() {
    new CustomPlate("   ");
  }

  @Test(expected = IllegalArgumentException.class)
  public void doesNotAcceptSequenceWithNonLatinChars() {
    new CustomPlate("213 ЛОВ");
  }

  @Test(expected = IllegalArgumentException.class)
  public void doesNotAcceptSequenceWithNonLatinWeirdChars() {
    new CustomPlate("213 ÜÕÄ");
  }
}
