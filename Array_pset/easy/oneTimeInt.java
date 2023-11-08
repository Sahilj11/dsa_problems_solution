import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class oneTimeInt {
    public static void main(String[] args) {
        int[] arr = { 4, 1, 2, 1, 2 };
        // brute(arr);
        // approach1(arr);
        optimal(arr);
    }

    static void brute(int[] arr) {
        HashMap<Integer, Integer> appear = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!appear.containsKey(arr[i])) {
                appear.put(arr[i], 1);
            }
            for (int j = 1 + i; j < arr.length; j++) {
                if (appear.containsKey(arr[j])) {
                    appear.put(arr[j], appear.get(arr[j]) + 1);
                }
            }
        }
        for (Map.Entry<Integer, Integer> i : appear.entrySet()) {
            if (i.getValue() == 1) {
                System.out.println(i.getKey());
            }
        }
    }

    static void approach1(int[] arr) {
        Arrays.sort(arr);
        ArrayList<Integer> count = new ArrayList<>();
        int once = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i + 1]) {
                count.add(arr[i]);
            }
            if (arr[i] != arr[i + 1] && !count.contains(arr[i])) {
                once = arr[i];
                break;
            }
        }
        System.out.println(once);
    }

    // using XOR apporoach
    // XOR of two same numbers is always 0 i.e. a ^ a = 0. ←Property 1.
    // XOR of a number with 0 will result in the number itself i.e. 0 ^ a = a.
    // ←Property 2
    static void optimal(int[] arr) {
        int xorr = 0;
        for (int i = 0; i < arr.length; i++) {
            xorr = xorr ^ arr[i];
        }
        System.out.println(xorr);
    }
}
