public class Punto {
    private final double x;
    private final double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public Punto() {
        this(0,0);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distanceTo(Punto otherPunto) {
        double deltaX = otherPunto.getX() - this.x;
        double deltaY = otherPunto.getY() - this.y;

        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public double distanceToOrigin() {
        return Math.sqrt(x * x + y * y);
    }
}
