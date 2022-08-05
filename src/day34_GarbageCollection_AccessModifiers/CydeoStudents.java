package day34_GarbageCollection_AccessModifiers;

public class CydeoStudents {
    public String studentName;
    public static String schoolName;

    public CydeoStudents(String studentName){
        this.studentName = studentName;
    }
    static {
        schoolName = "CydeoSchool";
    }

}

class CydeoStudentObject{
    public static void main(String[] args) {
        CydeoStudents student1 = new CydeoStudents("navid");
        CydeoStudents student2 = new CydeoStudents("ahmad");

        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);
    }
}
