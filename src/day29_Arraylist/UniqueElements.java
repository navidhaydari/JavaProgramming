package day29_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,4,4,5,7,6,9,9,9));


        ArrayList<Integer> unique= new ArrayList<>();
        for (Integer each : list) {
            int freq = Collections.frequency(list,each);
            if (freq==1){
                unique.add(each);
            }

        }
        System.out.println(unique);

        System.out.println("-------------------------");
        ArrayList<Integer> list2 = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,4,4,5,7,6,9,9,9));

        ArrayList<Integer> unique2= new ArrayList<>(list2);
        unique2.removeIf(p -> Collections.frequency(list2,p)>1);
        System.out.println("unique2 = " + unique2);

    }
}
