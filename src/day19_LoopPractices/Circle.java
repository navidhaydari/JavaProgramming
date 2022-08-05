package day19_LoopPractices;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("enter the radius of the circle");
            int radius = scan.nextInt();

            while (radius < 0) {
                System.out.println("invalid entry, enter positive number");
                radius = scan.nextInt();}
                System.out.println("Diameter of circle: " + (radius) );
                System.out.println("Area of circle: "+ (3.14*radius*radius));
                System.out.println("Perimeter of circle: " + (2*3.14*radius));

                System.out.println("Would you like to calculate another circle?");
                String answer = scan.next();

                while (!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
                    System.out.println("please just enter yes or no");
                    answer = scan.next();
                }

                if (answer.equalsIgnoreCase("no")){
                    System.out.println("Thank you for using Cydeo Circle Calculator APP");
                    break;
                }

            }

        }
    }

