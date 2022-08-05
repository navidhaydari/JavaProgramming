package day22_MultiDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray2 {
    /*
    9 10 11 12 13
    4 5 6 7 8
    1 2 3
     */
    public static void main(String[] args) {
        //index element:   0 1 2   0 1 2 3     0  1  2  3  4
        int[][] arr2D = { {1,2,3},{4,5,6,7,8},{9,10,11,12,13} };
        //arr element:       1         2             3


        for (int i = arr2D.length - 1; i >= 0; i--) { // i: index number of array

            for (int j = 0; j < arr2D[i].length; j++) { // j:index number of elements
                System.out.print(arr2D[i][j] + " ");


            }
            System.out.println();
        }

            System.out.println("------------------");
            /*
            13 12 11 10 9
            8 7 6 5 4
            3 2 1
             */
            for (int k = arr2D.length - 1; k >= 0; k--) {
                for (int l = arr2D[k].length - 1; l >= 0; l--) {
                    System.out.print(arr2D[k][l] + " ");

                }
                System.out.println();

            }

        }
    }

