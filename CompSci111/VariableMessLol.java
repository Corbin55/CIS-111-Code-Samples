public class VariableMessLol
{

   public static void main (String[] args)
   {
      //declare var
      double pi;
      int radius;
      int radius2;
      double celsiusTemp;
      String startingStatementCircle;
      String startingStatementDegrees;
      String endingStatementDegrees;
      
      
      //initialize var
      pi = 3.14159;
      radius = 7;
      radius2 = 7;
      celsiusTemp = 27.50000;
      startingStatementCircle = "The area of a circle with the radius 7 is: ";
      startingStatementDegrees = "The Fahrenheit value of 27.5 degrees Celsius is: ";
      endingStatementDegrees = " degrees Fahrenheit";
      
      
         //statement below calculates a circle's area
         System.out.println(startingStatementCircle +
                        ( radius * radius2 * pi ));
                        
         //statement below calculates fahrenheit from celsius
         System.out.println(startingStatementDegrees +
                        ( celsiusTemp * ( 9.00 / 5.00 ) +32 ) +
                         endingStatementDegrees);
      
   }

}