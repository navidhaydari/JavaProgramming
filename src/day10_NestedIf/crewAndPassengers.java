package day10_NestedIf;

public class crewAndPassengers {
    public static void main(String[] args) {
        /*
        2. Create a class called CrewAndPassangers, Given a number of people on
the ship (int number), determine how many need to be crew members and
how many can be passengers. Print how many of each type there should
be.
Total: 50 ====> 20 crew, 30 passengers
Total: 75 ====> 25 crew, 50 passengers
Total: 100 ====> 30 crew, 70 passengers
Any other number of people on the ship is not valid
NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT
STATEMENT

         */
        int crew = 75,
                passenger = 11,
                total = (crew + passenger);
       String passengers = (total>=50 && total<=100) ? (total==50)? "20 crews, 30 passengers" :(total==75)? "25 crews, 50 passengers"
                : "30 crews, 70 passengers" : "invalid number";
        System.out.println("passengers = " + passengers);
    }
}
