package Shop;

import Behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;
    double totalPossibleProfit;

    public Shop(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    public void addToStock(ISell product){
        stock.add(product);
    }

    public void removeFromStock(ISell product){
        stock.remove(product);
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public double calculateTotalPossibleProfit() {
        double totalPossibleProfit = 0;
        for (ISell i : getStock()) {
            totalPossibleProfit = i.calculateMarkup() + totalPossibleProfit;
        }
        return totalPossibleProfit;
    }
}


