package Skillbuilders;

import java.util.Scanner;

public class NumberSum {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner userInput = new Scanner(System.in);

        // Prompt the user for a number
        System.out.print("Enter a number: ");
        int number = userInput.nextInt();

        int sum = 0;

        // Display numbers from 1 to the entered number and calculate the sum
        System.out.println("Numbers from 1 to " + number + ":");
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
            sum += i; // Add the current number to the sum
        }

        // Display the sum below the numbers
        System.out.println("Sum: " + sum);

        // Close the scanner to prevent resource leaks
        userInput.close();
    }
}
