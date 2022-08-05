package day15_ForLoop;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String reverse = "";
        System.out.println("enter word");
        String s1 = scan.nextLine();
        for (int i = s1.length()-1; i >=0 ; i--) {
            reverse +=s1.charAt(i);

        }
        System.out.println(reverse);

    }
}
