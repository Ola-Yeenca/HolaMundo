package src;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MultiplesAndDivisors {
    public static void main(String[] args) {
        int N = 10;

        for (int multiple = 3; multiple <= N; multiple+= 3) {
            Set<Integer> divisors = new HashSet<>();

            for (int divisor = 1; divisor <= multiple ; divisor++) {
                if (multiple % divisor == 0) {
                    divisors.add(divisor);
                }
            }
            System.out.println("Multiple = " + multiple + " Divisors of " + multiple + " = " + divisors);
        }
    }
}