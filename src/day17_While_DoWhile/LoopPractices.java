package day17_While_DoWhile;

public class LoopPractices {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) { // if the number of repeatation is known we use for loop.
            System.out.println(i);

        }
        System.out.println("-----------------------------");
        int j = 0;
        while (j<10) {
            System.out.println(j);
            j++; // at last increament
        }
        System.out.println("-----------------------------");
        int k=0;
        do {
            System.out.println(k);
            k++;
        }while (k<10);

    }
}
