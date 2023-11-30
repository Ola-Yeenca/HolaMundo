package src;

import java.util.Scanner;

public class NumberOfZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        System.out.println("Please enter the length of the series: ");
        int N = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < N; i++) {
            System.out.println("Enter an integer: ");
            String numStr = scanner.nextLine();


            count += containsZero(numStr);
        }
        System.out.println("Numbers containing '0': " + count);
    }

    private static int containsZero(String numStr) {
        int count = 0;
        for (int i = 0; i < numStr.length(); i++) {
            if (numStr.charAt(i) == '0') {
                count++;
            }
        }
        return count;
    }
}
