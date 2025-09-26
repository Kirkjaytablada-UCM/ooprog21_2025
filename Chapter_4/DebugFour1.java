// This class uses a DebugCircle class
// to instantiate a Circle object
import java.util.Scanner;
public class DebugFour1
{
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
      int radius;
      Circle c = new DebugCircle(); // changed 'new Circle()' to 'new DebugCircle()'
      System.out.print("Enter a radius for a circle >> ");
      radius = input.nextInt();
      c = new DebugCircle(radius); // changed 'new DebugCircle(c)' to 'new DebugCircle(radius)'
      System.out.println("The radius is " + c.getRad());
      System.out.println("The diameter is " + c.getDiam());
      System.out.println("The area is " + c.getArea());
   }
}