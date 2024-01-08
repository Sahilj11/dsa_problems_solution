/**
 * FreqOfArr
 */
public class FreqOfArr {

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2, 3 };
        System.out.println(optimul(arr));
    }

    private static int brute(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int smallestIndex = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    private static int optimul(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int smallest = Integer.MAX_VALUE;
        int smallestIndex = 0;
        while (low <= high) {
            int midPoint = (low + high) / 2;
            if (arr[midPoint] >= arr[low]) {
                if (arr[low] < smallest) {
                    smallest = arr[low];
                    smallestIndex = low;
                }
                low = midPoint + 1;
            } else if (arr[midPoint] <= arr[high]) {
                if (arr[midPoint] < smallest) {
                    smallest = arr[midPoint];
                    smallestIndex = low;
                }
                high = midPoint - 1;
            }
        }
        return smallestIndex;
    }
}
