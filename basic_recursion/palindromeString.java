import java.util.Stack;

public class palindromeString {

    public static void main(String[] args) {
        String str = "abccba";
        System.out.println(optimul(str));
    }

    private static boolean brute(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            Character c = s.charAt(i);
            if (c.equals(st.pop())) {
                return false;
            } else {
                continue;
            }
        }
        return true;
    }

    private static boolean optimul(String s) {
        int start = 0;
        int end = s.length() - 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
