import java.util.HashSet;
import java.util.Set;

/**
 * LongestSubstring
 */
public class LongestSubstring {

    public static void main(String[] args) {
        String s = "takeUforward";
        System.out.println(brute(s));
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
    private static int optimul(String s){

    }
}
