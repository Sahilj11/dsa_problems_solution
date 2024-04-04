import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * LeastInterval
 */
public class LeastInterval {

    public static void main(String[] args) {
        char[] tasks = { 'A', 'A', 'A', 'B', 'B', 'B' };
        //TODO: Important question
        System.out.println(optimul(tasks, 2 ));
    }

    private static int optimul(char[] tasks, int n) {
        int[] char_map = new int[26];
        for (int i = 0; i < tasks.length; i++) {
            char_map[tasks[i] - 'A']++;
        }
        Arrays.sort(char_map);
        int maxValue = char_map[25] - 1;
        int idolSpot = maxValue * n;
        for (int i = 24; i >= 0; i--) {
            idolSpot-=Math.min(char_map[i],maxValue);
        }
        return idolSpot > 0 ? idolSpot + tasks.length : tasks.length;
    }
}
