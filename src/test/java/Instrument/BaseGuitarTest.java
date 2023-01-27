package Instrument;

import Products.DrumStick;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BaseGuitarTest {

    BaseGuitar baseGuitar;

        @Before
        public void before() {
            baseGuitar = new BaseGuitar("bassio", "acrylic", InstrumentType.STRINGS, "blue", 300, 200, 6, false);
    }
        @Test
        public void canGetStrings() {
            assertEquals(6, baseGuitar.getStrings());
        }
    @Test
    public void canPlay() {
        assertEquals("Now Playing bassio", baseGuitar.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(100, baseGuitar.calculateMarkup(), 0.0);
    }
}