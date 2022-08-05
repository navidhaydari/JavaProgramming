package day11_Switch_Scanner;

public class Calculator {
    public static void main(String[] args) {
        double n1 = 3.12,
                n2 = 2.0;
        char operator = '-';
        if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
            switch (operator) {
                case '+':
                    System.out.println(n1 + n2);
                    break;
                case '-':
                    System.out.println(n1 - n2);
                    break;
                case '*':
                    System.out.println(n1 * n2);
                    break;
                case '/':
                    System.out.println(n1 / n2);
                default:
                    System.out.println("inv");

            }
        } else {
            System.out.println("invalid operator");
        }
    }
}
