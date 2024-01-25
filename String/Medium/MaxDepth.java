import java.util.Stack;

/**
 * MaxDepth
 */
public class MaxDepth {

    public static void main(String[] args) {
        String s = "(1)+((2))+(((3)))";
        System.out.println(brute(s));
    }
    private static int brute(String s){
        Stack<Character> st = new Stack<>();
        int maxDepth= 0;
        for (int i = 0; i < s.length(); i++) {
           if (s.charAt(i)== '(' || s.charAt(i)==')') {
               if(s.charAt(i)== '('){
                   st.push(s.charAt(i));
                   maxDepth = Math.max(maxDepth, st.size());
               }else{
                   st.pop();
               }
           } 
        }
        return maxDepth;
    }
}
