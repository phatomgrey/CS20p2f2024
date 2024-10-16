/*
Ahamid Adam
Program: GroupAssignment_Mastery.java          Date: October 16, 2024


Purpose: An application that puts people into groups based on there names.


School: CHHS
Course: Computer Science 20

*/

package Mastery;

import java.util.Scanner;

public class GroupAssignment {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner userInput = new Scanner(System.in);

        // Prompt the user for their first and last name
        System.out.print("Enter your first name: ");
        String firstName = userInput.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = userInput.nextLine();

        // Get the first letter of the last name and convert it to uppercase
        char firstLetter = Character.toUpperCase(lastName.charAt(0));

        // Determine the group assignment based on the first letter of the last name
        String group;
        if (firstLetter >= 'A' && firstLetter <= 'I') {
            group = "Group 1";
        } else if (firstLetter >= 'J' && firstLetter <= 'S') {
            group = "Group 2";
        } else if (firstLetter >= 'T' && firstLetter <= 'Z') {
            group = "Group 3";
        } else {
            group = "Unknown Group"; // Edge case handling
        }

        // Display the group assignment
        System.out.println(firstName + " " + lastName + " is assigned to " + group + ".");

        // Close the scanner to avoid resource leak
        userInput.close();
    }
}

/* Screen Dump

Enter your first name: Ahamid
Enter your last name: Adam
Ahamid Adam is assigned to Group 1.

*/