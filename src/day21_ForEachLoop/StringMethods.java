package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str = "java";
        char[] chars = str.toCharArray();

        System.out.println(Arrays.toString(chars));


        for(char each: str.toCharArray()){
            System.out.println(each);
        }

        System.out.println("-------------------");

        String sentence = "wooden spoon";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

    }
}
