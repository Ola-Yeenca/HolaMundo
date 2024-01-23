public class Car {
    String brand;
    String color;
    int year;
    String model;

    public void start() {
        System.out.println("Starting engine...");
    }

    public void checkSystem() {
        System.out.println("System check is running...");
        System.out.println("Checks completed!");
    }

    public void drive() {
        System.out.println("The car is moving...");
    }

    public void stop() {
        System.out.println("The car has stopped");
    }

    public void engineOff() {
        System.out.println("Engine is off!");
    }
}
