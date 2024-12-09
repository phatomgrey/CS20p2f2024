/*

Program: EvensAndOdds_Mastery.java          Date: December 2, 2024

Author: Ahamid Adam
Purpose: An application that Lets you see how many of 25 numbers are even or odd


School: CHHS
Course: Computer Science 20

*/



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

/* Screen Dump

EVEN: 40 82 94 68 64 14 96 70 24 82 18 14 60 58 34 22 
ODD: 51 1 33 53 93 53 17 5 69 



*/