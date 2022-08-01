package src;
import java.util.Scanner;

public class Salary {

    public static double calculateSalary(int weeklyHours, double rate, int vacationDays) {
        if (weeklyHours < 0 || rate < 0 || vacationDays < 0) {
            return -1;
        }

        int vacationHours = vacationDays * 8;
        double weeklyPaycheck = weeklyHours * rate;
        return (weeklyPaycheck * 52) - (vacationHours * rate);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many hours does the employee work per week?");
        int hours = input.nextInt();
        System.out.println("How much does the employee earn per hour?");
        double rate = input.nextDouble();
        System.out.println("How many vacation days did they take?");
        int vacationDays = input.nextInt();
        double salary = calculateSalary(hours, rate, vacationDays);
        if (salary < 0) {
            System.out.println("Invalid input.");
        } else {
            System.out.println("This employee made $" + salary + "!");
        }

    }
}
