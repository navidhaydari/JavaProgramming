package day14_String;

import java.util.Scanner;

public class twoWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the words");
        String firstWord = scan.nextLine();
        String secondWord = scan.nextLine();
        firstWord = firstWord.substring(1);
        secondWord = secondWord.substring(1);
        System.out.println(firstWord+secondWord);
        scan.close();


    }
}
