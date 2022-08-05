package day10_NestedIf;

public class DayNames {
    public static void main(String[] args) {
        int day = 8;
        if (day>=1 && day <=7){
            if (day == 1){
                System.out.println("saturday");
            } else if (day==2) {
                System.out.println("sunday");
            } else if (day==3) {
                System.out.println("monday");

            }else {
                System.out.println("other days of week");
            }

        } else {
            System.out.println(" Invalid ");
        }
    }
}
