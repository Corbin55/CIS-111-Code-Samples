import java.util.Scanner;

public class MinToMax {

   public static void main(String[] args) {

      Scanner keyboardInt = new Scanner(System.in);
      int int1, int2;
      
      String failMessage = "Invalid input. Please enter a positive integer.";

      // get first valid positive integer
      while (true) {
         System.out.print("Enter the first positive integer: ");
         if (keyboardInt.hasNextInt()) {
            int1 = keyboardInt.nextInt();
            if (int1 > 0) {
               break;
            } else {
               System.out.println(failMessage);
            }
         } else {
            System.out.println("Invalid input. Please enter an integer.");
            keyboardInt.next(); // consume the invalid input
         }
      }

      // get second valid positive integer
      while (true) {
         System.out.print("Enter the second positive integer: ");
         if (keyboardInt.hasNextInt()) {
            int2 = keyboardInt.nextInt();
            if (int2 > 0) {
               break;
            } else {
               System.out.println(failMessage);
            }
         } else {
            System.out.println(failMessage);
            keyboardInt.next(); // consume the invalid input
         }
      }

      // make int1 less than int2
      if (int1 > int2) {
         int temp = int1;
         int1 = int2;
         int2 = temp;
      }

      // print from int1 to int2
      for (int printInt = int1; printInt <= int2; printInt++) {
         if (printInt != int2) {
            System.out.print(printInt + ", ");
         } else {
            System.out.print(printInt);
         }
      }
   }
}