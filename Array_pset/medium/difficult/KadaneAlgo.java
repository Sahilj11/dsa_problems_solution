public class KadaneAlgo {
    public static void main(String[] args) {
        int[] arr = { 5, -4, -2, 6, -1 };
        int len = arr.length;
        int maxSoFar = 0;
        int maxEndHere = 0;
        for (int j = 0; j < len; j++) {
            maxEndHere += arr[j];
            if (maxEndHere > maxSoFar) {
                maxSoFar = maxEndHere;
            }
            if (maxEndHere < 0) {
                maxEndHere = 0;
            }
        }
        System.out.println(maxSoFar);

    }
}
