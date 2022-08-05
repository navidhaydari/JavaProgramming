package day09_IfStatements;

public class MaxNumber {
    public static void main(String[] args) {
        int num1 = 50,
                num2= 30;
        boolean num1isTheMax = num1>num2;
        if (num1isTheMax){
            System.out.println(num1 + " is The Max");
        } else {
            System.out.println(num2 + " is The Max");
        }
    }

}
