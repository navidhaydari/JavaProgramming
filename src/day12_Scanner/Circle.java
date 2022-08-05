package day12_Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner circle = new Scanner(System.in);
        System.out.println("please enter the radius");
        double radius = circle.nextDouble();
        double area = 3.14* radius *radius;
        System.out.println("area = " + area);
        double perimeter = 2*3.14*radius;
        System.out.println("perimeter = " + perimeter);
        circle.close();

    }
}
