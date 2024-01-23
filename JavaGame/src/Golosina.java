import java.util.Scanner;

public class Golosina {
    public static void main(String[] args) {
        String[][] candyNames = {
                {"Kitkat", "Strawberry Chew", "Lacasitos", "Palotes"},
                {"Kinder Bueno", "Mixed Haribo Bag", "Chetos", "Twix"},
                {"Kinder Bueno", "M&M's", "Papa Delta", "Mint Chews"},
                {"Lacasitos", "Crunch", "Milkybar", "Kitkat"},
        };

        double[][] candyPrices = {
                {1.1, 0.8, 1.5, 0.9},
                {1.8, 0.1, 1.2, 0.1},
                {1.8, 1.3, 1.2, 0.8},
                {1.5, 1.1, 1.1, 1.1}
        };

        int[][] candyQuantity = {
                {5, 5, 5, 5},
                {5, 5, 5, 5},
                {5, 5, 5, 5},
                {5, 5, 5, 5}
        };

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Candy Bar");

        int userChoice;
        do {
            System.out.println("\nMenu: ");
            System.out.println("Option 0 - Exit");
            System.out.println("Option 1 - Order Candy");
            System.out.println("Option 2 - Show Candies");
            System.out.println("Option 3 - Refill Candies (Technician only)");
            System.out.println("Option 4 - Turn Off Machine");

            userChoice = getIntInput(scanner, "Enter your choice: ");

            switch (userChoice) {
                case 0:
                    break;
                case 1:
                    orderCandy(candyNames, candyPrices, candyQuantity, scanner);
                    break;
                case 2:
                    showCandies(candyNames, candyPrices);
                    break;
                case 3:
                    refillCandies(candyNames, candyQuantity, scanner);
                    break;
                case 4:
                    turnOffMachine(candyNames, candyPrices, candyQuantity);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (userChoice != 0);

        scanner.close();
    }

    private static void orderCandy(String[][] candyNames, double[][] candyPrices, int[][] candyQuantity, Scanner scanner) {
        System.out.println("Enter the row and column (e.g., 2 0) of the candy you want: ");
        int row = getIntInput(scanner, "Enter the row: ");
        int column = getIntInput(scanner, "Enter the column: ");

        if (isValidPosition(row, column, candyNames)) {
            if (candyQuantity[row][column] > 0) {
                System.out.println("You ordered: " + candyNames[row][column]);
                System.out.println("Price: " + candyPrices[row][column] + "€");
                candyQuantity[row][column]--;
            } else {
                System.out.println("Sorry, this candy is out of stock.");
            }
        } else {
            System.out.println("Invalid position. Please try again.");
        }
    }

    private static void showCandies(String[][] candyNames, double[][] candyPrices) {
        System.out.println("Available Candies:");
        for (int i = 0; i < candyNames.length; i++) {
            for (int j = 0; j < candyNames[i].length; j++) {
                System.out.println("Code: " + i + j + " Name: " + candyNames[i][j] + " Price: " + candyPrices[i][j] + "€");
            }
        }
    }

    private static void refillCandies(String[][] candyNames, int[][] candyQuantity, Scanner scanner) {
        System.out.println("Enter the row and column (e.g., 2 0) of the candy to refill: ");
        int row = getIntInput(scanner, "Enter the row: ");
        int column = getIntInput(scanner, "Enter the column: ");

        if (isValidPosition(row, column, candyNames)) {
            System.out.println("Enter the quantity to refill: ");
            int quantity = getIntInput(scanner, "Enter the quantity: ");
            candyQuantity[row][column] += quantity;
            System.out.println("Candy refilled successfully.");
        } else {
            System.out.println("Invalid position. Please try again.");
        }
    }

    private static void turnOffMachine(String[][] candyNames, double[][] candyPrices, int[][] candyQuantity) {
        double totalSales = 0;

        for (int i = 0; i < candyNames.length; i++) {
            for (int j = 0; j < candyNames[i].length; j++) {
                totalSales += (5 - candyQuantity[i][j]) * candyPrices[i][j];
            }
        }

        System.out.println("Total Sales: " + totalSales + "€");
        System.out.println("Turning off the Candy Bar. Goodbye!");


    }

    private static int getIntInput(Scanner scanner, String prompt) {
        int input = -1;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.println(prompt);
                input = scanner.nextInt();
                validInput = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.nextLine(); // consume the invalid input
            }
        }

        return input;
    }

    private static boolean isValidPosition(int row, int column, String[][] candyNames) {
        return row >= 0 && row < candyNames.length && column >= 0 && column < candyNames[0].length;
    }
}
