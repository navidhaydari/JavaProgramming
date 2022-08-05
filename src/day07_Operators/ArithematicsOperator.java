package day07_Operators;

public class ArithematicsOperator {
    public static void main(String[] args) {
        int num1 = 10,
                num2= 3;
        double remainder = num1 % num2 ,
                division = num1/num2;
        System.out.println("remainder = " + remainder);
        System.out.println("division = " + division);
        System.out.println(num1 +"divided by " + num2 + " is equal to "+ division);


    }
}
