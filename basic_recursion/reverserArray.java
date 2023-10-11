public class reverserArray {
    public static void main(String[] args) {
        // there are two way to achieve this
        // either by create a new array
        // and while reverse iterating the input array storing element in new array from
        // start

        // this approach do not require extra space
        int[] arr = { 6, 7, 4, 3, 1, 2 };
        int len = arr.length;
        revArr(arr, len);
    }

    static void revArr(int[] arr, int len) {
        for (int j = 0; j < arr.length; j++) {
            int tempLast = arr[len - 1];
            for (int i = len - 1; i >= 1 + j; i--) {
                arr[i] = arr[i - 1];
            }
            arr[j] = tempLast;
        }
        for (int i : arr) {
            System.out.println(i);
        }

    }

}
