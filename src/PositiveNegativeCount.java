package src;

import java.util.Scanner;

public class PositiveNegativeCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        int zero = 0;

        System.out.println("Enter the total number of random numbers to generate: ");
        int totalNumbers = sc.nextInt();

        for (int i = 0; i < totalNumbers; i++) {
            double randomNumber = (Math.random() - 50) * 100; // Generate random numbers between -50 and 100
            System.out.println("Generated number: " + randomNumber);

            if (randomNumber > 0) {
                positive++;
            } else if (randomNumber < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.println("Total positive numbers: " + positive);
        System.out.println("Total negative numbers: " + negative);
        System.out.println("Total zero numbers: " + zero);

        sc.close();
    }
}
