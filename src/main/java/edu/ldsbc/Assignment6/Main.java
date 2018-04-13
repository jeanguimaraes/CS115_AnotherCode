package edu.ldsbc.Assignment6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        String message = "You didn't find anything";
        try{
            System.out.println("Starting of try block");
            // I'm throwing the custom exception using throw
            throw new MyException(-1);
        }
        catch(MyException exp){
            System.out.println("Catch Block") ;
            System.out.println(exp) ;
        }
    }
}