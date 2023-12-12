package Matrices.src;

public class TwoDimensionalArrays {
    public void elements2() {

        int[] origin = {10, 25, 26, 40, 37, 45, 90, 76, 78, 81, 58, 32};;

        int[] destination = new int[12];

        for (int i = 0; i < origin.length; i++) {
            if (origin[i] % 2 == 0 && origin[i] > 25) {
                destination[i] = origin[i];
            }
        }
        System.out.println("Number in origin box: ");
        for (int num : origin) {
            System.out.println(num + " ");
        }

        System.out.print("\nSpecial numbers in destination: ");
        for (int num : destination) {
            System.out.println(num + " ");
        }
    }
}
