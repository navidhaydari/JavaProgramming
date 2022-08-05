package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {


        String str1 = "abcd";
        String str2 = "adbc";

        char[] s1 = str1.toCharArray(); // [a,b,c,d]  convert to array
        char[] s2 = str2.toCharArray(); // [a,d,b,c]  convert to array

        Arrays.sort(s1); // [a,b,c,d] sorted
        Arrays.sort(s2); // [a,b,c,d] sorted


        boolean answer = Arrays.equals(s1,s2);
        System.out.println(answer);

    }
}
