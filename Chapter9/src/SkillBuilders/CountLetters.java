package SkillBuilders;

import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        final int LOW = 'A';  // smallest possible value
        final int HIGH = 'Z'; // highest possible value
        int[] letterCounts = new int[HIGH - LOW + 1]; // array to count letters
        Scanner input = new Scanner(System.in);

        // Prompt user for a phrase
        System.out.print("Enter a phrase: ");
        String phrase = input.nextLine();

        // Convert phrase to uppercase and iterate through it
        phrase = phrase.toUpperCase();
        for (int i = 0; i < phrase.length(); i++) {
            char c = phrase.charAt(i);
            if (c >= LOW && c <= HIGH) { // Check if character is a letter
                int offset = c - LOW;    // Calculate array index
                letterCounts[offset]++; // Increment count for the letter
            }
        }

        // Display the letter occurrences
        System.out.println("\nLetter occurrences:");
        for (int i = LOW; i <= HIGH; i++) {
            System.out.println((char) i + ": " + letterCounts[i - LOW]);
        }

        input.close();
    }
}

