package Skillbuilder;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner userInput = new Scanner(System.in);

        // Prompt the user for minimum and maximum values
        System.out.print("Enter the minimum value: ");
        int min = userInput.nextInt();

        System.out.print("Enter the maximum value: ");
        int max = userInput.nextInt();

        // Validate if max is greater than min
        if (max < min) {
            System.out.println("Maximum value must be greater than or equal to the minimum value.");
        } else {
            // Generate a random number between min and max (inclusive)
            Random random = new Random();
            int randomNum = random.nextInt((max - min) + 1) + min;

            // Display the random number
            System.out.println("Random number between " + min + " and " + max + ": " + randomNum);
        }

        // Close the scanner to prevent resource leaks
        userInput.close();
    }
}
