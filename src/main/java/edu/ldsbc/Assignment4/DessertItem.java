package edu.ldsbc.Assignment4;

public abstract class DessertItem {

    private String name;


    public DessertItem(String name){
        this.name = name;
    }
    public int calculateItemCost(){
        return 0;
    }

    public void calculateSalesTax(){


    }

    public String getName() {
        return name;
    }
}
