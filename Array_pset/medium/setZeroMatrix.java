
/**
 * setZeroMatrix
 */
public class setZeroMatrix {

    public static void main(String[] args) {
        int[][] matrix = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
        // bruteForce(matrix);
        optimul1(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + ",");
            }
            System.out.println();
        }
    }

    static void bruteForce(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    markingCell(matrix, i, j);
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    static void markingCell(int[][] matrix, int row, int col) {
        for (int i = 0; i < matrix[row].length; i++) {
            if (matrix[row][i] != 0) {
                matrix[row][i] = -1;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][col] != 0) {
                matrix[i][col] = -1;
            }
        }
    }

    static void optimul1(int[][] matrix) {
        int[] col = new int[matrix[0].length];
        int[] row = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    col[j] = 1;
                    row[i] = 1;
                }
            }
        }
        for (int i : row) {
            System.out.print(i + ",");
        }

        System.out.println();

        for (int i : col) {
            System.out.print(i + ",");
        }

        System.out.println();

        for (int i = 0; i < row.length; i++) {
            for (int j = 0; j < col.length; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }

    }

}
