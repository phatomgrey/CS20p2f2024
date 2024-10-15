package Skillbuilders;
import java.util.Scanner;

public class Digit{
    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner userInput = new Scanner(System.in);
        
        // Prompt the user to enter a 3-digit number
        System.out.print("Please enter a 3-digit number: ");
        int number = userInput.nextInt();

        // Extract the hundreds, tens, and ones places
        int HundredsPlace = (number / 100);       // Extract the hundreds place
        int TensPlace = (number / 10) % 10;       // Extract the tens place
        int OnesPlace = number % 10;              // Extract the ones place

        // Display the result
        System.out.println("The hundreds place is: " + HundredsPlace);
        System.out.println("The tens place is: " + TensPlace);
        System.out.println("The ones place is: " + OnesPlace);
        
        // Close the Scanner object
        userInput.close();
    }
}
