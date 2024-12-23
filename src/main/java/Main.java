public class Main {


    public static void main(String[]args){

        Pet pet =new Pet("dog","Rock",5,75,new String[]{"eat","drink","sleep"});

        Human mother=new Human("Jale","Memmedova",1975);

        Human father=new Human("Kerim","Memmedov",1970);

        Family family= new Family(mother,father );

        Human child=new Human("Mikayil","Memmedov",1995,90,pet,new Family(mother,father),new String[][]{
                {"Monday", "Go to the course"},
                {"Friday", "Go to the swimming pool"}
        });

        System.out.println(mother);
        System.out.println(father);
        System.out.println(child);


        pet.getRespond();
        pet.getFoul();
        pet.getEat();
        child.getDescribePet();
        child.getGreetPet();



    }
}
