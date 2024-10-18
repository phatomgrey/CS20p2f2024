package Skillbuilders;

import java.util.Scanner;

public class TimeConverter {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Display the conversion options
        System.out.println("Time Conversion Options:");
        System.out.println("1. Convert hours to minutes");
        System.out.println("2. Convert days to hours");
        System.out.println("3. Convert minutes to hours");
        System.out.println("4. Convert hours to days");

        // Prompt the user to choose an option
        System.out.print("Choose an option (1-4): ");
        int choice = scanner.nextInt();

        // Switch case for different conversions
        switch (choice) {
            case 1:
                // Hours to minutes
                System.out.print("Enter the number of hours: ");
                double hours = scanner.nextDouble();
                double minutes = convertHoursToMinutes(hours);
                System.out.println(hours + " hours is equal to " + minutes + " minutes.");
                break;
            case 2:
                // Days to hours
                System.out.print("Enter the number of days: ");
                double days = scanner.nextDouble();
                double hoursInDays = convertDaysToHours(days);
                System.out.println(days + " days is equal to " + hoursInDays + " hours.");
                break;
            case 3:
                // Minutes to hours
                System.out.print("Enter the number of minutes: ");
                double totalMinutes = scanner.nextDouble();
                double hoursFromMinutes = convertMinutesToHours(totalMinutes);
                System.out.println(totalMinutes + " minutes is equal to " + hoursFromMinutes + " hours.");
                break;
            case 4:
                // Hours to days
                System.out.print("Enter the number of hours: ");
                double totalHours = scanner.nextDouble();
                double daysFromHours = convertHoursToDays(totalHours);
                System.out.println(totalHours + " hours is equal to " + daysFromHours + " days.");
                break;
            default:
                // Invalid option
                System.out.println("Invalid option. Please choose a number between 1 and 4.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to convert hours to minutes
    public static double convertHoursToMinutes(double hours) {
        return hours * 60;
    }

    // Method to convert days to hours
    public static double convertDaysToHours(double days) {
        return days * 24;
    }

    // Method to convert minutes to hours
    public static double convertMinutesToHours(double minutes) {
        return minutes / 60;
    }

    // Method to convert hours to days
    public static double convertHoursToDays(double hours) {
        return hours / 24;
    }
}

