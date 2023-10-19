package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // declaration of arrays of number
        ArrayList<Integer> numbers = new ArrayList<>();

        //initializing the even or odd methods
        boolean isEven = false;
        boolean isOdd = false;

        // getting the user input and storing it, to populate the array.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any numbers of your choice(enter any alphabets to exit): ");

        // using while loops to iterate the array
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            numbers.add(number);
        }

        for (int number : numbers) {
            if (number % 2 == 0) {
                isEven = true;
                System.out.println(number + " is even");
            } else {
                isOdd = true;
                System.out.println(number + " is odd");
            }
        }

        if (isEven && isOdd) {
            System.out.println("Both even and odd numbers are present.");
        } else if (isEven) {
            System.out.println("Only even numbers are present.");
        } else if (isOdd) {
            System.out.println("Only odd numbers are present.");
        } else {
            System.out.println("No numbers were entered.");
        }

        Collections.reverse(numbers);

        System.out.println("These are the numbers in ascending order: ");
        for (int number : numbers) {
            System.out.println(number);
        }

        scanner.close();
    }
}
