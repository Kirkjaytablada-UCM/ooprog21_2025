import java.util.Scanner;

public class BankBalanceByRateAndYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter initial bank balance > ");
        double balance = input.nextDouble();

        double[] rates = {0.02, 0.03, 0.04, 0.05};

        for (int i = 0; i < rates.length; i++) {
            double rate = rates[i];
            double newBalance = balance;

            System.out.printf("%nWith an initial balance of $%.2f at an interest rate of %.2f%n", balance, rate);

            for (int year = 1; year <= 4; year++) {
                double interest = newBalance * rate;
                newBalance += interest;
                System.out.printf("After year %d: Interest = $%.2f, Balance = $%.2f%n", year, interest, newBalance);
            }
        }

        input.close();
    }
}
