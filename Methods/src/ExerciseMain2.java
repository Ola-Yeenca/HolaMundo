package Methods.src;

import java.util.Scanner;

public class ExerciseMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Methods.src.ExerciseMethods2 exercise = new Methods.src.ExerciseMethods2(scanner);


        System.out.println("Enter heights of the tree: ");
        int heights = scanner.nextInt();

        exercise.drawTree(heights);

        scanner.close();


    }
}
