package edu.ldsbc.Assignment4;


public class Checkout {

    private int numberOfItems;
    private int totalCost;

    //constructor

    Checkout() {
        numberOfItems = 0;
        totalCost = 0;

    }

    public void add(DessertItem dessertItem) {
        totalCost += dessertItem.calculateItemCost();
        numberOfItems++;
        System.out.println(dessertItem);

    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public int getTotalCost() {
        return totalCost;
    }
}