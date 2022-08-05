package day11_Switch_Scanner;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        String cappuccino = "tall";
        double tall = 3.69,
                grande = 4.29,
                venti = 4.29;

        if (cappuccino == "tall" || cappuccino=="grande" || cappuccino=="venti"){
            if (cappuccino == "tall"){
                System.out.println("price is $"+ tall + "\n 90 calories");
            } else if (cappuccino=="grande") {
                System.out.println("price is $" + grande + "\n 120 calories");
                
            }else {
                System.out.println("price is $"+ venti);
            }

        }else {
            System.out.println("wrong size");
        }
    }
}
