package Mastery;
import java.util.Scanner;

public class Quadratics {

    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner userInput = new Scanner(System.in);

        // Prompt the user for values of a, b, and c
        System.out.print("Enter value for a: ");
        double a = userInput.nextDouble(); // Changed to nextDouble() for consistency
        System.out.print("Enter value for b: ");
        double b = userInput.nextDouble();
        System.out.print("Enter value for c: ");
        double c = userInput.nextDouble();

        // Calculate the discriminant
        double discriminant = b * b - 4 * a * c;

        // Determine the nature of the roots based on the discriminant
        if (discriminant > 0) {
            // Two real and distinct roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("Roots are real and different.%nRoot 1: %.2f%nRoot 2: %.2f%n", root1, root2);
        } else if (discriminant == 0) {
            // One real root (double root)
            double root = -b / (2 * a);
            System.out.printf("Roots are real and the same.%nRoot: %.2f%n", root);
        } else {
            // Complex roots
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.printf("Roots are complex.%nRoot 1: %.2f + %.2fi%nRoot 2: %.2f - %.2fi%n", realPart, imaginaryPart, realPart, imaginaryPart);
        }

        // Close the scanner
        userInput.close();
    }
}

