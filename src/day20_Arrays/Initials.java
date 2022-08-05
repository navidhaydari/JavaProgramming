package day20_Arrays;

import java.util.Arrays;

public class Initials {
    public static void main(String[] args) {
        String[] names = {"Navid Haydari","Basit Usmany","Bayes Usmany","Wakil Wasiq","Khalid Toukhi"};
        for (String each : names){
            String initials = each.charAt(0)+"."+each.charAt(each.indexOf(" ")+1);
            System.out.println(initials);
            }

        }
    }

