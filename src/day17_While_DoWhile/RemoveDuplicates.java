package day17_While_DoWhile;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "AAABBCC";
        String result = ""; // ABC
        for (int i = 0; i <str.length(); i++) {
            String eachChar =""+ str.charAt(i); // we have to use String because in next we use contain. it only accepts string.
            if (result.contains(eachChar)){
                continue;
            }
            result+=eachChar;



        }
        System.out.println(result);
    }
}
