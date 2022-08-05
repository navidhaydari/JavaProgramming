package day06_PrimitiveTypeCastings;

public class BirthDay {
    /*
    1. Create a class named BirthDay and create the following variable name, birthDay(int), birthMonth(String), birthYear(int)
        use concatenation to display the birthday of the person
            if  name = "john"
                birthDay = 23
                birthMonth = "November"
                birthYear = 1995
            output:
                John was born on April/25/1995
     */
    public static void main(String[] args) {
        int birthDay = 23,
                birthYear = 1995;
        String name = "John",
                birthMonth = "November";
        String birthDate = birthMonth + "/" + birthDay+ "/" + birthYear +".";
        System.out.println(name + " was born on " + birthDate);
    }
}
