import java.util.Scanner;

public class TemperatureAnalyzer {

    public static final int MONTHS_IN_YEAR = 12;

    private final double[][] temperatures;

    public TemperatureAnalyzer() {
        temperatures = new double[MONTHS_IN_YEAR][];
    }

    public void generateRandomTemperatures() {
        for (int month = 0; month < MONTHS_IN_YEAR; month++) {
            int daysInMonth = 28 + (int) (Math.random() * 4); 

            temperatures[month] = new double[daysInMonth];

            for (int day = 0; day < daysInMonth; day++) {
                temperatures[month][day] = -10 + (Math.random() * 40);
            }
        }
    }

    public void calculateAnnualMinimumTemps() {
        double minTemp = Double.MAX_VALUE;

        for (double[] monthTemperatures : temperatures) {
            for (double temperature : monthTemperatures) {
                if (temperature < minTemp) {
                    minTemp = temperature;
                }
            }
        }
        System.out.println("The minimum temperature of the year is: " + minTemp);
    }

    public void calculateMonthlyMinimumTemps() {
        for (int month = 0; month < MONTHS_IN_YEAR; month++) {
            double minTemp = Double.MAX_VALUE;
            int minDay = -1;

            for (int day = 0; day < temperatures[month].length; day++) {
                if (temperatures[month][day] < minTemp) {
                    minTemp = temperatures[month][day];
                    minDay = day + 1;
                }
            }

            System.out.println("Month " + (month + 1) + ": Minimum Temperature - " + minTemp +
                    " (Day " + minDay + ")");
        }
    }

    public void calculateMonthlyAverageTemperatures() {
        for (int month = 0; month < MONTHS_IN_YEAR; month++) {
            double totalTemperature = 0;

            for (double temperature : temperatures[month]) {
                totalTemperature += temperature;
            }

            double averageTemperature = totalTemperature / temperatures[month].length;

            System.out.println("Month " + (month + 1) + ": Average Temperature - " + averageTemperature);
        }
    }

    public static void main(String[] args) {
        TemperatureAnalyzer temperatureAnalyzer = new TemperatureAnalyzer();
        temperatureAnalyzer.generateRandomTemperatures();

        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Calculate Annual Minimum Temperature");
            System.out.println("2. Calculate Minimum Temperature for Each Month");
            System.out.println("3. Calculate Average Temperature for Each Month");
            System.out.println("4. Exit");

            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    temperatureAnalyzer.calculateAnnualMinimumTemps();
                    break;
                case 2:
                    temperatureAnalyzer.calculateMonthlyMinimumTemps();
                    break;
                case 3:
                    temperatureAnalyzer.calculateMonthlyAverageTemperatures();
                    break;
                case 4:
                    System.out.println("Exiting the program. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }

        } while (choice != 4);
    }
}
