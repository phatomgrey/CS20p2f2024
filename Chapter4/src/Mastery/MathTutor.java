package Mastery;


import java.util.Random;
import java.util.Scanner;


public class MathTutor {


    public static void main(String[] args) {


        // Create Random and Scanner objects for generating numbers and getting user input
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        // Generate two random single-digit numbers
        int num1 = random.nextInt(10);
        int num2 = random.nextInt(10);
        String operator = getRandomOperator(random);


        // Handle division to avoid division by zero
        if (operator.equals("/") && num2 == 0) {
            num2 = 1; // Avoid division by zero by setting num2 to 1
        }


        // Create and display the equation
        String equation = num1 + " " + operator + " " + num2;
        System.out.println("What is " + equation + "?");


        // Calculate the correct answer
        int correctAnswer = calculateAnswer(num1, num2, operator);


        // Get user input for their answer
        System.out.print("Your answer: ");
        int userAnswer = scanner.nextInt();


        // Check if the user's answer is correct
        if (userAnswer == correctAnswer) {
            System.out.println("Correct! Amazing job.");
        } else {
            System.out.println("Oh no... Wrong! The correct answer is: " + correctAnswer);
        }


        // Close the scanner to prevent resource leak
        scanner.close();
    }


    // Helper method to get a random operator
    private static String getRandomOperator(Random random) {
        String[] operators = {"+", "-", "*", "/"};
        return operators[random.nextInt(operators.length)];
    }


    // Helper method to calculate the answer based on the operator
    private static int calculateAnswer(int num1, int num2, String operator) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2; // Integer division for simplicity
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }
}
