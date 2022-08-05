package day10_NestedIf;

public class StudentGrades {
    public static void main(String[] args) {
        int mark = 65;
       if (mark>0 && mark<=100){
            if (mark>=90){
                System.out.println("Excellent");
            } else if (mark>=80 ) {
                System.out.println("Very good");

            } else if (mark>=60 ) {
                System.out.println("good");

            } else if (mark>=50) {
                System.out.println("passed");

            }else {
                System.out.println("Failed");
            }

        }else {
            System.out.println("not valid");
        }
    }
}
