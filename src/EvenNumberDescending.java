package src;

import java.util.Scanner;

public class EvenNumberDescending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the lower limit: ");
        int lowerLimit = scanner.nextInt();

        System.out.println("Enter the higer limit: ");
        int higherLimit = scanner.nextInt();

        if (lowerLimit > higherLimit) {
            int temp = lowerLimit;
            lowerLimit = higherLimit;
            higherLimit = temp;
        }

        int currentNumber = (higherLimit % 2 == 0) ? higherLimit : higherLimit - 1;

        System.out.println("Even numbers between " + lowerLimit + " and " + higherLimit + " (excluding odds numbers):");
        while (currentNumber >= lowerLimit) {
            if (currentNumber % 2 == 0) {
                System.out.println(currentNumber);
            }
            currentNumber -= 2;
        }

        scanner.close();
    }
}
