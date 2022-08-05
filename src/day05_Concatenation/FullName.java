package day05_Concatenation;

public class FullName {
    /*
    1. create a class named fullName, declare:
        first name
        last name
        use concatenation to print the full address.
     */
    public static void main(String[] args) {
        String firstName = "Navid";
        String lastName = "Haydari";
        int age = 26;
        String jobTitle = "Engineer";
        String companyName = "Tesla";
        String fullName = firstName + " " +lastName;
        System.out.println("Full name is " + fullName);
        System.out.println( fullName + " has " + age + " years old" );
        System.out.println(fullName + " is " + jobTitle + " works at " + companyName);



    }
}
