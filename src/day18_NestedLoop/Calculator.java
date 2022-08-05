package day18_NestedLoop;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        /*
        3. Write a program that can calculate two numbers.
			1. Ask user to enter the first number
			2. Ask user to enter a math operator (+,-,/,*)
				(if user enters any invalid operator, repeat this step until user provides a valid operator)
			3. Ask user to enter the second number
			4. Display the result
			5. Ask user if they want to continue? (yes/no)
				if yes ==> repeat the entire steps
				if no ==> print "Thanks for using Cydeo calculator!"
				If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry
         */
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter the first number");
            int firstNum = scan.nextInt();

            System.out.println("enter the operator");
            char signs = scan.next().charAt(0);
            while (!((signs == '+') || (signs == '-') || (signs == '*') || (signs == '/'))) {
                System.out.println("please enter a correct sign");
                signs = scan.next().charAt(0);
            }

            System.out.println("enter the second number");
            int secNum = scan.nextInt();
            if (signs == '+') {
                System.out.println("sum: " + (firstNum + secNum));
            } else if (signs == '-') {
                System.out.println("subt: " + (firstNum - secNum));
            } else if (signs == '*') {
                System.out.println("Mult: " + (firstNum * secNum));

            } else {
                System.out.println("division: " + (firstNum / secNum));
            }
            System.out.println("do you want to continue? ");
            String ask = scan.next();
            while (!(ask.equalsIgnoreCase("yes") || ask.equalsIgnoreCase("no"))) {
                System.out.println("enter correct, yes o no?");
                ask = scan.next();


            }
            if (ask.equalsIgnoreCase("no")) {
                System.out.println("thanks for using Cydeo Calc");
                break;

            }

        }
    }
}


