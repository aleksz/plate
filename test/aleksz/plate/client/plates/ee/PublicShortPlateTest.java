package aleksz.plate.client.plates.ee;

import org.junit.Test;

import aleksz.plate.client.plates.ee.PublicShortPlate;


public class PublicShortPlateTest {

  @Test
  public void acceptsLegalSequenceWithoutSpace() {
    new PublicShortPlate("21ARX");
  }

  @Test
  public void acceptsLegalSequenceWithSpace() {
    new PublicShortPlate("21 ARX");
  }

  @Test(expected = IllegalArgumentException.class)
  public void doesNotAcceptSequenceWithMoreThanTwoDigits() {
    new PublicShortPlate("213 ARX");
  }

  @Test(expected = IllegalArgumentException.class)
  public void doesNotAcceptSequenceWithLessThanTwoDigits() {
    new PublicShortPlate("2 ARX");
  }

  @Test(expected = IllegalArgumentException.class)
  public void doesNotAcceptSequenceWithMoreThanThreeChars() {
    new PublicShortPlate("21 ARXX");
  }

  @Test(expected = IllegalArgumentException.class)
  public void doesNotAcceptSequenceWithLessThanThreeChars() {
    new PublicShortPlate("21 AR");
  }

  @Test(expected = IllegalArgumentException.class)
  public void doesNotAcceptSequenceWithNonLatinChars() {
    new PublicShortPlate("21ЛОВ");
  }

  @Test(expected = IllegalArgumentException.class)
  public void doesNotAcceptSequenceWithNonLatinWeirdChars() {
    new PublicShortPlate("21 ÜÕÄ");
  }

  @Test(expected = IllegalArgumentException.class)
  public void doesNotAcceptEmptySequence() {
    new PublicShortPlate("");
  }

  @Test(expected = IllegalArgumentException.class)
  public void doesNotAcceptNull() {
    new PublicShortPlate(null);
  }

  @Test(expected = IllegalArgumentException.class)
  public void doesNotAcceptStringOnlyWithSpaces() {
    new PublicShortPlate("   ");
  }
}
