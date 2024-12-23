import java.util.Arrays;

public class Human {
    private String name;
    private String surName;
    private int dateOfBirth;
    private int iq;
    private Pet pet;
    private Family family;
    private String[][]schedule;


    public Human(String name,String surName,int dateOfBirth,int iq,Pet pet,Family family,String[][]schedule){
        this.name=name;
        this.surName=surName;
        this.dateOfBirth=dateOfBirth;
        this.iq=iq;
        this.pet=pet;
        this.family=family;
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
        //this.mother=mother;
        //this.father=father;
    }
    public Human(){

    }


    private void greetPet(){
        System.out.println("hello,"+name);
    }
    public void getGreetPet(){
        System.out.println("hello,"+name);
    }
    
    private void describePet(String species,int age){
        if(pet.getTrickLevel()>50) {
            System.out.println("I have an " + species + " is " + age+", he is sly.");
        }else{
            System.out.println("I have an "+species+" is "+age+", he is almost not sly.");
        }
    }
    public void getDescribePet(){
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", iq=" + iq +
                ", pet=" + pet +
                ", schedule=" + Arrays.toString(schedule) +
                '}';
    }
}
