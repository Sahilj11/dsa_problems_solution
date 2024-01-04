/**
 * FirstLastArray
 */
public class FirstLastArray {

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 8, 8, 11, 13 };
        optimul1(arr, 8);
    }

    private static void brute(int[] arr, int x) {
        int[] index = { -1, -1 };
        for (int i = 0; i < arr.length; i++) {
            if (index[0] == -1 && arr[i] == x) {
                index[0] = i;
                index[1] = i;
            } else if (index[0] != -1 && arr[i] == x) {
                index[1] = i;
            }
        }
        for (int i : index) {
            System.out.println(i);
        }
    }

    private static void optimul1(int[] arr, int x) {
        int lb = lowerBound(arr, x);
        int up = upperBound(arr, x);
        if(lb == x || arr[lb] != x){
            System.out.println(-1);
            return;
        }
        System.out.print(lb+",");
        System.out.print(up-1);
        System.out.println();
    }

    private static int lowerBound(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int midPoint = (low + high) / 2;
        int ans = 0;
        while (low <= high) {
            if (arr[midPoint] >= x) {
                ans = midPoint;
                high = midPoint - 1;
            }
            if (arr[midPoint] < x) {
                low = midPoint + 1;
            }
            midPoint = (low + high) / 2;
        }
        return ans;
    }

    private static int upperBound(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int midPoint = (low + high) / 2;
        int ans = 0;
        while (low <= high) {
            if (arr[midPoint] > x) {
                ans = midPoint;
                high = midPoint - 1;
            }
            if (arr[midPoint] <= x) {
                low = midPoint + 1;
            }
            midPoint = (low + high) / 2;
        }
        return ans;
    }
}
