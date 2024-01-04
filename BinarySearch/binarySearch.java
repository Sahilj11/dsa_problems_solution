
/**
 * binarySearch
 */
public class binarySearch {

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6 };
        System.out.println(binarySearchRecur(numbers,0,numbers.length-1,6)); 
    }

    private static int binarySearchFun(int[] arr, int numberToSearch) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int midPoint = (low + high) / 2;
            if (numberToSearch == arr[midPoint]) {
                return midPoint;
            }
            if (numberToSearch > arr[midPoint]) {
                low = midPoint + 1;
            } else if (numberToSearch < arr[midPoint]) {
                high = midPoint - 1;
            }
        }
        return -1;
    }

    private static int binarySearchRecur(int[] arr, int left, int right, int numberToSearch) {
        if (left <= right) {
            int midPoint = (left + right) / 2;
            if (arr[midPoint] == numberToSearch) {
                return midPoint;
            } else if (arr[midPoint] > numberToSearch) {
                return binarySearchRecur(arr, left, midPoint-1, numberToSearch);
            } else {
                return binarySearchRecur(arr, midPoint+1, right, numberToSearch);
            }
        }
        return -1;
    }
}
