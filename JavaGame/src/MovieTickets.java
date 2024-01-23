import java.util.Scanner;

public class MovieTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = 10;
        int columns = 10;
        String[][] cinemaSeats = new String[rows][columns];


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                cinemaSeats[i][j] = "L";
            }
        }

        boolean continueProgram = true;

        while (continueProgram) {
            System.out.println("Welcome to House of Chaos! \nWhat's your name? (Nombre completo por favor): ");
            String names = scanner.nextLine();

            System.out.println("Welcome " + names + ", \nPlease fill in your resident ID: ");
            String DNI = scanner.nextLine();


            displaySeats(cinemaSeats);

            // Ask user for action
            System.out.println("Select an option:\n1. Reserve a seat\n2. Cancel reservation\n3. Exit");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    reserveSeat(cinemaSeats, DNI);
                    break;
                case 2:
                    cancelReservation(cinemaSeats, DNI);
                    break;
                case 3:
                    continueProgram = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void displaySeats(String[][] cinemaSeats) {
        System.out.println("Cinema Seat Status:");

        for (String[] cinemaSeat : cinemaSeats) {
            for (String s : cinemaSeat) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }

    private static void reserveSeat(String[][] cinemaSeats, String DNI) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please select a seat from the available seats (row column): ");
        int row = scanner.nextInt();
        int column = scanner.nextInt();

        if (cinemaSeats[row][column].equals("L")) {
            cinemaSeats[row][column] = DNI;
            System.out.println("Seat reserved successfully!");
        } else {
            System.out.println("Sorry, the seat is already reserved. Please choose another seat.");
        }
    }

    private static void cancelReservation(String[][] cinemaSeats, String DNI) {
        for (int i = 0; i < cinemaSeats.length; i++) {
            for (int j = 0; j < cinemaSeats[i].length; j++) {
                if (cinemaSeats[i][j].equals(DNI)) {
                    cinemaSeats[i][j] = "L";
                    System.out.println("Reservation canceled successfully!");
                    return;
                }
            }
        }

        System.out.println("No reservation found for the given DNI.");
    }
}
