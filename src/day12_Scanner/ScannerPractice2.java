package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        Scanner score = new Scanner(System.in);
        System.out.println("please enter your marks");
        int marks = score.nextInt();
        String result = "";
        if (marks>=50 && marks<=100){
            if (marks >=90 && marks<=100){
                result= "A";
            } else if (marks>=80 ) {
                result = "B";

            } else if (marks>=60) {
                result="passed";

            }else {
                result="failed";
            }

        }else {
            result=("invalid marks");
        }
        System.out.println("result = " + result);
        score.close();
    }
}
