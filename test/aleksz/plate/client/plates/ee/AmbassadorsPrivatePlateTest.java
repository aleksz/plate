package aleksz.plate.client.plates.ee;

import org.junit.Test;

import aleksz.plate.client.plates.ee.AmbassadorsPrivatePlate;


public class AmbassadorsPrivatePlateTest {

  @Test
  public void acceptsLegalSequenceWithSmallLetters() {
    new AmbassadorsPrivatePlate("cMd213");
  }

  @Test
  public void acceptsLegalSequenceWithoutSpace() {
    new AmbassadorsPrivatePlate("CMD213");
  }

  @Test
  public void acceptsLegalSequenceWithSpace() {
    new AmbassadorsPrivatePlate("CMD 213");
  }

  @Test(expected = IllegalArgumentException.class)
  public void doesNotAcceptSequenceWithMoreThanThreeDigits() {
    new AmbassadorsPrivatePlate("CMD 2133");
  }

  @Test(expected = IllegalArgumentException.class)
  public void doesNotAcceptSequenceWithLessThanThreeDigits() {
    new AmbassadorsPrivatePlate("CMD 21");
  }

  @Test(expected = IllegalArgumentException.class)
  public void doesNotAcceptSequenceNotStartingWithCMD() {
    new AmbassadorsPrivatePlate("CMS 213");
  }

  @Test(expected = IllegalArgumentException.class)
  public void doesNotAcceptEmptySequence() {
    new AmbassadorsPrivatePlate("");
  }

  @Test(expected = IllegalArgumentException.class)
  public void doesNotAcceptNull() {
    new AmbassadorsPrivatePlate(null);
  }

  @Test(expected = IllegalArgumentException.class)
  public void doesNotAcceptStringOnlyWithSpaces() {
    new AmbassadorsPrivatePlate("   ");
  }
}
