//Incomplete
package Ch1_Arrays_and_Strings.Q7_RotateMatrix;

/*
Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, 
write a method to rotate the image by 90 degrees in place.
*/

public class Solution {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int[][] newMatrix = new int[3][3];

        fill(matrix);
        printMatrix(matrix);
        // rotate(matrix, newMatrix);
        printMatrix(matrix);
    }
    // newMatrix[i][j] = matrix[n - j][i];
    /*
     * public static void rotate(int[][] matrix, int[][] newMatrix) { int n =
     * matrix.length - 1; for (int i = 0; i < matrix.length; i++) { for (int j = 0;
     * j < matrix[0].length; j++) { matrix[i][j] = matrix[n - j][i]; } } }
     */

    public static void rotate(int[][] matrix) {
        int n = matrix.length - 1;
        for (int i = 0; i < matrix.length / 2; i++) {
            rotateLevel(matrix, i);
        }
    }

    public static void rotateLevel(int[][] matrix, int level) {
        int i, j = level;
        int temp = 0;
        int n = matrix.length - 1;
        for (int k = level; k < matrix.length - level - 1; k++) {

            while (true) {
                break;
            }
        }
    }

    public static void corners(int[][] matrix) {
        int n = matrix.length - 1;
        int topLeft = matrix[0][0];
        int topRight = matrix[0][n];
        int bottomRight = matrix[n][n];
        int bottomLeft = matrix[n][0];
        matrix[0][0] = bottomLeft;
        matrix[0][n] = topLeft;
        matrix[n][0] = bottomRight;
        matrix[n][n] = topRight;
    }

    public static void fill(int[][] matrix) {
        int n = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = n++;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
