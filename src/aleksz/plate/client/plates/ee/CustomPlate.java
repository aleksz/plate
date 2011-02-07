package aleksz.plate.client.plates.ee;

import aleksz.plate.client.plates.Plate;

/**
 * <p>
 * Tüüp A2 - eritellimuse järgi valmistatav registreerimismärk. Võimalik
 * kasutada kuni 9 sümbolit, millest vähemalt üks on number, vastavalt soovile.
 * Väljastatakse autole.
 * </p>
 *
 * @author aleksz
 *
 */
public class CustomPlate implements Plate {

  private static final String pattern = "[a-zA-Z\\d\\s]{1,9}";
  private static final String pattern2 = ".*\\d.*";

  public CustomPlate(String sequence) {
    if (sequence == null || !sequence.matches(pattern2)
        || !sequence.matches(pattern)) {
      throw new IllegalArgumentException();
    }
  }

}
