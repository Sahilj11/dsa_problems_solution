/**
 * ReverseLL
 */
public class ReverseLL {
    public static void main(String[] args) {
        MyLinkedList<Integer> ls = new MyLinkedList<>();
        ls.add(2);
        ls.add(3);
        ls.add(4);
        ls.add(5);
        ls.add(6);
        ls.add(7);
        ls.reverse();
        ls.display();
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

    void reverse(){
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
