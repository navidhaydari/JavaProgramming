package day38_Inheritance.carTask;

public class BMW extends Car {


    public BMW(String brand, String model, String color, int year, int miles, double price) {
        super(brand, model, color, year, miles, price);
    }

    public void extraPower(){
        System.out.println(brand+" es fuerte");
    }

}
