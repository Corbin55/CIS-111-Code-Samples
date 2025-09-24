import java.util.Scanner;

public class DecimalToBinaryDivision {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int number = 0;

      while (true) {
         System.out.print("Enter a positive integer you would like to convert to binary: ");
         if (keyboard.hasNextInt()) {
            number = keyboard.nextInt();
            
            if (number >= 0) {
               if (number == 0) { 
                  System.out.println("Binary value: 0"); // get rid of case of 0
               } else {
                  String binary = ""; // binary holds nothing
                  while (number > 0) {
                     int remainder = number % 2; // remainder is set using modulo
                     binary = remainder + binary; // glue remainder value to binary per iteration
                     number = number / 2; 
                  }
                  System.out.println("Binary value: " + binary);
               }
               break;
            } 
            else {
               System.out.println("Enter a non-negative integer.");
            }
         } 
         else {
            System.out.println("Invalid, please enter an integer.");
            keyboard.next(); // consume dead input
         }
      }
      keyboard.close();
   }
}
