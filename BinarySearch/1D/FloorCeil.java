
/**
 * FloorCeil
 */
public class FloorCeil {

    public static void main(String[] args) {
        int[] arr = { 3, 4, 4, 7, 8, 10 };
        // brute(arr, 5);
        optimul(arr, 5);
    }

    private static void brute(int[] arr, int x) {
        int[] ans = { 0, 0 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= x) {
                ans[0] = arr[i];
            }
            if (arr[i] > x) {
                ans[1] = arr[i];
                break;
            }
        }
        for (int i : ans) {
            System.out.println(i);
        }
    }

    private static void optimul(int[] arr, int x) {
        int lower = 0;
        int high = arr.length - 1;
        int midPoint = (lower + high) / 2;
        int[] ans = { 0, 0 };
        while (lower <= high) {
            if (arr[midPoint] <= x) {
                ans[0] = arr[midPoint];
                lower = midPoint + 1;
            }
            if (arr[midPoint] > x) {
                ans[1] = arr[midPoint];
                high = midPoint - 1;
            }
            midPoint = (lower + high) / 2;
        }
        for (int i : ans) {
           System.out.println(i); 
        }
    }
}
