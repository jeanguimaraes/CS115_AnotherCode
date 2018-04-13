package edu.ldsbc.Assignment5;

public class Dog implements AnimalAudio{

    private String myName;
    private Owner owner;
    private Gender gender;
    private boolean tail;

    public String sound = "The Dog Says Woof";

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }
    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public String makeSound() {
        return sound;
    }

    public String sayMyName() {
        return "My Name Is " + myName;
    }

    @Override
    public String getOwner() {
        return null;
    }
}