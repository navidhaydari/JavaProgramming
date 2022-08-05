package day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter your HourlyRate");
        int hourlyRate = input.nextInt();
        System.out.println("Enter the Hours of Work in a week");
        int weekHours = input.nextInt();
        System.out.println("Enter the State Tax in percentage");
        double stateTax = input.nextDouble();
        System.out.println("Enter the Federal Tax in percentage");
        double federalTax = input.nextDouble();
        double salary = hourlyRate*weekHours*52;
        System.out.println("salary = " + salary);
        System.out.println("stateTax = " + salary*(stateTax/100) );
        System.out.println("federalTax = " + salary*(federalTax/100));
        System.out.println("total tax: = " + (salary*(stateTax/100)+salary*(federalTax/100 )));
        System.out.println("net income = " + (salary - (salary*(stateTax/100)+salary*(federalTax/100)) ) );
        input.close();


    }
}
