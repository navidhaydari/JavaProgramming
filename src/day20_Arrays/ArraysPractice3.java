package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("how many numbers would you like to enter?");
        int length = scan.nextInt();

        if (length<=0){
            System.err.println("length is error");
            System.exit(0);
        }

        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("enter a number");
            numbers[i] = scan.nextInt(); // each input will assigend to the index of arry


        }
        scan.close();
        System.out.println(Arrays.toString(numbers));

    }
}
