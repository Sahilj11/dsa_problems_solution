import java.util.Stack;

/**
 * PostToInfix
 */
public class PostToInfix {

    public static void main(String[] args) {
        String postfix = "*-a/bc-/ade";
        System.out.println(toInfix(postfix));
    }

    private static String toInfix(String s) {
        Stack<String> st = new Stack<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            Character c = s.charAt(i);
            String temp = ""+c;
            if (Character.isLetterOrDigit(c)) {
               st.push(temp); 
            }else{
                String temp1 = "";
                temp1+=st.pop();
                temp1+=c;
                temp1+=st.pop();
                st.push(temp1);
            }
        }
        return st.peek();
    }
}
