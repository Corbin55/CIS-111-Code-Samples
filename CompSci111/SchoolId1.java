import java.util.Scanner;
public class SchoolId1
{
   public static void main (String[] args)
   {
      System.out.println("Enter your first initial: ");
      Scanner keyboard = new Scanner(System.in);
      char firstInitial = keyboard.next().charAt(0);
      keyboard.nextLine();
      
      System.out.println("Enter your last name: ");
      String lastName = keyboard.nextLine();
      
      System.out.println("Enter the last four digits of your student ID: ");
      int studentsId4Last = keyboard.nextInt();
      
      System.out.println(firstInitial + lastName + studentsId4Last);
      
      
   }
}