package Skillbuilder;

import java.util.Scanner;

public class Delivery {

    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner userInput = new Scanner(System.in);

        // Prompt the user for the dimensions of the package
        System.out.print("Enter the length of the package: ");
        double length = userInput.nextDouble(); // Changed to nextDouble() for better consistency

        System.out.print("Enter the width of the package: ");
        double width = userInput.nextDouble();

        System.out.print("Enter the height of the package: ");
        double height = userInput.nextDouble();

        // Check dimensions and display result
        if (length > 10 || width > 10 || height > 10) {
            System.out.println("Reject");
        } else {
            System.out.println("Accept");
        }

        // Close the scanner to avoid resource leaks
        userInput.close();
    }
}
