package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        System.out.println("Enter the number you want to display it's sequence: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            List<Integer> sequence = new ArrayList<>();

            for (int j = 1; j <= i; j++) {
                sequence.add(j);
            }
            System.out.println("Number: " + i);
            System.out.println(sequence);

            if (sequence.size() > 1) {
                List<Integer> subSequence = sequence.subList(1, sequence.size() - 1);
                System.out.println(subSequence);
            }
        }
        scanner.close();
    }
}