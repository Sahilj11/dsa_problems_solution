import java.util.Stack;

/**
 * PrefixInfix
 */
public class PrefixInfix {

    public static void main(String[] args) {
        String s = "a+b*(c^d-e)^(f+g*h)-i";
        prefixToInfix(infixConv(s));
    }

    private static String infixConv(String s) {
        Stack<Character> st = new Stack<>();
        String output = new String("");
        for (int i = s.length() - 1; i >= 0; i--) {
            Character c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                output += c;
            } else if (c == ')') {
                st.push(c);
            } else if (c == '(') {
                while (!st.empty() && st.peek() != ')')
                    output += st.pop();
                st.pop();
            } else {
                while (!st.empty() && precedence(c) <= precedence(st.peek())) {
                    output += st.pop();
                }
                st.push(c);
            }
        }
        while (!st.empty()) {
            if (st.peek() == ')') {
                return "expression invalid";
            }
            output += st.pop();
        }
        String prefix = new String("");
        for (int i = output.length() - 1; i >= 0; i--) {
            prefix += output.charAt(i);
        }
        System.out.println(prefix);
        return prefix;
    }

    private static int precedence(Character c) {
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

    private static void prefixToInfix(String s) {
        Stack<String> operand = new Stack<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            Character c = s.charAt(i);
            String temp1 = "" + c;
            if (Character.isLetterOrDigit(c)) {
                operand.push(temp1);
            } else {
                String temp = new String("");
                temp += operand.pop();
                temp += c;
                temp += operand.pop();
                operand.push(temp);
            }
        }
        System.out.println(operand.peek());
    }
}
