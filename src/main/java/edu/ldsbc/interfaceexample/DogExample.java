package edu.ldsbc.interfaceexample;

public class DogExample implements Animal{
    public DogExample(){
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
