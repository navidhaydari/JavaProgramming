package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        //index element:   0 1 2   0 1 2 3     0  1  2  3  4
        int[][] arr2D = { {1,2,3},{4,5,6,7,8},{9,10,11,12,13} };
        //arr element:       1         2             3

        for (int[] each1DArray : arr2D) {
            System.out.println(Arrays.toString(each1DArray));
            for (int each : each1DArray) {
                System.out.print(each);

            }
            System.out.println();

            
        }
    }

}
