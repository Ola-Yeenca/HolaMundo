import java.util.Arrays;

public class TrafficLights {
    private String[] colors = {"Red", "Yellow", "Green"};
    private int currentIndex = 0;

    public String[] getColors() {
        return colors;
    }

    public void changeColors() {
        currentIndex = (currentIndex + 1) % colors.length;
        System.out.println("traffic light changes to: " + colors[currentIndex]);
    }

    public void setColors(String[] newColors) {
        if (Arrays.equals(newColors, colors) && newColors.length == colors.length) {
            this.colors = newColors;
            System.out.println("Traffic light colors updated successfully.");
        } else {
            System.out.println("Invalid input. Please provide an array of length " + colors.length);
        }
    }

}