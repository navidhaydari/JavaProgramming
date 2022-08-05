package day04_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {
        int hourlyRate = 20;
        int weeklyHours = 40;
        int salary = hourlyRate * weeklyHours * 52;
        System.out.println("hourlyRate = EUR " + hourlyRate);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("salary = EUR " + salary);

    }
}
