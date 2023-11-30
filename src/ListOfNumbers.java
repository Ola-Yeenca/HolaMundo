package src;

import java.util.Scanner;

public class ListOfNumbers {
    public static void main(String[] args) {
        int currentNumber = 1;


        System.out.println("Please enter any number: ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();



        for (int iteration = 0; iteration <= N ; iteration++) {
            int[] list = new int[iteration];

            for (int number = 1; number <= iteration ; number++) {
                list[number - 1 ] = number;
            }
            System.out.println("N = " + iteration);
            for (int number : list ) {
                System.out.println("Number: " + number);
            }
        }
        System.out.println();
    }
}