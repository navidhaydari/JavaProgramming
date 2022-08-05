package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your age");
        int age = scan.nextInt();
        while (!(age>=18 && age<120)){
            System.out.println("incorrect please enter your age again ");
            age = scan.nextInt();
        if (age>=18 && age<120){
            System.out.println("eligible to buy alcohol");

            }

        }
        scan.close();

    }

}
