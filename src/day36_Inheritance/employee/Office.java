package day36_Inheritance.employee;

public class Office {
    public static void main(String[] args) {

        Developer developer = new Developer();
        developer.setInfo("navid","engineer","10090D","cydeo",26,120000);

        developer.work();
        developer.eat();

        Tester tester = new Tester();
        tester.setInfo("bayes","QA","d9000","MAC",20,150000);

        tester.work();
        tester.eat();

        System.out.println(developer);
        System.out.println(tester);


    }
}
