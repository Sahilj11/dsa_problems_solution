
/**
 * LowerBound
 */
public class LowerBound {

    public static void main(String[] args) {
        int[] arr = { 3, 5, 8, 15, 19 };
        System.out.println(optimul(arr, 9));
    }

    private static int bruteFun(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            } else if (arr[i] > x) {
                return i;
            }
        }
        return -1;
    }

    private static int optimul(int[] arr, int x) {
        int lower = 0;
        int high = arr.length - 1;
        int ans = arr.length-1;
        int midPoint = (lower + high) / 2;
        while (lower <= high) {
            if (x <= arr[midPoint]) {
                high = midPoint - 1;
                ans = midPoint;
            } else if (x > arr[midPoint]) {
                lower = midPoint + 1;
            }
            midPoint = (lower + high) / 2;
        }

        return ans;
    }
}
