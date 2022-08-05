package day06_PrimitiveTypeCastings;

public class PrimitiveCasting {
    public static void main(String[] args) {
        byte a = 100;
        short b = a ;

        int x = 55;
        short y = (short) x;
        System.out.println(x + " : " + y );

        long j = 1000000;
        short k = (short) j;
        System.out.println( j + " : " + k );
        double l = 2.5;
        float m = (float) l ;
        System.out.println(l + " : " + m);

        byte h = 20;
        int g = h;

        double d1 = 20.5;
        short s1 = (short) d1;

        float c1 = 20.5f;
        long c2 = (long) c1;
        System.out.println( c1 + " : " + c2);





    }
}
