package day24_CustomMethod_Return;

public class ReturnMethodPractice {
    public static void main(String[] args) {
       int max = maximumNumber(100,200);
        System.out.println(max);
        int multiply = max*2;
        System.out.println(multiply);


    }
    // find the max number between 100 and 200
    // multiply the max by 2.

    public static int maximumNumber(int number1, int number2) {
        int result = 0;
        if (number1>number2){
            result = number1;
        }else {
            result=number2;
        }
        return result;

    }
}

