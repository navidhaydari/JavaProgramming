package day11_Switch_Scanner;

public class Browser {
    public static void main(String[] args) {
        String names = "chrome",
                result = "";
        if (names == "chrome" || names == "safari" || names =="edge") {
            if (names == "chrome"){
                result= "valid";
            } else if (names == "safari") {
                result = "valid";

            }else {
                result = "edge";
            }

        }else {
            result = "invalid name";
        }
        System.out.println("result = " + result);

    }
}
