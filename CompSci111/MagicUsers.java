import java.util.Scanner;

public class MagicUsers
{  
   public static void main (String[] args)
   {
      //creation of scanner class 
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Please enter your username: ");
      String userInputName = keyboard.nextLine();
      
            
      if (userInputName.equals("root") || userInputName.equals("ada") || userInputName.equals("flynn") || userInputName.equals("admin"))
      {
         System.out.print("Super user access granted!"); 
      }
      
      else
      {
         System.out.print("Access denied, end of line.");
      }
   }
}