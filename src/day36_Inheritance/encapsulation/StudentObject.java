package day36_Inheritance.encapsulation;

public class StudentObject {
    public static void main(String[] args) {

        Student student1 = new Student("navid","cydeo",26,'M','A');
        student1.setAge(30);

        System.out.println(student1);
    }
}
