/**
 * rotateMatrix90
 */
public class rotateMatrix90 {

    public static void main(String[] args) {
        int[][] matrix = { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, { 13, 3, 6, 7 }, { 15, 14, 12, 16 } };
        int[][] rotateMatrix = new int[matrix.length][matrix[0].length];
        int row = matrix.length;
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = row-1; i >= 0; i--) {
                System.out.print(matrix[i][j]+",");
            }
            System.out.println();
        }
    }
}
