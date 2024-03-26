import java.util.Stack;

/**
 * AsteroidColl
 */
public class AsteroidColl {

    public static void main(String[] args) {
        int[] arr = { 10, 2, -5 };
        Stack<Integer> st = new Stack<>();
        optimul(arr, st);
    }

    private static int[] optimul(int[] arr,Stack<Integer> st) {
        for (int i = 0; i < arr.length; i++) {
            if (st.empty()) {
               st.push(arr[i]); 
            }else{
                int a = st.peek();
                int stPeek = a;
                int arrTemp = arr[i];
                if (Integer.signum(a) == Integer.signum(arr[i])) {
                   st.push(arr[i]); 
                }else{
                    if (Integer.signum(a) == -1) {
                       stPeek = stPeek + -stPeek * 2; 
                    } else {
                       arrTemp = arrTemp + -arrTemp * 2; 
                    }
                    if (stPeek > arrTemp) {
                       continue; 
                    }else if (stPeek < arrTemp){
                        st.pop();
                        st.push(arr[i]);
                    }else{
                        st.pop();
                        continue;
                    }
                }
            }
        }
        int[] arr_new = new int[st.size()];
        int temp = 0;
        for (Integer integer : st) {
            arr_new[temp] = integer;
            temp++;
        }
        return arr_new;
    }
}
