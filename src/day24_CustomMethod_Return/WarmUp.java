package day24_CustomMethod_Return;

public class WarmUp {
    public static void main(String[] args) {
        initialsOfPerson("john","wick");
        domain("navid@gmail.com");



    }
public static void initialsOfPerson(String firstName, String lastName){
    String initials = firstName.charAt(0)+"."+lastName.charAt(0);
    initials=initials.toUpperCase();
    System.out.println(initials);

}
public static void domain(String email){
        String domain = email.substring(email.indexOf("@")+1 ,email.indexOf("."));
    System.out.println(domain);
}

}
