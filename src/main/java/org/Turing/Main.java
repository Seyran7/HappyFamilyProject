package org.Turing;

public class Main {


    public static void main(String[]args){
        Human mother=new Human("Jane","Karleone",0);
        Human father=new Human("Vito","Karleone",0);

        Pet pet =new Pet("dog","Rock",5,75,new String[]{"eat","drink","sleep"});

        Human child=new Human("Michael","Karleone",1977,90,mother,father,new Pet("dog","Rock",5,75, new String [] {"eat","drink","sleep"}),new String[][]{
                {"Monday", "Go to the course"},
                {"Friday", "Go to the swimming pool"}});
        System.out.println(father);
        System.out.println(mother);
        System.out.println(pet);
        System.out.println(child);

        pet.getEat();
        pet.getRespond();
        pet.getFoul();
        child.getDescribePet("dog",8);
        child.getGreetPet();
    }
}