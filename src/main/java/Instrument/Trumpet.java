package Instrument;

public class Trumpet extends Instrument {
    private int valves;

    public Trumpet(String name, String material, InstrumentType type, String colour, double salePrice, double costPrice, int valves) {
        super(name, material, InstrumentType.BRASS, colour, salePrice, costPrice);
        this.valves  = valves;
    }

    public int getValves() {
        return valves;
    }
}
