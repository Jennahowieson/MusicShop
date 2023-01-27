package Instrument;

import Behaviours.IPlay;
import Behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {
    private  String name;
    private  String material;
    private  InstrumentType type;
    private  String colour;
    private double salePrice;
    private double costPrice;

    public Instrument(String name, String material, InstrumentType type, String colour, double salePrice, double costPrice) {
        this.name = name;
        this.material = material;
        this.type = type;
        this.colour = colour;
        this.salePrice = salePrice;
        this.costPrice = costPrice;
    }

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public InstrumentType getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public double getCostPrice() {
        return costPrice;
    }


    public String play() {
        return ("Now Playing " + this.name);
    }

    public double calculateMarkup() {
        return (this.salePrice - this.costPrice );
    }

}
