package day09_IfStatements;

public class NumberToWord {
    public static void main(String[] args) {
        /*
1. Create a class called NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
Ex:
number = 1;
output:
One
         */
        int number = 3;
        if (number ==1){
            System.out.println("one");
        } else if (number ==2) {
            System.out.println("two");
        } else if (number ==3) {
            System.out.println("three");

        }
        else{
            System.out.println("other numbers");
        }

    }
}
