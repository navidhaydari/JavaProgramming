package day24_CustomMethod_Return;

public class Palindrome {
    public static void main(String[] args) {
        palindrome("aena");
    }


    public static void palindrome(String word){
        String reversed = "";
        for (int i = word.length()-1; i >=0 ; i--) {
            reversed+=word.charAt(i);

        }
        boolean isPal = word.equalsIgnoreCase(reversed);
        System.out.println(isPal);

    }
}
