package edu.ldsbc.model;

public abstract class Student extends Person{

    Float gpa;

    public Student(String name, int age, float height) {
        super(name, age, height);
    }

    @Override
    public String printPerson(){
        return "name=" + this.getName();
    }
}
