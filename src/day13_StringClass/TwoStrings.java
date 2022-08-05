package day13_StringClass;

import java.util.Scanner;

public class TwoStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter string1");
        String s1 = scan.nextLine();
        System.out.println("enter string2");
        String s2 = scan.nextLine();
        int n1 =s1.length();
        int n2 = s2.length();
        if (n1>n2){
            System.out.println("n1 = " + s1);
        }else {
            System.out.println("n2 = " + s2);
        }
    }
}
