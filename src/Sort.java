package src;

import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        int thirdNumber;

        int max, middle, min;

        Scanner sc = new Scanner(System.in);
        System.out.println("Write the first number: ");
        firstNumber = sc.nextInt();
        System.out.println("Write the second number: ");
        secondNumber = sc.nextInt();
        System.out.println("Write the third number: ");
        thirdNumber = sc.nextInt();

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            max = firstNumber;
            if (secondNumber >= thirdNumber) {
                middle = secondNumber;
                min = thirdNumber;
            } else {
                middle = thirdNumber;
                min = secondNumber;
            }
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            max = secondNumber;
            if (firstNumber >= thirdNumber) {
                middle = firstNumber;
                min = thirdNumber;
            } else {
                middle = thirdNumber;
                min = firstNumber;
            }
        } else {
            max = thirdNumber;
            if (firstNumber >= secondNumber) {
                middle = firstNumber;
                min = secondNumber;
            } else {
                middle = secondNumber;
                min = firstNumber;
            }
        }

        System.out.println("Sorted in descending order: " + max + "," + middle + "," + min);
        sc.close();
    }
}
