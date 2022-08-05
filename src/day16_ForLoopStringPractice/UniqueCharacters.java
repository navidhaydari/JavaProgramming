package day16_ForLoopStringPractice;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "aaabcccc";
        //            01234567   number of index
        String result = "";
        for (int i = 0; i <= str.length() - 1; i++) {
            char ch  = str.charAt(i); // each character

            if (str.indexOf(ch) == str.lastIndexOf(ch)) { // if the first and the last index are same its unique.
                result += ch;



            }
        }
        System.out.println(result);
    }
}
