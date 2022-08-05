package day29_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,8,7));

        list.removeIf(p-> Collections.max(list)==p ); // second large
        list.removeIf(p-> Collections.max(list)==p ); // 3rd
        list.removeIf(p-> Collections.max(list)==p ); // 4th
        list.removeIf(p-> Collections.max(list)==p );
        list.removeIf(p-> Collections.max(list)==p );
        list.removeIf(p-> Collections.max(list)==p );

        int max = Collections.max(list);
        System.out.println(max);


    }

}
