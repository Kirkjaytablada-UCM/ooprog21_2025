// DebugFive1
// Adds your lunch bill
// Burger and hot dog are $2.59
// Grilled cheese and fish are $1.99
// Fries are 89 cents
import java.util.*;
public class DebugFive1
{
   public static void main(String args[])
   {
      Scanner kb = new Scanner(System.in);
      final double HIGH_PRICE = 2.59;
      final double MED_PRICE = 1.99;
      final double LOW_PRICE = 0.89;
      int usersChoice;
      double bill;
      
    bill = 0; // start the bill at zero
      
      System.out.println("Order please 1 - Burger 2 - Hotdog");
      System.out.print("3 - Grilled cheese 4 - Fish sandwich >> ");
      usersChoice = kb.nextInt();
      
      // If the user chooses Burger or Hotdog, use the higher price.
      // Otherwise, use the medium price for Grilled Cheese or Fish.
      if(usersChoice == 1 || usersChoice == 2)  
         bill = bill + HIGH_PRICE;
      else
         bill = bill + MED_PRICE;
         
      System.out.print("Fries with that? 1 - Yes 2 - No >> ");
      usersChoice = kb.nextInt();
      
      // Add fries price only if the user says yes.
      if(usersChoice == 1)  
         bill = bill + LOW_PRICE;
      
      // Finally, display the total bill.
      System.out.println("Total bill is " + bill);  
   }  
}  