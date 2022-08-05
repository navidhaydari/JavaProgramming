package day21_ForEachLoop;

import java.util.Arrays;

public class MergingArrays {
    public static void main(String[] args) {
        int[] one = {1,2,3};
        int[] two = {4,5};
        int[] sum = new int[one.length+ two.length];

        int i = 0;

        for (int each : one) {
            sum[i++]=each;
            
        }
        for (int each : two) {
            sum[i++]=each;
            
        }
        System.out.println(Arrays.toString(sum));
    }
}
