//method for checking if a character is a vowel
public class VowelCheck {
   public static boolean isVowel(char c){
   
   c = Character.toLowerCase(c);
   return c == 'a' || c == 'e' || c == 'i' ||
   c == 'o' || c == 'u' || c == 'y';
   
   }
}