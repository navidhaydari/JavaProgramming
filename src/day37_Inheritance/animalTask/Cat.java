package day37_Inheritance.animalTask;

public class Cat extends Animal {


    public Cat(String name, String breed, String color, String size, int age, char gender) {
        super(name, breed, color, size, age, gender);
    }

    public void meow(){
        System.out.println(name+ " is meowing");
    }
}
