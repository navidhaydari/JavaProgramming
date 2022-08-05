package day24_CustomMethod_Return;

public class Reverse {
    public static void main(String[] args) {
        reverse("navid");
    }


    public static String reverse(String word) {

        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);

        }
        System.out.println(reverse);
        return reverse;
    }
}

