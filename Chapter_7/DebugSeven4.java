// Gets a String from the user
// Converts the String to lowercase
// Displays the String's length and the number of letters
import java.util.*;

class DebugSeven4 // public removed
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      String aString;
      int numLetters = 0;
      int stringLength;
      System.out.println("Enter a String. Include");
      System.out.println("some uppercase letters, lowercase");
      System.out.print("letters, and numbers >> ");
      aString = kb.nextLine();
      stringLength = aString.length();
      System.out.print("In all lowercase, the String is: ");
      for(int i = 0; i < stringLength; i++)  // removed (=) 
      {
      char ch = Character.toLowerCase(aString.charAt(i)); // the (.) is missing
      System.out.print(ch);
      if(Character.isLetter(ch)) // i removed (!)
      numLetters++;
      }
      System.out.println();
      System.out.println("The number of CHARACTERS in the string is " + stringLength);  
      System.out.println("The number of LETTERS is " + numLetters); // the (") is missng so i added it
   }
}
