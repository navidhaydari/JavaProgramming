package day21_ForEachLoop;

public class MaxNumMinNumAvg {
    public static void main(String[] args) {

        int[] numbers = {3,4,5,6,7,8,9,10};
        int max = numbers[0];
        int min = numbers[0];
        int sum = 0;

       /*
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i]>max){
                max=numbers[i];

            }
           */
        for (int number : numbers) {
            if (number>max){
                max=number;
            }

        }
        for (int number : numbers) {
            if (number<min){
                min=number;
            }

        }
        for (int number : numbers) {
            sum+=number;


        }
        System.out.println(max);
        System.out.println(min);
        System.out.println("avg: " + sum/ numbers.length);

    }
}
