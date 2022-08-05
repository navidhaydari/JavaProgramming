package day23_CustomMethods_Void;

public class GivenNumber {
    public static void main(String[] args) {
        numberType(-3);
    }


    public static void numberType(int number){
        String str = (number>0)? "positive" :(number==0)?"zero" : "negative";
        System.out.println(str);
    }
}
