package src;

import java.util.Scanner;

public class ValueOfN2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value(number) of N1: ");
        int n1 = scanner.nextInt();

        int n2 = removeFirstAndLastDigits(n1);

        System.out.println("N2: " + n2);
    }

    public static int removeFirstAndLastDigits(int n1) {
        if (n1 < 10) {
            return 0;
        }

        String n1Str = String.valueOf(n1);
        String n2Str = n1Str.substring(1, n1Str.length() - 1);

        return Integer.parseInt(n2Str);
    }
}
