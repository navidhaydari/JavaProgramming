package day35_Enscapsulation.encapsulation;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee("navid",'M',26,120000);
        System.out.println(employee1);

        employee1.setAge(32);

    }


}
