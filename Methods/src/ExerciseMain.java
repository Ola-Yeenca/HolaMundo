import java.util.Scanner;

public class ExerciseMain {
    public static void main(String[] args) {
        ExerciseMethods exercise = new ExerciseMethods();
        DrawShapes draw = new DrawShapes();


        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce the number: ");
        int number = scanner.nextInt();

        exercise.multiplicationTable(number);

        System.out.println("Please introduce the number of grades: ");
        int numberOfGrades = scanner.nextInt();
        double[] grades = new double[numberOfGrades];

        for (int i = 0; i < numberOfGrades; i++) {
            System.out.println("Enter grade " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();

        }

        double average = exercise.calculateAverage(grades);

        System.out.println("The average grade is: " + average);

        exercise.displaySummation(number);

        System.out.println("Please introduce the width of the Rhombus: ");
        int width = scanner.nextInt();

        exercise.drawRhombus(width);


        draw.displayMenu();

    }
}
