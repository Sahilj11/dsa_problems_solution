/**
 * SearchRotateArray
 */
public class SearchRotateArray {

    public static void main(String[] args) {
        // int[] arr = {1,2,3,4,5};
        int[] arr = { 4, 5, 1, 2, 3 };
        System.out.println(optimul2(arr, 3));
    }

    private static int brute(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    private static int optimul1(int[] arr, int x) {
        int pivot = findPivot(arr);
        if (arr[pivot] == x) {
            return pivot;
        } else {
            int ans1 = binarySearch(arr, 0, pivot - 1, x);
            if (ans1 != -1) {
                return ans1;
            } else {
                return binarySearch(arr, pivot, arr.length - 1, x);
            }
        }
    }

    private static int binarySearch(int[] arr, int left, int right, int x) {
        while (left <= right) {

            int midPoint = (left + right) / 2;
            if (x == arr[midPoint]) {
                return midPoint;
            }
            if (x > arr[midPoint]) {
                left = midPoint + 1;
            } else if (x < arr[midPoint]) {
                right = midPoint - 1;
            }
        }
        return -1;
    }

    private static int findPivot(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                continue;
            } else {
                return i + 1;
            }
        }
        return -1;
    }

    private static int optimul2(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int midPoint = (low + high) / 2;
            if(arr[midPoint] == x){
                return midPoint;
            }
            if (arr[midPoint] >= arr[low]) {
                if (arr[midPoint] >= x && arr[low] <= x) {
                    high = midPoint - 1;
                } else {
                    low = midPoint + 1;
                }
            } else {
                if (arr[midPoint] <= x && arr[high] >= x) {
                    low = midPoint + 1;
                } else {
                    high = midPoint - 1;
                }
            }
        }
        return ans;
    }
}
