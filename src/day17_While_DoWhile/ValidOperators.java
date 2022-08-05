package day17_While_DoWhile;

import java.util.Scanner;

public class ValidOperators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String result = "";
        System.out.println("enter the first number");
        int number1 = scan.nextInt();
        System.out.println("enter the second number");
        int number2 = scan.nextInt();
        System.out.println("enter the Operator sign");
        char ch = scan.next().charAt(0);
        while (!(ch=='+' || ch=='-' || ch=='*' || ch=='/'  )){
            System.out.println( "invalid operators");
            System.out.println("enter valid operator");
            ch = scan.next().charAt(0);


        }
        System.out.println((ch=='+')?  number1+number2 :(ch=='-')? number1-number2 :(ch=='*')? number1*number2 : number1/number2);
    }
}
