package day35_Enscapsulation.encapsulation;

import day31_Constructors.Person;
import day35_Enscapsulation.PersonObject;

public class PersonObjects {
    public static void main(String[] args) {

     person person1 = new person();

        person1.setName("Danial");
        person1.setAge(20);

        System.out.println(person1.getName() + " " + person1.getAge());



    }
}
