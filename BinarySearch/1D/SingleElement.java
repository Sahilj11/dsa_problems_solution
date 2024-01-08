/**
 * SingleElement
 */
public class SingleElement {

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,5,5,6,6}; 
        System.out.println(brute(arr));
    }
    private static int brute(int[] arr){
        //TODO
        int SingleElement = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length-1; i++) {
           if(arr[i] == arr[i+1]){
               continue;
           }else{
               SingleElement = arr[i+1];
           } 
        }
        return SingleElement;
    }
}
