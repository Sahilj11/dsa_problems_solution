/**
 * RearrangeArraySign
 */
public class RearrangeArraySign {

    public static void main(String[] args) {
        int[] arr = { 1, 2, -3, -1, -2, 3 };
        bruteForce(arr);
    }

    static void bruteForce(int[] arr) {
        int positivePointer = 0;
        int negativePointer = 0;
        int[] negArr = new int[arr.length / 2];
        int[] posArr = new int[arr.length / 2];
        int[] reArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negArr[negativePointer] = arr[i];
                negativePointer++;
            } else if (arr[i] > -1) {
                posArr[positivePointer] = arr[i];
                positivePointer++;
            }
        }
        positivePointer = 0;
        negativePointer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                reArr[i] = posArr[positivePointer];
                positivePointer++;
            } else {
                reArr[i] = negArr[negativePointer];
                negativePointer++;
            }
        }
        for (int i : reArr) {
            System.out.println(i);
        }
    }
    static void optimul1(int[] arr){

    }
}
