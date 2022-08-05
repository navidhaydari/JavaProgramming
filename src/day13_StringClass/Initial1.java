package day13_StringClass;

import java.util.Scanner;

public class Initial1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first word");
        String s1 = scan.nextLine();
        System.out.println("enter second word");
        String s2 = scan.nextLine();
        char c1 = s1.charAt(0);
        char c2 = s2.charAt(0);
        System.out.println(""+c1 + c2); // we should take a blank qutation in here.
    }
}
