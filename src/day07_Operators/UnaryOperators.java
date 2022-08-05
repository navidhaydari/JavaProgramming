package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int num1= 5;
        ++num1; // pre increment: increase by 1 immadiatly
        System.out.println("num1 = " + num1);
        --num1;
        System.out.println("num1 = " + num1);
        System.out.println("--------------------------------------------------");

        int c = 100;
        System.out.println(c++); // increase in next step
        System.out.println("--------------------------------------------------");
        int d= 200;
        System.out.println(d--);
        System.out.println(d);



    }
}
