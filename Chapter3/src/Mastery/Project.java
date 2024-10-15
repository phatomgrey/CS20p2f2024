package Mastery;

import java.util.Scanner;


public class Project {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // Get time inputs
        System.out.print("Designing time: ");
        double designing = input.nextDouble();
        System.out.print("Coding time: ");
        double coding = input.nextDouble();
        System.out.print("Debugging time: ");
        double debugging = input.nextDouble();
        System.out.print("Testing time: ");
        double testing = input.nextDouble();


        // Calculate total time and percentages
        double total = designing + coding + debugging + testing;
        System.out.printf("Designing: %.2f%%\n", (designing / total) * 100);
        System.out.printf("Coding: %.2f%%\n", (coding / total) * 100);
        System.out.printf("Debugging: %.2f%%\n", (debugging / total) * 100);
        System.out.printf("Testing: %.2f%%\n", (testing / total) * 100);


        input.close();
    }
}
