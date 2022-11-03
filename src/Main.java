public class Main {

    public static int[][] matrixTransposition(int[][] arr) {
        int[][] result = new int[arr[0].length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result[j][i] = arr[i][j];
            }
        }
        return result;
    }

    public static void printMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] array1 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 0}};
        int[][] array2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        printMatrix(array1);
        System.out.println("********************************");
        printMatrix(matrixTransposition(array1));
        System.out.println("********************************");
        printMatrix(array2);
        System.out.println("********************************");
        printMatrix(matrixTransposition(array2));
    }
}