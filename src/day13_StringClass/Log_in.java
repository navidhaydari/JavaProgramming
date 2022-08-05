package day13_StringClass;

import java.util.Scanner;

public class Log_in {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter username:");
        String username= scan.nextLine();
        System.out.println("enter password:");
        String password = scan.nextLine();
        int l1 = username.length();
        int l2 = password.length();
        if (l1==5 && username.equals("cydeo") && l2==11 && password.equals("woodenspoon")){
            System.out.println("logged in");
        }else {
            System.out.println("Incorrect username or password");
        }
    }
}
