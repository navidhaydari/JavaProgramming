package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class MethodOverloadingIntro {
    public static void main(String[] args) {

        int[] intArray = {5,6,-1,3,4};
        double[] doubleArray = {10.5, 11.5 , 5.5 , 4.5};
        char[] charArray = {'E','F','G','A','B'};
        Arrays.sort(charArray);
        Arrays.sort(intArray);
        System.out.println("----------------------------");

        int sum1 = sumOfNum(2,3,4);
        System.out.println(sum1);



    }
    public static int sumOfNum(int num1 , int num2){
        return num1+num2;
    }
    public static int sumOfNum(int num1 , int num2, int num3){
        return sumOfNum(num1, num2)+num3;
    }
    public static double sumOfNum(double num1, double num2){
        return num1+num2;
    }
    public static double sumOfNum(double num1, double num2, double num3){
        return sumOfNum(num1,num2)+num3;
    }
}
