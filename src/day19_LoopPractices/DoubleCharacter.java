package day19_LoopPractices;

public class DoubleCharacter {
    public static void main(String[] args) {
        String str = "abbcdff";
        String result = ""; // bb

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);
                if (ch == each) {
                    count++;


                }


                }
            if (count != 2) {
                continue;


            }
            result+=ch;
        }
        System.out.println(result);
    }
}