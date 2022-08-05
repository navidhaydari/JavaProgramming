package navid1;

import java.util.Scanner;

public class Practice03 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print(" enter first number: ");
        int x = in.nextInt();
        System.out.print(" enter second number: ");
        int y = in.nextInt();

        System.out.println(x + " + " + y + " = " + (x + y) );
        System.out.println(x + " - " + y + " = " + (x - y) );
        System.out.println(x + " * " + y + " = " + (x * y) );
        System.out.println(x + " / " + y + " = " + (x / y) );



    }
}
