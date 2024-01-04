/**
 * FirstLastArray
 */
public class FirstLastArray {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 8, 8, 11, 13};
        brute(arr,8);
    }
    private static void brute(int[] arr,int x){
        int occur = 0;
        int[] index = {0,0};
        for (int i = 0; i < arr.length; i++) {
            if(occur > 0 && arr[i] == x){
                index[1] = i;
            }else if(arr[i] == x && occur == 0){
              occur++;
              index[0] = i;
           } 
        }
        for (int i : index) {
           System.out.println(i); 
        }
    }
    
    private static void optimul1(int[] arr,int x){
        int low = 0;
        int high = arr.length-1;
        int occur = 0;
        int[] index = {0,0};
        int midPoint = (low+high) / 2;
        while (low <= high) {
 
        }
    }
}
