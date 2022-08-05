package day13_StringClass;
import java.util.Scanner;
import java.lang.String;
public class FirstAndLast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your name");
        String name = scan.nextLine();
        char n = name.charAt(0);
        char l = name.charAt(name.length()-1);
        String total = ""+n + l ;
        System.out.println(total);

    }

}
