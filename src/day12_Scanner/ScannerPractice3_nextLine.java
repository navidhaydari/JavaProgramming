package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_nextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        ask users enter age
        ask users enter full name
         */
        System.out.println(" please enter your age");
        int age =input.nextInt();

        input.nextLine();

        System.out.println(" please enter your full name");
        String fullName =input.nextLine();

        System.out.println(" Enter your GPA");
        double gpa = input.nextDouble();

        input.nextLine();

        System.out.println("Enter school name");
        String school = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
        System.out.println("gpa = " + gpa);
        System.out.println("school = " + school);
        input.close();


    }

}
