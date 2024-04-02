/**
 * CheckingMinMax
 */
public class CheckingMinMax {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6, 7 };
        System.out.println(isMinHeap(arr));
    }

    private static boolean isMinHeap(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int leftNode = 2 * i + 1;
            int rightNode = 2 * i + 2;
            if (leftNode < arr.length && arr[leftNode] < arr[i]) {
                return false;
            } else if (rightNode < arr.length && arr[rightNode] < arr[i]) {
                return false;
            }
        }
        return true;
    }

}
