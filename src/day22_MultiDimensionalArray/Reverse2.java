package day22_MultiDimensionalArray;

import java.util.Arrays;

public class Reverse2 {
    public static void main(String[] args) {
        String sentence = "I love Java"; // first we convert this into array
        String[] words = sentence.split(" "); // [I, love, Java]
        String reverse = "";  // "I evol Java"

        for (int i = words[1].length() - 1; i >= 0; i--) {
            reverse+=words[1].charAt(i); // to get first index characters

        }
        System.out.println(reverse);
    }
}
