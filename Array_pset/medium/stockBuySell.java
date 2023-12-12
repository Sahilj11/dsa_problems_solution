
/**
 * stockBuySell
 */

public class stockBuySell {

    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 3, 6, 4 };
        System.out.println(optimul1(arr));
    }

    static int bruteForce(int[] arr) {
        int profit = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int profitTemp = arr[j] - arr[i];
                if (profit < 0) {
                    continue;
                }
                profit = Math.max(profit, profitTemp);
            }
        }
        return profit;
    }

    static int optimul1(int[] arr) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
            profit = Math.max(profit, arr[i] - min);
        }
        return profit;
    }
}
