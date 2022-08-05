package day13_StringClass;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your word");
        String str1 = scan.nextLine();
        int n1 = str1.length();


        if (str1.length() == 0) {
            System.out.println("string is empty");
        } else if (n1>3) {
            System.out.println(""+ str1.charAt(str1.length()-3) + str1.charAt(str1.length()-2)+str1.charAt(str1.length()-1));

        } else if (n1<3) {
            System.out.println(str1);


        }

    }

}
