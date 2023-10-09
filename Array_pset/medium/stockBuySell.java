
/**
 * stockBuySell
 */

public class stockBuySell {

    public static void main(String[] args) {
        int[] arr = { 7, 6, 4, 3, 1 };
        // Brute force
        int len = arr.length;
        int max = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] > arr[j]) {
                    continue;
                } else if (arr[i] < arr[j]) {
                    int tempProfit = arr[j] - arr[i];
                    max = Math.max(max, tempProfit);
                } else {
                    continue;
                }
            }
        }
        System.out.println(max);
    }
}