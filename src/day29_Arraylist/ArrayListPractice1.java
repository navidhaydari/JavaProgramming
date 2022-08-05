package day29_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
    public static void main(String[] args) {
        String[] country = {"Japan","Korea","Turkey","Afghanistan","United Kingdom"};
        // converting array to arraylist
        ArrayList<String> list = new ArrayList<>(Arrays.asList(country));
        list.removeIf(p -> p.length()>7);
        System.out.println(list);

        //converting arraylist to array
        country = list.toArray(new String[0]);

        System.out.println(Arrays.toString(country));

    }
}
