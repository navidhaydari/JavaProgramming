package day11_Switch_Scanner;

public class NumberOfTheDays {
    public static void main(String[] args) {
        int month = 11;
        String numOfDay = "";
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numOfDay = "31 days";
                break;
            case 2:
                numOfDay="28 days";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numOfDay="30 days";

            default:
                System.out.println("invalid");
        }
        System.out.println(numOfDay);
    }
}
