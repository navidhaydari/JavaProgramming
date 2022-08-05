package day29_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7));

        System.out.println(list);

        list.removeAll(Arrays.asList(3,5,7));
        System.out.println(list);

        System.out.println("---------------------");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100,200,300,400,500,600));
        numbers.retainAll(Arrays.asList(400,500));
        System.out.println(numbers);

        System.out.println("-------------------------");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        boolean r1 = nums.contains(7);
        boolean r2 = nums.contains(2)&&nums.contains(5)&&nums.contains(6);
        boolean r3 = nums.containsAll(Arrays.asList(2,5,6));
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}
