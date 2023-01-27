package Instrument;

public class BaseGuitar extends Instrument{
    private int strings;

    public BaseGuitar(String name, String material, InstrumentType type, String colour, double salePrice, double costPrice, int strings, boolean acoustic) {
        super(name, material, InstrumentType.STRINGS, colour, salePrice, costPrice);
        this.strings  = strings;
    }

    public int getStrings() {
        return strings;
    }
}
