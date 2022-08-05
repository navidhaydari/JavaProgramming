package day26_CustomMethodsPractice;

import java.util.Arrays;

public class RemoveElements1 {
    public static void main(String[] args) {
        int[] a = {10,20,30};
        int[] b = removeElement(a,1);
        System.out.println(Arrays.toString(b));
    }

    public static int[] removeElement(int[] array, int index){
        int[] result = new int[array.length-1];

        int j = 0;
        for (int each : array) {
            if (each==array[index]){
             continue;
            }
            result[j++] = each;

        }
        return result;

        }
    }


