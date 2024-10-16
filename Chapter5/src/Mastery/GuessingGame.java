
/*
Ahamid Adam
Program:  GuessingGame_Mastery.java          Date: October 16, 2024


Purpose: An application that Lets the user guess for a secret number.


School: CHHS
Course: Computer Science 20

*/

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

        int playerGuess = 0;

        // Loop to allow the player to keep guessing until the correct number is guessed
        while (playerGuess != secretNumber) {
            // Prompt the player to guess the number
            System.out.print("Guess a number between 1 and 20: ");
            playerGuess = scanner.nextInt();

            // Provide feedback to guide the player
            if (playerGuess < secretNumber) {
                System.out.println("Try again.");
            } else if (playerGuess > secretNumber) {
                System.out.println("Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number!");
            }
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }

}
         
/* Screen Dump

Guess a number between 1 and 20: 1
Try again.
Guess a number between 1 and 20: 2
Congratulations! You guessed the correct number!



*/
        

       
        