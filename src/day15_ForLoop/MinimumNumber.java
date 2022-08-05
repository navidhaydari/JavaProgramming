package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        int min = 1000;
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <5 ; i++) {
            System.out.println("enter numbers");
            int num =scan.nextInt();
            if (num<min){
                min=num;
            }

        }
        System.out.println(min);
        scan.close();
    }
}
