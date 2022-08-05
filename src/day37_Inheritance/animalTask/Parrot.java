package day37_Inheritance.animalTask;

public class Parrot extends Animal {
    public Parrot(String name, String breed, String color, String size, int age, char gender) {
        super(name, breed, color, size, age, gender);
    }

    public void fly(){
        System.out.println(name + " is flying");
    }
}
