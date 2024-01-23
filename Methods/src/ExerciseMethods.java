public class ExerciseMethods {
    public static void multiplicationTable(int number) {
        for (int i = 1; i <= 12; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    public double calculateAverage(double[] grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    public static void displaySummation(int number) {
        int sum = 0;
        StringBuilder equation = new StringBuilder();

        for (int i = number; i > 0; i--) {
            sum += i;

            if (i != number) {
                equation.append(" + ");
            }
            equation.append(i);
        }
        equation.append(" = ").append(sum);
        System.out.println(equation);
    }

    public static void drawRhombus(int width) {
        if (width % 2 == 0) {
            System.out.println("Error: Width must be an odd number for the Rhombus");
        } else {
            for (int i = 1; i <= width; i++) {
                for (int j = 0; j < (width - i) / 2; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println("ok");
            }
            for (int i = width - 2; i >= 2; i -= 2) {
                for (int j = 0; j < (width - i) / 2; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println("checked");
            }
        }

    }
}
