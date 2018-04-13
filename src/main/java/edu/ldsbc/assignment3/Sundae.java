package edu.ldsbc.assignment3;

/**
 * Created by XPS on 2/1/2017.
 */
public class Sundae extends IceCream {

    private String topping;
    private int cost;

    public Sundae(String nameOfIceCream , int costOfIceCream, String nameOfTopping, int costOfTopping){
        super(nameOfIceCream, costOfIceCream);
        cost = costOfIceCream + costOfTopping;
        topping = nameOfTopping;
    }


    @Override
    public int calculateItemCost(){
        return cost;
    }
    @Override
    public String toString(){
        return this.getName() + " with " + topping + " - " + cost;
    }
}

