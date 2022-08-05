package day19_LoopPractices;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;

        System.out.println("Enter Item1 and its price:");
        item = scan.nextLine();
        price= scan.nextDouble();

        while(true){
            while(!((item.equalsIgnoreCase("tomatoes")) || item.equalsIgnoreCase("cheese") || item.equalsIgnoreCase("apples"))){
                System.out.println("please enter correct item");
                item = scan.nextLine();
                price= scan.nextDouble();
            }

            if(item.equalsIgnoreCase("tomatoes")|| item.equalsIgnoreCase("cheese") || item.equalsIgnoreCase("apples")){
                totalPrice+=price;

            }
            System.out.println("Add one more item?");
            countinue = scan.nextLine();
            while(!(countinue.equalsIgnoreCase("yes") || countinue.equalsIgnoreCase("no"))){
                System.out.println("enter correct answer");

            }
            if(countinue.equals("no")){
                System.out.println("thanks for shopping");
                System.out.println("total: "+ totalPrice);
                break;
            }
        }
    }


}

