package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {
        String[] students = {"navid", "basit", "bayes","tahir","wakil","khalid"};
        String[] earlyBird = Arrays.copyOf(students,2);
        System.out.println(Arrays.toString(earlyBird)); // navid basit
        String[] second = Arrays.copyOfRange(students,1,4);
        System.out.println(Arrays.toString(second));

    }
}
