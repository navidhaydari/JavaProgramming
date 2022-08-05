package day12_Scanner;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {
        Scanner score = new Scanner(System.in);
        System.out.println(" Please enter your score");
        int points= score.nextInt();
        char grades ='A';
        if (points >=1 && points <=100){
            if (points>=80){
                System.out.println('A');
            } else if (points>=50) {
                System.out.println('B');

            } else if (points>30) {
                System.out.println('C');

            } else {
                System.out.println('D');
            }
        }else {
            System.out.println("invalid score");
        }
        score.close();

    }
}
