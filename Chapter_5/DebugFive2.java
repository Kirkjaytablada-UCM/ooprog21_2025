// DebugFive2.java
// Decides if two numbers are evenly divisible
import java.util.Scanner;
public class DebugFive2
{
   public static void main(String args[])
   {
      int num;
      int num2;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number ");
      
      num = input.nextInt(); // read first number from the user
            
      System.out.print("Enter another number ");
      
      num2 = input.nextInt(); // read second number from the user
      
      // Check one number divides evenly into the other
      if((num % num2 == 0) || (num2 % num == 0))                 
      {
         System.out.println("One of these numbers is");
         System.out.println(" evenly divisible into the other");
      }
      else
      {  
         System.out.println("Neither of these numbers is");
         System.out.println(" evenly divisible into the other");
      }
    }
}
