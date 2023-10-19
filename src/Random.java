package src;

import java.util.Scanner;


public class Random {
    public static void  main (String[] args) {
        int guess;
        int maxTries = 10;
        int remainingTries = maxTries;

        Scanner sc = new Scanner(System.in);

       while (remainingTries > 0) {
           int randomNumber = (int) (Math.random() * 101);
           System.out.println("Guess a random number from 0 - 100: (Numbers of tries left)" + remainingTries);
           guess = sc.nextInt();

           if (guess > randomNumber) {
               System.out.printf("Too High! Try again...", randomNumber, remainingTries);
           } else if (guess < randomNumber) {
               System.out.printf("Too Low! Try again...", randomNumber, remainingTries);
           } else {
               System.out.println("Congratulations, You Won!");
               break;
           }
           remainingTries--;
       }
       if (remainingTries == 0) {
           System.out.println("You are out of tries... Sorry!");
       }
       sc.close();
    }
}
