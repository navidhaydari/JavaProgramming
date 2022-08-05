package day17_While_DoWhile;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kingBed= 120;
        int queenBed= 100;
        int singleBed = 80;
        System.out.println("do you want to reserve a room? yes/no");
        String str = scan.nextLine();
        while (!(str.equals("yes") || str.equals("no"))){
            System.out.println("enter a valid entry");
            System.out.println("do you want to reserve a room? yes/no");
            str = scan.nextLine();
            if (str.equals("yes")){
                System.out.println("please select room type");
                String roomType= scan.next();

                while (!(roomType.equals("king bed")|| roomType.equals("queen bed") || roomType.equals("single bed"))){
                    System.out.println("enter correct room name");
                    System.out.println("please select room type");
                    roomType= scan.next();
                    if (roomType.equals("king bed")){
                        System.out.println(kingBed + "$");
                    } else if (roomType.equals("queen bed")) {
                        System.out.println(queenBed+"$");

                    }else {
                        System.out.println(singleBed+"$");
                    }

                }
            } else  {
                System.out.println("have a nice day");

            }


        }
    }
}
