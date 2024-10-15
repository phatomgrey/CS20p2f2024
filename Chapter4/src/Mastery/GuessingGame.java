package Mastery;


import java.util.Random;
import java.util.Scanner;


public class GuessingGame {


    public static void main(String[] args) {


        // Create a random number generator and scanner for user input
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        // Generate a secret number between 1 and 20
        int secretNumber = random.nextInt(20) + 1;


        // Prompt the player to guess the number
        System.out.print("Guess a number between 1 and 20: ");
        int playerGuess = scanner.nextInt();


        // Display the player's guess and the secret number
        System.out.println("Your guess: " + playerGuess);
        System.out.println("Secret number: " + secretNumber);


        // Check if the player's guess matches the secret number
        if (playerGuess == secretNumber) {
            System.out.println("Congratulations! You guessed the correct number!");
        } else {
            System.out.println("Better luck next time.");
        }


        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
