import java.util.ArrayList;
import java.util.Collections;

/**
 * Insertionheap
 */
public class Insertionheap {

    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        int[] arr = { 70, 40, 50, 20, 35, 30, 10 };
        for (int i = 0; i < arr.length; i++) {
            ar.add(arr[i]);
        }
        ar.add(60);
        insertHeap(ar, ar.size()-1);
        for (Integer i : ar) {
           System.out.println(i); 
        }
    }

    private static void insertHeap(ArrayList<Integer> arr, int n) {
        while (n >= 0) {
            int parent = n / 2;
            if (arr.get(n) > arr.get(parent)) {
               Collections.swap(arr, n, parent); 
               n = parent;
            }else
                return;
        }
    }
}
