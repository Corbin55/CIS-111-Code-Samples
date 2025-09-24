import java.util.Scanner;

public class LargeSmallSumAvg {
    public static void main(String[] args) {
        // variable initialization
        Scanner input = new Scanner(System.in);
        int number;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        double average;

        System.out.println("Enter a series of integers (enter -99 to quit):");
               // set value to true to continually run
        while (true) {
            System.out.print("Enter an integer: ");
            if (input.hasNextInt()) {
                number = input.nextInt();
                sum = sum + number;

                if (number == -99) {
                    sum = sum + 99; // counteract sum set value from quit value
                    break; // end input
                }

                // update min and max
                if (number < min) {
                    min = number;
                }
                if (number > max) {
                    max = number;
                }

            } else {
                System.out.println("Invalid input. Please enter an integer.");
                input.next(); // consume the invalid input
            }
        }

        // check if any numbers were entered
        if (min == Integer.MAX_VALUE && max == Integer.MIN_VALUE) {
            System.out.println("No valid integers were entered.");
        } else {
            System.out.println("Smallest number entered: " + min);
            System.out.println("Largest number entered: " + max);
            System.out.println("Sum is: " + sum);
        }
    }
}

