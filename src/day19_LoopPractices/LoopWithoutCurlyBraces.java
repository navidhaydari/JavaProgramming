package day19_LoopPractices;

public class LoopWithoutCurlyBraces {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Cydeo");
            System.out.println("EU9");

        } // with curlyBraces it executes five times Cydeo and EU9;

        System.out.println("------------------------------");

        for (int j = 0; j <=5 ; j++)  // without curlyBraces it just execute Cydeo five times and EU9 its not belong to for loop
            System.out.println("Cydeo");
        System.out.println("EU9");

        System.out.println("------------------------------");

        for (int k = 0; k <=5 ; k++)
            System.out.println("Cydeo");
        for (int z = 0; z <=5 ; z++) {
            System.out.println("EU9");

        }




    }
}
