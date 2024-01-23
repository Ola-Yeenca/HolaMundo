package src;

import java.util.Scanner;
import java.util.logging.Logger;

public class CountAnyNumber {
    private static final Logger logger = Logger.getLogger(CountAnyNumber.class.getName());
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        char digitToCount = '0';

        System.out.println("How many numbers would you like to count?: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < number; i++) {
            System.out.println("Please enter a number: ");
            String numberStr = scanner.nextLine();

            System.out.println("Which digit would you like to count?: ");
            String digitInput = scanner.nextLine();


            if (!digitInput.isEmpty()) {
                digitToCount = digitInput.charAt(0);
                count += countOccurrencesOfDigit(numberStr, digitToCount);
            }
        }

        logger.info(String.format("Total count of '%c' digits in the series: %d%n", digitToCount, count));
    }

    private static int countOccurrencesOfDigit(String numberStr, char digitToCount) {
        int count = 0;
        for (int i = 0; i < numberStr.length(); i++) {
            if (numberStr.charAt(i) == digitToCount) {
                count++;
            }
        }
        return count;
    }
}
