package Mastery;

public class GradeBook {
    private int[][] grades; // Two-dimensional array to store grades

    // Constructor to initialize grades array
    public GradeBook(int students, int tests) {
        grades = new int[students][tests];
    }

    // Method to set a grade for a specific student and test
    public void setGrade(int student, int test, int grade) {
        grades[student][test] = grade;
    }

    // Method to display all grades
    public void showGrades() {
        System.out.println("Grades:");
        for (int student = 0; student < grades.length; student++) {
            System.out.print("Student " + (student + 1) + ": ");
            for (int test = 0; test < grades[student].length; test++) {
                System.out.print(grades[student][test] + " ");
            }
            System.out.println();
        }
    }

    // Method to calculate the average grade for a specific student
    public double studentAvg(int student) {
        int total = 0;
        for (int test : grades[student]) {
            total += test;
        }
        return total / (double) grades[student].length;
    }

    // Method to calculate the average grade for a specific test
    public double testAvg(int test) {
        int total = 0;
        for (int[] studentGrades : grades) {
            total += studentGrades[test];
        }
        return total / (double) grades.length;
    }
}
