package day15_ForLoop;

import java.util.Scanner;

public class SumBetweenAnyNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        System.out.println("enter the number");
        int num = scan.nextInt();
        for (int i = 1; i <=num ; i++) {
            sum +=i;



        }
        System.out.println(sum);
        scan.close();
    }
}
