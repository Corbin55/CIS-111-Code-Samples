public class Var_and_Arithmetic_Operators
{
   public static void main(String[] args)
   {
      //radius question A
      int radius = 4;
      System.out.println("The diameter of a circle with a radius of 4 equals: " + (radius*2));
      
      //average question B
      int numba1 = 17;
      int numba2 = 37;
      int numba3 = 111;
      System.out.println("The average of 17, 37, and 111 is: " + (numba1 + numba2 + numba3)/3.0);
      
      //series sum question C
      int seriesSum = (100/2*(1+100));
      System.out.println("The sum of numbers 1-100 is: " + (seriesSum));
      
      //fahrenheit conversion question D
      double fahrenheitValue = 112.4;
      double kelvinValue = (fahrenheitValue - 32) * 5/9 + 273.15;
      double celsiusValue = (fahrenheitValue - 32) * 5/9;
      
      System.out.println("The temperature you recorded was: " + fahrenheitValue + " degrees Fahrenheit, which is " 
                                + celsiusValue + " degrees in Celsius or " + kelvinValue + " degrees in Kelvin.");
      
      //coin amounts in 97 cents question E
      int totalCents = 97;
      double quartersValue = 25.000;
      double dimesValue = 10.000;
      double nickelsValue = 5.000;
      int penniesValue = 1;
      
      System.out.println("You have 97 cents which is equal to " + (totalCents / quartersValue) 
                                                                + " quarters in value.");
                                                                
      System.out.println("97 cents is equal to " + (totalCents / dimesValue) + " dimes worth or " 
                                                 + (totalCents / nickelsValue) + " nickels worth or OR " 
                                                 + (totalCents / penniesValue) + " in pennies (shocking).");
                                                 
      int triangleSide1 = 7;
      double triangleSide2 = 9.3;
      double hypotenuseStepOne = (triangleSide1 * triangleSide1) + (triangleSide2 * triangleSide2);
      
      //initial hypotenuse using arithmetic
      System.out.println("Hypotenuse is the square root of: " + hypotenuseStepOne);
      System.out.println("Hypotenuse value is complicated..");
      
      //hypotenuse using math class
      double hypotenuseStepTwo = Math.pow(7.0, 2.0) + Math.pow(9.3, 2.0);
      double hypotenuseFinal = Math.sqrt(hypotenuseStepTwo);
      System.out.println("Hypotenuse is: " + hypotenuseFinal);
   }
}