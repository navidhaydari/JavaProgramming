package day11_Switch_Scanner;


import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter input 1");
        int num1 =input.nextInt();
        System.out.println("enter decimal");
        double num2 = input.nextDouble();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Multiply" + (num1*num2));
        input.close(); // for closing scan, if not it takes much memory, the input is closed can not accpet other inpu



    }

}
