import java.util.Stack;

public class TrappingWater {
    public static void main(String[] args) {

        int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2 };
        brute(arr);
    }

    private static void brute(int[] arr) {
        int waterTrapped = 0;
        for (int i = 0; i < arr.length; i++) {
            int leftMax = 0;
            int rightMax = 0;
            int j = i;
            while (j >= 0) {
                leftMax = Math.max(leftMax, arr[j]);
                j--;
            }
            j = i;
            while (j < arr.length) {
                rightMax = Math.max(rightMax, arr[j]);
                j++;
            }
            waterTrapped+= Math.min(leftMax,rightMax) - arr[i];
        }
        System.out.println(waterTrapped);
    }
    private static void optimul(int[] arr){
       int  
    }
}
