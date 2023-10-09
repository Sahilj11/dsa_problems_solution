public class twoSum {

    public static void main(String[] args) {
        // we are given an array and a int we need to find if sum of two element is
        // equals target
        int[] arr = { 2, 6, 5, 8, 11 };
        int target = 14;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1 + i; j < arr.length; j++) {
                int remaining = target - arr[i];
                if (remaining == arr[j]) {
                    System.out.println("true");
                    return;
                }
            }
        }
        System.out.println("False");

    }
}