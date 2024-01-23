import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TestingMethods testingMethods = new TestingMethods();
        Car myCar = new Car();

        System.out.println("What is your name?: ");
        String name = scanner.nextLine();

        testingMethods.greetUser(name);

        System.out.println("What type of car? ");
        myCar.brand = scanner.nextLine();

        System.out.println("Indicate the color type: ");
        myCar.color = scanner.nextLine();

        System.out.println("What type of model is it?");
        myCar.model = scanner.nextLine();

        System.out.println("What year is it?");
        myCar.year = scanner.nextInt();

        scheduleInstructions(myCar);
    }

    public static void scheduleInstructions(Car car) {
        Timer timer = new Timer();

        TimerTask checkSystemTask = new TimerTask() {
            public void run() {
                car.start();
                car.checkSystem();
            }
        };

        TimerTask driveTask = new TimerTask() {
            public void run() {
                car.drive();
            }
        };

        TimerTask engineOffTask = new TimerTask() {
            public void run() {
                car.stop();
                car.engineOff();

                timer.cancel();
            }
        };

        timer.schedule(checkSystemTask, 1000); // Executes after 1 second
        timer.schedule(driveTask, 3000); // Delay of 3 seconds for drive
        timer.schedule(engineOffTask, 6000); // Delay of 6 seconds for stopping the car and engine off
    }

}
