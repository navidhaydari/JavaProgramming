package day20_Arrays;

public class AverageNumbers {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};
        int sum = 0;
        int n1 = numbers.length;
        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];



        }
        System.out.println(sum);
        System.out.println("average" + sum/n1);
    }
}
