/**
 * SearchRotate2
 */
public class SearchRotate2 {

    public static void main(String[] args) {
        int[] arr = {3,3,4,1,2,3};
        System.out.println(optimul(arr, 3));

    }
    private static boolean optimul(int[] arr,int x){
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int midPoint = (low + high) / 2;
            if(arr[midPoint] == x){
                return true;
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
        return false;
    }
}
