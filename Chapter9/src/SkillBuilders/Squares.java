package SkillBuilders;

public class Squares {

    public static void main(String[] args) {
        // Create an array to store 5 elements
        int[] squares = new int[5];

        // Populate the array with squares of the index
        for (int i = 0; i < squares.length; i++) {
            squares[i] = i * i; // Square of the index
        }

        // Display the values of each element in the array
        System.out.println("Squares of the indices:");
        for (int i = 0; i < squares.length; i++) {
            System.out.println("Index " + i + ": " + squares[i]);
        }
    }
}

