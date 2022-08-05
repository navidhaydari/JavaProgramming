package day14_String;

import java.util.Scanner;

public class really {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter what do you want");
        String n1 = scan.nextLine();
        String n2 = n1.substring(n1.length()-2);
        if (n2.equals("ly")) {
            System.out.println("really???");
        }else {
            System.out.println("never mind");
        }
    }
}
