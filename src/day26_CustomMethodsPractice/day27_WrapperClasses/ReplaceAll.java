package day26_CustomMethodsPractice.day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAll {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,5,3};
        int[] arr1 = replaceAll(arr,3,300);
        System.out.println(Arrays.toString(arr1));
    }

    public static int[] replaceAll(int[] array , int oldElement, int newElement){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement){
                array[i] = newElement;
            }

        }
        return array;
    }
}
