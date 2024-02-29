import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

/**
 * LRUCache
 */
public class LRUCache {

    public static void main(String[] args) {
        LRU lq  = new LRU(2);
        lq.put(1, 1);
        lq.put(2, 2);
        System.out.println(lq.get(2));
        lq.put(3, 3);
        lq.put(3, 4);
        System.out.println(lq.get(3));
    }
}

class LRU {
    private final int capacity;
    HashMap<Integer, Integer> hp;
    Deque<Integer> dq;

    public LRU(int capacity) {
        this.capacity = capacity;
        this.hp = new HashMap<>();
        this.dq = new ArrayDeque<>();
    }

    public int get(int key) {
        if (hp.isEmpty()) {
            return -1;
        }
        if (hp.get(key) != null) {
            dq.offer(hp.get(key));
            return hp.get(key);
        }
        return -1;
    }

    public void put(int key, int value) {
        if (hp.size() >= capacity) {
            hp.remove(dq.peek());
            dq.pop();
        }
        hp.put(key, value);
        dq.offer(key);
    }
}
