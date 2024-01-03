/**
 * UpperBound
 */
public class UpperBound {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3 };
        System.out.println(optimul(arr, 3));
    }

    private static int bruteFun(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > number) {
                return i;
            }
        }
        return arr.length - 1;
    }

    private static int optimul(int[] arr, int number) {
        int lower = 0;
        int high = arr.length - 1;
        int midPoint = (lower + high) / 2;
        int ans = -1;
        while (lower <= high) {
            if (arr[midPoint] > number) {
                ans = midPoint;
                high = midPoint - 1;
            }
            if (arr[midPoint] <= number) {
                lower = midPoint + 1;
            }
            midPoint = (lower + high) / 2;
        }
        return ans;
    }
}
