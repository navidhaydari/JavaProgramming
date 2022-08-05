package day18_NestedLoop;

import java.util.Locale;
import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        int count = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("do you want to reserve a room?");
        String answer = scan.next().toLowerCase();
        scan.nextLine();

        if (answer.equalsIgnoreCase("yes")){
            System.out.println("which type of room?");
            System.out.println("king bed ==> 120$ \nQueen bed ==>100$ \nSingle bed==> 80$");
            String roomType = scan.nextLine();
            while (!(roomType.equalsIgnoreCase("king bed")
                    || roomType.equalsIgnoreCase("queen bed")
            || roomType.equalsIgnoreCase("single bed"))){
                System.out.println("please enter a correct room type");
                roomType = scan.nextLine();
                if (roomType.equalsIgnoreCase("king bed")){
                    count+=120;
                } else if (roomType.equalsIgnoreCase("queen bed")) {
                    count+=100;

                } else if (roomType.equalsIgnoreCase("single bed")) {
                    count+=80;

                }
                System.out.println("how many night?");
                int nights = scan.nextInt();

            }



            while (!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
                System.out.println("invalid answer please re enter !");
            }
        }else {
            System.out.println("price: "+ (count ));
        }
    }
}
