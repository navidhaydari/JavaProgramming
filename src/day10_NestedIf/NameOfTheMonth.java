package day10_NestedIf;

public class NameOfTheMonth {
    public static void main(String[] args) {
        int month = 4;
        if (month >0 && month <=12){
            if (month==1){
                System.out.println("january");
            } else if (month==2) {
                System.out.println("february");

            } else if (month==3) {
                System.out.println("march");

            } else if (month==4) {
                System.out.println("april");

            } else if (month==5) {
                System.out.println("may");

            }else {
                System.out.println("Other Months Of the Year");
            }

        }else {
            System.out.println("Invalid month");
        }
        System.out.println("---------------------------------------------");
        String nameOfMths= (month == 1)? " Jan" :(month==2)? "Feb" :(month==3)? "March" :(month==4)?"Apr" : "may";
        System.out.println(nameOfMths);
    }
}
