import java.util.LinkedList;

public class moveZero {
	public static void main(String[] args) {
		int[] arr = {1,0,2,0,1,2};
        int len = arr.length;
        // TODO : optimul approach 
        // bruteForce(arr);
        System.out.println(optimalApp(arr, len));
        betterApproach(arr);
        // zeroMove(arr);
		// int i = 0;
		// int endKey = arr.length - 1;
		// while( i < endKey){
		// 	if(arr[endKey] == 0){
		// 		endKey--;
		// 	}
		// 	if(arr[i] == 0){
		// 		for (int j = i+1; j <= endKey; j++) {
		// 			arr[j-1] = arr[j];
		// 		}
		// 		arr[endKey] = 0;
		// 		endKey--;
		// 		i++;
		// 	}else{
		// 		i++;
		// 	}
		// }
		// for (int var : arr) {
		// 	System.out.println(var);
		// 	
		// }
	}
    static void bruteForce(int[] arr){
        LinkedList<Integer> nonZero = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
           if(arr[i] != 0){
               nonZero.add(arr[i]);
           } 
        }
        int size = nonZero.size();
        for (int i = 0; i < arr.length - size; i++) {
           nonZero.add(0); 
        }
        for (Object j : nonZero) {
            System.out.println(j);
        }
    }
    static void betterApproach(int[] arr){
        int lastNonZero = arr.length-1;
        int first = 0;
        for (int i = arr.length- 1; i > 0; i--) {
           if(arr[i] == 0){
               lastNonZero--;
           }else{
               break;
           } 
        }
        System.out.println(lastNonZero + "LastNonZero");
        while (first != lastNonZero) {
            if(arr[first] == 0){
                for (int i = first; i < lastNonZero; i++) {
                   arr[first] = arr[first+1]; 
                }
                arr[lastNonZero] = 0;
                lastNonZero--;
            }else{
                first++;
            }
        }
        for (int i : arr) {
           System.out.println(i); 
        }
    }
    static int[] optimalApp(int[] a, int n){
        int j = -1;
        //place the pointer j:
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }

        //no non-zero elements:
        if (j == -1) return a;

        //Move the pointers i and j
        //and swap accordingly:
        for (int i = j + 1; i < n; i++) {
            if (a[i] != 0) {
                //swap a[i] & a[j]:
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                j++;
            }
        }
        return a;
    }
}
