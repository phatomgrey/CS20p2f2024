/*

Program: class CourseGrades_Mastery.java          Date: December 9, 2024

Author: Ahamid Adam
Purpose: An application that Lets you input the test grade of 12 students and see there average


School: CHHS
Course: Computer Science 20

*/

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


/* Screen Dump

Enter grades for Student 1:
Test 1: 90
Test 2: 98
Test 3: 92
Test 4: 93
Test 5: 94
Enter grades for Student 2:
Test 1: 50
Test 2: 67
Test 3: 69
Test 4: 61
Test 5: 57
Enter grades for Student 3:
Test 1: 70
Test 2: 71
Test 3: 81
Test 4: 78
Test 5: 79
Enter grades for Student 4:
Test 1: 81
Test 2: 91
Test 3: 86
Test 4: 87
Test 5: 88
Enter grades for Student 5:
Test 1: 100
Test 2: 91
Test 3: 92
Test 4: 93
Test 5: 98
Enter grades for Student 6:
Test 1: 32
Test 2: 45
Test 3: 50
Test 4: 57
Test 5: 52
Enter grades for Student 7:
Test 1: 12
Test 2: 23
Test 3: 24
Test 4: 16
Test 5: 19
Enter grades for Student 8:
Test 1: 34
Test 2: 45
Test 3: 32
Test 4: 38
Test 5: 47
Enter grades for Student 9:
Test 1: 71
Test 2: 87
Test 3: 91
Test 4: 52
Test 5: 61
Enter grades for Student 10:
Test 1: 12
Test 2: 100
Test 3: 81
Test 4: 72
Test 5: 34
Enter grades for Student 11:
Test 1: 45
Test 2: 67
Test 3: 89
Test 4: 78
Test 5: 79
Enter grades for Student 12:
Test 1: 12
Test 2: 34
Test 3: 56
Test 4: 78
Test 5: 90
Grades:
Student 1: 90 98 92 93 94 
Student 2: 50 67 69 61 57 
Student 3: 70 71 81 78 79 
Student 4: 81 91 86 87 88 
Student 5: 100 91 92 93 98 
Student 6: 32 45 50 57 52 
Student 7: 12 23 24 16 19 
Student 8: 34 45 32 38 47 
Student 9: 71 87 91 52 61 
Student 10: 12 100 81 72 34 
Student 11: 45 67 89 78 79 
Student 12: 12 34 56 78 90 
Average grade for Student 1: 93.4
Average grade for Student 2: 60.8
Average grade for Student 3: 75.8
Average grade for Student 4: 86.6
Average grade for Student 5: 94.8
Average grade for Student 6: 47.2
Average grade for Student 7: 18.8
Average grade for Student 8: 39.2
Average grade for Student 9: 72.4
Average grade for Student 10: 59.8
Average grade for Student 11: 71.6
Average grade for Student 12: 54.0
Average grade for Test 1: 50.75
Average grade for Test 2: 68.25
Average grade for Test 3: 70.25
Average grade for Test 4: 66.91666666666667
Average grade for Test 5: 66.5




*/