package Mastery;

import java.util.Scanner;

public class DigitExtractor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for an integer
        System.out.print("Enter an integer: ");
        int userInput = scanner.nextInt();

        // Create a Num object
        Num num = new Num(userInput);

        int choice;
        do {
            // Display menu options
            System.out.println("\nMenu:");
            System.out.println("1. Show the ones digit");
            System.out.println("2. Show the tens digit");
            System.out.println("3. Show the hundreds digit");
            System.out.println("4. Show the whole number");
            System.out.println("0. Quit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            // Process user choice
            switch (choice) {
                case 1:
                    System.out.println("Ones digit: " + num.getOnesDigit());
                    break;
                case 2:
                    System.out.println("Tens digit: " + num.getTensDigit());
                    break;
                case 3:
                    System.out.println("Hundreds digit: " + num.getHundredsDigit());
                    break;
                case 4:
                    System.out.println("The whole number is: " + num.getNumber());
                    break;
                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);

        // Close the scanner
        scanner.close();
    }
}
