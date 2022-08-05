package day11_Switch_Scanner;

public class Elevator {
    public static void main(String[] args) {


    /*
    2. Create a class called Elevator. A variable named floorNumber is
given, write a program that can display the floor info
when floorNum is 1 -> print "Floor 1
selected. Companies: Lobby, Verizon, Starbucks"
when floorNum is 2 -> print "Floor 2
selected. Companies: Cybertek, NASA, Intelsat"
when floorNum is 3 -> print "Floor 3
selected. Companies: Lyft, BofA, Stake house"
 anything else: print "Invalid floor - 6"
 Note:
 Solution 1: use nested if statement
Solution 2: use switch statement
Solution 2: use if & switch statements
mixed

     */
        int floorNum = 3;
        String companies = "",
                floor = "";
        switch (floorNum){
            case 1:
                floor = "Floor 1";
                companies= "Lobby, Verizon, Starbucks";
                break;
            case 2:
                floor = "Floor 2";
                companies= "Cybertek, NASA, Intelsat";
                break;
            case 3:
                floor= "Floor 3";
                companies="Lyft, Bofa, Stake house";
            default:
                System.out.println("invalid floor");
        }
        System.out.println(floor+ "\n"+ companies);

    }
}
