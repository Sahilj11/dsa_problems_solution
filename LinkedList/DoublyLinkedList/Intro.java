/**
 * Intro
 */
public class Intro {

    public static void main(String[] args) {
        MyDoublyLinkedList<Integer> ls = new MyDoublyLinkedList<>();
        ls.add(23);
        ls.add(26);
        ls.add(25);
        ls.add(28);
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
        }else{
            Node<T> current = head;
            while (current != null) {
               current = current.next; 
            }
            current.next = node;
            node.prev = current;
        }
    }
    void display(){
        Node<T> iterator = head;
        while (iterator != null) {
           System.out.print(iterator.data+" "); 
           iterator = iterator.next;
        }
        System.out.println();
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
