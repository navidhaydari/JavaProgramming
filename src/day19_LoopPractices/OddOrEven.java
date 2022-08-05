package day19_LoopPractices;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("enter a number");
            int num1 = scan.nextInt();

            if (num1 % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("Odd");
            }
            System.out.println("would you like to enter other number");
            String answer = scan.next();

            while ( !(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
                System.out.println("enter correct answer");
                answer = scan.next();

            }

            if (answer.equalsIgnoreCase("no")){
                System.exit(0);
            }
            }

        }
    }

