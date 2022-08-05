package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {
        boolean result1 = 20>40 ;
        System.out.println("result1 = " + result1); // false

        boolean result2 = 300>=150;
        System.out.println("result2 = " + result2);

        int score = 720;
        boolean eligible = score>= 700;

        double marks = 70.6;
        boolean pass = marks >= 70;
        System.out.println("pass = " + pass);

        int value = 100000;
        boolean accept = value >= 99000;
        System.out.println("accept = " + accept);

    }
}
