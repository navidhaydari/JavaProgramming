package day01_JavaIntro;
import day11_Switch_Scanner.ScannerIntro;
import utilities.StringUtility;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        int[] nums = {14,1,84,97,1243,46};
        int total = 0;
        for (int i = 0; i<nums.length; i++){
            if (nums[i] % 2 !=0){
                total+=3;
            }else {
                total+=10;
            }
            if (i%3 == 0){
                total-= 15;
            }
        }
        System.out.println(total);
    }
}

