package day13_StringClass;

import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter three words");
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        String str3 = scan.nextLine();
        int l1 =str1.length();
        int l2 = str2.length();
        int l3 = str3.length();
        if ((l1 == l2) && (l2==l3) && (l1==l3)){
            System.out.println("All words are same length");
        }else if (l1 == l2 || l2==l3) {
            System.out.println("Not Same nor Different lengths");
        }else {
            System.out.println("All different length");
        }
    }
}
