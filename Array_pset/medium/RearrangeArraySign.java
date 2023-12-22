/**
 * RearrangeArraySign
 */
public class RearrangeArraySign {

    public static void main(String[] args) {
        int[] arr = { 1, 2, -3, -1, -2, 3 };
        // bruteForce(arr);
        // optimul1(arr);
        optimul2(arr);
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

    static void optimul1(int[] arr) {
        int ith = 0;
        int positive = 0;
        int negative = 0;
        int alternate[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (ith % 2 == 0) {
                if (arr[positive] >= 0) {
                    alternate[ith] = arr[positive];
                    positive = checkPos(arr, positive);
                } else {
                    positive = checkPos(arr, positive);
                    alternate[ith] = arr[positive];
                }
            } else {
                if (arr[negative] < 0) {
                    alternate[ith] = arr[negative];
                    negative = checkNeg(arr, negative);
                } else {
                    negative = checkNeg(arr, negative);
                    alternate[ith] = arr[negative];
                }

            }
            ith++;
        }
        for (int i : alternate) {
            System.out.print(i);
            System.out.print(",");
        }

        System.out.println();
    }

    static int checkPos(int[] arr, int pos) {
        while (pos < arr.length - 1) {
            pos++;
            if (arr[pos] >= 0) {
                return pos;
            }
        }
        return pos;
    }

    static int checkNeg(int[] arr, int neg) {
        while (neg < arr.length - 1) {
            neg++;
            if (arr[neg] < 0) {
                return neg;
            }
        }
        return neg;
    }

    static void optimul2(int[] arr) {
        int i = 0;
        int posIndex = 0;
        int negIndex = 1;
        int alternate[] = new int[arr.length];
        while (i < arr.length) {
            if (arr[i] >= 0) {
                alternate[posIndex] = arr[i];
                posIndex += 2;
            } else {
                alternate[negIndex] = arr[i];
                negIndex += 2;
            }
            i++;
        }
        for (int j : alternate) {
           System.out.println(j); 
        }
    }
}
