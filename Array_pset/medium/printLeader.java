import java.util.ArrayList;

/**
 * printLeader
 */
public class printLeader {

    public static void main(String[] args) {
        int[] arr = { 4, 7, 1, 0 };
        ArrayList<Integer> leader = new ArrayList<>();
        // brute(arr, leader);
        optimul1(arr, leader);
    }

    static void brute(int[] arr, ArrayList<Integer> leader) {
        int tmpLeader = 0;
        boolean isLeader = false;
        for (int i = 0; i < arr.length; i++) {
            tmpLeader = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (tmpLeader <= arr[j]) {
                    break;
                } else {
                    isLeader = true;
                }
            }
            if (isLeader) {
                leader.add(tmpLeader);
            }
        }
        for (Integer integer : leader) {
            System.out.println(integer);
        }
    }

    static void optimul1(int[] arr, ArrayList<Integer> leader) {
        int max = arr[arr.length-1];
        leader.add(max);
        for (int i = arr.length - 1; i >= 0; i--) {
            if (max < arr[i]) {
                leader.add(arr[i]);
                max = arr[i];
            }
        }
        for (Integer integer : leader) {
            System.out.println(integer);
        }
    }
}
