package day17_While_DoWhile;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the first number");
        int n1 = scan.nextInt();
        System.out.println("enter the second number");
        int n2 = scan.nextInt();
        System.out.println("enter the math operation");
        char ch = scan.next().charAt(0);
        /*if ( !(ch =='+' || ch=='-')){
            System.out.println("invalid operator, enter correct one");
            ch = scan.next().charAt(0); // its just for one time, for several times we just change if to while.
         */
        while ( !(ch =='+' || ch=='-')){
            System.out.println("invalid operator, enter correct one");
            ch = scan.next().charAt(0);

        }
        System.out.println((ch=='+')? n1 + n2 : n1-n2);



    }
}
