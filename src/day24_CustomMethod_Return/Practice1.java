package day24_CustomMethod_Return;

public class Practice1 {
    public static void main(String[] args) {
        sumOfTwoN(2,'+',3);
    }


    public static void sumOfTwoN(int number1, char ch1 , int number2){
        if (ch1=='+'){
            System.out.println(number1+number2);
        }else {
            System.out.println("invalid");
            return;
        }
    }
}
