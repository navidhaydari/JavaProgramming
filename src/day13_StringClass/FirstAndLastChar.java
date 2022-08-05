package day13_StringClass;

public class FirstAndLastChar {
    public static void main(String[] args) {
        String str1 = "navidan";
        char first =str1.charAt(0);
        char last = str1.charAt(str1.length()-1);
        String result = "";
        result = (first == last)? "same" : "different";
        System.out.println("result = " + result);

    }
}
