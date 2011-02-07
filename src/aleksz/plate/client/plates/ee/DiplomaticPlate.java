package aleksz.plate.client.plates.ee;

import aleksz.plate.client.plates.Plate;


/**
 *
 * <p>
 * For diplomatic corps, the plate is coloured white letters on a blue
 * background, and consists of two letters and four numbers. The two letters are
 * either CD (for Corps Diplomatique) or AT (for Attaché). The first two numbers
 * are a code for the individual Embassy.
 * </p>
 *
 * <p>
 * Tüüp A4 - Eestis tegutseva välisesinduse diplomaatilise ja
 * administratiivtehnilise personali autode registreerimismärk Välisesinduste
 * diplomaatilise personali autode registreerimismärkidel on tähed CD ja
 * administratiivtehnilise personali autode registreerimismärkidel on tähed AT
 * ning välisministeeriumi poolt määratud neljakohaline number.
 * </p>
 *
 * @author aleksz
 *
 */
public class DiplomaticPlate implements Plate {

  private static final String pattern = "(([Cc][Dd])|([Aa][Tt]))\\s?\\d{4}";

  public DiplomaticPlate(String sequence) {
    if (sequence == null || !sequence.matches(pattern)) {
      throw new IllegalArgumentException();
    }
  }
}
