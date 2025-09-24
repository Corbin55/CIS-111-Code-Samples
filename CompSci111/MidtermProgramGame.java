import java.util.Scanner;

public class MidtermProgramGame{
   
   public static void main(String[] args){
   
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Choose a menu option below: \n---------------------------");
      System.out.println("1: Start Game \n2: Use Time Budget Calculator\n3: Quit Game");
      
      int userFirstMenuSelect = keyboard.nextInt();
      keyboard.nextLine();
      
      //First menu select------------------------------------------------------
      if(userFirstMenuSelect == 1){
      
      //Copyright (c) 2025 Corbin Hawke Pignoli
      System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=\n"+ 
      "WELCOME TO CORBIN HAWKE'S FIRST TEXT BASED ADVENTURE\n" + 
      "=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=\n");
         
         System.out.println("Please enter your character's name below: ");
         String playerName = keyboard.nextLine();
         
         //first game menu choices
         System.out.println("Hello " + playerName + ". Next, choose an action: ");
         System.out.println("1: Enter dungeon \n2: Enter home \n3: Enter coffee shop");
         
         int userAction = keyboard.nextInt();
         
         //player choice dungeon
         if(userAction == 1){
         System.out.println(playerName + " enters the dungeon and sees a skeleton. Unfortunately they forgot their sword and it kills them.");
         System.out.print("GAME OVER");
         }
         
         //player choice home
         else if(userAction == 2){
         System.out.println(playerName + " sees a dog. Choose an option: ");
         System.out.println("1: Slay \n2: Pet");
         
         int homeAction = keyboard.nextInt();
         
         //player choice home->slay dog
         if(homeAction == 1){
         System.out.print("You monster.");
         }
         
         //player choice home->pet dog
         else if(homeAction == 2){
         System.out.print("He is happy.");
         }
         
         //player choice home->invalid
         else{
         System.out.print("Failed...");
         }
         
         }
         
         //player choice coffee shop
         else if(userAction == 3){
         System.out.print(playerName + " walks in and orders a latte. Enjoy!");
         }
         
         //player didnt choose dungeon, home, or coffee shop
         else{
         System.out.println("Not valid. Terminating...");
         }
      }
      
      //Second menu select-----------------------------------------------------
      else if(userFirstMenuSelect == 2){
         System.out.println("How much work do you have to do in hours? (This can be a whole number or decimal number) : ");
         
         double hoursValue = keyboard.nextDouble();
         //convert hours to mins
         double minutesValue = (hoursValue * 60);
         
         //check for negative value and terminate
         if(hoursValue < 0){
         System.out.print("You cannot have negative work hours.");
         }
         
         else {
         System.out.print("You have " + minutesValue + " minutes of work. Thankfully this game only takes 7 seconds to play, so go ahead.");
         }
      }
      
      //Third menu select------------------------------------------------------
      else if(userFirstMenuSelect == 3){
         System.out.print("Quitting...");
      }
      
      else{
         System.out.print("Menu option not valid. Exiting...");
      }
      keyboard.close();
   }   
}