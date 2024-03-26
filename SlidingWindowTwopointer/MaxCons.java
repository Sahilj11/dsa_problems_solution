import java.util.ArrayDeque;
import java.util.Deque;

/**
 * MaxCons
 */
public class MaxCons {

    public static void main(String[] args) {
        int[] binary = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
        int k = 2;
        System.out.println(optimul(binary, k));
    }

    private static int brute(int[] binary, int k) {
        int maxC = Integer.MIN_VALUE;
        for (int i = 0; i < binary.length; i++) {
            int temp = 0;
            int kTemp = k;
            for (int j = i; j < binary.length; j++) {
                if (binary[j] == 1) {
                    temp++;
                    continue;
                } else if (kTemp != 0 && binary[j] == 0) {
                    temp++;
                    kTemp--;
                } else
                    break;
            }
            maxC = Math.max(temp, maxC);
        }
        return maxC;
    }

    private static int optimul(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int zeros = 0;

        while (end < nums.length) {
            if (nums[end] == 0) {
                zeros++;
            }
            end++;
            if (zeros > k) {
                if (nums[start] == 0) {
                    zeros--;
                }
                start++;
            }
        }
        return end - start;
    }
}
