package day08_IfStatement;

public class GradeReport {
    public static void main(String[] args) {
        int score = 75;
        boolean a = score >=90 && score<=100;
        boolean b = score>=80 && !a;// score>=80 && score <90
        boolean c = score>= 70 && !b && !a; // score>=70 && score<80
        boolean d = !a && !b &&!c;
        if (a) {// if the student made a
            System.out.println("Excellent");
        }
        if (b){// if the student b
            System.out.println("Great");
        }
        if (c) {
            System.out.println("Good");
        }
        if (d){
            System.out.println("Fail");
        }




        }
    }
