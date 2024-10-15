package Skillbuilders;
import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner userInput = new Scanner(System.in);

        // Prompt user for five grades
        System.out.print("Please enter your first grade: ");
        int firstGrade = userInput.nextInt();

        System.out.print("Please enter your second grade: ");
        int secondGrade = userInput.nextInt();

        System.out.print("Please enter your third grade: ");
        int thirdGrade = userInput.nextInt();

        System.out.print("Please enter your fourth grade: ");
        int fourthGrade = userInput.nextInt();

        System.out.print("Please enter your fifth grade: ");
        int fifthGrade = userInput.nextInt();

        // Calculate total and average
        int total = firstGrade + secondGrade + thirdGrade + fourthGrade + fifthGrade;
        int average = total / 5;

        // Display the average
        System.out.println("The average of your grades is: " + average);

        // Close the scanner
        userInput.close();
    }
}
