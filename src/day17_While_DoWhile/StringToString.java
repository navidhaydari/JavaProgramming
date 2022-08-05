package day17_While_DoWhile;

public class StringToString {
    public static void main(String[] args) {
        String str = "JavaJava";
        int freq = 0;
        for (int i = 0; i <=str.length()-4 ; i++) { // string has 7index if i take value of 5 than it will error becouse of that we -4
            String eachSub = str.substring(i, i + 4);
            if (eachSub.equals("Java")){
                freq++;
            }


            System.out.println(eachSub);


        }
        System.out.println(freq);

    }
}
