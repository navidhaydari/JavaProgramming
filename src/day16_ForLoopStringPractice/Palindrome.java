package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the word");
        String str = scan.nextLine();
        String result = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            result+=str.charAt(i);

        }
        boolean isPalindrome = str.equalsIgnoreCase(result);
        System.out.println(isPalindrome);

    }
}
