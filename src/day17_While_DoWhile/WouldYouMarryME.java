package day17_While_DoWhile;

import java.util.Locale;
import java.util.Scanner;

public class WouldYouMarryME {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("would you marry me ?");
        String answer = scan.next();
        while (!(answer.equals("yes") || answer.equals("no"))){
            System.out.println("invalid anser, please enter correct one");
            System.out.println("would you marry me ?");
            answer = scan.next().toLowerCase();

        }
        while (answer.equals("yes")){
            System.out.println("congrats");

        }
        while (answer.equals("no")){
            System.out.println("dont be sad");
            break;
        }
    }
}
