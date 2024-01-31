/**
 * Intro
 */
public class Intro {

    public static void main(String[] args) {
        // TODO: Revise this
        MyLinkedList<Integer> ls = new MyLinkedList<>();
        ls.add(1);
        ls.add(5);
        ls.add(2);
        ls.add(7);
        ls.insertHead(10);
        ls.display();
    }
}

class MyLinkedList<T> {

    Node<T> head;

    public MyLinkedList() {
        this.head = null;
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

    void insertHead(T data){
        Node<T> firstNode = new Node<>(data);
        if (head == null) {
           head = firstNode;
        }else{
            firstNode.next = head;
            head = firstNode;
        }
    }
    void display(){
        Node<T> current = head;
        while (current != null) {
           System.out.print(current.data+ " "); 
           current = current.next;
        }
        System.out.println();
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
