package src;

import java.util.Scanner;

public class DivisionOfPositiveIntegers {
    public static void main(String[] args) {
        int dividend;
        int dividedBy;

        Scanner scanner = new Scanner(System.in);

        // Input and error check for dividend
        do {
            System.out.println("Please enter the number to be divided: ");
            dividend = scanner.nextInt();

            if (dividend <= 0) {
                System.out.println("Number must be positive. Please try again.");
            }
        } while (dividend <= 0);

        // Input and error check for dividedBy
        do {
            System.out.println("Please enter the number to be divided by: ");
            dividedBy = scanner.nextInt();

            if (dividedBy <= 0) {
                System.out.println("Number must be positive. Please try again.");
            }
        } while (dividedBy <= 0);

        int quotient = 0;
        int remainder = dividend;

        while (remainder >= dividedBy) {
            remainder -= dividedBy;
            quotient += 1;
        }

        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
}
