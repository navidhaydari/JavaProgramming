package day15_ForLoop;

import java.util.Scanner;

public class FormatFullName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your first name");
        String firstName = scan.nextLine();
        System.out.println("enter your last name");
        String lastName =scan.nextLine();
        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0) .toUpperCase();
        System.out.println(firstName);
        System.out.println(lastName);

    }
}
