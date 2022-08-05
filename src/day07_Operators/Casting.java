package day07_Operators;

public class Casting {
    /*
    casting Explicit (casting larger type to smaller) and implicit (casting smaller type to larger)
    we can assign small number to larger but we can not assign large number to small one.
     */
    public static void main(String[] args) {
        float averageScore = 20.5f;
        byte num1 =(byte) averageScore; // explicit
        short num2 = (short) averageScore;// explicit
        int num3 = (int) averageScore;//explicit
        float num4 = averageScore; // no casting
        long num5 =(long) averageScore; // explicit
        double num6 = averageScore; // implicit



        System.out.println("Num1: "+ num1);
        System.out.println("Num2: "+ num2);
        System.out.println("Num3: "+ num3);
        System.out.println("num4: "+ num4);
        System.out.println("Num5: "+ num5);
        System.out.println("Num6: "+ num6);


    }
}
