import java.util.*;

public class sortBinary {
    public static void main(String[] args) {
        // sorting a binary array
        int[] arr = { 0, 1, 0, 2, 2, 0, 0 };
        int len = arr.length;
        mergeSort(arr);

    }

    static int[] mergeSort(int[] arr) {
        // first we need to recursively divide the array to find smallest two component
        if (arr.length < 1) {
            return arr;
        }
        int mid = (int) (Math.round((double) arr.length / 2));
        int[] leftHalf = Arrays.copyOfRange(arr, 0, mid);
        int[] leftSorted = mergeSort(leftHalf);
        for (int i : leftSorted) {
            System.out.println(i);
        }
        int[] rightHalf = Arrays.copyOfRange(arr, mid + 1, arr.length - 1);
        int[] rightSorted = mergeSort(rightHalf);
        for (int i : rightSorted) {
            System.out.println(i);
        }
        return leftSorted;
    }
}