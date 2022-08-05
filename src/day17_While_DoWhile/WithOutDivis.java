package day17_While_DoWhile;

import java.util.Scanner;

public class WithOutDivis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number 1");
        int num1 = scan.nextInt();
        System.out.println("enter number 2");
        int num2 = scan.nextInt();
        int result = 0;
        while (num1>=num2){
            num1-=num2;
            result++;
        }
        System.out.println(result);


    }
}
