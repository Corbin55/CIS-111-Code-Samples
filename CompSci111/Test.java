public class Test {
   public static void main(String[] args){
      //vowel check test
      char a = 'a';
      boolean result = VowelCheck.isVowel(a);
      System.out.println(result);
      
      //meal bill test
      double mealBill = MealSplitter.MealSplit(3, 38.58, 0.20);
      System.out.println("Your meal total per person: " + mealBill);
   }
}