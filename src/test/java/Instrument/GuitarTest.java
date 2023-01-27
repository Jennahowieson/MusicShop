package Instrument;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuitarTest {

    Guitar guitar;
    Guitar guitar2;

        @Before
        public void before() {
            guitar = new Guitar("elecy", "acrylic", InstrumentType.STRINGS, "blue", 500, 300, 6, false);
            guitar2 = new Guitar("acoustico", "acrylic", InstrumentType.STRINGS, "green", 200, 150, 6, true);

        }
        @Test
        public void canGetStrings() {
            assertEquals(6, guitar.getStrings());
        }

        @Test
    public void canCheckIfAcoustic(){
            assertTrue(guitar2.isAcoustic());
        }

        @Test
    public void canPlay() {
            assertEquals("Now Playing elecy", guitar.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(200, guitar.calculateMarkup(), 0.0);
    }

}