package day24_CustomMethod_Return;

public class ReturnMethodPractice2 {

    public static void main(String[] args) {
        String str1 = grade(60);
        if (str1.equals("A")){
            System.out.println("EXCEllent");
        }else {
            System.out.println("not bad");
        }

    }

    // calculate a function that can calculate the grade
    public static String grade(int score) {
        String result = "";
        if (score < 0 || score > 100) {
            result = "invalid";

        } else {
            result = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 60) ? "C" : (score >= 50) ? "D" : "failed";
        }
        return result;

    }
}

