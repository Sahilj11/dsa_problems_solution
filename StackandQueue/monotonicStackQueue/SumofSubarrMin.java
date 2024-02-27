import java.util.Stack;

/**
 * SumofSubarrMin
 */
public class SumofSubarrMin {

    public static void main(String[] args) {
        int[] arr = { 11, 81, 94, 43, 3 };
        System.out.println(optimul(arr));
    }

    private static int brute(int[] A) {
        if(A == null || A.length == 0) return 0;
 		long sum = 0;
 		for(int i = 0; i < A.length; i++){
 			int min = A[i];
 			for(int j = i; j < A.length; j++){
 				min = Math.min(A[j], min);
 				sum += min;
 			}
 		}
 		return (int)(sum % (Math.pow(10, 9) + 7));
    }

    private static int optimul(int[] arr) {
        int sum = 0;
        Stack<data> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!st.empty() && arr[i] < st.peek().getNum()) {
                int left, right;
                data temp = st.pop();
                if (!st.empty()) {
                    left = temp.getIndex() - st.peek().getIndex();
                } else {
                    left = temp.getIndex() + 1;
                }
                right = i - temp.getIndex();
                sum = sum + temp.getNum() * left * right;
            }
            st.push(new data(i, arr[i]));
        }
        return sum;
    }

}

class data {
    private int index;
    private int num;

    public data(int index, int num) {
        this.index = index;
        this.num = num;
    }

    public int getIndex() {
        return index;
    }

    public int getNum() {
        return num;
    }

}
