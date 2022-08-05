package day15_ForLoop;

public class SumOfOdd {
    public static void main(String[] args) {

        int total = 1;
        for (int i = 1; i < 101; i+=2) {
            if (i%2!=0) {
                total += i;
            }






        }
        System.out.print(total);
    }
}
