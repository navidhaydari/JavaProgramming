package day17_While_DoWhile;

import day12_Scanner.SalaryCalculator;

import java.util.Scanner;

public class InsuranceQuote {
    /*
        6. Create a class called InsuranceQuote, write a program that can calculate the insurance cost of a person based on the following info:
    		1. Ask the user to enter your name
    		2. Ask the user to enter your gender
    			(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			3. Ask the user if he/she is married(Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			4. Ask user to enter your age
					(age can not be negative or greater than 120)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			5. Ask user to enter how many miles he/she drives in a day
					(mileage can not be negative or less than 5)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			6. Ask the user if he/she wants full coverage or liability insurance?

			7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

			8. Ask the user if his/her car has an anti-theft device (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

		Calculate the price of the insurance and display all the info of the user

			Insurance Quote calculation:
				starting prices for liability:
					age < 25 ===> 90
					age >= 25 ==> 50

					miles <= 10 ====> $10
				    miles > 10 and miles <= 50 ==> $30
				    miles > 50 ===>  $50

				starting prices for full coverage:
					age < 25 ===> 160
					age >= 25 ==> 120

					miles <= 10 ====> $20
				    miles > 10 and miles <= 50 ==> $40
				    miles > 50 ===>  $70


			    If the car has anti-theft device ==> 5% discount
			    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
			    If he/she never had any accidents or claims in past 5 years ==> 10% discount
			    If he/she is married ==> 5% discount
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your name");
        String name = scan.next();
        System.out.println("enter your gender");
        char ch = scan.next().charAt(0);
        while (!(ch=='M' || ch=='F')){
            System.out.println("please enter correct gender");
            ch = scan.next().charAt(0);
        }
        System.out.println("Are you married? yes/no");
        String isMarried = scan.next();
        while (!(isMarried.equalsIgnoreCase("yes") || isMarried.equalsIgnoreCase("no"))){
            System.out.println("please enter correct answer, married? ");
            isMarried = scan.next();

        }
        System.out.println("enter your age");
        int age = scan.nextInt();
        while (!(age>0 && age <=120)){
            System.out.println("please enter correct age");
            age = scan.nextInt();
        }
        System.out.println("how many miles do you drive in a day");
        int miles = scan.nextInt();
        while (!(miles>5)){
            System.out.println("please enter correct answer, miles? ");
            miles = scan.nextInt();

        }
        System.out.println("do you want a full coverage or liability insurance?");
        String insurance = scan.next();
        while (!(insurance.equalsIgnoreCase("yes") || insurance.equalsIgnoreCase("no"))){
            System.out.println("please answer correctly, do you want insurance? ");
            insurance = scan.next();
        }
        System.out.println("did you had an accident in last five years?");
        String accident = scan.next();
        while (!(accident.equalsIgnoreCase("yes") || accident.equalsIgnoreCase("no"))){
            System.out.println("please answer correctly, any accident? ");
            accident = scan.next();
        }
        System.out.println("does your car has anti thief device ?");
        String antiThief = scan.next();
        while (!(antiThief.equalsIgnoreCase("yes") || antiThief.equalsIgnoreCase("no"))){
            System.out.println("please answer correctly, device? ");
            insurance = scan.next();
        }
        scan.close();



    }
}
