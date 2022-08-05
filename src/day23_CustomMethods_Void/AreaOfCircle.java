package day23_CustomMethods_Void;

public class AreaOfCircle {
    public static void main(String[] args) {
        double areaCircle = circle(2);
        System.out.println(areaCircle);
    }


    public static double circle(double radios) {
        double area = 3.14 * radios * radios;

        return area;
    }
}
