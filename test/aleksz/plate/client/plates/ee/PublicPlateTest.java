package aleksz.plate.client.plates.ee;

import org.junit.Test;

import aleksz.plate.client.plates.ee.PublicPlate;


public class PublicPlateTest {

  @Test(expected = IllegalArgumentException.class)
  public void doesNotAcceptSequenceWithMoreThanOneWChar1() {
    new PublicPlate("213 WWA");
  }

  @Test(expected = IllegalArgumentException.class)
  public void doesNotAcceptSequenceWithMoreThanOneWChar2() {
    new PublicPlate("213 AWW");
  }

  @Test(expected = IllegalArgumentException.class)
  public void doesNotAcceptSequenceWithMoreThanOneWChar3() {
    new PublicPlate("213 WAW");
  }


  @Test(expected = IllegalArgumentException.class)
  public void doesNotAcceptSequenceWithMoreThanTwoSmallMChars() {
    new PublicPlate("213mmm");
  }

  @Test(expected = IllegalArgumentException.class)
  public void doesNotAcceptSequenceWithMoreThanTwoLargeMChars() {
    new PublicPlate("213 MMM");
  }

  @Test(expected = IllegalArgumentException.class)
  public void doesNotAcceptSequenceWithMoreThanTwoSmallAChars() {
    new PublicPlate("213aaa");
  }

  @Test(expected = IllegalArgumentException.class)
  public void doesNotAcceptSequenceWithMoreThanTwoLargeAChars() {
    new PublicPlate("213 AAA");
  }

  @Test
  public void acceptsLegalSequenceWithSmallLetters() {
    new PublicPlate("213arx");
  }

  @Test
  public void acceptsLegalSequenceWithoutSpace() {
    new PublicPlate("213ARX");
  }

  @Test
  public void acceptsLegalSequenceWithSpace() {
    new PublicPlate("213 ARX");
  }

  @Test(expected = IllegalArgumentException.class)
  public void doesNotAcceptSequenceWithMoreThanThreeDigits() {
    new PublicPlate("2133 ARX");
  }

  @Test(expected = IllegalArgumentException.class)
  public void doesNotAcceptSequenceWithLessThanThreeDigits() {
    new PublicPlate("21 ARX");
  }

  @Test(expected = IllegalArgumentException.class)
  public void doesNotAcceptSequenceWithMoreThanThreeChars() {
    new PublicPlate("213 ARXX");
  }

  @Test(expected = IllegalArgumentException.class)
  public void doesNotAcceptSequenceWithLessThanThreeChars() {
    new PublicPlate("213 AR");
  }

  @Test(expected = IllegalArgumentException.class)
  public void doesNotAcceptSequenceWithNonLatinChars() {
    new PublicPlate("213 ЛОВ");
  }

  @Test(expected = IllegalArgumentException.class)
  public void doesNotAcceptSequenceWithNonLatinWeirdChars() {
    new PublicPlate("213 ÜÕÄ");
  }

  @Test(expected = IllegalArgumentException.class)
  public void doesNotAcceptEmptySequence() {
    new PublicPlate("");
  }

  @Test(expected = IllegalArgumentException.class)
  public void doesNotAcceptNull() {
    new PublicPlate(null);
  }

  @Test(expected = IllegalArgumentException.class)
  public void doesNotAcceptStringOnlyWithSpaces() {
    new PublicPlate("   ");
  }
}
