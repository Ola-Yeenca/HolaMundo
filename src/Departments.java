package src;

import java.util.Scanner;

public class Departments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double importe;
        int dto;
        int option;

        double[] total = {0, 0, 0};
        String[] departments = {"Carnicera", "Pescaderia", "Drogueria"};
        String[] menu = {"Exit", "Register"};

        do {
            for (int i = 0; i < menu.length; i++) {
                System.out.println(i + 1 + ": " + menu[i]);
            }
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Bye");
                    break;

                case 2:
                    System.out.println("Importe: ");
                    importe = scanner.nextDouble();
                    do {
                        for (int i = 0; i < departments.length; i++) {
                            System.out.println(i + 1 + ": " + departments[i]);
                        }
                        dto = scanner.nextInt();
                        if (dto < 0 || dto >= departments.length) {
                            System.out.println("Not valid");
                        }
                    } while (dto < 0 || dto >= departments.length);

                    total[dto] += importe;
                    break;

                default:
                    System.out.println("incorrect option: ");
            }
        } while (option != 0);

        // Remove the extra curly braces from here
        for (int i = 0; i < departments.length; i++) {
            System.out.println(i + 1 + " Department summary: " + departments[i] + " - Total: " + total[i]);
        }
    }
}
