package day10_NestedIf;

public class GradeLevel {
    public static void main(String[] args) {
        /*
        1. Create a class called GradeLevel, Given a number(byte) grade level
determine and print which school type someone is in.
grade level and types are:
1-5: Elementary school
6-8: Middle school
9-12: High school
13-16: College
17-18: Grad School
For Any Other grade: Invalid grade level given
NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT
STATEMENT
         */
        byte age = 2;
        String gradeLevel = "";
        if (age>= 1 && age<= 18){
            if (age >=1 && age <= 5){
                gradeLevel = "Elementary school";
            } else if (age>5 && age<=8) {
                gradeLevel = "Meddle school";

            } else if (age>8 && age <=12) {
                gradeLevel = "High school";

            } else if (age> 12 && age<=16) {
                gradeLevel = "college";

            }else {
                gradeLevel = "Grad school";
            }

        }else {
            gradeLevel = "invalid grade";

        }
        System.out.println("gradeLevel = " + gradeLevel);
    }
}
