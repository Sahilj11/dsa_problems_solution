import java.util.HashMap;
import java.util.Map;

/**
 * SingleElement
 */
public class SingleElement {

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6 };
        System.out.println(optimul(arr));
    }

    private static int brute(int[] arr) {
        int SingleElement = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                if (arr[i] != arr[i + 1]) {
                    SingleElement = arr[i];
                    return SingleElement;
                }
            } else if (i == arr.length - 1) {
                if (arr[i] != arr[i - 1]) {
                    SingleElement = arr[i];
                    return SingleElement;
                }
            }else{
                if(arr[i] != arr[i-1] && arr[i] != arr[i+1]){
                    SingleElement = arr[i];
                    return SingleElement;
                }
            }
        }
        return SingleElement;
    }
    private static int optimul(int[] arr){
        // TODO
        if(arr.length == 1){
            return arr[0];
        }
        if(arr[0] != arr[1]){
            return arr[0];
        }
        if(arr[arr.length-1] != arr[arr.length-2]){
            return arr[arr.length-1];
        }
        int low = 1;
        int high = arr.length-2;
        while (low <= high) {
           int mid = (low + high) / 2;
           if(arr[mid - 1] != arr[mid] && arr[mid+1] != arr[mid]){
               return arr[mid];
           }
           if(arr[mid] == arr[mid-1]){
               if(mid % 2 == 0){
                   low = mid + 1;
               }else{
                   high = mid - 1;
               }
           }
           if(arr[mid] == arr[mid+1]){
               if(mid % 2 == 0){
                   high = mid - 1;
               }else{
                   low = mid + 1;
               }
           }
        }
        return -1;
    }
}
