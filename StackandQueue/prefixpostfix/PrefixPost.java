import java.util.Stack;

/**
 * PrefixPost
 */
public class PrefixPost {

    public static void main(String[] args) {
        String prefix = "+a-*b^-^cde+f*ghi";
        // String infix = "a+b*c^d-e^f+g*h-i";
        // String postfix= "abcd^*+ef^-gh*+i-";
        brute(prefix);
    }

    private static void brute(String s) {
        String postfix = new String("");
        Stack<String> st = new Stack<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            Character c = s.charAt(i);
            String temp1 = "" + c;
            if (Character.isLetterOrDigit(c)) {
                st.push(temp1);
            } else {
                String temp = new String("");
                temp += st.pop();
                temp += st.pop();
                temp += c;
                st.push(temp);
            }
        }
        System.out.println(st.peek());
    }
}
