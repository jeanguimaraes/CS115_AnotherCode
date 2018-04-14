package edu.ldsbc.Assignment10;

import edu.ldsbc.Assignment7.Control;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        NumberController controller = new NumberController();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 numbers: ");
        for(int i=0; i<10; i++) {
            System.out.print("> ");
            controller.pushNumber(scanner.nextInt());
        }

        controller.reverseQueue();
        controller.displayQueue();
    }
}
