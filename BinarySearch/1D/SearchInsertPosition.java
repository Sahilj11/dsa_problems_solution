/**
 * SearchInsertPosition
 */
public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 7 };
        System.out.println(optimul(arr, 2));
    }

    private static int bruteFun(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            } else if (arr[i] > x) {
                return i;
            }
        }
        return arr.length - 1;
    }

    private static int optimul(int[] arr, int x) {
        int lower = 0;
        int high = arr.length - 1;
        int midPoint = (lower + high) / 2;
        int ans = -1;
        while (lower <= high) {
            if (arr[midPoint] >= x) {
                ans = midPoint;
                high = midPoint -1;
            }
            if (arr[midPoint] < x) {
                lower = midPoint + 1;
            }
            midPoint = (lower + high) / 2;
        }
        return ans;
    }
}
