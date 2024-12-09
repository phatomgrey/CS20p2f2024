package Mastery;

import java.util.Scanner;

public class CourseGrades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Number of students and tests
        int students = 12;
        int tests = 5;

        // Create a GradeBook object
        GradeBook gradeBook = new GradeBook(students, tests);

        // Input grades for all students and tests
        for (int student = 0; student < students; student++) {
            System.out.println("Enter grades for Student " + (student + 1) + ":");
            for (int test = 0; test < tests; test++) {
                System.out.print("Test " + (test + 1) + ": ");
                int grade = scanner.nextInt();
                gradeBook.setGrade(student, test, grade);
            }
        }

        // Display all grades
        gradeBook.showGrades();

        // Calculate and display average grades for each student
        for (int student = 0; student < students; student++) {
            System.out.println("Average grade for Student " + (student + 1) + ": " +
                    gradeBook.studentAvg(student));
        }

        // Calculate and display average grades for each test
        for (int test = 0; test < tests; test++) {
            System.out.println("Average grade for Test " + (test + 1) + ": " +
                    gradeBook.testAvg(test));
        }

        scanner.close();
    }
}
