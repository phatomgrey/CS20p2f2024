package SkillBuilders;

public class Reverse {

    public static void main(String[] args) {
        // Create an array to store 10 elements
        int[] numbers = new int[10];

        // Populate the array with values equal to their indices
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        // Display the title
        System.out.println("Countdown:");

        // Display numbers in reverse order
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
