import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

import javax.crypto.Mac;

/**
 * SlidingWindow
 */
public class SlidingWindow {

    public static void main(String[] args) {
        int[] arr = { 4, 0, -1, 3, 5, 3, 6, 8 };
        int k = 3;
        ArrayList<Integer> ans = new ArrayList<>();
        ans = optimul(arr, ans, k);
        for (Integer integer : ans) {
            System.out.println(integer);
        }
    }

    private static ArrayList<Integer> brute(int[] arr, ArrayList<Integer> ans, int k) {
        int left = 0;
        int right = k - 1;
        while (right < arr.length) {
            // first we need to find max in current window and add it to ans
            // then shift the window
            int max = Integer.MIN_VALUE;
            for (int i = left; i <= right; i++) {
                max = Math.max(max, arr[i]);
            }
            ans.add(max);
            left++;
            right++;
        }
        return ans;
    }

    private static ArrayList<Integer> optimul(int[] arr, ArrayList<Integer> ans, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++) {
            if (!dq.isEmpty() && dq.peek() == i - k) {
                dq.pop();
            }
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.pollLast();
            }
            dq.offer(i);
            if (i >= k - 1) {
                ans.add(arr[dq.peek()]);
            }
        }
        return ans;
    }
}
