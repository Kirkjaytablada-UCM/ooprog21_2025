import java.util.Scanner;

public class DebugThree1 {
    public static void main(String[] args) {
        // Declare variables to store the amounts of two checks
        double check1;
        double check2;
        
        // Create a Scanner object to get input from the user
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the amount of their first check
        System.out.print("Enter the amount of your check >> ");
        check1 = input.nextDouble();  // Get the amount for the first check
        
        // Prompt the user to enter the amount of their friend's check
        System.out.print("Enter the amount of your friend's check >> ");
        check2 = input.nextDouble();  // Get the amount for the second check

        // Calculate and show the tip for both checks
        calcTip(check1);
        calcTip(check2);
    }

    // Method to calculate and display the tip based on the bill amount
    public static void calcTip(double bill) {
        final double RATE = 0.15;  // The tip rate is set to 15%
        
        // Calculate the tip by multiplying the bill amount by the tip rate
        double tip = bill * RATE;
        
        // Display the calculated tip amount
        System.out.println("The tip should be at least $" + tip);
    }
}
