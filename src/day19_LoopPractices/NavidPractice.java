package day19_LoopPractices;

public class NavidPractice {
    public static void main(String[] args) {
       String str = "aaaabbbgggdfdffgsdfgfdgdbbdggg";
       String result = "";
       int count = 0;
        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);

                if (ch==2){
                    count++;
        }

            }
        }
        System.out.println(count);

    }
}
