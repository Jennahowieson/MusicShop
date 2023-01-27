package Instrument;


public class Guitar extends Instrument {
    private int strings;
    private boolean acoustic;

    public Guitar(String name, String material, InstrumentType type, String colour, double salePrice, double costPrice, int strings, boolean acoustic) {
        super(name, material, InstrumentType.STRINGS, colour, salePrice, costPrice);
        this.strings  = strings;
        this.acoustic = acoustic;
    }

    public int getStrings() {
        return strings;
    }

    public boolean isAcoustic() {
        return acoustic;
    }


}
