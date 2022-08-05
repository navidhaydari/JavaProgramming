package day10_NestedIf;

public class NameOfTheDay {
    public static void main(String[] args) {
        int day = 4;
       String names =  (day==1)? "Sat" :(day==2)? "Sun" :(day==3)? "monday" : "monday";
        System.out.println(names);
    }
}
