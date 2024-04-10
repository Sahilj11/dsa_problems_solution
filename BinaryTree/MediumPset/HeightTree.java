import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * HeightTree
 */
public class HeightTree {

    public static void main(String[] args) {
        int[] tree = {3,1,2};
        System.out.println(brute(tree));
    }

    private static int brute(int[] tree) {
        Queue<Integer> qu = new LinkedList<>();
        int level = 0;
        int index = 0;
        qu.offer(index);
        while (!qu.isEmpty()) {
            List<Integer> temp = new LinkedList<>();
            int size = qu.size();
            for (int i = 0; i < size; i++) {
                index = qu.poll();
                if (index < tree.length) {
                    int leftIndex = 2 * index + 1;
                    int rightIndex = 2 * index + 2;
                    if (leftIndex < tree.length ) {
                        qu.offer(leftIndex);
                    }
                    if (rightIndex < tree.length ) {
                        qu.offer(rightIndex);
                    }
                }
            }
            level++;
        }
        return level;
    }

}
