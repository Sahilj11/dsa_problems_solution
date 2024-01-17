import java.util.Arrays;

/**
 * LongestPrefix
 */
public class LongestPrefix {

    public static void main(String[] args) {
        String[] arr = { "dog", "racecar", "car" };
        optimul1(arr);
    }

    private static String brute(String[] arr) {
        String temp = arr[0];
        String ans = "";
        int len = Math.min(temp.length(), arr[1].length());
        for (int j = 0; j < len; j++) {
            if (temp.charAt(j) == arr[1].charAt(j)) {
                ans += temp.charAt(j);
            } else {
                break;
            }
        }
        if (ans.length() == 0) {
            return ans;
        }
        for (int i = 2; i < arr.length; i++) {
            int len2 = Math.min(ans.length(), arr[i].length());
            String temp3 = "";
            for (int j = 0; j < len2; j++) {
                if (ans.charAt(j) == arr[i].charAt(j)) {
                    temp3 += arr[i].charAt(j);
                } else {
                    break;
                }
            }
            if (!temp3.equals(ans)) {
                ans = temp3;
            }
        }
        return ans;
    }

    private static void optimul1(String[] arr) {
        Arrays.sort(arr);
        String compare = arr[0];
        String ans = "";
        String last = arr[arr.length - 1];
        for (int i = 0; i < Math.min(compare.length(), last.length()); i++) {
            if (compare.charAt(i) != last.charAt(i)) {
                System.out.println(ans);
                return;
            }
            ans += compare.charAt(i);
        }
        System.out.println(ans);
    }
}
