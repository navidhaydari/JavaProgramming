package day17_While_DoWhile;

import java.util.Scanner;

public class DivisionWithoutDivisionOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double division = 0;
        System.out.println("enter the first number");
        double num1 = scan.nextDouble();
        System.out.println("enter the second number");
        double num2 = scan.nextDouble();
        while (num1>=num2){
            num1-=num2;
            division++;
        }
        while (num1<0 && num2<0){
            System.out.println("please enter positive numbers");
            System.out.println("enter the first number");
            num1 = scan.nextDouble();
            System.out.println("enter the second number");
            num2 = scan.nextDouble();

        }
        System.out.println(division);
    }
}
