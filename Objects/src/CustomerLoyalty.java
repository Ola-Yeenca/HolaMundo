import java.util.*;

public class CustomerLoyalty {

    private final long DNI;
    private String firstName, lastName;
    private double bonus = 100;
    private double totalAccumulated, currentPurchaseAmount;
    private int purchaseCount;

    public CustomerLoyalty(long DNI, String firstName, String lastName, double bonus) {
        this.DNI = DNI;
        this.firstName = firstName;
        this.lastName = lastName;
        this.bonus = bonus;
    }

    public long getDNI() {
        return DNI;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getBonus() {
        return bonus;
    }

    public double getTotalAccumulated() {
        return totalAccumulated;
    }

    public void registerPurchase(double amount) {
        // Calculate discounts and update card
        // Add logic here to calculate discounts and update totalAccumulated, bonus, etc.
    }

    private static class Registration {

        private final ArrayList<CustomerLoyalty> registeredUsers;

        public Registration(long DNI) {
            this.registeredUsers = new ArrayList<>();

            Scanner scanner = new Scanner(System.in);

            System.out.println("Please input your first name: ");
            String firstName = scanner.nextLine();

            System.out.println("Enter your last name: ");
            String lastName = scanner.nextLine();

            if (!firstName.isBlank() && !lastName.isBlank()) {
                CustomerLoyalty newCustomer = new CustomerLoyalty(DNI, firstName, lastName, 0);
                registeredUsers.add(newCustomer);
                System.out.println("Registration successful!");
            } else {
                System.out.println("First name and last name cannot be blank. Registration failed.");
            }

            Set<String> usernameSet = new HashSet<>();

            String username = firstName.toLowerCase() + "." + lastName.toLowerCase();

            while (!usernameSet.add(username)) {
                username += "_" + new Random().nextInt(100);
            }
        }

        CustomerLoyalty findUser(long DNI) {
            for (CustomerLoyalty user : registeredUsers) {
                if (user.getDNI() == DNI) {
                    return user;
                }
            }
            System.out.println("User not found!");
            return null;
        }
    }

    public static class UserRegistration {

        public void someMethod(long DNI) {
            System.out.println("DNI from UserRegistration: " + DNI);
        }
    }

    public static void main(String[] args) {
        CustomerLoyalty loyalty = new CustomerLoyalty(123456789L, "John", "Doe", 10);
        Registration registration = new Registration(loyalty.getDNI());

        // Other parts of your program
    }
}
