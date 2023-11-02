import java.util.ArrayList;
import java.util.LinkedHashSet;

class removeDuplicate{
	public static void main(String[] args){
        int[] arr = {0,2,4,5,5,6,7,8,8};
        removeDuplicatefun(arr);
        bruteForce(arr);
	}
    static void bruteForce(int[] arr){
        LinkedHashSet set= new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
           set.add(arr[i]); 
        }
        for (Object object : set) {
           System.out.println(object); 
        }
    }
    static void removeDuplicatefun(int[] arr){
        int len = arr.length;
        ArrayList newArr = new ArrayList<>();
        for (int i = 0; i < len; i++){
            int temp = arr[i];
            for (int j = i+1; j < len; j++){
               if(temp != arr[j]){
                   newArr.add(temp);
                  break;
               }else{
                   i++;
                   continue;
               }
            }
       }
       for (Object object : newArr) {
           System.out.println(object);
       } 
    }
    static void optimulFun(int[] arr){

    }
}
