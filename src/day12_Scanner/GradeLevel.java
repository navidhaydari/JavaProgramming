package day12_Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        int num = 12;
        String result = "";
        switch (num){
            case 1: case 2: case 3: case 4: case 5:
                result ="Elementary School";
                break;
            case 6: case 7: case 8:
                result ="Middle School";
                break;
            case 9: case 10: case 11: case 12:
                result = "High School";
                break;
        default:
        System.out.println("invalid");
        }
        System.out.println(result);
    }


}
