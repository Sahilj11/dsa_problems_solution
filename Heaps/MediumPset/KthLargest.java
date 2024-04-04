import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * KthLargest
 */
public class KthLargest {

    public static void main(String[] args) {
        int[] arr = { -1, 2, 0 };
        int k = 0;
        System.out.println(optimul(arr, k));
    }

    private static int bruteForce(int[] arr, int k) {
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
        if (k == 0) {
            return arr[arr.length - 1];
        }
        return arr[arr.length - k];
    }

    private static int optimul(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        k = k - 1;
        while (k > 0) {
            pq.remove();
            k--;
        }
        return pq.peek();
    }

}
