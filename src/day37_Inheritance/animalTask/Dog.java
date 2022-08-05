package day37_Inheritance.animalTask;

public class Dog extends Animal {

    public Dog(String name, String breed, String color, String size, int age, char gender){
        super(name,breed,color,size,age,gender);

    }
    public void bark(){
        System.out.println(name + " is barking");
    }

}
