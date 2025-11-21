// Program accepts a String and displays some facts
import java.util.*;

class DebugSeven3
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      String quote, charString;
      char searchChar;

      System.out.print("Enter a famous quote >> "); 
      quote = kb.nextLine(); // nextLine() must be called from the Scanner object kb

     
      System.out.print("Enter a character to search for >> "); 
     
      charString = kb.nextLine();      // Changed from nextInt() to nextLine();
     
      searchChar = charString.charAt(0);     
      
      System.out.println("indexOf('" + searchChar + "') is: " +
      quote.indexOf(searchChar)); //missing parenthesis 
          
      System.out.println("indexOf('a') is: " + quote.indexOf('a')); // Method call must use parentheses: indexOf('a'). Missing closing parenthesis

      System.out.println("indexOf('x') is: " + quote.indexOf('x'));

      System.out.println("charAt(5) is: " + quote.charAt(5));  
      
      System.out.println("replace('e', '*') is: " +
         quote.replace('e', '*')); // Misspelled replace() as "repplace"
   }
}
