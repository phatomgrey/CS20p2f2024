package Mastery;

import java.util.Scanner;

public class LunchOrder {

    public static void main(String[] args) {
        // Initialize food items with their price and nutritional information
        Food hamburger = new Food(1.85, 9, 33, 1);
        Food salad = new Food(2.00, 1, 11, 5);
        Food frenchFries = new Food(1.30, 11, 36, 4);
        Food soda = new Food(0.95, 0, 38, 0);

        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the quantity of each item
        System.out.print("Enter the number of hamburgers: ");
        int hamburgerCount = scanner.nextInt();

        System.out.print("Enter the number of salads: ");
        int saladCount = scanner.nextInt();

        System.out.print("Enter the number of French fries: ");
        int frenchFriesCount = scanner.nextInt();

        System.out.print("Enter the number of sodas: ");
        int sodaCount = scanner.nextInt();

        // Calculate totals
        double totalPrice = (hamburger.getPrice() * hamburgerCount) +
                            (salad.getPrice() * saladCount) +
                            (frenchFries.getPrice() * frenchFriesCount) +
                            (soda.getPrice() * sodaCount);

        // Separate nutritional calculations
        int hamburgerFat = hamburger.getFat() * hamburgerCount;
        int hamburgerCarbs = hamburger.getCarbs() * hamburgerCount;
        int hamburgerFiber = hamburger.getFiber() * hamburgerCount;

        int saladFat = salad.getFat() * saladCount;
        int saladCarbs = salad.getCarbs() * saladCount;
        int saladFiber = salad.getFiber() * saladCount;

        int friesFat = frenchFries.getFat() * frenchFriesCount;
        int friesCarbs = frenchFries.getCarbs() * frenchFriesCount;
        int friesFiber = frenchFries.getFiber() * frenchFriesCount;

        int sodaFat = soda.getFat() * sodaCount;
        int sodaCarbs = soda.getCarbs() * sodaCount;
        int sodaFiber = soda.getFiber() * sodaCount;

        // Display the order summary for each item
        System.out.println("\nOrder Summary:");

        System.out.println("\nHamburgers:");
        System.out.println("  Fat: " + hamburgerFat + "g");
        System.out.println("  Carbs: " + hamburgerCarbs + "g");
        System.out.println("  Fiber: " + hamburgerFiber + "g");

        System.out.println("\nSalads:");
        System.out.println("  Fat: " + saladFat + "g");
        System.out.println("  Carbs: " + saladCarbs + "g");
        System.out.println("  Fiber: " + saladFiber + "g");

        System.out.println("\nFrench Fries:");
        System.out.println("  Fat: " + friesFat + "g");
        System.out.println("  Carbs: " + friesCarbs + "g");
        System.out.println("  Fiber: " + friesFiber + "g");

        System.out.println("\nSodas:");
        System.out.println("  Fat: " + sodaFat + "g");
        System.out.println("  Carbs: " + sodaCarbs + "g");
        System.out.println("  Fiber: " + sodaFiber + "g");

        // Display totals
        System.out.printf("\nTotal price: $%.2f%n", totalPrice);
        System.out.println("Total fat: " + (hamburgerFat + saladFat + friesFat + sodaFat) + "g");
        System.out.println("Total carbohydrates: " + (hamburgerCarbs + saladCarbs + friesCarbs + sodaCarbs) + "g");
        System.out.println("Total fiber: " + (hamburgerFiber + saladFiber + friesFiber + sodaFiber) + "g");

        // Close the scanner
        scanner.close();
    }
}
