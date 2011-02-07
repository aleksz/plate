package aleksz.plate.client.plates;

import aleksz.plate.client.plates.ee.AmbassadorsPrivatePlate;
import aleksz.plate.client.plates.ee.CustomPlate;
import aleksz.plate.client.plates.ee.DiplomaticPlate;
import aleksz.plate.client.plates.ee.PublicPlate;
import aleksz.plate.client.plates.ee.PublicShortPlate;

public class PlateFactory {

  public static Plate createPlate(String sequence) {

    try {
      return new PublicPlate(sequence);
    } catch (IllegalArgumentException e) {}

    try {
      return new PublicShortPlate(sequence);
    } catch (IllegalArgumentException e) {}

    try {
      return new DiplomaticPlate(sequence);
    } catch (IllegalArgumentException e) {}

    try {
      return new AmbassadorsPrivatePlate(sequence);
    } catch (IllegalArgumentException e) {}

    return new CustomPlate(sequence);
  }
}
