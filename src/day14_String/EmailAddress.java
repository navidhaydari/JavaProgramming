package day14_String;

import java.util.Scanner;

public class EmailAddress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your email address");
        String email = scan.nextLine();
        email = email.substring(email.indexOf("@")+1, email.lastIndexOf("."));
        System.out.println("domain = " + email);

    }
}
