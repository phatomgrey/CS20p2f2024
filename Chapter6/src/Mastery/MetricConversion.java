





package Mastery;

import java.util.Scanner;

public class MetricConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
        int choice; // Variable to store user's menu choice

        // Display the menu and prompt the user to choose a conversion option
        do {
            System.out.println("Metric Conversion Menu:");
            System.out.println("1. Inches to Centimeters");
            System.out.println("2. Centimeters to Inches");
            System.out.println("3. Feet to Centimeters");
            System.out.println("4. Centimeters to Feet");
            System.out.println("5. Yards to Meters");
            System.out.println("6. Meters to Yards");
            System.out.println("7. Miles to Kilometers");
            System.out.println("8. Kilometers to Miles");
            System.out.println("9. Exit");
            System.out.print("Choose an option (1-9): ");
            choice = scanner.nextInt(); // Read the user's choice

            // Switch statement to handle each conversion option
            switch (choice) {
                case 1:
                    // Inches to Centimeters conversion
                    System.out.print("Enter inches: ");
                    double inches = scanner.nextDouble();
                    System.out.println(inches + " inches = " + inchesToCentimeters(inches) + " centimeters");
                    break;
                case 2:
                    // Centimeters to Inches conversion
                    System.out.print("Enter centimeters: ");
                    double cmToInches = scanner.nextDouble();
                    System.out.println(cmToInches + " centimeters = " + centimetersToInches(cmToInches) + " inches");
                    break;
                case 3:
                    // Feet to Centimeters conversion
                    System.out.print("Enter feet: ");
                    double feet = scanner.nextDouble();
                    System.out.println(feet + " feet = " + feetToCentimeters(feet) + " centimeters");
                    break;
                case 4:
                    // Centimeters to Feet conversion
                    System.out.print("Enter centimeters: ");
                    double cmToFeet = scanner.nextDouble();
                    System.out.println(cmToFeet + " centimeters = " + centimetersToFeet(cmToFeet) + " feet");
                    break;
                case 5:
                    // Yards to Meters conversion
                    System.out.print("Enter yards: ");
                    double yards = scanner.nextDouble();
                    System.out.println(yards + " yards = " + yardsToMeters(yards) + " meters");
                    break;
                case 6:
                    // Meters to Yards conversion
                    System.out.print("Enter meters: ");
                    double metersToYards = scanner.nextDouble();
                    System.out.println(metersToYards + " meters = " + metersToYards(metersToYards) + " yards");
                    break;
                case 7:
                    // Miles to Kilometers conversion
                    System.out.print("Enter miles: ");
                    double miles = scanner.nextDouble();
                    System.out.println(miles + " miles = " + milesToKilometers(miles) + " kilometers");
                    break;
                case 8:
                    // Kilometers to Miles conversion
                    System.out.print("Enter kilometers: ");
                    double kilometers = scanner.nextDouble();
                    System.out.println(kilometers + " kilometers = " + kilometersToMiles(kilometers) + " miles");
                    break;
                case 9:
                    // Exit the program
                    System.out.println("Exiting the program.");
                    break;
                default:
                    // Handle invalid menu choices
                    System.out.println("Invalid choice. Please choose again.");
            }

            System.out.println(); // Print a blank line for readability

        } while (choice != 9); // Continue until the user chooses to exit

        scanner.close(); // Close the scanner to prevent resource leaks
    }

    // Conversion methods

    // Converts inches to centimeters
    public static double inchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    // Converts centimeters to inches
    public static double centimetersToInches(double centimeters) {
        return centimeters / 2.54;
    }

    // Converts feet to centimeters
    public static double feetToCentimeters(double feet) {
        return feet * 30.48;
    }

    // Converts centimeters to feet
    public static double centimetersToFeet(double centimeters) {
        return centimeters / 30.48;
    }

    // Converts yards to meters
    public static double yardsToMeters(double yards) {
        return yards * 0.9144;
    }

    // Converts meters to yards
    public static double metersToYards(double meters) {
        return meters / 0.9144;
    }

    // Converts miles to kilometers
    public static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }

    // Converts kilometers to miles
    public static double kilometersToMiles(double kilometers) {
        return kilometers / 1.60934;
    }
}



/* Screen Dump

Metric Conversion Menu:
1. Inches to Centimeters
2. Centimeters to Inches
3. Feet to Centimeters
4. Centimeters to Feet
5. Yards to Meters
6. Meters to Yards
7. Miles to Kilometers
8. Kilometers to Miles
9. Exit
Choose an option (1-9): 2
Enter centimeters: 31
31.0 centimeters = 12.204724409448819 inches

Metric Conversion Menu:
1. Inches to Centimeters
2. Centimeters to Inches
3. Feet to Centimeters
4. Centimeters to Feet
5. Yards to Meters
6. Meters to Yards
7. Miles to Kilometers
8. Kilometers to Miles
9. Exit
Choose an option (1-9): 9
Exiting the program.

*/







