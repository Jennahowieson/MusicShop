package Products;

import Behaviours.ISell;

public class ValveOil implements ISell {

    private double salePrice;
    private double costPrice;

    public ValveOil() {
        this.costPrice = 10;
        this.salePrice = 20;
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