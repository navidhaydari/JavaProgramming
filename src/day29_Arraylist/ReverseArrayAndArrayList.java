package day29_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayAndArrayList {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};

        int[] result = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--,j++) {
            result[j]= array[i];

        }
        System.out.println(Arrays.toString(result));

        System.out.println("-----------------------");
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6));

        ArrayList<Integer> reversed = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            int each = list.get(i);
            reversed.add(each);

        }
        System.out.println(reversed);

    }
}
