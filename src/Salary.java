package src;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Salary {
    public static void main(String[] args) {
        // Getting the user input and storing it.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce your current salary: €");
        int salary = sc.nextInt();

        // the assign the values from the question
        double range1 = 6000;
        double range2 = 7900;
        double range3 = 12000;

        double increasePercentage = 0.0;

        // using the if statement to check and compare the range of the user input 'salary'
        if (salary <= range1) {
            increasePercentage = 0.20;
        } else if (salary <= range2) {
            increasePercentage = 0.10;
        } else if (salary <= range3) {
            increasePercentage = 0.05;
        } else {
            increasePercentage = 0.0;
        }

        // increasing the user input by percentage and adding it
        double increasedAmount = salary * increasePercentage;

        double newSalary = salary + increasedAmount;

        System.out.println("Your current salary is: €" + salary);
        System.out.println("Your increased percentage: " + (increasePercentage * 100) + "%");
        System.out.println("Your new salary is: €" + newSalary);

        sc.close();
    }
}
