package Products;

import Behaviours.ISell;

public class DrumStick implements ISell {

    private double salePrice;
    private double costPrice;

    public DrumStick(){
        this.costPrice = 5;
        this.salePrice = 10;
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
