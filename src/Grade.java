package src;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        // get the user grade and storing it
        int grade;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your grade?: ");
        grade = scanner.nextInt();

        String letterGrade = "Fail"; // Initialize with "Fail" as the default grade

        if (grade >= 9) {
            letterGrade = "A";
        } else if (grade >= 8) {
            letterGrade = "B";
        } else if (grade >= 7) {
            letterGrade = "C";
        } else if (grade >= 6) {
            letterGrade = "D";
        }

        // Display the calculated letter grade
        System.out.println("Your letter grade is: " + letterGrade);
    }
}
