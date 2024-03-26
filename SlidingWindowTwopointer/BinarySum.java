/**
 * BinarySum
 */
public class BinarySum {

    public static void main(String[] args) {
        int[] binary = { 0, 0, 0, 0, 0 };
        int goal = 0;
        System.out.println(optimul(binary, goal));
    }

    private static int optimul(int[] binary, int goal) {
        int max = 0;
        int sum = 0;
        int l = 0;
        for (int r = 0; r < binary.length; r++) {
            sum = sum + binary[r];
            if (sum == goal) {
                max++;
            }
            if (sum > goal) {
                while (l <= r) {
                    if (sum == goal) {
                        max++;
                    }
                    if (binary[l] == 1) {
                        sum--;
                        l++;
                        continue;
                    }
                    l++;
                }
            }
        }
        return max;
    }
}
