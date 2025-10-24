// This program starts with one penny and doubles the amount each day.
// It asks the user how many days to run the calculation
// and then shows how much money you’d have at the end of each day.

import java.util.Scanner;

public class DebugSix1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Ask the user how many days to double the penny
        System.out.print("Enter number of days >> ");
        int days = keyboard.nextInt();

        double money = 0.01; // Starting amount: one penny
        int day = 1; // Start counting from day 1

        // Keep doubling the money until we reach the given number of days
        while (day <= days) {
            money = money * 2; // Double the money each day
            System.out.println("After day " + day + " you have " + money);
            day++; // Move to the next day
        }
    }
}
