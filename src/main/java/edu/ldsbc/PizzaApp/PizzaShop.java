package edu.ldsbc.PizzaApp;


import java.util.ArrayList;
import java.util.Scanner;

public class PizzaShop {

    private static Pizza pizza;
    private static double pizzaBasePrice;

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        System.out.println("Enter customer name: ");
        String name = sn.nextLine();
        System.out.println("What type of pizza would you choose: Regular or " + "Sicilian?");
        String type = sn.nextLine();
        if (type.equalsIgnoreCase("Regular")) {
            System.out.println("What size? Small, Medium, Large or Extra-Large");
            String size = sn.nextLine();
            pizza = new Regular();
            if (size.equalsIgnoreCase("Small")) {
                pizza = new Regular(12);
            } else if (size.equalsIgnoreCase("Medium")) {
                pizza = new Regular(14);
            } else if (size.equalsIgnoreCase("Large")) {
                pizza = new Regular(16);
            } else if (size.equalsIgnoreCase("Extra-Large")) {
                pizza = new Regular(18);
            }
            pizzaBasePrice = pizza.cost;
            pizza.getToppings();
            pizza.printString();

        } else {
            System.out.println("What size? Small, Medium, Large or Extra-Large");
            String size = sn.nextLine();
            pizza = new Sicilian();
            if (size.equalsIgnoreCase("Small")) {
                pizza = new Sicilian(12);
            } else if (size.equalsIgnoreCase("Medium")) {
                pizza = new Sicilian(14);
            } else if (size.equalsIgnoreCase("Large")) {
                pizza = new Sicilian(16);
            } else if (size.equalsIgnoreCase("Extra-Large")) {
                pizza = new Sicilian(18);
            }
            pizzaBasePrice = pizza.cost;
            pizza.getToppings();
            pizza.printString();

        }
        printReceipt();
    }

    public static void printReceipt() {
        System.out.printf("Pizza type: %s $%.2f%n", pizza.type, pizzaBasePrice);

        for(int i=0; i< pizza.toppings.size(); i++) {
            System.out.printf("Topping #%d: %s $%.2f%n", i+1, pizza.toppings.get(i), pizza.type == "Regular"? ((Regular)pizza).toppingCost : ((Sicilian)pizza).toppingCost); //hahahahaha eita
        }
        System.out.printf("Total cost: $%.2f%n", pizza.cost);
        System.out.println("Thank you for shopping at Jean's pizzaria.");

    }
}
