package src;

import java.util.Scanner;

public class PassPercentage {
    public static void main(String[] args) {
        int finalScores = 0;
        int students = 100;
        int passPercentage;
        int subjectCount = 7;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter scores for " + subjectCount + " subjects for each student:");

        for (int student = 1; student <= students; student++) {
            System.out.println("Student " + student + ": ");
            int studentScores = 0; // Initialize studentScores outside the inner loop

            for (int subject = 1; subject <= subjectCount; subject++) {
                System.out.println("Enter score for subject " + subject + ": ");
                int score = scanner.nextInt();
                studentScores += score; // Accumulate scores for each subject
            }

            if (studentScores >= subjectCount * 40) {
                finalScores++; // Increment the number of students who passed
            }
        }

        passPercentage = (finalScores * 100) / students;
        System.out.println("Pass percentage: " + passPercentage + "%");
    }
}
