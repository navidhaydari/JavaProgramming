package day09_IfStatements;

public class EligibleToBuyAlcohol {
    public static void main(String[] args) {


        int age = 15;
        boolean isEligible = age >= 18;
        if (isEligible){
            System.out.println(age+ " is eligible");
        } else {
            System.out.println(" is not eligible");
        }

    }
}
