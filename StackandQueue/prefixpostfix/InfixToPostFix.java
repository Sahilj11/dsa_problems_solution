import java.util.Stack;

/**
 * InfixToPostFix
 */
public class InfixToPostFix {

    public static void main(String[] args) {
        String infix = "a+b*c^d-e^f+g*h-i";
        System.out.println(bruteMethod(infix));
    }

    private static String bruteMethod(String infix) {
        Stack<Character> st = new Stack<>();
        String postFix = new String("");
        for (int i = 0; i < infix.length(); i++) {
            Character c = infix.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                postFix += c;
            } else if (c == '(') {
                st.push(c);
            } else if (c == ')') {
                while (!st.empty() && st.peek() != '(')
                    postFix += st.pop();
                st.pop();
            } else {
                while (!st.empty() && precedence(c) <= precedence(st.peek()))
                    postFix += st.pop();
                st.push(c);
            }
        }
        while (!st.empty())
            postFix += st.pop();
        return postFix;
    }

    private static int precedence(char c) {
        switch (c) {
            case '^':
                return 3;
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                return -1;
        }
    }
}
