package day33_Statics;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name = "ahmet";
        employee1.salary = 120000;
        Employee employee2 = new Employee();
        employee2.name = "navid";
        employee2.salary = 110000;

        System.out.println(employee1.name +" "+ employee1.salary);
        System.out.println(employee2.name+ " " + employee2.salary);
    }
}
