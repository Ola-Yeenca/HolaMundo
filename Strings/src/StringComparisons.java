import java.util.Scanner;

public class StringComparisons {
    public static void main(String[] args) {
        //Using fake daatabase, check if a username name exist

        Scanner scanner = new Scanner(System.in);
        //Ask for a user_name
        System.out.println("Please enter a Username: ");

        //Store and display a greeting
        String username1 = scanner.nextLine();
        System.out.println("Welcome " + username1);


        //Ask for another user_name
        System.out.println("Please enter a username: ");
        String username2 = scanner.nextLine();

        //Display a welcome message if the username is not equal to the first one
        if (!username1.equals(username2)) {
            System.out.println("Welcome, " + username2);

            //Compare and print out common characters
            System.out.println("Common characters: " + getCommonCharacters(username1, username2));
        } else {
            System.out.println("Sorry, you can't have use this username, try again!");
        }
    scanner.close();

    }
    private static String getCommonCharacters(String str1, String str2) {
        StringBuilder commonChars = new StringBuilder();

        for (int i = 0; i < Math.min(str1.length(), str2.length()); i++) {
            if (str1.charAt(i) == str2.charAt(i)){
                commonChars.append(str1.charAt(i));
            }
        }
        return commonChars.toString();
    }
}
