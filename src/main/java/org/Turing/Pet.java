package org.Turing;

import java.util.Arrays;

public class Pet {
    private String species;
    private String nickName;
    private int age;
    private int trickLevel;
    private String[] habits;


    public Pet(String species, String nickName, int age, int trickLevel, String[] habits){
        this.species=species;
        this.nickName=nickName;
        this.age=age;
        this.trickLevel=trickLevel;
        this.habits=habits;
    }
    public Pet(String species,String nickName){
        this.species=species;
        this.nickName=nickName;
    }
    public Pet(){
    }


    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getTrickLevel(){
        return trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }
    private void respond(){
        System.out.println("Hello owner.I'm " +nickName+".I miss you!.");
    }
    public void getRespond(){System.out.println("Hello owner.I'm " +nickName+".I miss you!.");
    }

    private void foul(){
        System.out.println("I need to cover it up");
    }
    public void getFoul() {
        System.out.println("I need to cover it up");
    }

    private void eat(){
        System.out.println("I'm eating.");
    }
    public void getEat(){
        System.out.println("I'm eating.");
    }



    public void setHabits(String[] habits) {
        this.habits = habits;
    }


    @Override
    public String toString() {
        return "Pet{" +
                "species='" + species + '\'' +
                ", nickName='" + nickName + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }
}
