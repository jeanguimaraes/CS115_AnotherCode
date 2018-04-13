package edu.ldsbc.PizzaApp;

import java.util.Scanner;

public class Sicilian extends Pizza {

    public final double toppingCost = 2.50; //price of the topping when pizza is Sicilian

    public Sicilian(){}

    public Sicilian(int size){
        super(size);
        this.type = "Sicilian";
    }
    public double getCost(){
        return this.cost;
    }


    @Override
    public void getToppings() {
        Scanner sn = new Scanner(System.in);
        System.out.println("How many toppings you want: ");

        int numToppings = Integer.parseInt(sn.nextLine().trim());
        while (numToppings > 4)
        { System.out.println("You can only choose maximum of four toppings.");
            System.out.println("Choose how many toppings you want: ");
            numToppings = Integer.parseInt(sn.nextLine().trim());
        }

        for (int i=0; i<numToppings; i++){
            System.out.println("Enter topping: ");
            String topping = sn.nextLine();
            toppings.add(topping);
            this.cost += toppingCost;
        }
    }
}
