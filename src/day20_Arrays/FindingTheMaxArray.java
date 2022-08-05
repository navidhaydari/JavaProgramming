package day20_Arrays;

import java.util.Arrays;

public class FindingTheMaxArray {
    public static void main(String[] args) {
        int[] numbers = {10,4,58,70,3};
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i]>max){
                max= numbers[i];

            }
            
        }
        System.out.println(max);
    }
}
