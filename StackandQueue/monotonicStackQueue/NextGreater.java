import java.util.Stack;

/**
 * NextGreater
 */
public class NextGreater {

    public static void main(String[] args) {
        int[] arr = { 3, 8, 1 };
        optimul(arr);
    }

    private static void brute(int[] arr) {
        int[] ans = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            int pointer = -1;
            for (int j = i + 1; j < arr.length * 2; j++) {
                if (pointer == j) {
                    ans[index] = -1;
                    index++;
                    break;
                }
                if (j < arr.length) {
                    pointer = j;
                } else if (j >= arr.length) {
                    pointer = j % arr.length;
                }
                if (arr[pointer] > arr[j % arr.length]) {
                    ans[index] = arr[pointer];
                    index++;
                    break;
                }
            }
        }
        for (int i : ans) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    private static void optimul(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int nge[] = new int[n];
        for (int i = arr.length * 2 - 1; i >= 0; i--) {
            while (!st.empty() && st.peek() <= arr[i % n]) {
                st.pop();
            }
            if (i < n) {
                if (!st.empty())
                    nge[i] = st.peek();
                else
                    nge[i] = -1;

            }
            st.push(arr[i % n]);
        }
        for (int i : nge) {
            System.out.print(i + ",");
        }
    }
}
