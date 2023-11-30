package src;

import java.util.Scanner;

public class NumberOfZeros2 {
    public static void main(String[] args) {
        int count = 0;
        int num, N;
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many number you wanna count?: ");
        num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            N = (int) (Math.random() * (1000 - 10 + 1)) + 10;
            System.out.println(N);

            String numStr = String.valueOf(N);

            for (int j = 0; j < numStr.length(); j++) {
                char digit = numStr.charAt(j);
                if (digit == '0') {
                    count++;
                    break;
                }
            }
        }
        System.out.println("Count of random numbers with a '0': " + count);
    }
}
