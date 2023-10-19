package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // getting the number from the user and storing them
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("introduce the second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("introduce the third number: ");
        int thirdNumber = scanner.nextInt();
        System.out.println("Quieres buscar el mini o maxi de esto 3 valores?(type 'max' or 'min'): ");
        String typed = scanner.next();


        // using if method, compare the variables with Math.max and Math.min
        if (typed.equals("max")) {
            int max = Math.max(Math.max(firstNumber, secondNumber), thirdNumber);
            System.out.println("The maximum number is: " + max);
        } else if (typed.equals("min")) {
            int min = Math.min(Math.min(firstNumber, secondNumber), thirdNumber);
            System.out.println("The minimum number is: " + min);
        }else {
            System.out.println("Incorrect input. Please type 'MAX' or 'Min'");
        }

        scanner.close();
    }
}
