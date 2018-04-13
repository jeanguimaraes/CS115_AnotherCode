package edu.ldsbc.interfaceexample;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[])
    {
        Animal dog = new DogExample();
        Animal cat = new CatExample();
        Animal pig = new Pig();

        System.out.println(pig.speaks());

        List<Animal> list = new ArrayList<>();
        list.add(dog);
        list.add(cat);

    }
}
