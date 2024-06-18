// THIS IS THE SECOND PROJECT:- A STUDENT GRADE CALCULATOR

import java.util.Scanner;

public class StudentGrades {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        if (numSubjects <= 0) {
            System.out.println("The number of subjects must be greater than zero.");
            return;
        }

        // Array to store marks of each subject
        int[] marks = new int[numSubjects];
        int totalMarks = 0;

        // Input marks for each subject
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            int mark = scanner.nextInt();

            if (mark < 0 || mark > 100) {
                System.out.println("Invalid mark entered. Please enter a mark between 0 and 100.");
                i--; 
                continue;
            }

            marks[i] = mark;
            totalMarks += mark;
        }

        // average percentage calculation 
        double averagePercentage = (double) totalMarks / numSubjects;

        // grade on based on the avg percentage
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // TO DISPLAY THE RESULTS
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        // Closing scanner
        scanner.close();
    }
}
