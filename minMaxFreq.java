import java.util.*;
public class minMaxFreq {

    public static void main(String[] args) {
        int[] arr = {2,2,3,4,4,2};
        minMaxCounter(arr);
    }
    static void minMaxCounter(int[] arr){
       HashMap<Integer, Integer> occur = new HashMap<>();
       for (int i = 0; i < arr.length; i++) {
           if(occur.containsKey(arr[i])== false){
               occur.put(arr[i],1);
          }else {
              occur.put(arr[i], occur.get(arr[i]) + 1);
          }
       }
       for (Integer i : occur.keySet()) {
         System.out.println(i + " occurs " + occur.get(i));
       }
    }
}
