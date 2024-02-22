import java.util.Stack;

/**
 * NextSmallest
 */
public class NextSmallest {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        optimul(arr);
    }

    private static void optimul(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] nse = new int[n];
        for (int i = arr.length * 2 - 1; i >= 0; i--) {
            while (!st.empty() && st.peek() >= arr[i % n]) {
                st.pop();
            }
            if (i < n) {
                if (!st.empty())
                    nse[i] = st.peek();
                else
                    nse[i] = -1;
            }
            st.push(arr[i % n]);
        }
        for (int i : nse) {
           System.out.print(i+","); 
        }
    }
}
