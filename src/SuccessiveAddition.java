package src;

import java.util.Scanner;

public class SuccessiveAddition {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int firstPositive = scanner.nextInt();

        System.out.println("Please enter the second number: ");
        int secondPositive = scanner.nextInt();

        while (firstPositive <= 0 || secondPositive <= 0) {
            System.out.println("Please both numbers has to be greater than 0. Try again: ");
            System.out.println("Please enter the first number: ");
            firstPositive = scanner.nextInt();
            System.out.println("Please enter the second number: ");
            secondPositive = scanner.nextInt();
        }

        int result = 0;

        for (int i = 1; i <= secondPositive; i++) {
            result += firstPositive;
        }
        System.out.println("Result: " + result);
        scanner.close();
    }
}