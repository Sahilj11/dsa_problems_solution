/**
 * Palindrome
 */
public class Palindrome {

    public static void main(String[] args) {
        MyLinkedList<Integer> ls = new MyLinkedList<>();
        ls.add(1);
        ls.add(2);
        ls.add(2);
        ls.add(1);
        System.out.println(ls.palindrome());
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

    boolean palindrome() {
        Node<T> last = this.tailNode();
        Node<T> start = head;
        int lengthStart = this.size();
        int lengthLast = lengthStart;
        while (lengthStart != 0 && lengthLast != 0) {
           if (start.data.equals(last.data)) {
               lengthStart--;
               lengthLast--;
               continue;
           }else{
               return false;
           } 
        }
        return true;
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

    Node<T> tailNode() {
        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current;
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

    int size() {
        int size = 0;
        Node<T> current = head;
        while (current != null) {
            current = current.next;
            size++;
        }
        return size;
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
