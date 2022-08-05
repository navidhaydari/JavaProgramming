package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); //0
        numbers.add(20); //1
        numbers.add(30); //3
        numbers.add(40); //4
        numbers.add(2,25); //2


        System.out.println(numbers);
        System.out.println(numbers.size());
        System.out.println(numbers.size()-1); // last index
        Integer num = numbers.get(3);
        System.out.println(num);
        System.out.println(numbers.get(1)); //
        System.out.println("-----------------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
            
        }
        System.out.println("---------------------");

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Rubby");

        list.set(2,"JavaScript");
        System.out.println(list);
        list.set(3,"C++");
        System.out.println(list);
        System.out.println("------------------");

        ArrayList<String> employees = new ArrayList<>();
        employees.add("navid");
        employees.add("basit");
        employees.add("bayes");
        employees.add("emran");
        employees.add("ahmad");
        employees.add("mahmad");
        employees.add("shamtal");
        employees.add("khampal");

        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);
        employees.remove(employees.size()-1);
        System.out.println(employees);
        employees.remove("emran");
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);





    }
}
