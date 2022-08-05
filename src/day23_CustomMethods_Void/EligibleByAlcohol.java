package day23_CustomMethods_Void;

public class EligibleByAlcohol {
    public static void main(String[] args) {
        eligibleToVote(23,"us");
    }
    public static void eligibleToVote(int number , String nationality){
        if ((number>=18 && number<120) && nationality.equalsIgnoreCase("US")){
            System.out.println("eligibleForVote");

        }else {
            System.out.println("eligibleToVote");}
    }
}
