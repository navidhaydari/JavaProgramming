package day13_StringClass;

import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the word");
        String str1 = scan.nextLine();
        int lenght = str1.length();
        if (str1.charAt(1) == 'a' && str1.length()==3) {
            System.out.println("Cool word");

        } else if (str1.charAt(1) != 'a' && str1.length()==3) {
            System.out.println("Okay word");
        } else if (str1.length()<3) {
            System.out.println("word is too short");

        }else {
            System.out.println("word is too long");
        }
    }
}
