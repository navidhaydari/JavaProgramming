package day23_CustomMethods_Void;

public class Calculator {
    public static void main(String[] args) {
        calculator(4,2,'+');
    }


    public static void calculator(int num1, int num2, char signs){

            if (signs=='+'){
                System.out.println(num1+num2);
            } else if (signs=='-') {
                System.out.println(num1-num2);

            } else if (signs=='*') {
                System.out.println(num1*num2);

            }else {
                System.out.println(num1/num2);
            }
        }
    }

