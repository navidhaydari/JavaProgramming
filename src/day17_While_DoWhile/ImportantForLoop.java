package day17_While_DoWhile;

public class ImportantForLoop {
    public static void main(String[] args) {
        /*
        write a program that can return the frequency of a char from a String.
        Ex:
        str = "AAABBBC"
        ch = 'A'
        Output:
        3
         */
        String str = "AAABBBC";
        char ch = 'A';
        int frequency = 0; // compare char to string everytime that match +1+1+1 = 3
        for (int i = 0; i < str.length(); i++) { // i : indexes of str
            char eachChar = str.charAt(i); // how can i get each char from string
            if (ch == eachChar){ // if giving ch is matching then
                frequency++;
            }

        }
        System.out.println(frequency);

    }

}
