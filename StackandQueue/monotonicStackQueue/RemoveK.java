import java.util.Stack;

/**
 * RemoveK
 */
public class RemoveK {

    public static void main(String[] args) {
        String num = "112";
        optimul(num, 1);
    }

    private static String brute(String num, int k) {
        if (num.length() == k) {
            return "0";
        }
        int left = 0;
        int right = left + k - 1;
        Stack<Integer> st = new Stack<>();
        while (right < num.length()) {
            String temp = "";
            for (int i = 0; i < left; i++) {
                temp += num.charAt(i);
            }
            for (int i = right + 1; i < num.length(); i++) {
                temp += num.charAt(i);
            }
            int current = Integer.parseInt(temp);
            if (!st.empty()) {
                if (current > st.peek()) {
                    ;
                } else {
                    while (!st.empty() && current < st.peek()) {
                        st.pop();
                    }
                    st.push(current);
                }
            } else {
                st.push(current);
            }
            left++;
            right++;
        }
        return Integer.toString(st.peek());
    }

    private static String optimul(String num, int k) {
        if (num.length() == k) {
            return "0";
        }
        int i = 0;
        Stack<Character> st = new Stack<>();
        while (i < num.length()) {
            while (k > 0 && !st.empty() && st.peek() > num.charAt(i)) {
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
            i++;
        }
        while (k > 0) {
            st.pop();
            k--;
        }
        StringBuilder smallest = new StringBuilder();
        while (!st.empty()) {
            smallest.append(st.pop());
        }
        smallest.reverse();

        while (smallest.length() > 1 && smallest.charAt(0) == '0')
            smallest.deleteCharAt(0);

        return smallest.toString();
    }
}
