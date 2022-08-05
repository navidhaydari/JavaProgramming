package day17_While_DoWhile;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String divi15="",
                divi5="",
                divi3="";
        System.out.println("enter a number");
        int num= scan.nextInt();
        for (int i = 1; i <=num ; i++) {
            if (i%15==0){
                divi15+=(i+" ");
            } else if (i%5==0) {
                divi5+=(i+" ");

            } else if (i%3==0) {
                divi3 += (i+" ");

            }


        }
        System.out.println(divi15 +" "+ "\n" + divi5+" " + "\n"+ divi3+" ");
    }
}
