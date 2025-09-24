public class MealSplitter {
   public static double MealSplit(int peopleCount, double dinnerTotal, double tipPercent) {
      return (dinnerTotal +(dinnerTotal*tipPercent))/peopleCount;
   }
}