package day17_While_DoWhile;

public class FrequencyOfString2 {
    public static void main(String[] args) {
        String str = "Cat Cat Dog Dog";
        int freq = 0;
        for (int i = 0; i <=str.length()-3 ; i++) {
            String eachSub = str.substring(i,i+3);

            if (eachSub.equals("Cat")) {
                freq++;
            }


        }
        System.out.println(freq);

    }
}
