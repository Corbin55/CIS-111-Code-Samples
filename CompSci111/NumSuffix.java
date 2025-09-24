import java.util.Scanner;

public class NumSuffix
{
   public static void main (String[] args)
   {
      //creation of scanner class and number range query to user
      Scanner scanNum = new Scanner(System.in);
      System.out.println("Enter a number between 1 and 20: ");
      int userNum = scanNum.nextInt();
      
      //check for number between 0 and 20
      if (userNum < 21 && userNum > 0)
      {
         //special cases for 1, 2, and 3 follow for suffixes "st, nd, rd"
         if (userNum == 1)
         {
         String userNumPlace = userNum + "st";
         System.out.println(userNumPlace);
         }
         
         else if (userNum == 2)
         {
         String userNumPlace = userNum + "nd";
         System.out.println(userNumPlace);
         }
         
         else if (userNum == 3)
         {
         String userNumPlace = userNum + "rd";
         System.out.println(userNumPlace);
         }
         
         //case for any input that is greater than 3 and applies "th"
         else
         {
         String userNumPlace = userNum + "th";
         System.out.println(userNumPlace);
         }
      }
      
      //check for number out of range
      else if (userNum > 20 || userNum < 1)
      {
         System.out.println("Number out of range. Terminating.");
      }
   }
}