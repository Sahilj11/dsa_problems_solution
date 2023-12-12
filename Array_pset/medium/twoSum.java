public class twoSum {

    public static void main(String[] args) {
        // we are given an array and a int we need to find if sum of two element is
        // equals target
        int[] arr = { 2, 6, 5, 8, 11 };
        int target = 14;
        int[] indices = indicesBrute(arr, target);
        for (int i : indices) {
           System.out.println(i); 
        }
    }

    static int[] indicesBrute(int[] arr, int target) {
        int[] indices = new int[2];
        for (int i = 0; i < arr.length; i++) {
            int remaining = target - arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (remaining == arr[j] && j != i) {
                    indices[0] = i;
                    indices[1] = j;
                    return indices;
                }
            }
        }
        return indices;
    }
}
