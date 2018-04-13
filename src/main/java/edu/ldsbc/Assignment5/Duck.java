package edu.ldsbc.Assignment5;


public class Duck implements AnimalAudio {

    private String myName;
    private Owner owner;
    private Gender gender;
    private boolean wingsClipped;
    private String sound = "The Duck Says Quack";

    public String getMyName() {
        return myName;
    }

    public void myName(String myName) {
        this.myName = myName;
    }

    public String getOwner() {
        return String.valueOf(owner);
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Gender getGender() {
        return gender;
    }



    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public boolean isWingsClipped() {
        return wingsClipped;
    }

    public void setWingsClipped(boolean wingsClipped) {
        this.wingsClipped = wingsClipped;
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
}
