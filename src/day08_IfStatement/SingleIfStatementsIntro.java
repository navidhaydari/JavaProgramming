package day08_IfStatement;

public class SingleIfStatementsIntro {
    public static void main(String[] args) {
        int number = 300;
        boolean evenNumber = number % 2 == 0;
        if (evenNumber) {
            System.out.println(number + " is even number");
        }
        if (!evenNumber) {
            System.out.println(number + " is odd number");
        }
        System.out.println("--------------------------");

        int number1 = -20;
        if (number1>0){
            System.out.println(number1 + " is Positive");
        }
        if (number1<0 ){
            System.out.println(number1 + " is Negative");

        }
        if (number1==0){
            System.out.println(number1 + " is Zero");
        }
    }

}
