public class Car {
    String model;
    String color;
    Boolean metallic;
    int licensePlate;
    String[] type = {"MIN", "UTILITARIO", "FAMILIAR", "DEPORTIVO"};
    int year;
    String insuranceMode;

    public Boolean getMetallic() {
        return metallic;
    }

    public int getLicensePlate() {
        return licensePlate;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getInsuranceMode() {
        return insuranceMode;
    }

    public String getModel() {
        return model;
    }

    public String[] getType() {
        return type;
    }

    Car(String color, String model) {
        this.color = color;
        this.model = model;
    }

    public static void main(String[] args) {
        Car car = new Car("Black", "Mini");

        System.out.println("Color of the  car :" + car.color);
        System.out.println("Model of the car: " + car.model);
    }

}
