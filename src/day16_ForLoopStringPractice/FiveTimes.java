package day16_ForLoopStringPractice;

import java.util.Scanner;

public class FiveTimes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the numbers");

        int positive = 0;
        int negative = 0;
        for (int i = 1; i <5 ; i++) {
            int num = scan.nextInt();
            if (num>0){
                positive++;
            } else if (num<0) {
                negative++;

            }

        }
        System.out.println("positive: "+ positive + "negative: "+negative);
    }
}
