package edu.ldsbc.assignment3;

import edu.ldsbc.assignment3.DessertItem;

/**
 * Created by XPS on 2/1/2017.
 */
public class Cookie extends DessertItem {

    private int cost;

    public Cookie( String name , int number, double costPerDozen){
        super(name);
        cost = (int) (costPerDozen /12 * number);
    }

    @Override
    public int calculateItemCost(){
        return cost;
    }

    @Override
    public String toString(){
        return this.getName() + " - " + cost;
    }
}
