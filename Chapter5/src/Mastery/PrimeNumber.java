package Mastery;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner userInput = new Scanner(System.in);

        // Prompt the user for two numbers (range)
        System.out.print("Enter the starting number: ");
        int start = userInput.nextInt();

        System.out.print("Enter the ending number: ");
        int end = userInput.nextInt();

        // Display the prime numbers between start and end
        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }

        // Close the scanner to prevent resource leaks
        userInput.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // If divisible by any number other than 1 and itself, not prime
            }
        }
        return true; // If no divisors, the number is prime
    }
}
