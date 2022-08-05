package day23_CustomMethods_Void;

public class DollarToEuro {
    public static void main(String[] args) {
        Exchange(100);
    }

    public static void Exchange(double number){
        double euro = number * 0.9;
        System.out.println(euro);
    }
}
