
public class missingNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 6, 7, 8, 9, 3 };
        int N = 9;
        // brute(arr, N);
        better(arr, N);
    }

    static void brute(int[] arr, int N) {
        boolean found = false;
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                }
            }
            if (found) {
                found = false;
            } else {
                System.out.println(i);
                break;
            }
        }
    }

    static void better(int[] arr, int N) {
        int arrSum = 0;
        int realSum = (N*(N+1)/2);
        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }
        System.out.println(realSum - arrSum);
    }

}
