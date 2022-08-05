package day23_CustomMethods_Void;

import java.util.Arrays;

public class printEachChar {
    public static void main(String[] args) {
        print("navidhaydari");
    }


    public static void print(String str){
        char[] ch= str.toCharArray();
        System.out.print(Arrays.toString(ch)+" ");
    }
}
