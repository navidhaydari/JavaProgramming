package day20_Arrays;

import java.util.Arrays;

public class Months {
    public static void main(String[] args) {
        String[] months = new String[3];
        months[0]="January";
        months[1]="February";
        months[2]="March";
        System.out.println(Arrays.toString(months));
        System.out.println("----------------------");
        String[] m = {"January", "february", "march"};
        System.out.println(Arrays.toString(m));
        System.out.println(m[2]);
        System.out.println("----------------------");

        for (int i = 0; i < months.length ; i++) {
            System.out.println(months[i]);


        }
        System.out.println("------------------------");
        for (int j = months.length -1 ; j >=0 ; j--) {
            System.out.println(months[j]);

        }
    }
}
