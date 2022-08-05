package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        /*
        enter your full name
        enter your building number
        enter your street name
        enter your city name
        enter your state
        enter your zip code

        display the shipping address
         */
        Scanner input = new Scanner(System.in);

        System.out.println("please enter your full name");
        String name= input.nextLine();
        System.out.println("please enter you building number");
        int buildingNum = input.nextInt();

        input.nextLine(); // is so important

        System.out.println("please enter your city name");
        String cityName = input.nextLine();
        System.out.println("please enter your state");
        String stateName = input.nextLine();
        System.out.println("enter your zip code");
        int zip = input.nextInt();



        System.out.println("name: " + name + " building number: " + buildingNum +
                "\n city name: " + cityName + " State name: " + stateName +
                "\n ZIP: "+ zip);
        input.close();
    }
}
