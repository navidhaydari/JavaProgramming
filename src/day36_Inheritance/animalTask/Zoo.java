package day36_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("max","hasky","black","large",2,'M');

        dog.eat();
        dog.drink();
        dog.move();
        dog.bark();

        Cat cat = new Cat();
        cat.setInfo("peshak","afghani","white","small",3,'f');

        cat.eat();
        cat.drink();
        cat.meow();
        cat.move();

        System.out.println(dog);
        System.out.println(cat);


    }
}
