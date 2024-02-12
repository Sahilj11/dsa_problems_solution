import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * LengthLoop
 */
public class LengthLoop {

    public static void main(String[] args) {
        MyLinkedList<Integer> ls = new MyLinkedList<>();
        ls.add(2);
        ls.add(4);
        ls.add(5);
        ls.add(6);
        ls.addCycle(1);
        System.out.println(ls.loopSizeStack());
        System.out.println(ls.loopLength());
    }
}

class MyLinkedList<T> {

    Node<T> head;

    public MyLinkedList() {
        this.head = null;
    }

    Node<T> get(int n) {
        Node<T> node = head;
        while (n != 0) {
            node = node.next;
            n--;
        }
        return node;
    }

    Node<T> tailNode() {
        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current;
    }

    void add(T data) {
        Node<T> node = new Node<>(data);
        if (head == null) {
            head = node;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    void addCycle(int index) {
        Node<T> n = this.get(index);
        Node<T> tail = this.tailNode();
        tail.next = n;
    }

    void insertHead(T data) {
        Node<T> firstNode = new Node<>(data);
        if (head == null) {
            head = firstNode;
        } else {
            firstNode.next = head;
            head = firstNode;
        }
    }

    void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    void reverse() {
        if (this.size() == 1) {
            return;
        }
        Node<T> prev = null;
        Node<T> temp = head;
        Node<T> front = head.next;
        while (front != null) {
            temp.next = prev;
            Node<T> temp2 = temp;
            temp = front;
            front = front.next;
            prev = temp2;
        }
        head = temp;
        temp.next = prev;
    }

    int size() {
        int size = 0;
        Node<T> current = head;
        while (current != null) {
            current = current.next;
            size++;
        }
        return size;
    }

    boolean isCycleBrute() {
        Set<Node<T>> st = new HashSet<>();
        Node<T> node = head;
        while (node.next != null) {
            st.add(node);
            node = node.next;
            if (st.contains(node)) {
                return true;
            }
        }
        return false;
    }

    int loopSizeStack() {
        Node<T> start = null;
        Node<T> last = head;
        Stack<Node<T>> st = new Stack<>();
        while (last.next != null) {
            if (!st.contains(last)) {
                st.add(last);
                last = last.next;
            } else {
                last = st.peek();
                System.out.println(last.data + " this is ending point");
                start = last.next;
                System.out.println(start.data + " this is starting point");
                break;
            }
        }
        int count = 1;
        while (start != last) {
            count++;
            start = start.next;
        }
        return count;
    }

    int loopLength() {
        HashMap<Node<T>, Integer> hp = new HashMap<>();
        Node<T> ptr = head;
        int counter = 1;
        while (ptr.next != null) {
            if (!hp.containsKey(ptr)) {
                hp.put(ptr, counter);
                counter++;
                ptr = ptr.next;
            } else {
                return counter - hp.get(ptr);
            }
        }
        return counter;
    }

    boolean isCycleOpt() {
        Node<T> slow = head;
        Node<T> fast = head;
        while (fast.next != null || fast != null) {
            if (slow == fast) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}

class Node<T> {

    T data;
    Node<T> next;

    Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}
