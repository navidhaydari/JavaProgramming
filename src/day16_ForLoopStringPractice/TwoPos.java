package day16_ForLoopStringPractice;

import java.util.Scanner;

public class TwoPos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter tow numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int sum = 1;
        for (int i = 1; i <num2 ; i++) {
            if (i>0){
                sum*=i;

            }else {
                System.out.println("negative number");
            }

        }
        System.out.println(sum);
    }
}
