import java.util.Arrays;

class secondLarg{
	public static void main(String[] arg){
		int[] arr = {0,5,4,3,2,1};
        int len = arr.length;
        bruteSecondLarg(arr, len);
        optimulSecondLarg(arr, len);
	}
    static void bruteSecondLarg(int[] arr, int len){
        if(len< 4){
            System.out.println("-1");
        }
        Arrays.sort(arr);
        int secondLarg = arr[len- 2];
        int secondSmall = arr[1];
        System.out.println(secondLarg+ "," + secondSmall);
    }
    static void betterApproach(int[] arr, int len){
        
    }
    static void optimulSecondLarg(int[] arr, int len){
        int largest = 0;
        int secondLargest = -1;
        for (int i = 0; i < len; i++) {
           if(arr[i] > largest){
               secondLargest = largest;
               largest = arr[i];
           } 
        }
        System.out.println(secondLargest);
    }
}
