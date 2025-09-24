import java.util.Scanner;
import java.util.Random;

public class RandomPasswordLoop {

   public static void main(String[] args) {
   
      Scanner keyboardInput = new Scanner(System.in);
      Random random = new Random();
      int passSize;
      
      while(true) {
      System.out.println("\nHow long is your password?");
      //run if input is an int
      if(keyboardInput.hasNextInt()){
      passSize = keyboardInput.nextInt();
         //check pass length
         if(passSize < 10 || passSize > 60){
         passSize = 0;
         System.out.println("Please enter a different value\n");
         }
         
         System.out.println("your password:");
         //make random characters print for size of pass using count var
         for(int count = 0; count < passSize; count++){
         int x = random.nextInt(94) + 33; //choose random readable ascii char
         char c = (char) x; 
         System.out.print(c); 
         }
      }
      else {   //fail message for non-ints
      System.out.print("Incorrect value, please try again!\n");
      keyboardInput.nextLine();
      }
      
      }
      
   }

}