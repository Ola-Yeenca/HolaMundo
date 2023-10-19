package src;

import java.util.Scanner;

public class Exponent {
    public static void main(String[] args) {


        System.out.println("Please enter the base of a number: ");
        Scanner scanner = new Scanner(System.in);
        int baseNumber = scanner.nextInt();

        while (baseNumber <= 0) {
            System.out.println("The base number must be positive. Please try again: ");
            baseNumber = scanner.nextInt();
        }

        System.out.println("Please enter the exponent of a number: ");
        int exponentNumber = scanner.nextInt();
        
        int result = 1;

        for (int i = 1; i <= exponentNumber; i++) {
            result *= baseNumber;
        }
        System.out.println("Result: " + result);
    }
}