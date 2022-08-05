package day08_IfStatement;

public class EligibleToVote {
    public static void main(String[] args) {


        String name = " Navid ", country = "Spain";
        int age = 26;

        boolean isEligible = age >= 19 && country == "Spain";
        if (isEligible){
            System.out.println(name + " is eligible");
        }
        if (!isEligible){
            System.out.println(name + "is not eligible");

        }


    }

}
