
public class checkSorted {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6, 7 };
        sortedFun(arr);
    }

    static void sortedFun(int[] arr) {
        int len = arr.length;
        boolean sorted = false;
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                sorted = true;
            } else {
                sorted = false;
            }
        }
        System.out.println(sorted);
    }
}
