package day32_Construstors;

public class CarObjects {
    public static void main(String[] args) {
        Car car1 = new Car("bmw");
        Car car2 = new Car("toyota","corrolla");
        Car car3 = new Car("lexus","camery",2020);
        Car car4 = new Car("benz","x10",2022,20000);
        Car car5 = new Car("volvo","r3",1998,1000,"red");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}
