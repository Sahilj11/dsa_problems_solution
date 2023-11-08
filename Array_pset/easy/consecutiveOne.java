import java.util.ArrayList;

public class consecutiveOne {

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 0, 1};
        approach(arr);
    }

    static void approach(int[] arr) {
        ArrayList<Integer> countArr = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
                while (i < arr.length && arr[i] == 1) {
                    if (i >= arr.length) {
                        break;
                    }
                    count++;
                    i++;
                }
                if(count > 0){
                    countArr.add(count);
                }
        }
        int largestCount = 0;
        for (Integer integer : countArr) {
            if(integer > largestCount){
                largestCount = integer;
            }
        }
        System.out.println(largestCount);
    }
}
