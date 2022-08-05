package day15_ForLoop;

import java.util.Scanner;

public class askForWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word");
        String str1 = scan.nextLine();
        char first = str1.charAt(0);
        String a = str1.replaceFirst("x","a");
        System.out.println(a);
        System.out.println("================================");

        String xX=str1.replace("x","a") .replace("X","a");
        System.out.println(xX);
        scan.close();




    }
}
