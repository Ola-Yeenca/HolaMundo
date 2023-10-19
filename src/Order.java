package src;

import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        int firstNumber, secondNumber;

        Scanner speak = new Scanner(System.in);
        System.out.println("Please introduce the first number: ");
        firstNumber = speak.nextInt();

        System.out.println("Please introduce the second number: ");
        secondNumber = speak.nextInt();

        if (firstNumber > secondNumber) {
            int temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
        }
        System.out.println("The numbers between " + firstNumber + " and " + secondNumber + " in ascending order:");
        for (int i = firstNumber; i <= secondNumber; i++) {
            System.out.println(i);
        }
    }
}