package Ch1_Arrays_and_Strings.Q8_ZeroMatrix;

/*
Write an algorithm such that if an element in an MxN matrix is 0, it's entire row and column are set to 0.
*/

public class Solution {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];

        matrix[0][0] = 2;
        matrix[0][1] = 0;
        matrix[0][2] = 2;
        matrix[1][0] = 2;
        matrix[1][1] = 2;
        matrix[1][2] = 2;
        matrix[2][0] = 0;
        matrix[2][1] = 2;
        matrix[2][2] = 2;

        printMatrix(matrix);
        zeroMatrix(matrix);
        // negateRowAndColumn(matrix, 0, 1);
        printMatrix(matrix);

    }

    public static void zeroMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    negateRowAndColumn(matrix, i, j);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == Integer.MIN_VALUE) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void negateRowAndColumn(int[][] matrix, int x, int y) {
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[x][i] != 0) {
                matrix[x][i] = Integer.MIN_VALUE;
            }
        }

        for (int j = 0; j < matrix.length; j++) {
            if (matrix[j][y] != 0) {
                matrix[j][y] = Integer.MIN_VALUE;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
