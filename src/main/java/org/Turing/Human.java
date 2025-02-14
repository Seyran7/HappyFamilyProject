package org.Turing;

import java.util.Arrays;

public class Human {
    private String name;
    private String surName;
    private int dateOfBirth;
    private int iq;
    private Pet pet;
    private Human father;
    private Human mother;
    private String[][]schedule;

    public Human(String name, String surName, int dateOfBirth, int iq,Human mother,Human father,Pet pet, String[][]schedule){
        this.name=name;
        this.surName=surName;
        this.dateOfBirth=dateOfBirth;
        this.iq=iq;
        this.mother=mother;
        this.father=father;
        this.pet=pet;
        this.schedule=schedule;

    }


    public Human( String name,String surName,int dateOfBirth){
        this.name=name;
        this.surName=surName;
        this.dateOfBirth=dateOfBirth;
    }
    public Human(String name,String surName,int dateOfBirth,Human mother,Human father){
        this.name=name;
        this.surName=surName;
        this.dateOfBirth=dateOfBirth;
        this.mother=mother;
        this.father=father;
    }
    public Human(){

    }


    private void greetPet(){
        System.out.println("Hello,"+pet.getNickName());
    }
    public void getGreetPet(){
        System.out.println("Hello,"+pet.getNickName());
    }
    
    private void describePet(String species,int age){
        if(pet.getTrickLevel()>50) {
            System.out.println("I have an " + species + " is " + age+", he is sly.");
        }else{
            System.out.println("I have an "+species+" is "+age+", he is almost not sly.");
        }
    }
    public void getDescribePet(String species,int age){
        if(pet.getTrickLevel()>50) {
        System.out.println("I have an " + species + " is " + age+", he is sly.");
    }else{
        System.out.println("I have an "+species+" is "+age+", he is almost not sly.");
    }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", iq=" + iq +
                ", pet=" + pet +
                 (father != null ? "father="+father.name + " "+father.surName:"Null")+","+
                (mother!=null?"mother="+ mother.name +mother.surName:"Null")+
                ", schedule=" + Arrays.deepToString(schedule);
    }
}
