package day23_CustomMethods_Void;

import java.util.Locale;

public class Order {
    public static void main(String[] args) {
        Ordered("nAVid","hayDArI");
    }


    public static void Ordered(String name , String lastName){
        String firstName = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        String apellido = lastName.substring(0,1).toUpperCase()+ lastName.substring(1).toLowerCase();
        System.out.println(firstName+" "+ apellido);
    }
}
