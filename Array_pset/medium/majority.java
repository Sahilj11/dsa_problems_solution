import java.util.*;

public class majority {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 4, 3, 2, 4, 4, 2, 2 };
        // first we need to find which element is occuring most
        Map<Integer, Integer> iteration = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!iteration.containsKey(arr[i])) {
                iteration.put(arr[i], 1);
            } else {
                iteration.put(arr[i], iteration.get(arr[i]) + 1);
            }
        }
        int maxValueInMap = (Collections.max(iteration.values()));

        for (Map.Entry<Integer, Integer> entry : iteration.entrySet()) {
            if (entry.getValue() == maxValueInMap) {
                System.out.println("maxValueInMap  is " + entry.getKey());
                break;
            }
        }
    }

}
