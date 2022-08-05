package day14_String;

import java.util.Scanner;

public class twoWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter words");
        String word1 = scan.nextLine();
        String word2 = scan.nextLine();
       String word3 = word1.substring(0);
        String word4 = word2.substring(1);
        if (word3 == word4){
            System.out.println("" +word3+word4);

        }else {
            System.out.println(word1+word2);
        }
    }
}
