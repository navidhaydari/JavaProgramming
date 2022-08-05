package day10_NestedIf;

public class TernariesWithNestedIf {
    public static void main(String[] args) {
        int grade = 500;
       String score =  (grade>0 && grade <=100)? (grade>=70 && grade <=100)? "Excellent" :(grade >=60 && grade<70)? "Pass" : "Fail" : "not valid";
        System.out.println(score);
    }
}
