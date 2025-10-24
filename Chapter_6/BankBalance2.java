import java.util.Scanner;

public class BankBalance2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance;
        double rate = 0.03;
        int year = 1;
        int choice;

        System.out.print("Enter initial bank balance: ");
        balance = input.nextDouble();

        do {
            balance += balance * rate;
            System.out.printf("After year %d at %.2f interest rate, balance is %.2f%n", year, rate, balance);
            year++;
            System.out.print("Do you want to see the balance at the end of another year? (1 = yes, others = no): ");
            choice = input.nextInt();
        } while (choice == 1);

        System.out.println("Operation complete.");
    }
}
