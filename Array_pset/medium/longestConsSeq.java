import java.util.*;

/**
 * longestConsSeq
 */
public class longestConsSeq {

    public static void main(String[] args) {
        int[] arr = { 100, 200, 1, 3, 2, 4, 2 };
        // bruteForce(arr);
        // optimul1(arr);
        optimul2(arr);
    }

    static void bruteForce(int[] arr) {
        int maxCons = 1;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int tmp = 1;
            int counter = 1;
            for (int j = 0; j < arr.length; j++) {
                int temp = num + tmp;
                if (linearSearch(arr, temp)) {
                    tmp++;
                    counter++;
                }
            }
            maxCons = Math.max(counter, maxCons);
            counter = 1;
        }
        System.out.println(maxCons);
    }

    static boolean linearSearch(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

    static void optimul1(int[] arr) {
        Arrays.sort(arr);
        int lastSmaller = Integer.MIN_VALUE;
        int cnt = 0;
        int longest = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - 1 == lastSmaller) {
                cnt++;
                lastSmaller = arr[i];
            } else if (arr[i] != lastSmaller) {
                cnt = 1;
                lastSmaller = arr[i];
            }
            longest = Math.max(cnt, longest);
        }
        System.out.println(longest);
    }

    static void optimul2(int[] arr) {
        // TODO: 
        SortedSet<Integer> st = new TreeSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            st.add(arr[i]);
        }
        for (Integer integer : st) {
            System.out.println(integer);
        }
    }
}

