package src;

import java.util.Scanner;

public class NumberAscending {
    public static void main(String[] args) {
        int firstNumber, secondNumber;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce the first number: ");
        firstNumber = scanner.nextInt();

        System.out.println("Introduce the second number: ");
        secondNumber = scanner.nextInt();

        if (firstNumber <= secondNumber) {
            for (int i = firstNumber; i <= secondNumber; i++) {
                System.out.println(i);
            }
        } else {
                System.out.println("The first number should be less than or equal to the second number.");
            }
        scanner.close();
    }
}