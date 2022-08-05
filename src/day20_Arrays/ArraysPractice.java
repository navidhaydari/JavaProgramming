package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        int[] numbers = {10,20,50,70}; // in this methode we know the size and type of element
        System.out.println(Arrays.toString(numbers));

        System.out.println("-----------------------------"); //

        // create a variable that can contain 5 scores, in this methode we know just 5 variables not the elements
        int[] n = new int[5];
        n[1] = 85;

        System.out.println(Arrays.toString(n)); // [0,85,0,0,0]
    }
}
