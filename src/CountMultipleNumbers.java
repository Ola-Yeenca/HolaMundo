package src;

import java.util.Scanner;

public class CountMultipleNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers would you like to count?: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the digits you want to count (separated by spaces): ");
        String digitInput = scanner.nextLine();

        String[] digitsToCount = digitInput.split(" ");
        int totalCount = 0;

        for (int i = 0; i < number; i++) {
            System.out.println("Please enter a number: ");
            String numberStr = scanner.nextLine();

            System.out.println("Number: " + numberStr);

            for (String digit : digitsToCount) {
                char digitToCount = digit.charAt(0);
                int digitCount = countOccurrencesOfDigit(numberStr, digitToCount);
                System.out.printf("Count of '%c' digits: %d%n", digitToCount, digitCount);
                totalCount += digitCount;
                System.out.println("Total count: " + totalCount);
            }
        }
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