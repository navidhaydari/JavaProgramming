package day38_Inheritance.carTask;

public class Tesla extends Car {
    public Tesla(String brand, String model, String color, int year, int miles, double price) {
        super(brand, model, color, year, miles, price);
    }

    public void solar(){
        System.out.println(brand+" is charged by sun");
    }

}
