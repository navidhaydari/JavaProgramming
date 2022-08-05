package day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {
        int score = 500;
        if (score > 0 && score <=100) { // valid score
            if (score >60){
                System.out.println("pass");
            } else {
                System.out.println("fail");
            }

        }       else {
            System.out.println("not valid");
        }
        System.out.println("--------------------------------");

        int age = 30;
        boolean id = true;
        if (id){
            if (age >=19 ){
                System.out.println("eligible");
            } else {
                System.out.println("not eligible");
            }
        } else{
            System.out.println("does not have ID");
        }
    }
}
