package edu.ldsbc.PizzaApp;

import java.util.ArrayList;

public abstract class Pizza implements Comparable {


    public static final int small_pizza = 12;
    public static final int medium_pizza = 14;
    public static final int large_pizza = 16;
    public static final int extra_large_pizza = 18;
    public double [] price = {3.50 , 10.00, 14.00, 16.00};
    public double cost;
    public String type;
    public ArrayList<String> toppings = new ArrayList<String>();
    int size;

    public Pizza(){
        type ="pizza";
    }
    public Pizza(int size){

        switch (size) {
            case small_pizza:
                cost = price[0];
                size = small_pizza;
                break;
            case medium_pizza:
                cost = price[1];
                size = medium_pizza;
                break;
            case large_pizza:
                cost = price[2];
                size = large_pizza;
                break;
            case extra_large_pizza:
                cost = price[3];
                size = extra_large_pizza;
                break;
            default:
                System.out.println("Invalid size");
                break;
        }
    }

    public abstract void getToppings();

    @Override
        public int compareTo(Object x){
            Pizza choice = (Pizza)x;
            if(this.size < choice.size)
                return -1;
            else if (this.size == choice.size)
                return 0;
            else
                return 1;

    }
    public void printString()
    {
        String topping = "";
        if(toppings.size()==0);

    }

}
