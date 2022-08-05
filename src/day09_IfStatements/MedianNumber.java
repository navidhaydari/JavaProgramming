package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {

        int a = 30,
                b = 15,
                c = 20;
        boolean aIsMedian = (a > b && a < c) || (a < b && a > c);
        boolean bIsMedian = (b > a && b < c) || (b < a && b > c);
        boolean cIsMedian = (c > a && c < b) || (c < a && c > b);
        if (aIsMedian){
            System.out.println(a + " is Median");
        }
        if (bIsMedian){
            System.out.println(b + " is Median");
        }
        if (cIsMedian){
            System.out.println(c + " is Median");
        }

    }
}
