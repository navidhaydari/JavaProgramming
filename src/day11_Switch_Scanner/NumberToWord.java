package day11_Switch_Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        int num = 5;
        String result = (num >=1 && num<=5)? (num==1)? "one" :(num==2)?"two"
                :(num==3)?"three" :(num==4)?"four" : "five" : "invalid";
        System.out.println("result = " + result);
    }
}
