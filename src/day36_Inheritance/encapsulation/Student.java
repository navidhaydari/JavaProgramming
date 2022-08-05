package day36_Inheritance.encapsulation;

public class Student {

    private String name, schoolName;
    private int age;
    private char gender, grade;

    public Student(String name, String schoolName, int age, char gender, char grade) { // constuctor shortcut
        setName(name);
        setSchoolName(schoolName);
        setAge(age);
        setGender(gender);
        setGrade(grade);
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if (age<5 || age>90){
            return;
        }
        this.age= age;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGrade() {

        return grade;
    }

    public void setGrade(char grade) {
        if (!(grade =='A' || grade == 'B' || grade == 'C' )){
            return;
        }
        this.grade = grade;
    }



    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                '}';
    }
}
