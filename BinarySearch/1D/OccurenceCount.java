/**
 * OccurenceCount
 */
public class OccurenceCount {

    public static void main(String[] args) {
        int[] arr = { 2, 2, 3, 3, 3, 3, 4 ,4};
        optimul(arr, 4);
    }

    private static int brute(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count;
    }

    private static void optimul(int[] arr, int x) {
        System.out.println((highBinary(arr, x) - lowBinary(arr, x))+1);
    }
     private static int lowBinary(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int midPoint = (low + high) / 2;
        int ans = 0;
        while (low <= high) {
            if (arr[midPoint] == x) {
                ans = midPoint;
                high = midPoint - 1;
            }
            if (arr[midPoint] > x) {
                high = midPoint - 1;
            }
            if (arr[midPoint] < x) {
                low = midPoint + 1;
            }
            midPoint = (low + high) / 2;
        }
        return ans;
    }   
    private static int highBinary(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int midPoint = (low + high) / 2;
        int ans = 0;
        while (low <= high) {
            if (arr[midPoint] == x) {
                ans = midPoint;
                low = midPoint + 1;
            }
            if (arr[midPoint] > x) {
                high = midPoint - 1;
            }
            if (arr[midPoint] < x) {
                low = midPoint + 1;
            }
            midPoint = (low + high) / 2;
        }
        return ans;
    }
}
