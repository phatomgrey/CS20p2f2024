package Mastery;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EvensAndOdds {
    public static void main(String[] args) {
        // Create a Random object
        Random random = new Random();
        
        // Lists to store even and odd numbers
        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();
        
        // Generate 25 random numbers between 0 and 99
        for (int i = 0; i < 25; i++) {
            int number = random.nextInt(100); // Generates a number between 0 and 99
            
            if (number % 2 == 0) {
                evens.add(number);
            } else {
                odds.add(number);
            }
        }
        
        // Display even numbers
        System.out.print("EVEN: ");
        for (int num : evens) {
            System.out.print(num + " ");
        }
        System.out.println(); // Move to the next line
        
        // Display odd numbers
        System.out.print("ODD: ");
        for (int num : odds) {
            System.out.print(num + " ");
        }
    }
}
