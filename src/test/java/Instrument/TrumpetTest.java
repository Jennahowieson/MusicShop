package Instrument;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TrumpetTest {

    Trumpet trumpet;

        @Before
        public void before() {
            trumpet = new Trumpet("foghorn", "gold", InstrumentType.BRASS, "gold", 300, 150, 3);

        }
        @Test
        public void canGetValves() {
            assertEquals(3, trumpet.getValves());
        }

        @Test
    public void canPlay() {
            assertEquals("Now Playing foghorn", trumpet.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(150, trumpet.calculateMarkup(), 0.0);
    }

}