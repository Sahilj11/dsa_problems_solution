/**
 * MergeSort
 */
public class MergeSort {

    public static void main(String[] args) {
        // int[][] arr = {{1,2,3},{6,8,9},{3,4,5}};
        int[] arr = { 54, 3, 2, 1, 1 };
    }

    private static void merge(int[] arr, int beg, int end) {
        if (beg < end) {
            int mid = (beg + end) / 2;
            merge(arr, beg, mid);
            merge(arr, mid + 1, end);

        }
    }

    private static void mergeSort(int[] arr, int left, int mid, int right) {
        int[] arr1 = new int[mid - left + 1];
        int[] arr2 = new int[right - mid];
    }

}
