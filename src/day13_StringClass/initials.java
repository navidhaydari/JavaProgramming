package day13_StringClass;
import java.lang.String;
import java.util.Scanner;

public class initials {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("please enter first name");
        String firstName=scan.nextLine();
        System.out.println("Please enter sur name");;
        String surname = scan.nextLine();
        char f = firstName.charAt(0);
        char l = surname.charAt(0);
        String initial = ""+f + l ; // we must include on cotiotion
        System.out.println("initial = " + initial);
        int totalChars = firstName.length();
        System.out.println("totalChars = " + totalChars);
        String s1 = "wooden spoon";
        s1=s1.toUpperCase();
        System.out.println("s1 = " + s1);

    }
}
