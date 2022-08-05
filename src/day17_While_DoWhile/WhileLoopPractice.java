package day17_While_DoWhile;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter user");
        String user = scan.next();
        int attempt = 3;

        while (!(user.equals("Cydeo"))){
            System.out.println("Invalid user");
            System.out.println("Enter user");
            user = scan.next();


        }
        System.out.println("Enter password");
        String password= scan.nextLine();
        password = scan.nextLine();
        while (!(password.equals("Cydeo123")) && attempt>0 ){
            System.out.println("invalid, enter correct password");
            System.out.println("Enter password");
            password = scan.nextLine();
            attempt--;
        }
        while (user.equals("Cydeo") && password.equals("Cydeo123")){
            System.out.println("welcome to Cydeo");
            break;
        }
    }
}
