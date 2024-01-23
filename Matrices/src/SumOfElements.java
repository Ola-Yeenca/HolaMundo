package Matrices.src;

import java.util.Scanner;

public class SumOfElements {
    public void elements() {
        int sum = 0;
        int value;

        Scanner scanner = new Scanner(System.in);

        int[] vector = new int[15];

        System.out.println("Please enter 15 numbers: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }

        System.out.println("What is the range of numbers you want to add: ");
        value = scanner.nextInt();

        if (value <= vector.length) {
            for (int i = 0; i < value; i++) {
                sum += vector[i];
            }
            System.out.println("Sum of the first " + value + " elements: " + sum);
        } else {
            System.out.println("Sorry, the value is above 15, try again.");
        }

        // Close the Scanner to prevent resource leak
        scanner.close();
    }
}
