package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {
    public static void main(String[] args) {
        String[] group1= {"john", "James", "navid"};
        String[] group2= {"xavi", "ronaldo","basit"};
        String[] group3= {"messi", "suarez","bayes"};


        String[][] groups = new String[3][]; // indexes 0,1,2
        groups[0]=group1;
        groups[1]=group2;
        groups[2]=group3;

        // System.out.println(Arrays.toString(groups)); //toString() : for one dimensional arrays
        System.out.println(Arrays.deepToString(groups));

        System.out.println("---------------------------------");
        //                  0 1    0  1    0   1   2      // index of element
        int[][] numbers = {{1,3},{10,30},{100,200,300}  };
        //                   0      1          2          // index of array
        System.out.println(Arrays.deepToString(numbers));
        System.out.println(Arrays.toString(numbers[2])); // array [100,200,300]
        // 30
        System.out.println(numbers[1][1]); // first we take array 1 , [10,30]
        System.out.println("-----------------------------");








    }
}
