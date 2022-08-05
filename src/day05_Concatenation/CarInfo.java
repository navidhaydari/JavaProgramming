package day05_Concatenation;

public class CarInfo {
    /*
    1. Create a class called CarInfo.java
    2. Declare the followings variables:
        1. year
        2. make
        3. model
        4. miles
        5. color
        6. price
     */
    public static void main(String[] args) {
        String make = "Toyota",
                model = "Corolla",
                color = "White";
        int year = 2015,
                miles = 15000,
                price = 14000;
        System.out.println(year + " " + make + " " + model + ", " + miles + "miles, " + color + ", " + "$" +price );
    }
}
