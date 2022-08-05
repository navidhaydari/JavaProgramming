package day18_NestedLoop;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        /*
        dividing two numbers without using division .
         */
        int a = 30,
                b= 5;
        int count = 0;

        while (a>=b){
            a-=b;
            /*
            a=30 , b= 5 -> 30-5=25 , 25-5 =20 .... this happens six times when a became less than b
             */
            count++; // how many times does the loop run.
            // and the remainder is (a) right now

        }
        System.out.println(count + " remainder "+ a);
    }
}
