import java.util.ArrayList;
import java.util.Stack;

/**
 * StockSpan
 */
public class StockSpan {
    public static void main(String[] args) {
        int[] arr = { 7, 2, 1, 2, 2 };
        StockSpanner stock = new StockSpanner();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(stock.next(arr[i]));
        }
    }
}

class StockSpanner {
    private Stack<spanObj> st;

    public StockSpanner() {
        this.st = new Stack<>();
    }

    public int next(int price) {
        int span = 1;
        while (!st.empty() && st.peek().getPrice() <= price) {
            span = span + st.peek().getSpan();
            st.pop();
        }
        st.push(new spanObj(span, price));
        return span;
    }
}

class spanObj {
    private int span;
    private int price;

    public spanObj(int span, int price) {
        this.span = span;
        this.price = price;
    }

    public int getSpan() {
        return span;
    }

    public int getPrice() {
        return price;
    }
}
