package day11_Switch_Scanner;

public class SalaryAfterTax {
    public static void main(String[] args) {
        int salary = 190000;
        boolean isHemarried = true;

        boolean salaryAfterTax1 = salary >= 130000,
                salaryAfterTax2 = salary >=100000 && salary <130000,
                salaryAfterTax3 = salary >=80000 && salary < 100000,
                salaryAfterTax4 = salary<=80000;
        if (salaryAfterTax1){
            System.out.println(salary - salary * 0.35);
        } else if (salaryAfterTax2) {
            System.out.println(salary- salary * 0.30);

        } else if (salaryAfterTax3) {
            System.out.println(salary-salary * 0.25);

        } else if (salaryAfterTax4) {
            System.out.println(salary-salary*0.2);

        }
    }

    }
