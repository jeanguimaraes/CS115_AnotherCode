package edu.ldsbc.interfaceexample;

public class CatExample implements Animal {
    public CatExample(){
        System.out.println("yup we got a cat");
    }

    public String sleep(){
        return "Cat is asleep";
    }

    @Override
    public String speaks() {
        return null;
    }
}