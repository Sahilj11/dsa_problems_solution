import java.util.*;

public class unionArray {
	public static void main(String[] args) {

        int arr1[] = {1,2,3,4,5,6,7,8,9,10};
        int arr2[] = {2,3,4,4,5,11,12};
		int arr1Length = arr1.length;
		int arr2Length = arr2.length;

        unionSol1(arr1, arr2, arr1Length, arr2Length);
	}

    static void unionSol1(int[] a1 , int[] a2, int arrLen1 , int arrLen2){
       LinkedHashSet<Integer> union = new LinkedHashSet<>(); 
       for (int integer : a1) {
          union.add(integer);
       }
       for (int integer : a2) {
          union.add(integer);
       }
       for (Integer integer : union) {
         System.out.println(integer); 
       }
    }
    static void unionSol2 (int[] a1 , int[] a2, int arrLen1 , int arrLen2){

    }
}
