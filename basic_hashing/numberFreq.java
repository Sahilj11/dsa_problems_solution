import java.util.HashMap;

public class numberFreq {
    public static void main(String[] args) {
        int[] newArr = { 1, 2, 1, 3, 2 };
        int[] query = { 1, 3, 4, 2, 10 };
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < newArr.length; i++) {
            int number = newArr[i];
            freq.put(newArr[i], 1);
            for (int j = 0; j < newArr.length; j++) {
                if (number == newArr[j]) {
                }

            }
        }
    }
}
