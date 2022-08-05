package day05_Concatenation;

public class ShippingAddress {
    /*
    1. create a class called ShippingAddress.java
    2. Declare the following variables:
        1. name
        2. buildingNumber
        3. streetName
        4. city
        5. state
        6. zipCode
     */
    public static void main(String[] args) {
        String name = "Navid";
        byte buildingNumber = 120;
        String streetName = "Cart. de Madrid";
        String city = "Cordoba";
        String state = "Andalucia";
        int zipCode = 14610;
        System.out.println("Name: "+ name + "\n" + "Address: "+ buildingNumber + "," + streetName + "\n" + city + ", " + state +" \n"+ "ZIP: " +zipCode );
    }
}
