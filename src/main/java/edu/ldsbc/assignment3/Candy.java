package edu.ldsbc.assignment3;

public class Candy extends DessertItem {

    private double wight;
    private double costPerLb;

    public Candy(String name, double wight, double costPerLb){

        super(name);
        this.wight = wight;
        this.costPerLb = costPerLb;
    }

    @Override
    public int calculateItemCost(){
        return (int) (wight * costPerLb);
    }

    @Override
    public String toString(){
        return this.getName() + " - " + (wight * costPerLb);
    }
}
