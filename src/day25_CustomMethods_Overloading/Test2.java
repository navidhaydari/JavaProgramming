package day25_CustomMethods_Overloading;

import utilities.ArraysUtility;

public class Test2 {
    public static void main(String[] args) {

    int[] arr1 ={1,2,3,4,5};
        ArraysUtility.printEachElement(arr1);
        System.out.println("----------------");

        double[] arr2 = {1.2,1.3,1.4,1.5};
        ArraysUtility.printEachElement(arr2);
        System.out.println("----------------");

        char[] arr3= {'A','B','C','D'};
        ArraysUtility.printEachElement(arr3);
        System.out.println("---------------");

        String[] arr4 = {"navid","basit","bayes","khalid"};
        ArraysUtility.printEachElement(arr4);
        System.out.println("-----------------");

        int[] n1 ={1,2,3,4,5};
        int max1= ArraysUtility.max(n1);
        System.out.println(max1);
        System.out.println("--------------");

        double[] n2 = {1.4,5.6,4.7,5.2};
        double max2 =ArraysUtility.max(n2);
        System.out.println(max2);


        }
    }

