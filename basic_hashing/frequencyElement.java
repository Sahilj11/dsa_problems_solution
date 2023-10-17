import java.util.*;
public class frequencyElement{
    public static void main(String[] args) {
        int[] arr = {2,2,3,4,4,2};
        // bruteFreq(arr);
        optFreq(arr);
    }
    static void bruteFreq(int[] arr){
        boolean[] boolArr = new boolean[arr.length];
        Arrays.fill(boolArr, false);
        for (int i = 0; i < arr.length; i++) {
            if(boolArr[i] == false){
               boolArr[i] = true; 
               int e = arr[i]; 
               int occurence= 0;
               for (int j = 0; j < arr.length; j++) {
                  if(arr[j] == e){
                      boolArr[j] = true;
                     occurence++;
                  }else continue; 
               }
               System.out.println(e + " occurs: " + occurence);
            }
        }
    }
    static void optFreq(int[] arr){
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
