package day23_CustomMethods_Void;

public class CustomMethodWithParameters {
    public static void main(String[] args) {
        oddOrEven(24);
    }
    // create a function that checks numbers even or odd
    public static void oddOrEven(int number){
        if (number%2==0) {
            System.out.println("even");

        }else {
            System.out.println("odd");
        }

    }
}
