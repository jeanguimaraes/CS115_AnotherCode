package edu.ldsbc.Assignment5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[])

    {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Dog dog4 = new Dog();

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();

        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        Duck duck3 = new Duck();
        Duck duck4 = new Duck();


        dog1.setMyName("Richard");
        dog2.setMyName("Jack");
        duck2.myName("Quack");

        Owner owner = new Owner();

        owner.setFirstName("Craig");
        owner.setLastName("Smith");

        System.out.println(dog1.sayMyName());
        System.out.println(cat1.makeSound());

        System.out.println(duck2.sayMyName());

        List<AnimalAudio> list = new ArrayList<>();

        list.add(dog1);
        list.add(cat2);
        list.add(dog2);
        list.add(duck2);
        list.add(dog3);
        list.add(duck1);
        list.add(dog4);
        list.add(cat1);
        list.add(cat3);
        list.add(duck3);
        list.add(cat4);
        list.add(duck4);

        /*for (int i = list.size(); i > 0 ; i--) {
            System.out.println(list.get(i-1).sayMyName());
            System.out.println(list.get(i-1).makeSound());
            System.out.println(owner.getFirstName()+ " " + owner.getLastName());
            System.out.println("-------------");
        }
        */

        for (AnimalAudio animalAudio: list){
            System.out.println(animalAudio.sayMyName());
            System.out.println(animalAudio.makeSound());
            System.out.println(animalAudio.getOwner());
            System.out.println("-------------");
        }
    }
}
