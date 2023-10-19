package src;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        int number;

        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        if (number < 1) {
            System.out.println("Not valid, enter again: ");
        } else {
            int sum = 0;
            for (int i = 1; i <= number; i++) {
                sum += i;
            }
            System.out.println("The sum of numbers from 1 to " + number + " is: " + sum);
        }
        scanner.close();
    }
}