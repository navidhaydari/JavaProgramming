package day08_IfStatement;

public class EvenlyDivisible {
    public static void main(String[] args) {
        int number = 65;
        int divide2 = 2;
        boolean isDivisibleBy2 = number % 2 ==0 ;
        boolean isDivisibleBy3 = number % 3 ==0;
        boolean isDivisibleBy5 = number % 5 ==0;
        System.out.println(number+ " isDivisibleBy2 = " + isDivisibleBy2);
        System.out.println(number+ " isDivisibleBy3 = " + isDivisibleBy3);
        System.out.println(number +" isDivisibleBy5 = " + isDivisibleBy5);
    }
}
