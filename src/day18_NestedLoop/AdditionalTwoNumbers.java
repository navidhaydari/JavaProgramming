package day18_NestedLoop;

import java.util.Locale;
import java.util.Scanner;

public class AdditionalTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("enter first number");
            int num1 = scan.nextInt();
            System.out.println("enter second number");
            int num2 = scan.nextInt();
            System.out.println("sum is : " + (num1 + num2));
            System.out.println("would you like to continue? ");
            String askFor = scan.next().toLowerCase();
            while (!(askFor.equals("yes") || askFor.equals("no"))) {
                System.out.println("enter correct");
                System.out.println("would you like to continue? ");
                askFor = scan.next().toLowerCase();


                }
            if (askFor.equals("no")) {
                break;

            }
        }
    }
}
