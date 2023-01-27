package Shop;
import Behaviours.ISell;
import Instrument.*;
import Products.DrumStick;
import Products.Plectrums;
import Products.ValveOil;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    ISell iSell;
    ArrayList<ISell> stock;
    Trumpet trumpet;
    BaseGuitar baseGuitar;
    Guitar guitar;
    DrumStick drumStick;
    Plectrums plectrums;
    ValveOil valveOil;

    @Before
    public void before() {
        trumpet = new Trumpet("trumpetio", "brass metal", InstrumentType.BRASS, "gold", 250, 200, 3);
        baseGuitar = new BaseGuitar("bassio", "acrylic", InstrumentType.STRINGS, "blue", 500, 300, 6, false);
        guitar = new Guitar("main guy", "wood", InstrumentType.STRINGS, "red", 700, 500, 6, true);
        drumStick = new DrumStick();
        plectrums = new Plectrums();
        valveOil = new ValveOil();
        stock = new ArrayList<ISell>();
        shop = new Shop(stock);
        stock.add(trumpet);
        stock.add(baseGuitar);
        stock.add(guitar);
        stock.add(drumStick);
        stock.add(plectrums);
        stock.add(valveOil);
        stock.add(valveOil);
    }

    @Test
    public void canGetStock() {
        assertEquals(7, shop.getStock().size());
    }

    @Test

    public void canAddToStock() {
        shop.addToStock(valveOil);
        assertEquals(8, shop.getStock().size());
    }

    @Test
    public void canRemoveFromStock() {
        shop.removeFromStock(plectrums);
        assertEquals(6, shop.getStock().size());
    }

    @Test
    public void canCalculateTotalPossibleProfit(){
        assertEquals(478, shop.calculateTotalPossibleProfit(),0.0);
    }
}