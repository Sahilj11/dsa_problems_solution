/**
 * MiddleElement
 */
public class MiddleElement {
    public static void main(String[] args) {
        MyLinkedList<Integer> ls = new MyLinkedList<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        ls.add(5);
        System.out.println(ls.middleOpt().data);
    }

}

class MyLinkedList<T> {

    Node<T> head;

    public MyLinkedList() {
        this.head = null;
    }

    Node<T> middleBrute() {
        Node<T> n = head;
        int mid = 0;
        if (this.size() % 2 == 0) {
            mid = this.size() / 2;
            return this.get(mid);
        }else{
            mid = this.size() / 2;
            return this.get(mid);
        }
    }

    Node<T> get(int n){
        Node<T> node = head;
        while (n != 0) {
           node = node.next;
           n--;
        }
        return node;
    }
    Node<T> middleOpt(){
        Node<T> slow = head;
        Node<T> fast = head;
        while (!(fast.next == null || fast == null)) {
          slow = slow.next;  
          fast = fast.next.next;
        }
        return slow;
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
