package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        System.out.println(Arrays.toString(numbers));

        System.out.println("-------------------");

        int[] scores = {98,67,85,45,76};
        System.out.println(Arrays.toString(scores));
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));

        System.out.println("Min:"+ scores[0]);
        System.out.println("Max:"+scores[scores.length-1]);

        System.out.println("------------------");

        String[] names = {"navid","basit","bayes","wakil"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        System.out.println("---------------------------");
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,3,2};
        boolean ar = Arrays.equals(arr1,arr2);
        System.out.println(ar);

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean r1 = Arrays.equals(arr1,arr2);
        System.out.println(r1);

        System.out.println("-----------------------");

        char[] ch1 = {'a','c','b'};
        char[] ch2 = {'b','a','c'};
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean anagram = Arrays.equals(ch1,ch2); // anagram same letters, hearth = earth
        System.out.println("anagram = " + anagram);
    }
}
