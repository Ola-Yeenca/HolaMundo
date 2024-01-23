public class Main {
    public static void main(String[] args) {
        /*
        TrafficLights trafficLights = new TrafficLights();


        System.out.println("This traffic light is currently: " + Arrays.toString(trafficLights.getColors()));

        trafficLights.changeColors();
        trafficLights.changeColors();
        trafficLights.changeColors();

         */

        Punto punto1 = new Punto();
        Punto punto2 = new Punto(5, 3);
        Punto punto3 = new Punto(2, -1);
        Punto punto4 = new Punto((punto2.getX() + punto3.getX()) / 2, (punto2.getY() + punto3.getY()) / 2);

        System.out.println("Point 1: (" + punto1.getX() + ", " + punto1.getY() + ")");
        System.out.println("Point 2: (" + punto2.getX() + ", " + punto2.getY() + ")");
        System.out.println("Point 3: (" + punto3.getX() + ", " + punto3.getY() + ")");
        System.out.println("Point 4: (" + punto4.getX() + ", " + punto4.getY() + ")");


        System.out.println("Distance from Point 4 to the origin: " + punto4.distanceToOrigin());

    }
}