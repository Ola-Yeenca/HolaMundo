package src;

import java.util.Scanner;

public class Error {
    public static void main(String[] args) {
        int heightInCM;
        int weight = 1000; // converted from 1kg to grams

        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce the height: ");
        heightInCM = scanner.nextInt();

        System.out.println("introduce the weight: ");
        weight = scanner.nextInt();

        double cost = calculateShippingCost(weight, heightInCM);
        int euros = (int) cost;
        int centimos = (int) ((cost - euros) * 100);

        System.out.println("the cost is " + euros + " euros and " + centimos + " centimos");
    }

    public static double calculateShippingCost(int weight, int heightInCM) {
        double cost = 0;
        int price;

        if (heightInCM < 50) {
            price = 4;
        } else if (heightInCM >= 51 && heightInCM <= 100) {
            price = 6;
        } else {
            price = 10;
        }

        if (weight < 1000) {
            price += 2;
        } else if (weight >= 1000 && weight <= 4000) {
            price += 2 + (weight - 1000) * 0.05 / 10;
        } else {
            price += 4 + (weight - 4000) * 0.1 / 50;
        }

        cost = price;
        return cost;
    }
}
