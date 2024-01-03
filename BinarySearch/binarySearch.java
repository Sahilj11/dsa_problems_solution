
/**
 * binarySearch
 */
public class binarySearch {

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6 };
        System.out.println(binarySearchFun(numbers,3));
    }

    private static int binarySearchFun(int[] arr, int numberToSearch) {
        // first we get the length of arr
        // then we divide the arr and find the mid point
        // we compare the numberToSearch with the mid value
        // if equal return
        // else if greater , then search from mid-1 to last
        // else if smaller , then search from start to mid-1
        // if arr.length == 0 return -1
        int low = 0;
        int high = arr.length-1;
        while (low <= high) {
           int midPoint = (low + high)/2;
           if(numberToSearch == arr[midPoint]){
               return midPoint;
           }
           if(numberToSearch > arr[midPoint]){
               low = midPoint +1;
           }else if(numberToSearch < arr[midPoint]){
               high = midPoint -1;
           }
        }
        return -1;
    }
}
