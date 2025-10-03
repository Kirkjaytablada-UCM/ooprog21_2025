// DebugFive4.java
// Outputs highest of four numbers
import java.util.*;
public class DebugFive4
{
   public static void main (String args[])
   {
      int one, two, three, four;
      int highest;
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter an integer >> ");
      one = input.nextInt();
      
      System.out.print("Enter an integer >> ");
      two = input.nextInt(); // read second number
      
      System.out.print("Enter an integer >> ");
      three = input.nextInt(); // read third number
      
      System.out.print("Enter an integer >> ");
      four = input.nextInt(); // read fourth number
      
      // Check the first number is the largest
      if(one > two && one > three && one > four)
         highest = one;
      
      // check if the second number is the largest
      else if(two > one && two > three && two > four)  
         highest = two;
      
      // check if the third number is the largest
      else if(three > one && three > two && three > four)  
         highest = three;
      
      // If none of the above, the fourth must be the largest
      else     
         highest = four;
         
      System.out.println("The highest number is " + highest);
   }
}
