import java.util.Scanner;

public class DrawShapes {

    public static void drawSquare(int sideLength) {
        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void drawCircle(int radius) {
        for (int i = -radius; i <= radius; i++) {
            for (int j = -radius; j <= radius; j++) {
                double distance = Math.sqrt(i * i + j * j);
                if (distance < radius + 0.5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Select an option:");
            System.out.println("1. Draw square");
            System.out.println("2. Draw circle");
            System.out.println("3. Exit");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    int side = 5;
                    drawSquare(side);
                    break;
                case 2:
                    int circleRadius = 10;
                    drawCircle(circleRadius);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please select 1, 2, or 3.");
                    break;
            }
        } while (option != 3);

        scanner.close();
    }
}
