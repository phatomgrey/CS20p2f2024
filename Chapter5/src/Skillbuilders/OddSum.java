package Skillbuilders;

import java.util.Scanner;

public class OddSum {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner userInput = new Scanner(System.in);

        // Prompt the user for a number
        System.out.print("Enter a number: ");
        int number = userInput.nextInt();

        int sum = 0;

        // Loop through numbers from 1 to the entered number and sum the odd numbers
        for (int i = 1; i <= number; i++) {
            if (i % 2 != 0) {  // Check if the number is odd
                sum += i;      // Add the odd number to the sum
            }
        }

        // Display the sum of the odd numbers
        System.out.println("Sum of odd numbers from 1 to " + number + ": " + sum);

        // Close the scanner to prevent resource leaks
        userInput.close();
    }
}

