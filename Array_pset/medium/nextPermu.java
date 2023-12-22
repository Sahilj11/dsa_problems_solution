import java.util.ArrayList;

/**
 * nextPermu
 */
public class nextPermu {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayList<Integer> ds = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        boolean[] freq = new boolean[arr.length];
        recur(arr,ds,ans,freq);
        ans.forEach((n)-> System.out.println(n));
    }
     static void recur(int[] arr, ArrayList<Integer> ds , ArrayList<ArrayList<Integer>> ans, boolean[] freq){
        if(ds.size() == arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = 0; i < arr.length; i++) {
           if(!freq[i]){
               freq[i] = true;
               ds.add(arr[i]);
               recur(arr, ds, ans, freq);
               ds.remove(ds.size() - 1);
               freq[i] = false;
           } 
        }
    }
}
