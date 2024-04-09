/**
 * MergeSorted
 */
public class MergeSorted {

    public static void main(String[] args) {
        int[][] arr = { { 1, 4, 5 }, { 1, 3, 4 }, { 2, 6 } };
        int totalE = 0;
        for (int[] is : arr) {
            totalE += is.length;
        }
        int[] sorted = new int[totalE];
        for (int i = 0; i < arr.length - 1; i++) {
            merge(arr, i, i + 1, sorted);
        }
        for (int i : sorted) {
            System.out.println(i);
        }
    }

    private static void merge(int[][] arr, int start, int end, int[] sorted) {

        merging(arr, start, end, sorted);
    }

    private static void merging(int[][] arr, int left, int right, int[] sorted) {

        int i = 0, j = 0;
        int k = left;
    }
}
