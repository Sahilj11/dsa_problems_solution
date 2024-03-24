import java.util.HashSet;
import java.util.Set;

/**
 * LongestSubstring
 */
public class LongestSubstring {

    public static void main(String[] args) {
        String s = "takeUforward";
        System.out.println(optimul(s));
    }

    private static int brute(String s) {
        Set<Character> set = new HashSet<>();
        int max_string = 1;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                int sizeSet = set.size();
                set.add(s.charAt(j));
                if (set.size() == sizeSet) {
                    set.clear();
                    max_string = Math.max(max_string, sizeSet);
                    break;
                }
            }
        }
        return max_string;
    }

    private static int optimul(String s) {
        Set<Character> st = new HashSet<>();
        int left = 0;
        int maxSub = Integer.MIN_VALUE;
        for (int right = 0; right < s.length(); right++) {
            if (st.contains(s.charAt(right))) {
                while (left < right && st.contains(s.charAt(right))) {
                    st.remove(s.charAt(left));
                    left++;
                }
            }
            st.add(s.charAt(right));
            maxSub = Math.max(maxSub, right - left + 1);
        }
        return maxSub;
    }
}
