/**
 * MinimumElement
 */
public class MinimumElement {

    public static void main(String[] args) {
        int[] arr = { 7, 8, 1, 2, 3, 4, 5, 6 };
        System.out.println(optimul1(arr));
    }

    private static int brute(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    private static int optimul1(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int smallest = Integer.MAX_VALUE;
        while (low <= high) {
            int midPoint = (low + high) / 2;
            if (arr[midPoint] >= arr[low]) {
                if (arr[low] < smallest) {
                    smallest = arr[low];
                }
                low = midPoint + 1;
            } else if (arr[midPoint] <= arr[high]) {
                if (arr[midPoint] < smallest) {
                    smallest = arr[midPoint];
                }
                high = midPoint - 1;
            }
        }
        return smallest;
    }
}
