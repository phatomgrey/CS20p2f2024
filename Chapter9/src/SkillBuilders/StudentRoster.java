package SkillBuilders;

import java.util.Scanner;

public class StudentRoster {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of students
        System.out.print("Enter the number of students in the class: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Create an array to store student names
        String[] studentNames = new String[numStudents];

        // Collect names from the user
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            studentNames[i] = scanner.nextLine();
        }

        // Display the title
        System.out.println("\nStudent Roster:");

        // Display names in original order
        for (String name : studentNames) {
            System.out.println(name);
        }

        // Display names in reverse order
        System.out.println("\nStudent Roster (Reverse Order):");
        for (int i = studentNames.length - 1; i >= 0; i--) {
            System.out.println(studentNames[i]);
        }

        // Close the scanner
        scanner.close();
    }
}
