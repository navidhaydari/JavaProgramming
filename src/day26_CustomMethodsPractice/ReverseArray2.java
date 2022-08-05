package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReverseArray2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] arr3 = reverse(arr);
        System.out.println(Arrays.toString(arr3));
    }
    public static int[] reverse(int[] array){
        int[] result = {};
        for (int i = array.length - 1; i >= 0; i--) {
            ArraysUtility.addElement(result, array[i]);

        }
        return result;
    }
}
