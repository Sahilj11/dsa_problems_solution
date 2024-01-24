import java.util.ArrayList;
import java.util.Stack;

/**
 * RemoveBracket
 */
public class RemoveBracket {

    public static void main(String[] args) {
        String s = "(()())(())(()(()))";
        System.out.println(optimul(s));
    }

    private static String optimul(String s) {
        // TODO
        int len = s.length();
        if (len <= 2)
            return "";
        char[] c = s.toCharArray();
        StringBuilder newString = new StringBuilder();
        int open = 1;
        int openLeft = 0;
        for (int i = 1; i < len; i++) {
            if (c[i] == '(') {
                open++;
                if (open > 1)
                    newString.append('(');
            } else {
                if (open > 1)
                    newString.append(')');
                open--;
            }
        }
        return newString.toString();
    }

    private static ArrayList<Character> removeOuter(String s) {
        char[] para = s.toCharArray();
        ArrayList<Character> ls = new ArrayList<>();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < para.length; i++) {
            st.push(para[i]);
            if (st.size() == 2 && st.peek().equals(')')) {
                st.clear();
            } else if (st.size() >= 2) {
                ls.add(st.peek());
                if (st.peek().equals(')')) {
                    st.pop();
                    st.pop();
                }
            }
        }
        return ls;
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
