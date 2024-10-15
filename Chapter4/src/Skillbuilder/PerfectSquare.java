package Skillbuilder;

import java.util.Scanner;

public class PerfectSquare {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner userInput = new Scanner(System.in);

        // Prompt the user for an integer
        System.out.print("Enter an integer: ");
        int number = userInput.nextInt();

        // Calculate the square root and truncate to an integer
        int squareRoot = (int) Math.sqrt(number);

        // Check if the square of the truncated value equals the original number
        if (number >= 0 && squareRoot * squareRoot == number) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }

        // Close the scanner to prevent resource leaks
        userInput.close();
    }
}
