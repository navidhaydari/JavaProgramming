package day23_CustomMethods_Void;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        anagram("abc","cba");
    }



    public static void anagram(String s1 , String s2){
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (Arrays.equals(ch1,ch2)){
            System.out.println("anagram");
        }else {
            System.out.println("not anagram");
        }



    }
}
