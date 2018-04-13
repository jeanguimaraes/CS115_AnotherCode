package edu.ldsbc.Assignment5;

public class Cat implements AnimalAudio {

    private String myName;
    private Owner owner;
    private Gender gender;
    private Size size;

    public String sound =  "The Cat Says Meow";

    public String getMyName() {
        return myName;
    }
    public void setMyName(String myName) {
        this.myName = myName;
    }

    public String getOwner() {
        return String.valueOf(owner);
    }
    public void setOwner(Owner owner) {
        this.owner = owner;
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
        return "My Name Is "+ myName;
    }

}