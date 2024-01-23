package Matrices.src;

import java.util.Random;
import java.util.Scanner;

public class LaPrimitiva {
    public static void main(String[] args) {
        byte option;

        System.out.println("Welcome to La Primitiva Game");

        Scanner scanner = new Scanner(System.in);
        // Allow user to choose between Automatic or Manual Bets
        do {
            System.out.println("Do you want to play manually or automatic? ");
            System.out.print("Options: Press 1: Automatic or Press 2: Manual ");
            option = scanner.nextByte();

            if (option == 1) {
                System.out.println("Welcome to the Random numbers game.");
                int[] automaticBets = generateAutomaticBets();
                simulateDraw(automaticBets);
            } else if (option == 2) {
                int[] manualBets = generateManualBets();
                simulateDraw(manualBets);
            }else {
                System.out.println("Sorry, invalid option, try again!");
            }
        } while (option != 1 && option != 2);

        scanner.close();
    }

    private static int[] generateAutomaticBets() {
        int[] bet = new int[6];
        
        Random random = new Random();

        System.out.print("Your automatic bets are: ");
        for (int i = 0; i < bet.length; i++) {
            bet[i] = random.nextInt(49) + 1;
            System.out.print(bet[i] + " ");
        }
        System.out.println();
        return bet;
    }

    private static int[] generateManualBets() {
        Scanner sc = new Scanner(System.in);

        int[] bets = new int[6];

        System.out.println("Enter 6 digits between 1 - 49, for bet: ");

        for (int i = 0; i < bets.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            bets[i] = sc.nextInt();

            if (bets[i] > 49) {
                System.out.println("Sorry, the number has to be less than 49");
                System.out.println("Please, try again: ");
                i--;
            }


        }
        return bets;
    }

    private static void simulateDraw(int[] draw) {
        int[] drawing = new int[6];

        Random random = new Random();

        System.out.println("The drawing numbers are: ");

        for (int i = 0; i < drawing.length; i++) {
            drawing[i] = random.nextInt(49) + 1;
            System.out.print(drawing[i] + " ");
        }

        int correctDraw = matchDraw(draw, drawing);

        prize(correctDraw);

        System.out.println();
    }

    private static int matchDraw(int[] draw, int[] drawing) {
        int correctDraw = 0;

        for (int i = 0; i < draw.length && i < drawing.length; i++) {
            if (draw[i] == drawing[i]) {
                correctDraw++;
            }
        }
        return correctDraw;
    }

    private static void prize(int correctDraw) {
        System.out.println();
        System.out.println("Number of correct draw: " + correctDraw);

        switch (correctDraw) {
            case 6:
                System.out.println("Congratulation, you hit the jackpot!!!");
                break;

            case 5:
                System.out.println("Congrats, you almost lucky!");
                break;

            case 4:
                System.out.println("Wow, what a luck!");
                break;

            case 3:
                System.out.println("You guessed 3.");
                break;

            case 2:
                System.out.println("You got 2 right.");
                break;

            case 1:
                System.out.println("Sorry, you got only 1 correctly.");
                break;

            default:
                System.out.println("Better luck next time!");
        }
    }
}
