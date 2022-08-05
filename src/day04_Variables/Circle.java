package day04_Variables;

public class Circle {
    public static void main(String[] args) {
        /*
         create a class named rectangle, write a program that can calculate the
         area& perimeter of any given circle PI, radius, diameter,area, perimeter.
         */
        double pi = 3.14;
        double radius = 5;
        double area = pi * radius * radius;
        double perimeter = 2 * pi * radius;
        System.out.println("pi = " + pi);
        System.out.println("radius = " + radius);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);


    }
}
