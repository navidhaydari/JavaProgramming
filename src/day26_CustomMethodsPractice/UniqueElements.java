package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        int[] array = {1,2,1,2,11,3,5,7,3};
        int[] u = uniqueElements(array);
        System.out.println(Arrays.toString(u));
    }

    public static int[] uniqueElements(int[] array){
        int[] result ={};
        for (int each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){
                result = ArraysUtility.addElement(result,each);

            }

        }
        return result;
    }
}
