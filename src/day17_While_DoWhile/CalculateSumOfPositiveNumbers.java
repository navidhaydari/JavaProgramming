package day17_While_DoWhile;

import java.util.Scanner;

public class CalculateSumOfPositiveNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        while (true){
            System.out.println("enter the number");
            int number = scan.nextInt();
            if (number<0){
                break;
            }

            sum+=number;
            System.out.println("sum: " + sum);



        }
        System.out.println("sum: " + sum);

    }


}
/*
	2. Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

            hint: you need an infinite loop
 */
