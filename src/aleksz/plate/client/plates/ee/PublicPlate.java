package aleksz.plate.client.plates.ee;

import aleksz.plate.client.plates.Plate;

/**
 *
 * <p>
 * Tüüp A1 - üldkasutatav auto ja haagise registreerimismärk Numbrikombinatsioon
 * koosneb kolmest numbrist ja kolmest ladina tähest. Väljastatakse autodele ja
 * haagistele.
 * </p>
 *
 * <p>
 * Tähte «A» on keelatud kasutada tüübi D2 korral, tüübi A3 korral lubatud
 * kasutada koos tähega «M» ühel korral, ülejäänud juhtudel kahel korral.
 * </p>
 *
 * <p>
 * Tähte «M» on keelatud kasutada tüüpidel A9 ja D2, tüübi A3 korral lubatud
 * kasutada koos tähega «A» ühel korral, ülejäänud juhtudel kahel korral.
 * </p>
 *
 *<p>
 * Tähte «W» on keelatud kasutada tüüpidel A3, A9, B1, B2 ja D2, tüübi D1 korral
 * keelatud kasutada koos tähega «A» või «M». Ülejäänud juhtudel on tähte «W»
 * lubatud kasutada ühel korral.
 *</p>
 *
 * @author aleksz
 *
 */
public class PublicPlate implements Plate {

  private static final String P = "\\d{3}\\s?[a-zA-Z]{3}";
  private static final String P2 = ".*[Aa]{3}";
  private static final String P3 = ".*[Mm]{3}";
  private static final String P4 = ".*(([wW][wW].)|([wW].[wW])|(.[wW][wW]))";

  public PublicPlate(String sequence) {
    if (sequence == null || !sequence.matches(P) || sequence.matches(P2)
        || sequence.matches(P3) || sequence.matches(P4)) {
      throw new IllegalArgumentException();
    }
  }

}
