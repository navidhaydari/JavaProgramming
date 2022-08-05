package day21_ForEachLoop;

public class ForEachLoopPractice {
    public static void main(String[] args) {

        String[] words = {"Java Programming", "Cydeo School", "Wooden Spoon" }; // first and last letter
        for (String each :words){
            System.out.println("" + each.charAt(0)+ each.charAt(each.length()-1)); //

        }

    }
}
