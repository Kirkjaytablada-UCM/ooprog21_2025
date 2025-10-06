import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee number: ");
        int empNumber = input.nextInt();

        System.out.print("How many hours did you work this week? ");
        double hoursWorked = input.nextDouble();

        System.out.print("What is your regular pay rate? ");
        double rate = input.nextDouble();

        // Create Employee object
        Employee emp = new Employee(empNumber, rate);

        double regularPay = emp.getRegularPay(hoursWorked);
        double overtimePay = emp.getOvertimePay(hoursWorked);

        System.out.println("\nRegular pay is " + regularPay);
        System.out.println("Overtime pay is " + overtimePay);
    }
}
