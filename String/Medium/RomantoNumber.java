import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

/**
 * RomantoNumber
 */
public class RomantoNumber {

    public static void main(String[] args) {
        String s = "LXVMC";
        System.out.println(brute1(s));
    }

    private static int brute1(String s) {
        int ans = 0;
        HashMap<Character, Integer> hp = new HashMap<>();
        hp.put('I', 1);
        hp.put('V', 5);
        hp.put('X', 10);
        hp.put('L', 50);
        hp.put('C', 100);
        hp.put('D', 500);
        hp.put('M', 1000);
        for (int i = 0; i < s.length(); i++) {
            int integer1 = hp.get(s.charAt(i));
            if (i + 1 < s.length()) {
                int integer2 = hp.get(s.charAt(i + 1));
                if (integer1 >= integer2) {
                    ans = ans + integer1;
                } else {
                    ans = ans - integer1;
                }
            } else
                ans += integer1;

        }
        return ans;
    }
}
