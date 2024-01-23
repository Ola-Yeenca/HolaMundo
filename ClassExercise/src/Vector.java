import java.util.Arrays;

public class Vector {
    public Vector() {
        // Question 1
        System.out.println("Q: 1");
        int[] v1 = randomArray(1000, 100);

        // Question 2
        System.out.println("Q: 2");
        displayArray("Vector v1: ", v1);

        // Question 3
        System.out.println("Q: 3");
        search(v1, 7);

        // Question 4
        System.out.println("Q: 4");
        int[] v2 = create(10, 7);
        displayArray("Vector v2: ", v2);

        // Question 5
        System.out.println("Q: 5");
        int[] v3 = copyArrayRange(v1, 0, 10);

        // Question 6
        System.out.println("Q: 6");
        displayArray("Vector v3 (first 10 values of v1): ", v3);
    }

    private int[] randomArray(int range, int size) {
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * range) + 1;
        }
        return array;
    }

    private void displayArray(String message, int[] array) {
        System.out.print(message);
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    private void search(int[] array, int key) {
        int index = Arrays.binarySearch(array, key);

        if (index >= 0) {
            System.out.println("Value " + key + " found at index " + index);
        } else {
            System.out.println("Value " + key + " not found in the array");
        }
    }

    private int[] create(int size, int value) {
        int[] array = new int[size];

        Arrays.fill(array, value);
        return array;
    }

    private int[] copyArrayRange(int[] original, int from, int to) {
        return Arrays.copyOfRange(original, from, to);
    }
}
