package day18_NestedLoop;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;
        System.out.println("Enter Item1 and its price:");
        String things = scan.nextLine();
        while(true){
            while(!((item.equalsIgnoreCase("tomatoes")) || (item.equalsIgnoreCase("cheese") || item.equalsIgnoreCase("apples")))){
                System.out.println("please enter correct item");
                things = scan.nextLine();
            }


        }
    }
}

