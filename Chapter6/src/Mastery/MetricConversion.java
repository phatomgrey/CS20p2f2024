





package Mastery;

import java.util.Scanner;

public class MetricConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Display the menu
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
            choice = scanner.nextInt();

            // Handle user choice
            switch (choice) {
                case 1:
                    System.out.print("Enter inches: ");
                    double inches = scanner.nextDouble();
                    System.out.println(inches + " inches = " + inchesToCentimeters(inches) + " centimeters");
                    break;
                case 2:
                    System.out.print("Enter centimeters: ");
                    double cmToInches = scanner.nextDouble();
                    System.out.println(cmToInches + " centimeters = " + centimetersToInches(cmToInches) + " inches");
                    break;
                case 3:
                    System.out.print("Enter feet: ");
                    double feet = scanner.nextDouble();
                    System.out.println(feet + " feet = " + feetToCentimeters(feet) + " centimeters");
                    break;
                case 4:
                    System.out.print("Enter centimeters: ");
                    double cmToFeet = scanner.nextDouble();
                    System.out.println(cmToFeet + " centimeters = " + centimetersToFeet(cmToFeet) + " feet");
                    break;
                case 5:
                    System.out.print("Enter yards: ");
                    double yards = scanner.nextDouble();
                    System.out.println(yards + " yards = " + yardsToMeters(yards) + " meters");
                    break;
                case 6:
                    System.out.print("Enter meters: ");
                    double metersToYards = scanner.nextDouble();
                    System.out.println(metersToYards + " meters = " + metersToYards(metersToYards) + " yards");
                    break;
                case 7:
                    System.out.print("Enter miles: ");
                    double miles = scanner.nextDouble();
                    System.out.println(miles + " miles = " + milesToKilometers(miles) + " kilometers");
                    break;
                case 8:
                    System.out.print("Enter kilometers: ");
                    double kilometers = scanner.nextDouble();
                    System.out.println(kilometers + " kilometers = " + kilometersToMiles(kilometers) + " miles");
                    break;
                case 9:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }

            System.out.println();

        } while (choice != 9);

        scanner.close();
    }

    // Conversion methods

    public static double inchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    public static double centimetersToInches(double centimeters) {
        return centimeters / 2.54;
    }

    public static double feetToCentimeters(double feet) {
        return feet * 30.48;
    }

    public static double centimetersToFeet(double centimeters) {
        return centimeters / 30.48;
    }

    public static double yardsToMeters(double yards) {
        return yards * 0.9144;
    }

    public static double metersToYards(double meters) {
        return meters / 0.9144;
    }

    public static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }

    public static double kilometersToMiles(double kilometers) {
        return kilometers / 1.60934;
    }
}
