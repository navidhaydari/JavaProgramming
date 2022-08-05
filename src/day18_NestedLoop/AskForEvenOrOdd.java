package day18_NestedLoop;

import java.util.Locale;
import java.util.Scanner;

public class AskForEvenOrOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("enter a number");
            int number = scan.nextInt();

            if (number % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
            System.out.println("would you like another number");
            String ask = scan.next().toLowerCase();

            while (!(ask.equalsIgnoreCase("yes") || ask.equalsIgnoreCase("no"))){
                System.err.println("invalid answer, try again");
                ask = scan.next().toLowerCase();
            }

            if (ask.equalsIgnoreCase("no")){
                break;
            }


        }
    }
    }

