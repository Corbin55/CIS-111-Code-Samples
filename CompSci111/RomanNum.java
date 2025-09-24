import java.util.Scanner;

public class RomanNum
{
   public static void main (String[] args)
   {
      //creation of scanner class and number range query to user
      Scanner scanNum = new Scanner(System.in);
      System.out.println("Enter a number from 10 to 20: ");
      
      //grabs the integer value of userNum, converts the integer to a string 
      //which then is parsed for the numerical values at the starting character (tens place)
      int userNum = scanNum.nextInt();
      String userNumString = Integer.toString(userNum);
      int firstDigit = Character.getNumericValue(userNumString.charAt(0));
      
      char romanI = 'I';
      
      //check for number between 10 and 20
      if (userNum <= 21 && userNum >= 10)
      {
         //when number is between 10 and 20, the second digit is then parsed
         //to check for the amount of repetition that 'I' or romanI receives
         int secondDigit = Character.getNumericValue(userNumString.charAt(1));
         String romanIRepeating = String.valueOf(romanI).repeat(secondDigit);
         
         //print X for 10
         if (userNum == 10)
         {
            System.out.println("Your roman numeral is: " + "X");  
         }
         
         //print XX for 20
         else if (userNum == 20)
         {
            System.out.println("Your roman numeral is: " + "XX");  
         }
         
         //print XV for 15
         else if (userNum == 15)
         {
            System.out.println("Your roman numeral is: " + "XV");  
         }
         
         //print XIV for 14
         else if (userNum == 14)
         {
            System.out.println("Your roman numeral is: " + "XIV");
         }
         
         //print XIX for 19
         else if (userNum == 19)
         {
            System.out.println("Your roman numeral is: " + "XIX");
         }
         
         //check for numbers above 10 and below 15, excluding both values
         else if (firstDigit == 1 && userNum < 15 && userNum !=(10) )
         {
            System.out.println("Your roman numeral is: " + "X" + (romanIRepeating));
         }

         //check for numbers above 15 but below 20 and repeat romanI accordingly
         else if (firstDigit == 1 && userNum > 15 && userNum !=(20) )
         {
            System.out.println("Your roman numeral is: " + "XV" + (String.valueOf(romanI).repeat(secondDigit - 5)));
         }
      }
      
      //check for number out of range and terminate if value fits
      else if (userNum > 20 || userNum < 10)
      {
         System.out.println("Number out of range. Terminating.");
      }
   }
}