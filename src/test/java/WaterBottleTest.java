import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    private WaterBottle waterBottle;

    @Before
    public void before() {
        waterBottle = new WaterBottle();
    }

    @Test
    public void volumeStartsAt100() {
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void canDrink() {
        waterBottle.drink();
        assertEquals(90, waterBottle.getVolume());
    }

    @Test
    public void canEmpty() {
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }
}
