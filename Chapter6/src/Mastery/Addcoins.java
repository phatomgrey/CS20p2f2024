/*

Program: Addcoins_Mastery.java          Date: October 29, 2024

Author: Ahamid Adam
Purpose: An application that takes a amount of coins and gets a dollar amount.


School: CHHS
Course: Computer Science 20

*/


package Mastery;

import java.util.Scanner;

public class Addcoins {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of pennies, nickels, dimes, and quarters
        System.out.print("Enter the number of pennies: ");
        int pennies = scanner.nextInt();

        System.out.print("Enter the number of nickels: ");
        int nickels = scanner.nextInt();

        System.out.print("Enter the number of dimes: ");
        int dimes = scanner.nextInt();

        System.out.print("Enter the number of quarters: ");
        int quarters = scanner.nextInt();

        // Call the getDollarAmount method and display the total dollar amount
        String totalAmount = getDollarAmount(pennies, nickels, dimes, quarters);
        System.out.println("Total dollar amount: " + totalAmount);

        scanner.close();
    }

    // Method to calculate the total dollar amount of coins
    public static String getDollarAmount(int pennies, int nickels, int dimes, int quarters) {
        // Calculate the dollar value of each coin type
        double total = pennies * 0.01 + nickels * 0.05 + dimes * 0.10 + quarters * 0.25;
        // Format the result as a String with a currency sign and 2 decimal places
        return String.format("$%.2f", total);
    }
}

/* Screen Dump

Enter the number of pennies: 20
Enter the number of nickels: 27
Enter the number of dimes: 35
Enter the number of quarters: 37
Total dollar amount: $14.30


*/