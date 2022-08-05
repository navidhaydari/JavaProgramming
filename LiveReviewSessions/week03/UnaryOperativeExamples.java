package week03;

public class UnaryOperativeExamples {
    public static void main(String[] args) {
        int a = 25;
        System.out.println(++a);// first increase then print pre- increment
        System.out.println(--a);// first decrease then prin pre - decrement
        System.out.println("---------------");

        int b = 25;
        System.out.println(b++); // in the next line it changes
        System.out.println(b);// in here it changes
        System.out.println(b--);// in here it does not change it changes in the next line
        System.out.println(b);  //changes in here

        System.out.println("-----------------------");
        int x = 2;
        int y = x++;
        System.out.println(y);
        System.out.println(y); // its changes x not y
        System.out.println(x);

        System.out.println( "--------------------");
        int navid = 50;
        int ahmad = --navid;
        System.out.println("ahmad = " + ahmad); // 49
        int ghafoor = navid++; // 49
        System.out.println(ghafoor);
        int zobid = navid -- ; // 50
        System.out.println(zobid);
        int basit = navid ++ ;
        System.out.println(basit);
        System.out.println(ahmad + ghafoor + zobid + basit);
        System.out.println("======================");

        int num1 = 30,
        num= 20;
        boolean greater = num1>num;
        System.out.println("greater = " + greater);
        /*

         */

    }
}
