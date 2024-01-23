package Methods.src;

import java.util.Scanner;

public class ExerciseMethods2 {
    private final Scanner scanner;

    public ExerciseMethods2(Scanner scanner) {
        this.scanner = scanner;
    }

    public void writeLines() {
        int lines;
        int asterisks;

        System.out.println("How many numbers of lines do you want: ");
        lines = scanner.nextInt();

        System.out.println("How many number of asterisks per line do you want: ");
        asterisks = scanner.nextInt();

        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= asterisks; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void decreaselines() {
        int lines;

        System.out.println("How many number of lines do you want: ");
        lines = scanner.nextInt();

        for (int i = lines; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public void drawTree(int heights) {
        drawTriangle(heights);
    }

    public void drawTriangle(int heights) {
        int width = 5;
        int space = width * 5;
        int x = 1;


        for (int i = 1; i <= heights; i++) {
            for (int j = x; j <= width; j++) {
                for (int k = space; k >= j; k--) {
                    System.out.print(" ");
                }
                for (int k = 1; k < j; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            x += 2;
            width += 2;
        }

        // draw the branch
        for (int i = 1; i <= 4; i++) {
            for (int j = space - 3; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        // draw the pot
        for (int i = 1; i <= heights; i++) {
            for (int j = x; j <= width; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

    }


}
