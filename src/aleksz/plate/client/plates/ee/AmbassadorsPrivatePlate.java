package aleksz.plate.client.plates.ee;

import aleksz.plate.client.plates.Plate;

/**
 *
 * <p>
 * Tüüp A5 - Eestis tegutseva välisesinduse juhi auto registreerimismärk
 * Numbrikombinatsioon sisaldab tähti CMD ja välisministeeriumi määratud
 * kolmekohalist numbrit.
 * </p>
 *
 * <p>
 * The Ambassador's private vehicles have registration plates with the letters
 * CMD followed by three figures; again, the first two figures are the Embassy
 * code.
 * </p>
 *
 * @author aleksz
 *
 */
public class AmbassadorsPrivatePlate implements Plate {

  private static final String pattern = "[Cc][Mm][Dd]\\s?\\d{3}";

  public AmbassadorsPrivatePlate(String sequence) {
    if (sequence == null || !sequence.matches(pattern)) {
      throw new IllegalArgumentException();
    }
  }
}
