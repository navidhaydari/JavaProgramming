package day32_Construstors;

public class Empolyee {
    public String name,jobTitle;
    public char gender;
    public double salary;

    public Empolyee(String name, String jobTitle, char gender, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.gender = gender;
        this.salary = salary;
    }

    public String toString() {
        return "Empolyee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", salary= $" + salary +
                '}';
    }
}
