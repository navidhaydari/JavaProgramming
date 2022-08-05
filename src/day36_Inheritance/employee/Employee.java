package day36_Inheritance.employee;

public class Employee {

    public String name, jobTitle, id, companyName;
    public int age;
    public double salary;

    public void setInfo(String name, String jobTitle, String id, String companyName, int age, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.id = id;
        this.companyName = companyName;
        this.age = age;
        this.salary = salary;

    }
    public void work(){
        System.out.println(name + " is working");

    }
    public void eat(){
        System.out.println(name+ " is eating");

    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", id='" + id + '\'' +
                ", companyName='" + companyName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
