public class DebugCircle
   {
   private int radius;
   private int diameter;
   private final double PI = 3.14159;
   private double area;
   
   
   public DebugCircle(int r ) {
         radius = r;
         diameter = 2 * r;
         area = PI * r * r;
   }
   
   public int getRadius() {  // remove the semicolon
         return radius; // replace the radiuss to radius
   }        
   
   
   public int getDiameter() {  // change the void to int 
         return diameter;
   }
   
   
   public double getArea() {
         return area;
   }