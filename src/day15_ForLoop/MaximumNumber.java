package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        int max = 1;
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <6 ; i++) {
            System.out.println("enter the numbers");
            int num = scan.nextInt();
            if (num>max){ // if its bigger currently
                max = num;
            }

        }
        System.out.println("Max num is " +max);
    }
}
