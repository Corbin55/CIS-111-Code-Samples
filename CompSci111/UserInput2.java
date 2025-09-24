import java.util.Scanner;
public class UserInput2
{
   public static void main (String[] args)
   {

      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter word one: ");
      String word1 = keyboard.nextLine();
      
      System.out.println("Enter word two: ");
      String word2 = keyboard.nextLine();
      
      
      System.out.println("Enter word three: ");
      String word3 = keyboard.nextLine();
      
      String upperCaseWord1 = (word1.toUpperCase());
      String upperCaseWord2 = (word2.toUpperCase());
      String upperCaseWord3 = (word3.toUpperCase());
      String upperCaseFin = (upperCaseWord1 + upperCaseWord2 + upperCaseWord3);
      System.out.println(upperCaseFin);
      
      String lowerCase1 = (word1.toLowerCase());
      String lowerCase2 = (word2.toLowerCase());
      String lowerCase3 = (word3.toLowerCase());
      String lowerCaseFin = (lowerCase1 + lowerCase2 + lowerCase3);
      System.out.println(lowerCaseFin);
      
      System.out.println("Word one is: " + word1.length() + " chars long.");
      System.out.println("Word two is: " + word2.length() + " chars long.");
      System.out.println("Word three is: " + word3.length() + " chars long.");
      
      int sumLength = (upperCaseFin.length() + lowerCaseFin.length());
      System.out.println("The sum of chars is: " + sumLength);
      
      String charMess = String.valueOf(word1.charAt(0)) + word2.charAt(0) + word3.charAt(0);
      System.out.println(charMess);
      
      String charMess2 = String.valueOf(word1.charAt(word2.length() - 1)) + word2.charAt(word2.length() - 1) + word3.charAt(word3.length() - 1);
      System.out.println(charMess2);
      
   }
}