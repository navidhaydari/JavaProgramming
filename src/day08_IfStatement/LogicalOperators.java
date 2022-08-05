package day08_IfStatement;

public class LogicalOperators {
    public static void main(String[] args) {
        int age = 19;
        String citizen = "SPAIN";
        boolean eligible = age>18 && citizen == "USA";
        System.out.println(eligible + citizen);

        System.out.println("=================================");

        String name = "Navid";
        int score = 85,
                ageOfPerson = 26;
        boolean isEligible = score >= 80 && ageOfPerson>= 20;
        System.out.println(name + " is Eligible "+ isEligible);
        System.out.println("---------------------------------------");

        String name2 = "Bahar";
        char gender = 'F';
        int age3 = 24;
        boolean isEligible3 = age >= 18 && (gender == 'F' || gender == 'M');
        System.out.println(name2 + " is eligible: "+ isEligible3);

        System.out.println("=========================================");
        String name4 = " Ahmad",
                countryOfBirth= "UK";
        boolean marriedToUsCitizen = true;
        boolean isElg = countryOfBirth == "USA" || marriedToUsCitizen == true;
        System.out.println(name4 + "is Elg "+ isElg);




    }
}
