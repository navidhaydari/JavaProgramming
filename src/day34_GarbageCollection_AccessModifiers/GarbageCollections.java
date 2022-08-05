package day34_GarbageCollection_AccessModifiers;

import day32_Construstors.Car;
import day33_Statics.Iphone;

public class GarbageCollections {
    public static void main(String[] args) {

        String str = "wooden spoon";

        str= null;

        System.out.println(str);

        Car car = new Car("toyot");

        car = null;

        System.out.println(car);

    }
}
