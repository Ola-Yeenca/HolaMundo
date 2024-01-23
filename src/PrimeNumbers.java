package src;


public class PrimeNumbers {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;

        System.out.println("The first 20 prime numbers are: ");
        while (count < 20) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}