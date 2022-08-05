package day20_Arrays;

public class Minimum {
    public static void main(String[] args) {
        int[] numbers = {10,20,4,70,3};
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < min){
                min = numbers[i];
            }

        }
        System.out.println(min);
    }
}
