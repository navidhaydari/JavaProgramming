package day11_Switch_Scanner;

public class DaysOfTheWeek {
    public static void main(String[] args) {
        int num = 8;
        switch (num) { // 1,2,3,4,5,6,7
            case 1:
                System.out.println("Monday");
                break;

            case  2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("invalid");
        }
    }
    }
