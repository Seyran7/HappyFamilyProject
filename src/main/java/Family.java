public class Family {
    private  Human mother;
    private Human father;
    private Pet pet;
    private Human [] children;

    public Family(Human mother,Human father){
        this.mother=mother;
        this.father=father;
        this.children=new Human[0];
    }

    public Human getMother(){
        return mother;
    }
    public void setMother(){
        this.mother=mother;
    }
    public Human getFather(){
        return father;
    }
    public void setFather(){
        this.father= father;
    }
    public Pet getPet(){
        return pet;
    }
    public void setPet(){
        this.pet=pet;
    }
    public Human [] getChildren(){
        return children;
    }
    public void setChildren(Human[]children){
        this.children=children;
    }


}
