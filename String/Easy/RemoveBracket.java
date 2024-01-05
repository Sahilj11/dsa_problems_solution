import java.util.Stack;

/**
 * RemoveBracket
 */
public class RemoveBracket {

    public static void main(String[] args) {
        String s = "(()())(()))";
        System.out.println(validString(s));
    }

    private static boolean validString(String s) {
        char[] para = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < para.length; i++) {
            if (st.empty() == false && st.peek().equals('(') && para[i] == ')') {
                st.pop();
                continue;
            } else {
                st.push(para[i]);
            }
        }
        if (st.empty())
            return true;
        else
            return false;
    }
}
