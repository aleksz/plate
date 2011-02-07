package aleksz.plate.client.plates.ee;

import aleksz.plate.client.plates.Plate;

/**
 *
 * <p>
 * Tüüp A3 - vähendatud mõõtmetega autode ja haagiste registreerimismärk
 * Ettenähtud sõidukile, mille konstruktsioon ei võimalda kasutada
 * üldkasutatavat registreerimismärki. Numbrikombinatsioon koosneb kahest
 * numbrist ja kolmest ladina tähest.
 * </p>
 *
 * @author aleksz
 *
 */
public class PublicShortPlate implements Plate {

  private static final String pattern = "\\d{2}\\s?[a-zA-Z]{3}";

  public PublicShortPlate(String sequence) {
    if (sequence == null || !sequence.matches(pattern)) {
      throw new IllegalArgumentException();
    }
  }
}
