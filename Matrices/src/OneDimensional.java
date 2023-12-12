package Matrices.src;

import java.util.Scanner;

public class OneDimensional {

    public static void main(String[] args) {
        // Create an array to store grades for 10 subjects
        int[] grades = new int[10];

        // Read grades from the keyboard
        readGrades(grades);

        // Calculate and display the average grade
        double average = calculateAverage(grades);
        System.out.println("Average Grade: " + average);

        // Display grades below the average
        displayBelowAverage(grades, average);
    }

    private static void readGrades(int[] grades) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter grades for 10 subjects:");

        for (int i = 0; i < grades.length; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }

        scanner.close();
    }

    private static double calculateAverage(int[] grades) {
        int sum = 0;

        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.length;
    }

    private static void displayBelowAverage(int[] grades, double average) {
        System.out.println("Grades below the average:");

        for (int grade : grades) {
            if (grade < average) {
                System.out.println(grade);
            }
        }
    }
}
