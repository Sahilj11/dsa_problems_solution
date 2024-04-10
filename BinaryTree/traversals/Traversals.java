import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * Traversals
 */
public class Traversals {

    public static void main(String[] args) {
        int[] tree = { 9, 8, 7, 6, 5, 4, 3 };
        System.out.println("InOrder: ");
        inorderTrav(tree, 0);
        System.out.println();
        System.out.println("PreOrder: ");
        preOrderTrav(tree, 0);
        System.out.println();
        System.out.println("PostOrder: ");
        postOrderTrav(tree, 0);
        System.out.println();
        iterativePreOrder(tree);
    }

    private static void inorderTrav(int[] tree, int index) {
        if (index < tree.length) {
            inorderTrav(tree, index * 2 + 1);
            System.out.print(tree[index] + ", ");
            inorderTrav(tree, index * 2 + 2);
        }
    }

    private static void preOrderTrav(int[] tree, int index) {
        if (index < tree.length) {
            System.out.print(tree[index] + ", ");
            preOrderTrav(tree, 2 * index + 1);
            preOrderTrav(tree, 2 * index + 2);
        }
    }

    private static void postOrderTrav(int[] tree, int index) {
        if (index < tree.length) {
            postOrderTrav(tree, 2 * index + 1);
            postOrderTrav(tree, 2 * index + 2);
            System.out.print(tree[index] + ", ");
        }
    }

    private static List<List<Integer>> levelOrderTrav(int[] arr) {
        List<List<Integer>> ls = new LinkedList<>();
        if (arr == null || arr.length == 0) {
            return ls;
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0); // Start with the root node at index 0

        while (!queue.isEmpty()) {
            int size = queue.size(); // Get the number of nodes at the current
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                int index = queue.poll(); // Dequeue the node
                if (index < arr.length) {
                    list.add(arr[index]);
                    int leftChildIndex = 2 * index + 1;
                    int rightChildIndex = 2 * index + 2;
                    // Enqueue left child if it exists
                    if (leftChildIndex < arr.length) {
                        queue.offer(leftChildIndex);
                    }
                    // Enqueue right child if it exists
                    if (rightChildIndex < arr.length) {
                        queue.offer(rightChildIndex);
                    }
                }
            }
            ls.add(list);
        }
        return ls;
    }

    private static void iterativePreOrder(int[] tree) {
        Stack<Integer> st = new Stack<>();
        st.push(0);
        while (!st.isEmpty()) {
            for (int i = 0; i < st.size(); i++) {
                int index = st.pop();
                if (index < tree.length) {
                    System.out.println(tree[index]);
                    int leftChildIndex = index * 2 + 1;
                    int rightChildIndex = index * 2 + 2;
                    if (rightChildIndex < tree.length) {
                        st.push(rightChildIndex);
                    }
                    if (leftChildIndex < tree.length) {
                        st.push(leftChildIndex);
                    }
                }
            }
        }
    }

    private static void iterativeInorder(int[] tree){
    }
}
