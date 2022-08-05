package day20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {
        // 26 ch
        char[] alphabets = new char[26]; // z~a
        /*
        alphabets[0] = 'z'; // asci table 90
        alphabets[1] = 'y'; // 89
        alphabets[2] = 'x'; //88

         */

        char ch = 'z';
        for (int i = 0; i < alphabets.length; i++, ch--) {
            alphabets[i] = ch;

         /*
        for (char i = 0, j = 'z'; i < alphabets.length; i++, j--) {
            alphabets[i] = j;

        }

          */



           // System.out.println(alphabets[0]); // z
        }
        System.out.println(Arrays.toString(alphabets)); // [z,y,....]
    }
}
