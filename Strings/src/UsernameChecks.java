import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UsernameChecks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Firstly, store the usernames into an dictionary or list or set
        Set<String> usernameSet = new HashSet<>();

        //The logic to ask and check if the usernames exist or not, also quit
        while (true) {
            // asking for the username
            System.out.println("Please enter a username: ");
            String username = scanner.nextLine();

            //Check if user wants to quit
            if (username.equalsIgnoreCase("quit")) {
                break;
            }

            //Check if the username already exist
            if (!usernameSet.contains(username)) {
                usernameSet.add(username);
                System.out.println("Welcome on board " + username + "!");
            } else {
                System.out.println("Sorry, the username " + username + " already exist! Try again...");
            }
        }
        scanner.close();
    }
}
