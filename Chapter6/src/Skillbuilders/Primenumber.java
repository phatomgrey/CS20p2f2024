
/*

Program Primenumber.java          Last Date of this Revision: November 18, 224

Purpose: An application that gets the prime number in between two digits

Author: Ahamid Adam
School: CHHS
Course: Computer Programming 20
 

*/
package Skillbuilders;

import java.util.Scanner;

public class Primenumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt the user for two numbers
        System.out.print("Enter the first number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int end = scanner.nextInt();

        // Display prime numbers between the two numbers
        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }

        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) { // Check up to the square root of num
            if (num % i == 0) {
                return false; // If divisible by any number other than 1 and itself, it's not prime
            }
        }
        return true; // If no divisors found, it's prime
    }
}




/* Screen Dump

Enter the first number: 21
Enter the second number: 69
Prime numbers between 21 and 69:
23
29
31
37
41
43
47
53
59
61
67



*/