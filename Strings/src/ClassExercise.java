import java.util.Scanner;

public class ClassExercise {
    public static void main(String[] args) {
        String  firstName;
        String secondName;


        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter your first name: ");
        firstName = scanner.nextLine();

        System.out.println("Enter your last name: ");
        secondName = scanner.nextLine();

        String fullName = firstName + " " +  secondName;
        String fullNameLowercase = fullName.toLowerCase();
        int length = fullName.length();

        System.out.println("Full Name: " + fullName);
        System.out.println("Full name in lower case: " + fullNameLowercase);
        System.out.println("Full name length: " + length);

        StringBuilder reversedString = new StringBuilder(fullName).reverse();

        System.out.println("Reversed full name: " + reversedString.toString());


        if (length >= 2) {
            char firstChar = fullName.charAt(0);

            boolean found = false;
            for (int i = 0; i < fullName.length(); i++) {
                if (fullName.charAt(i) == firstChar) {
                    found = true;
                    break;
                }
            }

            if (found) {
                StringBuilder modifiedName = new StringBuilder();
                for (int i = 0; i < fullName.length(); i++) {
                    char currentChar = fullName.charAt(i);
                    modifiedName.append((currentChar == firstChar) ? Character.toUpperCase(currentChar) : currentChar);
                }
                System.out.println("Full Name with occurrences in uppercase: " + modifiedName);
            } else {
                System.out.println("First character doesn't occur later in the string.");
            }

            char lastChar = fullName.charAt(length - 1);

            char secondToThelastChar = fullName.charAt(length - 2);

            String lastTwoChar = String.valueOf(secondToThelastChar + " " + lastChar).toUpperCase();

            System.out.println("Last two characters are: " + lastTwoChar);

            if (!fullName.isEmpty()) {
                int count = 0;
                for (int i = 0; i < fullName.length(); i++) {
                    if (fullName.charAt(i) == lastChar) {
                        count++;
                    }
                }
                System.out.println("Last character: " + lastChar);
                System.out.println("Number of occurrences: " + count);
            } else {
                System.out.println("Please enter a valid full name.");
            }
        }else {
            System.out.println("String too small to get the last two characters.");

        }
    }
}
