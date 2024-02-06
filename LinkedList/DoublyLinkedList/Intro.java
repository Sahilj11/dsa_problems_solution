import java.util.Stack;

/**
 * Intro
 */
public class Intro {

    public static void main(String[] args) {
        // TODO: Complete the reverse task
        MyDoublyLinkedList<Integer> ls = new MyDoublyLinkedList<>();
        ls.add(23);
        ls.add(26);
        ls.add(25);
        ls.add(28);
        ls.display();
        ls.delete();
        ls.display();
        ls.bruteReverse();
        ls.display();
    }
}

class MyDoublyLinkedList<T> {
    Node<T> head;

    MyDoublyLinkedList() {
        this.head = null;
    }

    void add(T data) {
        Node<T> node = new Node<>(data);
        if (head == null) {
            head = node;
            node.prev = head;
            head.prev = null;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
            node.prev = current;
        }
    }

    void delete() {
        Node<T> iterator = head;
        while (iterator.next != null) {
            iterator = iterator.next;
        }
        iterator = iterator.prev;
        iterator.next = null;
    }

    void display() {
        Node<T> iterator = head;
        while (iterator != null) {
            System.out.print(iterator.data + " ");
            iterator = iterator.next;
        }
        System.out.println();
    }

    int size() {
        Node<T> iterator = head;
        int size = 0;
        while (iterator != null) {
            System.out.print(iterator.data + " ");
            iterator = iterator.next;
            size++;
        }
        return size;
    }
    void bruteReverse(){
        Stack<T> st = new Stack<>(); 
        Node<T> iterator = head;
        while (iterator != null) {
           st.push(iterator.data); 
           iterator = iterator.next;
        }
        iterator = head;
        while (iterator != null) {
           iterator.data = st.pop(); 
           iterator = iterator.next;
        }
    }
    void optReverse(){

       System.out.println("test"); 
    }
}

class Node<T> {
    T data;
    Node<T> next;
    Node<T> prev;

    Node(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
