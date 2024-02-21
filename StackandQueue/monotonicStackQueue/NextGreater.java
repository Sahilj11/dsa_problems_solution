import java.lang.reflect.Array;

/**
 * NextGreater
 */
public class NextGreater {

    public static void main(String[] args) {
        int[] arr = { 3, 10, 4, 3, 4, 32, 8, 1 };
        brute(arr);
    }

    private static void brute(int[] arr) {
        int[] ans = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            boolean foundGreater = false;
            int pointer;
            if (i == arr.length - 1) {
                pointer = 0;
            } else {
                pointer = i + 1;
            }
            while (i != pointer) {
                if (arr[pointer] > temp) {
                    ans[index] = arr[pointer];
                    foundGreater = true;
                    index++;
                    break;
                }
                if (pointer == arr.length - 1) {
                    pointer = 0;
                    continue;
                }
                pointer++;
            }
            if (foundGreater == false) {
                ans[index] = -1;
                index++;
            }
        }
        for (int i : ans) {
            System.out.println(i);
        }
    }

}
