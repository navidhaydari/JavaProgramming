package day14_String;

import java.util.Scanner;

public class withoutX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        word = word.replaceFirst("x", "");
        System.out.println(word);

    }
}
