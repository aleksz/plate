package aleksz.plate.client.plates;

import static junit.framework.Assert.assertTrue;

import org.junit.Test;

import aleksz.plate.client.plates.ee.AmbassadorsPrivatePlate;
import aleksz.plate.client.plates.ee.CustomPlate;
import aleksz.plate.client.plates.ee.DiplomaticPlate;
import aleksz.plate.client.plates.ee.PublicPlate;
import aleksz.plate.client.plates.ee.PublicShortPlate;


public class PlateFactoryTest {

  @Test
  public void createPublicPlate() {
    assertTrue(PlateFactory.createPlate("213 ARX") instanceof PublicPlate);
  }

  @Test
  public void createAmbassadorsPrivatePlate() {
    assertTrue(PlateFactory.createPlate("CMD 213") instanceof AmbassadorsPrivatePlate);
  }

  @Test
  public void createDiplomaticPlate() {
    assertTrue(PlateFactory.createPlate("CD 2134") instanceof DiplomaticPlate);
  }

  @Test
  public void createPublicShortPlate() {
    assertTrue(PlateFactory.createPlate("13GHD") instanceof PublicShortPlate);
  }

  @Test
  public void createCustomPlate() {
    assertTrue(PlateFactory.createPlate("213 ARXG") instanceof CustomPlate);
  }

  @Test(expected = IllegalArgumentException.class)
  public void exceptionOnWrongSequence() {
    PlateFactory.createPlate("this is not plate");
  }
}
