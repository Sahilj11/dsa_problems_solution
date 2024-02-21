import java.util.Stack;

/**
 * MinStack
 */
public class MinStack {
    public static void main(String[] args) {
        minStack mi = new minStack();
        mi.push(1);
        mi.push(-1);
        mi.push(3);
        System.out.println(mi.minStack.peek());
        mi.pop();
        mi.pop();
        System.out.println(mi.minStack.peek());
    }
}

class minStack {
    Stack<Integer> st;
    Stack<Integer> minStack;

    public minStack() {
        this.st = new Stack<>();
        this.minStack = new Stack<>();
    }

    void push(int x) {
        if (st.empty()) {
            minStack.push(x);
        } else {
            if (minStack.peek() > x) {
                minStack.push(x);
            } else if (minStack.peek() < x) {
            } else {
                minStack.push(x);
            }
        }
        st.push(x);
    }

    int getMin() {
        return minStack.peek();
    }

    void pop() {
        if (st.empty()) {
            return;
        } else if (st.peek() == minStack.peek()) {
            minStack.pop();
            st.pop();
        } else {
            st.pop();
        }
    }
}
