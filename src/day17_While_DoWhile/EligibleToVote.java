package day17_While_DoWhile;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your age");
        int age = scan.nextInt();
        while (!(age>=18) ){
            System.out.println("invalid, enter correct one");
            age=scan.nextInt();
        }
        System.out.println("are you US citizen? Yes/No");
        String answer = scan.next();
        while (!(answer.equals("Yes") || answer.equals("No"))){
            System.out.println("enter the correct answer");
            answer=scan.next();
        }
        System.out.println((age>=18 && answer.equals("Yes")) + " eligible");

    }
}
