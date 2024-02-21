import java.util.Stack;

/**
 * PostToPrefix
 */
public class PostToPrefix {
    public static void main(String[] args) {
        String s = "abc/-ad/e-*";
        // String prefix = "+*ab/c";
        //*-a/bc-/ade

        System.out.println(brute(s));
    }

    private static String brute(String s) {
        Stack<String> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            String temp = "" + c;
            if (Character.isLetterOrDigit(c)) {
                st.push(temp);
            } else {
                String operand1 = st.pop();
                String operand2 = st.pop();
                temp += operand2;
                temp += operand1;
                st.push(temp);
            }
        }
        return st.peek();
    }
}
