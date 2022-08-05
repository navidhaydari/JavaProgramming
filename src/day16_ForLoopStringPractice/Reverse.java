package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Reverse {
    /*
    7. Write a program that can reverse any given string
			Ex:
				input:
					Wooden Spoon
				output:
					noopS nedooW

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the word");
        String str1 = scan.nextLine();
        String result = "";
        for (int i = str1.length()-1; i >=0 ; i--) { // in here i is index number starting from last decrementing to index 0
            result+=str1.charAt(i); // we use charAt for printing character otherwise it prints only index numbers.

        }
        System.out.println(result);
        scan.close();
    }
}
