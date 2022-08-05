package day05_Concatenation;

public class FlightTicket {
    /*
    2. create a class named FlightTicket, and declare the following
variables:
1. from
2. to
3. ticketPrice
use concatenation to display the full info of the ticket
ex:
From Las Vegas to McLean is $425.5
     */
    public static void main(String[] args) {
        String from = "Madrid",
                to = "Barcelona";
        int price = 200;
        System.out.println("From " + from + " to " + to + " is EUR" + price);
    }
}
