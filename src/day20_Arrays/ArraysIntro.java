package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        // create a variable that capable enough to five names.
        String [] name = new String[6];
        name[0] = "navid";
        name[1] = "basit";
        name[2] = "bayes";
        name[3] = "ghafoor";
        name[4] = "ahmad";
        name[5] = "mahmod";

        // System.out.println(name); this is wrong
        System.out.println(Arrays.toString(name));

        System.out.println("----------------------------------");
        String[] days = {"monday", "tuesday", "wednesday" , "thursday", "friday" ,"Saturday", "sunday"};
        //                  0           1          2            3           4         5           6

        System.out.println(Arrays.toString(days));

        int number = 5;
        if (number<0 || number>7){
            System.err.println("invlaid");
            System.exit(0);
        }
        System.out.println(days[5]);
    }
}
