import java.util.Arrays;
import java.util.Stack;

/**
 * HandStraight
 */
public class HandStraight {

    public static void main(String[] args) {
        int[] hands = { 1, 2, 3, 6, 2, 3, 4, 7, 8 };
        int groupSize = 3;
        System.out.println(brute(hands, groupSize));
    }

    private static boolean brute(int[] hands, int groupSize) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> rep = new Stack<>();
        if (hands.length % groupSize != 0) {
            return false;
        }
        Arrays.sort(hands);
        for (int i = 0; i < hands.length; i++) {
            if (st.size() == groupSize) {
                st.clear();
                if (rep.empty()) {
                    st.add(hands[i]);
                } else {
                    while (!rep.empty()) {
                        st.add(rep.pop());
                    }
                    if (st.peek() == hands[i] - 1) {
                        st.add(hands[i]);
                    } else if (st.peek() == hands[i]) {
                        rep.add(hands[i]);
                    } else {
                        return false;
                    }
                }
            } else if (st.empty()) {
                if (rep.empty()) {
                    st.add(hands[i]);
                } else {
                    while (!rep.empty()) {
                        st.add(rep.pop());
                    }
                }
            } else {
                if (st.peek() == hands[i] - 1) {
                    st.add(hands[i]);
                } else if (st.peek() == hands[i]) {
                    rep.add(hands[i]);
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
