public class Main {
    public static void main(String[] args) {


        int[][] matrix = createAndInitialize();
        displayMatrix(matrix);

    }

    private static int[][] createAndInitialize() {
        int[][] matrix = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrix[i][j] = (i % 2 == 0) ? 1 : 0;
            }
        }
        return matrix;
    }

    private static int[][] diagonalMatrix(int size) {
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
        }
        return matrix;
    }

    private static int[][] additionMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] resultMatrix = new int[matrix1.length][matrix2.length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                resultMatrix[i][j] = matrix1.length + matrix2.length;
            }
        }
        return resultMatrix;
    }

    private static boolean isSymmetric(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows != cols) {
            return false;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] != matrix[i][j]);
            }
        }
        return isSymmetric(matrix);
    }


}