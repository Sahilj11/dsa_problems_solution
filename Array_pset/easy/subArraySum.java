public class subArraySum {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5 };
        int sum = 5;
        subArray(arr, sum);
    }

    static void subArray(int[] arr, int sum) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int start = arr[i];
            for (int j = i + 1; j < len; j++) {
                start = start + arr[j];
                if (start == 10) {
                    System.out.println(j);
                } else if (start > 10) {
                    break;
                }

            }
        }
    }

    static void brute(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int j2 = i; j2 < j + 1; j2++) {

                }

            }
        }

    }
}
