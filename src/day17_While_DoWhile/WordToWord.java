package day17_While_DoWhile;

public class WordToWord {
    public static void main(String[] args) {
        String str = "aabcccd";
        char ch = 'a';
        int freq = 0;
        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);
            if (ch==eachChar){
                freq++;
            }

        }
        System.out.println(freq);
    }
}
