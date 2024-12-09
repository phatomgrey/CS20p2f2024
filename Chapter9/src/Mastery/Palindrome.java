/*

Program: class Palindrome_Mastery.java          Date: December 6, 2024

Author: Ahamid Adam
Purpose: An application that Lets you see if a word is a class Palindrome or not.


School: CHHS
Course: Computer Science 20

*/


package Mastery;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a string
        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine();

        // Remove non-alphanumeric characters and convert to lowercase
        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check if the cleaned input is a palindrome
        if (isPalindrome(cleanedInput)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

/* Screen Dump

Enter a string to check if it's a palindrome: dad
"dad" is a palindrome.


Enter a string to check if it's a palindrome: ahamid
"ahamid" is not a palindrome.



*/