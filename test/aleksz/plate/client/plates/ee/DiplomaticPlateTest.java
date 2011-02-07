package aleksz.plate.client.plates.ee;

import org.junit.Test;

import aleksz.plate.client.plates.ee.DiplomaticPlate;


public class DiplomaticPlateTest {

  @Test
  public void acceptsLegalSequenceWithSmallLetters() {
    new DiplomaticPlate("Cd2134");
  }

  @Test
  public void acceptsLegalSequenceWithoutSpace() {
    new DiplomaticPlate("CD2134");
  }

  @Test
  public void acceptsSecondLegalSequenceWithoutSpace() {
    new DiplomaticPlate("AT2134");
  }

  @Test
  public void acceptsLegalSequenceWithSpace() {
    new DiplomaticPlate("CD 2134");
  }

  @Test(expected = IllegalArgumentException.class)
  public void doesNotAcceptSequenceWithMoreThanFourDigits() {
    new DiplomaticPlate("CD 21334");
  }

  @Test(expected = IllegalArgumentException.class)
  public void doesNotAcceptSequenceWithLessThanFourDigits() {
    new DiplomaticPlate("CD 215");
  }

  @Test(expected = IllegalArgumentException.class)
  public void doesNotAcceptSequenceNotStartingWithATorCD() {
    new DiplomaticPlate("CC 2135");
  }

  @Test(expected = IllegalArgumentException.class)
  public void doesNotAcceptEmptySequence() {
    new DiplomaticPlate("");
  }

  @Test(expected = IllegalArgumentException.class)
  public void doesNotAcceptNull() {
    new DiplomaticPlate(null);
  }

  @Test(expected = IllegalArgumentException.class)
  public void doesNotAcceptStringOnlyWithSpaces() {
    new DiplomaticPlate("   ");
  }
}
