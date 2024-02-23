import java.util.Stack;

public class palindromeString {

    public static void main(String[] args) {
        // TODO: checking palindrome string
        String str = "TAKE U FORWARD";
        System.out.println(brute(str));
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
}
