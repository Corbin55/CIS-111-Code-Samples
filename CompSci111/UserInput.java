import java.util.Scanner;
public class UserInput
{
   public static void main (String[] args)
   {
      System.out.println("Enter a decimal number: ");
      Scanner keyboard = new Scanner(System.in);
      double decimalNum = keyboard.nextDouble();
      keyboard.nextLine();
      
      System.out.println("Enter a whole number: ");
      int wholeNum = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.println("Enter a character: ");
      char character = keyboard.next().charAt(0);
      keyboard.nextLine();
      
      System.out.println("Enter a noun: ");
      String word = keyboard.nextLine();
      
      
      System.out.println("Enter a sentence: ");
      String sentence = keyboard.nextLine();
      
      
      System.out.println("Enter a small number: ");
      byte shortNum = keyboard.nextByte();
      
      System.out.println("There was once a " + word + " walking in the woods at " + wholeNum 
      + " O'clock at night. Suddenly a " + decimalNum + " foot tall man jumped out of a bush. He offered the " 
      + word + " a potion with the label " + character + ". After the " + word +
      " drank the potion, the man said \"" + sentence + "\"." + " The man then scurried off at " + shortNum + "mph.");
      
      
   }
}