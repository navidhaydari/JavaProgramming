package day24_CustomMethod_Return;

public class Frequency {
    public static void main(String[] args) {
        numOfFrequency(new int[]{1, 1, 1, 1, 1, 2, 2},1);

    }


    public static void numOfFrequency(int[] array , int element){

        int frq = 0;
        for (int each : array){
            if( each == element){
                frq++;
            }

        }
        System.out.println(frq);
    }
}
