package Products;

import Behaviours.ISell;

public class Plectrums implements ISell {

    private double salePrice;
    private double costPrice;

    public Plectrums() {
        this.costPrice = 2;
        this.salePrice = 5;
    }

    public double calculateMarkup() {
        return (this.salePrice - this.costPrice );
    }

    public double getSalePrice() {
        return salePrice;
    }

    public double getCostPrice() {
        return costPrice;
    }
}
