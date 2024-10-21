package Skillbuilders;

import java.util.Scanner;

public class Exponentiation {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the base number
        System.out.print("Enter the base number: ");
        double base = scanner.nextDouble();

        // Prompt the user for the exponent number
        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();

        // Call the powerOf method and store the result
        double result = powerOf(base, exponent);

        // Display the result
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        // Close the scanner
        scanner.close();
    }

    // Method to return the base raised to the power of the exponent
    public static double powerOf(double base, double exponent) {
        return Math.pow(base, exponent); // Using Java's built-in Math.pow() for exponentiation
    }
}
