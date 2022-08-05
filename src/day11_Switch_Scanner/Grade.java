package day11_Switch_Scanner;

public class Grade {
    public static void main(String[] args) {
        char chr = 'A';
        switch (chr){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Great Job");
                break;
            case 'C':
                System.out.println("good");
                break;
            case 'D':
                System.out.println("failed");
                break;
            default:
                System.out.println("Invalid Char");
        }
    }
}
